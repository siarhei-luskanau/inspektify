package sp.bvantur.inspektify.ktor.list.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import sp.bvantur.inspektify.ktor.list.ui.KtorListRoute

internal typealias OnNavigateToDetailsAction = (Long) -> Unit

internal const val NETWORK_TRAFFIC_LIST_NAVIGATION_ROUTE = "network_traffic_list_route"

internal fun NavGraphBuilder.networkTrafficListScreen(onNavigateToDetailsAction: OnNavigateToDetailsAction) {
    composable(
        route = NETWORK_TRAFFIC_LIST_NAVIGATION_ROUTE
    ) {
        KtorListRoute(onNavigateToDetailsAction)
    }
}
