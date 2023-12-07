require qt5.inc
require qt5-lts.inc

LICENSE = "(GPL-3.0-only & The-Qt-Company-GPL-Exception-1.0) | The-Qt-Company-Commercial"
LIC_FILES_CHKSUM = " \
    file://LICENSE.GPL3;md5=d32239bcb673463ab874e80d47fae504 \
    file://LICENSE.GPL3-EXCEPT;md5=763d8c535a234d9a3fb682c7ecb6c073 \
"

DEPENDS += "qtbase qtdeclarative"

SRCREV = "a56808f219f9a660dd48ee7e330d0bf86d2cee9b"
