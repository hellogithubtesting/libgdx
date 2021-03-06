/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;

public class btUniformScalingShape extends btConvexShape {
  private long swigCPtr;

  protected btUniformScalingShape(long cPtr, boolean cMemoryOwn) {
    super(gdxBulletJNI.btUniformScalingShape_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(btUniformScalingShape obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btUniformScalingShape(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public btUniformScalingShape(btConvexShape convexChildShape, float uniformScalingFactor) {
    this(gdxBulletJNI.new_btUniformScalingShape(btConvexShape.getCPtr(convexChildShape), convexChildShape, uniformScalingFactor), true);
  }

  public float getUniformScalingFactor() {
    return gdxBulletJNI.btUniformScalingShape_getUniformScalingFactor(swigCPtr, this);
  }

  public btConvexShape getChildShape() {
    long cPtr = gdxBulletJNI.btUniformScalingShape_getChildShape__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new btConvexShape(cPtr, false);
  }

}
