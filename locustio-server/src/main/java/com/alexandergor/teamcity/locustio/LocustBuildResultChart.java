package com.alexandergor.teamcity.locustio;
import jetbrains.buildServer.web.openapi.*;
import org.jetbrains.annotations.NotNull;


public class LocustBuildResultChart {
    private static final String PLUGIN_NAME = "LocustioChart-Plugin";

    public LocustBuildResultChart(
            @NotNull PluginDescriptor descriptor,
            @NotNull PagePlaces places
    ) {
        new SimplePageExtension(
                places,
                PlaceID.ALL_PAGES_FOOTER_PLUGIN_CONTAINER,
                PLUGIN_NAME,
                descriptor.getPluginResourcesPath("build.result.chart.jsp")
        ).register();
    }
}
