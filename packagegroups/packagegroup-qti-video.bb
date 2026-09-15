SUMMARY = "QTI Video opensource package groups"
PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

LICENSE = "BSD-3-Clause-Clear"

PROVIDES = "${PACKAGES}"

PACKAGES = ' \
    packagegroup-qti-video \
'

RDEPENDS:packagegroup-qti-video = " \
    mmrm-devicetree \
    video-devicetree \
    mmrm-kernel \
    video-kernel \
    video-kernel-headers \
    codec2 \
"

RDEPENDS:packagegroup-qti-video:remove:kera = " \
    mmrm-devicetree \
"

RDEPENDS:packagegroup-qti-video:remove:vienna = " \
    mmrm-kernel \
    mmrm-devicetree \
"
