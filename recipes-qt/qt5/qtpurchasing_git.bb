require qt5.inc
require qt5-lts.inc

HOMEPAGE = "http://www.qt.io"
LICENSE = "Apache-2.0 & BSD & ( LGPL-3.0 | GPL-3.0 | The-Qt-Company-Commercial )"
LIC_FILES_CHKSUM = " \
    file://LICENSE.LGPLv3;md5=b8c75190712063cde04e1f41b6fdad98 \
    file://LICENSE.GPLv3;md5=40f9bf30e783ddc201497165dfb32afb \
"

DEPENDS += "qtbase qtdeclarative"

SRCREV = "81ef87098a5260dc0a653ba6b79aa9cd23128dd1"
