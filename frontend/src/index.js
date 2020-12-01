// @flow strict
import {Plugin, React} from "@jetbrains/teamcity-api"
import Chart from './Chart/Chart'

new Plugin([Plugin.placeIds.SAKURA_BUILD_LINE_EXPANDED, 'BUILD_RESULTS_FRAGMENT'], {
    name: "LocustioChart-Plugin",
    content: Chart,
});
