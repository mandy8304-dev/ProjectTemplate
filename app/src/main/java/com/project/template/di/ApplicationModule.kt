package com.project.template.di

import android.content.Context
import com.project.template.logic.BaseApplication
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApplicationModule {

    @Singleton
    @Provides
    @Named("context")
    fun provideBaseContext(@ApplicationContext app: Context): Context {
        return app
    }

    @Singleton
    @Provides
    @Named("app")
    fun provideApplication(@ApplicationContext app: Context): BaseApplication {
        return app as BaseApplication
    }

}