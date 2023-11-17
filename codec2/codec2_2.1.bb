inherit cmake sdllvm
TOOLCHAIN = "sdllvm"

SUMMARY = "Codec2 multimedia framework"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

DEPENDS += "llvm-arm-toolchain-native \
        libcutils \
        libui \
        liblog \
        libion \
        libdmabufheap \
        gbm \
        libutils \
        linux-msm-headers "

SRCREV = "${AUTOREV}"
FILESPATH =+ "${WORKSPACE}:"
SRC_URI = "file://vendor/qcom/opensource/le-codec2-port/codec2/"

S = "${WORKDIR}/vendor/qcom/opensource/le-codec2-port/codec2"

PACKAGE_ARCH = "${TUNE_ARCH}"

SOLIBS = ".so"
FILES_SOLIBSDEV = ""

EXTRA_OECMAKE += " -DCMAKE_INCLUDE_PATH:PATH=${STAGING_INCDIR}/linux-msm/usr/include"

TOOLCHAIN = "sdllvm"
