package com.abdo.creditagricole.di

import com.abdo.creditagricole.data.repository.BanksRepository
import com.abdo.creditagricole.data.repository.DefaultBanksRepository
import com.abdo.creditagricole.data.source.BanksDataSource
import com.abdo.creditagricole.data.source.network.ApiInterface
import com.abdo.creditagricole.data.source.network.ApiInterfaceContainer
import com.abdo.creditagricole.data.source.network.BanksRemoteDataSource
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