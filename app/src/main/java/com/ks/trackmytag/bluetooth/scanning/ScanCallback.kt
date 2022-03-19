package com.ks.trackmytag.bluetooth.scanning

import android.bluetooth.le.ScanCallback
import android.bluetooth.le.ScanResult

object ScanCallback : ScanCallback() {

    lateinit var scanResults: ScanResults

    override fun onScanResult(callbackType: Int, result: ScanResult?) {
        result?.device?.let {
            if(!scanResults.devices.contains(it)) scanResults.devices.add(it)
        }
    }

    override fun onScanFailed(errorCode: Int) { scanResults.errorCode = errorCode }
}