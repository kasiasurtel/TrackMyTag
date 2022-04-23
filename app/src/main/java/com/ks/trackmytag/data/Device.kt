package com.ks.trackmytag.data

import android.bluetooth.BluetoothDevice
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

@Entity(tableName = "devices")
data class Device(
    @PrimaryKey(autoGenerate = true) val id: Int? = null,
    var name: String,
    val address: String
) {
    @Ignore var bluetoothDevice: BluetoothDevice? = null
}

enum class State {
    DISCONNECTED,
    CONNECTED,
    UNKNOWN
}


