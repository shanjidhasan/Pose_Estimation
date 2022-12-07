package org.mmh.android.examples.poseestimation.data

import android.graphics.RectF

data class Person(
    var id: Int = -1, // default id is -1
    val keyPoints: List<KeyPoint>,
    val boundingBox: RectF? = null, // Only MoveNet MultiPose return bounding box.
    val score: Float
)
