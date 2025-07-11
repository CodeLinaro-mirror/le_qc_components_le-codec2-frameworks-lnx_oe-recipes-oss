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

#PACKAGE_ARCH = "${TUNE_ARCH}"
PACKAGE_ARCH = "${TUNE_PKGARCH}"

FILES:${PN} += "${libdir}/libcodec2_vndk.so"

do_configure:prepend() {
    mkdir -p ${WORKDIR}/lib32-recipe-sysroot/usr/lib/gcc/arm-oemllib32-linux-gnueabi/11.5.0
    ln -sf \
      ${WORKDIR}/lib32-recipe-sysroot/usr/lib/arm-oemllib32-linux-gnueabi/11.5.0/* \
      ${WORKDIR}/lib32-recipe-sysroot/usr/lib/gcc/arm-oemllib32-linux-gnueabi/11.5.0/
}

SOLIBS = ".so"
FILES_SOLIBSDEV = ""

EXTRA_OECMAKE += " -DCMAKE_INCLUDE_PATH:PATH=${STAGING_INCDIR}/linux-msm/usr/include"

TOOLCHAIN = "sdllvm"
