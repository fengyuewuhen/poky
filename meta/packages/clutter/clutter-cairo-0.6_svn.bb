require clutter-cairo.inc

PV = "0.6.0+svnr${SRCREV}"

DEPENDS += "clutter-0.6"

SRC_URI = "svn://svn.o-hand.com/repos/clutter/branches;module=clutter-cairo-0-6;proto=http \
           file://enable_examples-0.6.patch;patch=1"

S = "${WORKDIR}/clutter-cairo-0-6"

PR = "r1"
