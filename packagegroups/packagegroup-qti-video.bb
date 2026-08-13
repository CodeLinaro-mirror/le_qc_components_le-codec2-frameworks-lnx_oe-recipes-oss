SUMMARY = "QTI Video opensource package groups"
PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

LICENSE = "BSD-3-Clause-Clear"

PROVIDES = "${PACKAGES}"

PACKAGES = ' \
    packagegroup-qti-video \
'

RDEPENDS:packagegroup-qti-video = " \
    video-devicetree \
    video-kernel \
    video-kernel-headers \
    codec2 \
"
