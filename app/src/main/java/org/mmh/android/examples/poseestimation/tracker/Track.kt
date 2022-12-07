package org.mmh.android.examples.poseestimation.tracker

import org.mmh.android.examples.poseestimation.data.Person

data class Track(
    val person: Person,
    val lastTimestamp: Long
)
