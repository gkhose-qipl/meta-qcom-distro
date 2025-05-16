SUMMARY = "Minimal image"

LICENSE = "BSD-3-Clause-Clear"

IMAGE_FEATURES += "splash tools-debug allow-empty-password empty-root-password allow-root-login post-install-logging enable-adbd"

inherit core-image features_check extrausers image-adbd

# let's make sure we have a good image..
REQUIRED_DISTRO_FEATURES = "pam systemd"

CORE_IMAGE_BASE_INSTALL += " \
    kernel-modules \
    packagegroup-qcom-utilities-filesystem-utils \
"

# Adding kernel-devsrc to provide kernel development support on SDK
TOOLCHAIN_TARGET_TASK += "kernel-devsrc"
