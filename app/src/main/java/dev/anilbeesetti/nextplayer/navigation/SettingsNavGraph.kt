package dev.himanshu.myplayer.navigation

import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import dev.himanshu.myplayer.settings.Setting
import dev.himanshu.myplayer.settings.navigation.aboutPreferencesEntry
import dev.himanshu.myplayer.settings.navigation.appearancePreferencesEntry
import dev.himanshu.myplayer.settings.navigation.audioPreferencesEntry
import dev.himanshu.myplayer.settings.navigation.folderPreferencesEntry
import dev.himanshu.myplayer.settings.navigation.generalPreferencesEntry
import dev.himanshu.myplayer.settings.navigation.gesturePreferencesEntry
import dev.himanshu.myplayer.settings.navigation.librariesEntry
import dev.himanshu.myplayer.settings.navigation.mediaLibraryPreferencesEntry
import dev.himanshu.myplayer.settings.navigation.navigateToAboutPreferences
import dev.himanshu.myplayer.settings.navigation.navigateToAppearancePreferences
import dev.himanshu.myplayer.settings.navigation.navigateToAudioPreferences
import dev.himanshu.myplayer.settings.navigation.navigateToFolderPreferencesScreen
import dev.himanshu.myplayer.settings.navigation.navigateToGeneralPreferences
import dev.himanshu.myplayer.settings.navigation.navigateToGesturePreferences
import dev.himanshu.myplayer.settings.navigation.navigateToLibraries
import dev.himanshu.myplayer.settings.navigation.navigateToMediaLibraryPreferencesScreen
import dev.himanshu.myplayer.settings.navigation.navigateToPlayerPreferences
import dev.himanshu.myplayer.settings.navigation.navigateToSubtitlePreferences
import dev.himanshu.myplayer.settings.navigation.navigateToThumbnailPreferencesScreen
import dev.himanshu.myplayer.settings.navigation.playerPreferencesEntry
import dev.himanshu.myplayer.settings.navigation.settingsEntry
import dev.himanshu.myplayer.settings.navigation.subtitlePreferencesEntry
import dev.himanshu.myplayer.settings.navigation.thumbnailPreferencesEntry

fun EntryProviderScope<NavKey>.settingsNavGraph(backStack: NavBackStack<NavKey>) {
    settingsEntry(
        onNavigateUp = { backStack.removeLastIfNotRoot() },
        onItemClick = { setting ->
            when (setting) {
                Setting.APPEARANCE -> backStack.navigateToAppearancePreferences()
                Setting.MEDIA_LIBRARY -> backStack.navigateToMediaLibraryPreferencesScreen()
                Setting.PLAYER -> backStack.navigateToPlayerPreferences()
                Setting.GESTURES -> backStack.navigateToGesturePreferences()
                Setting.AUDIO -> backStack.navigateToAudioPreferences()
                Setting.SUBTITLE -> backStack.navigateToSubtitlePreferences()
                Setting.GENERAL -> backStack.navigateToGeneralPreferences()
                Setting.ABOUT -> backStack.navigateToAboutPreferences()
            }
        },
    )
    appearancePreferencesEntry(
        onNavigateUp = { backStack.removeLastIfNotRoot() },
    )
    mediaLibraryPreferencesEntry(
        onNavigateUp = { backStack.removeLastIfNotRoot() },
        onFolderSettingClick = backStack::navigateToFolderPreferencesScreen,
        onThumbnailSettingClick = backStack::navigateToThumbnailPreferencesScreen,
    )
    thumbnailPreferencesEntry(
        onNavigateUp = { backStack.removeLastIfNotRoot() },
    )
    folderPreferencesEntry(
        onNavigateUp = { backStack.removeLastIfNotRoot() },
    )
    playerPreferencesEntry(
        onNavigateUp = { backStack.removeLastIfNotRoot() },
    )
    gesturePreferencesEntry(
        onNavigateUp = { backStack.removeLastIfNotRoot() },
    )
    audioPreferencesEntry(
        onNavigateUp = { backStack.removeLastIfNotRoot() },
    )
    subtitlePreferencesEntry(
        onNavigateUp = { backStack.removeLastIfNotRoot() },
    )
    generalPreferencesEntry(
        onNavigateUp = { backStack.removeLastIfNotRoot() },
    )
    aboutPreferencesEntry(
        onLibrariesClick = backStack::navigateToLibraries,
        onNavigateUp = { backStack.removeLastIfNotRoot() },
    )
    librariesEntry(
        onNavigateUp = { backStack.removeLastIfNotRoot() },
    )
}
