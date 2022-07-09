package com.raystatic.navigationwithmultimoduleapp

import com.learnacad.feature_02.Feature02DeeplinkProcessor
import com.raystatic.core.navigation.DeeplinkProcessor
import com.raystatic.feature_01.Feature01DeeplinkProcessor
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet

@Module
@InstallIn(SingletonComponent::class)
interface DeepLinkProcessorModule {

    @Binds
    @IntoSet
    fun bindFeat01Processors(
        feature01DeeplinkProcessor: Feature01DeeplinkProcessor
    ): DeeplinkProcessor

    @Binds
    @IntoSet
    fun bindFeat02Processors(
        feature02DeeplinkProcessor: Feature02DeeplinkProcessor
    ): DeeplinkProcessor



}