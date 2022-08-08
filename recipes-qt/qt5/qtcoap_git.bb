require qt5.inc
require qt5-lts.inc

LICENSE = "GFDL-1.3 & BSD-3-Clause & GPL-3.0-only | The-Qt-Company-Commercial"
LIC_FILES_CHKSUM = " \
    file://LICENSE.GPL3;md5=d32239bcb673463ab874e80d47fae504 \
"

PACKAGECONFIG ?= "qtdeclarative"
PACKAGECONFIG[qtdeclarative] = ",,qtdeclarative"

DEPENDS += "qtbase"

SRCREV = "a82e6785f001a64c57a8440ff1c5a67428d084d7"
