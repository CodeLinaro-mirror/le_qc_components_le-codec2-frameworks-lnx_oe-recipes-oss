inherit cmake sdllvm

SUMMARY = "Codec2 multimedia framework"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

DEPENDS += "llvm-arm-toolchain-native \
        libcutils \
        liblog \
        libion \
	libgbm \
	libutils \
        libui \
        system-core-headers \
        linux-msm-headers \
        display-commonsys \
        libdmabufheap "

SRCREV = "${AUTOREV}"
FILESPATH =+ "${WORKSPACE}:"
SRC_URI = "file://vendor/qcom/opensource/le-codec2-port/codec2/"

S = "${WORKDIR}/vendor/qcom/opensource/le-codec2-port/codec2"

PACKAGE_ARCH = "${TUNE_ARCH}"

SOLIBS = ".so"
FILES_SOLIBSDEV = ""

EXTRA_OECMAKE += " -DCMAKE_INCLUDE_PATH:PATH=${STAGING_INCDIR}/linux-msm/usr/include"

TOOLCHAIN = "sdllvm"
DEBUG_PREFIX_MAP:remove:seraph = "-fcanon-prefix-map"
