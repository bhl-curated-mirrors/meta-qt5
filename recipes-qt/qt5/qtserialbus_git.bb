require qt5.inc
require qt5-lts.inc

LICENSE = "GFDL-1.3 & (LGPL-3.0-only | GPL-2.0-or-later) | The-Qt-Company-Commercial"
LIC_FILES_CHKSUM = " \
    file://LICENSE.FDL;md5=6d9f2a9af4c8b8c3c769f6cc1b6aaf7e \
    file://LICENSE.GPLv2;md5=c96076271561b0e3785dad260634eaa8 \
    file://LICENSE.GPLv3;md5=88e2b9117e6be406b5ed6ee4ca99a705 \
    file://LICENSE.LGPLv3;md5=e0459b45c5c4840b353141a8bbed91f0 \
"

DEPENDS += "qtbase"

PACKAGECONFIG ?= "modbus ${@bb.utils.contains('BBFILE_COLLECTIONS', 'openembedded-layer', 'socketcan', '', d)}"
PACKAGECONFIG[modbus] = "-feature-modbus-serialport,-no-feature-modbus-serialport,qtserialport"
PACKAGECONFIG[socketcan] = "-feature-socketcan,-no-feature-socketcan,,libsocketcan"

EXTRA_QMAKEVARS_CONFIGURE += "${PACKAGECONFIG_CONFARGS}"

SRCREV = "7602d2559db6dda80ca8a3445b5729675ead7524"
