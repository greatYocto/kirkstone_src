SUMMARY = "A very small image for yocto test"

inherit great-base-image

LINGUAS_KO_KR = "ko-kr"
LINGUAS_EN_US = "en-us"

IMAGE_LINGUAS = "${LINGUAS_KO_KR} ${LINGUAS_EN_US}"

#IMAGE_INSTALL += "packagegroup-great"
#IMAGE_INSTALL += "mykernelmod"

IMAGE_OVERHEAD_FACTOR = "1.3"

inherit extrausers
EXTRA_USERS_PARAMS = " \
    usermod -p '\$6\$12345678\$zYTErUfpqzN5dmxG3gGKbhqFHaN9SxsePAd7oKlc5M1Qf.c.vhkThAe0Wyx8jRf37/HtlKAJvFfluXwQn/FWi1' root; \
    useradd -p '' great \
"



