package cz.minarik.alzatest.di

import cz.minarik.alzatest.data.repository.CategoryRepositoryImpl
import cz.minarik.alzatest.data.repository.ProductRepositoryImpl
import cz.minarik.alzatest.domain.repository.CategoryRepository
import cz.minarik.alzatest.domain.repository.ProductRepository
import cz.minarik.alzatest.domain.use_case.get_categories.GetCategoriesUseCase
import cz.minarik.alzatest.domain.use_case.get_products.GetProductsUseCase
import cz.minarik.alzatest.ui.screens.home.HomeScreenViewModel
import cz.minarik.alzatest.ui.screens.products.ProductListScreenViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    single<CategoryRepository> {
        CategoryRepositoryImpl(
            get(),
        )
    }

    single<ProductRepository> {
        ProductRepositoryImpl(
            get(),
        )
    }

    single {
        GetCategoriesUseCase(
            get(),
        )
    }

    single {
        GetProductsUseCase(
            get(),
        )
    }

    viewModel {
        HomeScreenViewModel(
            get(),
        )
    }

    viewModel { (categoryId: String) ->
        ProductListScreenViewModel(
            categoryId,
            get(),
        )
    }
}