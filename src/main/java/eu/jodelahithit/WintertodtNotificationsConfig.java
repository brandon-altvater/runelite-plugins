package eu.jodelahithit;

import net.runelite.client.config.*;

import java.awt.*;

@ConfigGroup("wintertodt-notifications")
public interface WintertodtNotificationsConfig extends Config
{
    @Alpha
    @ConfigItem(
            keyName = "overlayColor",
            name = "Notification color",
            description = "Set the notification overlay color",
            position = 0
    )
    default Color overlayColor() {
        return new Color(1.0f, 0.0f, 0.0f, 0.5f);
    }

    @ConfigItem(
            keyName = "notificationFlash",
            name = "Notification flash",
            description = "Flash the overlay",
            position = 1
    )
    default boolean flash() {
        return false;
    }

    @Range(
            min = 0,
            max = 2000
    )
    @Units(Units.MILLISECONDS)
    @ConfigItem(
            keyName = "notificationFade",
            name = "Fade duration",
            description = "Time taken to fade the notification in or out",
            position = 2
    )
    default int notificationFade()
    {
        return 150;
    }

    @ConfigItem(
            keyName = "showInterruptionText",
            name = "Show interruption reason",
            description = "Display what interrupted the current action on the overlay",
            position = 3
    )
    default boolean showInterruptionText()
    {
        return false;
    }

    @ConfigItem(
            keyName = "nativeNotification",
            name = "Native notification",
            description = "Send a RuneLite notification when an action is interrupted",
            position = 4
    )
    default boolean nativeNotification()
    {
        return false;
    }

    @Range(min = 0)
    @ConfigItem(
            keyName = "notificationPointThreshold",
            name = "Stop notifying at points",
            description = "Stop all plugin notifications at or above this round's points. Set to 0 to disable; use 500 for the minimum reward points.",
            position = 5
    )
    default int notificationPointThreshold()
    {
        return 0;
    }
}
