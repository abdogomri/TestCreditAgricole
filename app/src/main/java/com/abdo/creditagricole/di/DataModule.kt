package com.abdo.creditagricole.di

import com.creditagricole.domain.GetBanksDataUseCase
import com.creditagricole.network.repository.BanksRepository
import com.creditagricole.network.repository.DefaultBanksRepository
import com.creditagricole.network.source.BanksDataSource
import com.creditagricole.network.source.network.ApiInterface
import com.creditagricole.network.source.network.ApiInterfaceContainer
import com.creditagricole.network.source.network.BanksRemoteDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(ViewModelComponent::class)
object DataSourceModule {

    @Singleton
    @Provides
    fun provideRemoteBanksDataSource(
        api: ApiInterface
    ): BanksDataSource {
        return BanksRemoteDataSource(api)
    }
}

@Module
@InstallIn(SingletonComponent::class)
object RemoteDataModule {

    @Singleton
    @Provides
    fun provideApiInterface(container: ApiInterfaceContainer): ApiInterface {
        return container.provideApiInterface()
    }
}

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideBanksRepository(
        remoteDataSource: BanksRemoteDataSource
    ): BanksRepository {
        return DefaultBanksRepository(remoteDataSource = remoteDataSource)
    }

}

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Singleton
    @Provides
    fun provideBanksDataUseCase(
        banksRepository: BanksRepository
    ): GetBanksDataUseCase = GetBanksDataUseCase(repository = banksRepository)

}