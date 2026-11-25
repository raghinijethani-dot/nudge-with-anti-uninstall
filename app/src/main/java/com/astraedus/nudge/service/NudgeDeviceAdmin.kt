package com.astraedus.nudge.service

import android.app.admin.DeviceAdminReceiver

/** While this admin is active, Android refuses to uninstall Nudge until it is switched off. */
class NudgeDeviceAdmin : DeviceAdminReceiver()
