package com.ks.trackmytag.data

data class DeviceStates(
    var connectionStates: MutableMap<String, State>,
    var signalStrength: MutableMap<String, Int>,
    var batteryStates: MutableMap<String, Int>,
    var alarm: MutableMap<String, Boolean>
)