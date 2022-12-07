package org.mmh.android.examples.poseestimation.ml

import android.graphics.Bitmap
import org.mmh.android.examples.poseestimation.data.Person

interface PoseDetector : AutoCloseable {

    fun estimatePoses(bitmap: Bitmap): List<Person>

    fun lastInferenceTimeNanos(): Long
}
