package com.ks.trackmytag.data

import android.bluetooth.BluetoothDevice
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

@Entity(tableName = "devices")
data class Device(
    @PrimaryKey(autoGenerate = true) val id: Int? = null,
    var name: String,
    val address: String,
    var color: String
) {
    @Ignore var bluetoothDevice: BluetoothDevice? = null
    @Ignore var connectionState: State = State.DISCONNECTED
    @Ignore var signalStrength: Int = -1
    @Ignore var batteryLevel: Int = -1
}

enum class State {
    DISCONNECTED,
    CONNECTED,
    UNKNOWN
}


