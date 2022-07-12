SUMMARY = "QTI Video opensource package groups"
PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

LICENSE = "BSD-3-Clause-Clear"

PROVIDES = "${PACKAGES}"

PACKAGES = ' \
    packagegroup-qti-video \
'

RDEPENDS_packagegroup-qti-video = " \
    mmrm-kernel \
    video-kernel \
    codec2 \
"
