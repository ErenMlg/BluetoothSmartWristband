package com.softcross.smartband.domain.bluetooth

import java.io.IOException

class TransferFailedException : IOException("Reading incoming data failed")