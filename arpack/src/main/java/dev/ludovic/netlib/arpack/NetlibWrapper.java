/*
 * Copyright (c) Ludovic Henry. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation. Ludovic Henry designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Ludovic Henry in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact hi@ludovic.dev or visit ludovic.dev if you need additional
 * information or have any questions.
 */

package dev.ludovic.netlib.arpack;

import dev.ludovic.netlib.ARPACK;

abstract class NetlibWrapper extends AbstractARPACK {

  private final com.github.fommil.netlib.ARPACK arpack;

  protected NetlibWrapper(com.github.fommil.netlib.ARPACK _arpack) {
    arpack = _arpack;
  }

  protected void dmoutK(int lout, int m, int n, double[] a, int offseta, int lda, int idigit, String ifmt) {
    arpack.dmout(lout, m, n, a, offseta, lda, idigit, ifmt);
  }

  protected void smoutK(int lout, int m, int n, float[] a, int offseta, int lda, int idigit, String ifmt) {
    arpack.smout(lout, m, n, a, offseta, lda, idigit, ifmt);
  }

  protected void dvoutK(int lout, int n, double[] sx, int offsetsx, int idigit, String ifmt) {
    arpack.dvout(lout, n, sx, offsetsx, idigit, ifmt);
  }

  protected void svoutK(int lout, int n, float[] sx, int offsetsx, int idigit, String ifmt) {
    arpack.svout(lout, n, sx, offsetsx, idigit, ifmt);
  }

  protected void ivoutK(int lout, int n, int[] ix, int offsetix, int idigit, String ifmt) {
    arpack.ivout(lout, n, ix, offsetix, idigit, ifmt);
  }

  protected void dgetv0K(org.netlib.util.intW ido, String bmat, int itry, boolean initv, int n, int j, double[] v, int offsetv, int ldv, double[] resid, int offsetresid, org.netlib.util.doubleW rnorm, int[] ipntr, int offsetipntr, double[] workd, int offsetworkd, org.netlib.util.intW ierr) {
    arpack.dgetv0(ido, bmat, itry, initv, n, j, v, offsetv, ldv, resid, offsetresid, rnorm, ipntr, offsetipntr, workd, offsetworkd, ierr);
  }

  protected void sgetv0K(org.netlib.util.intW ido, String bmat, int itry, boolean initv, int n, int j, float[] v, int offsetv, int ldv, float[] resid, int offsetresid, org.netlib.util.floatW rnorm, int[] ipntr, int offsetipntr, float[] workd, int offsetworkd, org.netlib.util.intW ierr) {
    arpack.sgetv0(ido, bmat, itry, initv, n, j, v, offsetv, ldv, resid, offsetresid, rnorm, ipntr, offsetipntr, workd, offsetworkd, ierr);
  }

  protected void dlaqrbK(boolean wantt, int n, int ilo, int ihi, double[] h, int offseth, int ldh, double[] wr, int offsetwr, double[] wi, int offsetwi, double[] z, int offsetz, org.netlib.util.intW info) {
    arpack.dlaqrb(wantt, n, ilo, ihi, h, offseth, ldh, wr, offsetwr, wi, offsetwi, z, offsetz, info);
  }

  protected void slaqrbK(boolean wantt, int n, int ilo, int ihi, float[] h, int offseth, int ldh, float[] wr, int offsetwr, float[] wi, int offsetwi, float[] z, int offsetz, org.netlib.util.intW info) {
    arpack.slaqrb(wantt, n, ilo, ihi, h, offseth, ldh, wr, offsetwr, wi, offsetwi, z, offsetz, info);
  }

  protected void dnaitrK(org.netlib.util.intW ido, String bmat, int n, int k, int np, int nb, double[] resid, int offsetresid, org.netlib.util.doubleW rnorm, double[] v, int offsetv, int ldv, double[] h, int offseth, int ldh, int[] ipntr, int offsetipntr, double[] workd, int offsetworkd, org.netlib.util.intW info) {
    arpack.dnaitr(ido, bmat, n, k, np, nb, resid, offsetresid, rnorm, v, offsetv, ldv, h, offseth, ldh, ipntr, offsetipntr, workd, offsetworkd, info);
  }

  protected void snaitrK(org.netlib.util.intW ido, String bmat, int n, int k, int np, int nb, float[] resid, int offsetresid, org.netlib.util.floatW rnorm, float[] v, int offsetv, int ldv, float[] h, int offseth, int ldh, int[] ipntr, int offsetipntr, float[] workd, int offsetworkd, org.netlib.util.intW info) {
    arpack.snaitr(ido, bmat, n, k, np, nb, resid, offsetresid, rnorm, v, offsetv, ldv, h, offseth, ldh, ipntr, offsetipntr, workd, offsetworkd, info);
  }

  protected void dnappsK(int n, org.netlib.util.intW kev, int np, double[] shiftr, int offsetshiftr, double[] shifti, int offsetshifti, double[] v, int offsetv, int ldv, double[] h, int offseth, int ldh, double[] resid, int offsetresid, double[] q, int offsetq, int ldq, double[] workl, int offsetworkl, double[] workd, int offsetworkd) {
    arpack.dnapps(n, kev, np, shiftr, offsetshiftr, shifti, offsetshifti, v, offsetv, ldv, h, offseth, ldh, resid, offsetresid, q, offsetq, ldq, workl, offsetworkl, workd, offsetworkd);
  }

  protected void snappsK(int n, org.netlib.util.intW kev, int np, float[] shiftr, int offsetshiftr, float[] shifti, int offsetshifti, float[] v, int offsetv, int ldv, float[] h, int offseth, int ldh, float[] resid, int offsetresid, float[] q, int offsetq, int ldq, float[] workl, int offsetworkl, float[] workd, int offsetworkd) {
    arpack.snapps(n, kev, np, shiftr, offsetshiftr, shifti, offsetshifti, v, offsetv, ldv, h, offseth, ldh, resid, offsetresid, q, offsetq, ldq, workl, offsetworkl, workd, offsetworkd);
  }

  protected void dnaup2K(org.netlib.util.intW ido, String bmat, int n, String which, org.netlib.util.intW nev, org.netlib.util.intW np, double tol, double[] resid, int offsetresid, int mode, int iupd, int ishift, org.netlib.util.intW mxiter, double[] v, int offsetv, int ldv, double[] h, int offseth, int ldh, double[] ritzr, int offsetritzr, double[] ritzi, int offsetritzi, double[] bounds, int offsetbounds, double[] q, int offsetq, int ldq, double[] workl, int offsetworkl, int[] ipntr, int offsetipntr, double[] workd, int offsetworkd, org.netlib.util.intW info) {
    arpack.dnaup2(ido, bmat, n, which, nev, np, tol, resid, offsetresid, mode, iupd, ishift, mxiter, v, offsetv, ldv, h, offseth, ldh, ritzr, offsetritzr, ritzi, offsetritzi, bounds, offsetbounds, q, offsetq, ldq, workl, offsetworkl, ipntr, offsetipntr, workd, offsetworkd, info);
  }

  protected void snaup2K(org.netlib.util.intW ido, String bmat, int n, String which, org.netlib.util.intW nev, org.netlib.util.intW np, float tol, float[] resid, int offsetresid, int mode, int iupd, int ishift, org.netlib.util.intW mxiter, float[] v, int offsetv, int ldv, float[] h, int offseth, int ldh, float[] ritzr, int offsetritzr, float[] ritzi, int offsetritzi, float[] bounds, int offsetbounds, float[] q, int offsetq, int ldq, float[] workl, int offsetworkl, int[] ipntr, int offsetipntr, float[] workd, int offsetworkd, org.netlib.util.intW info) {
    arpack.snaup2(ido, bmat, n, which, nev, np, tol, resid, offsetresid, mode, iupd, ishift, mxiter, v, offsetv, ldv, h, offseth, ldh, ritzr, offsetritzr, ritzi, offsetritzi, bounds, offsetbounds, q, offsetq, ldq, workl, offsetworkl, ipntr, offsetipntr, workd, offsetworkd, info);
  }

  protected void dnaupdK(org.netlib.util.intW ido, String bmat, int n, String which, int nev, org.netlib.util.doubleW tol, double[] resid, int offsetresid, int ncv, double[] v, int offsetv, int ldv, int[] iparam, int offsetiparam, int[] ipntr, int offsetipntr, double[] workd, int offsetworkd, double[] workl, int offsetworkl, int lworkl, org.netlib.util.intW info) {
    arpack.dnaupd(ido, bmat, n, which, nev, tol, resid, offsetresid, ncv, v, offsetv, ldv, iparam, offsetiparam, ipntr, offsetipntr, workd, offsetworkd, workl, offsetworkl, lworkl, info);
  }

  protected void snaupdK(org.netlib.util.intW ido, String bmat, int n, String which, int nev, org.netlib.util.floatW tol, float[] resid, int offsetresid, int ncv, float[] v, int offsetv, int ldv, int[] iparam, int offsetiparam, int[] ipntr, int offsetipntr, float[] workd, int offsetworkd, float[] workl, int offsetworkl, int lworkl, org.netlib.util.intW info) {
    arpack.snaupd(ido, bmat, n, which, nev, tol, resid, offsetresid, ncv, v, offsetv, ldv, iparam, offsetiparam, ipntr, offsetipntr, workd, offsetworkd, workl, offsetworkl, lworkl, info);
  }

  protected void dnconvK(int n, double[] ritzr, int offsetritzr, double[] ritzi, int offsetritzi, double[] bounds, int offsetbounds, double tol, org.netlib.util.intW nconv) {
    arpack.dnconv(n, ritzr, offsetritzr, ritzi, offsetritzi, bounds, offsetbounds, tol, nconv);
  }

  protected void snconvK(int n, float[] ritzr, int offsetritzr, float[] ritzi, int offsetritzi, float[] bounds, int offsetbounds, float tol, org.netlib.util.intW nconv) {
    arpack.snconv(n, ritzr, offsetritzr, ritzi, offsetritzi, bounds, offsetbounds, tol, nconv);
  }

  protected void dsconvK(int n, double[] ritz, int offsetritz, double[] bounds, int offsetbounds, double tol, org.netlib.util.intW nconv) {
    arpack.dsconv(n, ritz, offsetritz, bounds, offsetbounds, tol, nconv);
  }

  protected void ssconvK(int n, float[] ritz, int offsetritz, float[] bounds, int offsetbounds, float tol, org.netlib.util.intW nconv) {
    arpack.ssconv(n, ritz, offsetritz, bounds, offsetbounds, tol, nconv);
  }

  protected void dneighK(double rnorm, org.netlib.util.intW n, double[] h, int offseth, int ldh, double[] ritzr, int offsetritzr, double[] ritzi, int offsetritzi, double[] bounds, int offsetbounds, double[] q, int offsetq, int ldq, double[] workl, int offsetworkl, org.netlib.util.intW ierr) {
    arpack.dneigh(rnorm, n, h, offseth, ldh, ritzr, offsetritzr, ritzi, offsetritzi, bounds, offsetbounds, q, offsetq, ldq, workl, offsetworkl, ierr);
  }

  protected void sneighK(float rnorm, org.netlib.util.intW n, float[] h, int offseth, int ldh, float[] ritzr, int offsetritzr, float[] ritzi, int offsetritzi, float[] bounds, int offsetbounds, float[] q, int offsetq, int ldq, float[] workl, int offsetworkl, org.netlib.util.intW ierr) {
    arpack.sneigh(rnorm, n, h, offseth, ldh, ritzr, offsetritzr, ritzi, offsetritzi, bounds, offsetbounds, q, offsetq, ldq, workl, offsetworkl, ierr);
  }

  protected void dneupdK(boolean rvec, String howmny, boolean[] select, int offsetselect, double[] dr, int offsetdr, double[] di, int offsetdi, double[] z, int offsetz, int ldz, double sigmar, double sigmai, double[] workev, int offsetworkev, String bmat, int n, String which, org.netlib.util.intW nev, double tol, double[] resid, int offsetresid, int ncv, double[] v, int offsetv, int ldv, int[] iparam, int offsetiparam, int[] ipntr, int offsetipntr, double[] workd, int offsetworkd, double[] workl, int offsetworkl, int lworkl, org.netlib.util.intW info) {
    arpack.dneupd(rvec, howmny, select, offsetselect, dr, offsetdr, di, offsetdi, z, offsetz, ldz, sigmar, sigmai, workev, offsetworkev, bmat, n, which, nev, tol, resid, offsetresid, ncv, v, offsetv, ldv, iparam, offsetiparam, ipntr, offsetipntr, workd, offsetworkd, workl, offsetworkl, lworkl, info);
  }

  protected void sneupdK(boolean rvec, String howmny, boolean[] select, int offsetselect, float[] dr, int offsetdr, float[] di, int offsetdi, float[] z, int offsetz, int ldz, float sigmar, float sigmai, float[] workev, int offsetworkev, String bmat, int n, String which, org.netlib.util.intW nev, float tol, float[] resid, int offsetresid, int ncv, float[] v, int offsetv, int ldv, int[] iparam, int offsetiparam, int[] ipntr, int offsetipntr, float[] workd, int offsetworkd, float[] workl, int offsetworkl, int lworkl, org.netlib.util.intW info) {
    arpack.sneupd(rvec, howmny, select, offsetselect, dr, offsetdr, di, offsetdi, z, offsetz, ldz, sigmar, sigmai, workev, offsetworkev, bmat, n, which, nev, tol, resid, offsetresid, ncv, v, offsetv, ldv, iparam, offsetiparam, ipntr, offsetipntr, workd, offsetworkd, workl, offsetworkl, lworkl, info);
  }

  protected void dngetsK(int ishift, String which, org.netlib.util.intW kev, org.netlib.util.intW np, double[] ritzr, int offsetritzr, double[] ritzi, int offsetritzi, double[] bounds, int offsetbounds, double[] shiftr, int offsetshiftr, double[] shifti, int offsetshifti) {
    arpack.dngets(ishift, which, kev, np, ritzr, offsetritzr, ritzi, offsetritzi, bounds, offsetbounds, shiftr, offsetshiftr, shifti, offsetshifti);
  }

  protected void sngetsK(int ishift, String which, org.netlib.util.intW kev, org.netlib.util.intW np, float[] ritzr, int offsetritzr, float[] ritzi, int offsetritzi, float[] bounds, int offsetbounds, float[] shiftr, int offsetshiftr, float[] shifti, int offsetshifti) {
    arpack.sngets(ishift, which, kev, np, ritzr, offsetritzr, ritzi, offsetritzi, bounds, offsetbounds, shiftr, offsetshiftr, shifti, offsetshifti);
  }

  protected void dsaitrK(org.netlib.util.intW ido, String bmat, int n, int k, int np, int mode, double[] resid, int offsetresid, org.netlib.util.doubleW rnorm, double[] v, int offsetv, int ldv, double[] h, int offseth, int ldh, int[] ipntr, int offsetipntr, double[] workd, int offsetworkd, org.netlib.util.intW info) {
    arpack.dsaitr(ido, bmat, n, k, np, mode, resid, offsetresid, rnorm, v, offsetv, ldv, h, offseth, ldh, ipntr, offsetipntr, workd, offsetworkd, info);
  }

  protected void ssaitrK(org.netlib.util.intW ido, String bmat, int n, int k, int np, int mode, float[] resid, int offsetresid, org.netlib.util.floatW rnorm, float[] v, int offsetv, int ldv, float[] h, int offseth, int ldh, int[] ipntr, int offsetipntr, float[] workd, int offsetworkd, org.netlib.util.intW info) {
    arpack.ssaitr(ido, bmat, n, k, np, mode, resid, offsetresid, rnorm, v, offsetv, ldv, h, offseth, ldh, ipntr, offsetipntr, workd, offsetworkd, info);
  }

  protected void dsappsK(int n, int kev, int np, double[] shift, int offsetshift, double[] v, int offsetv, int ldv, double[] h, int offseth, int ldh, double[] resid, int offsetresid, double[] q, int offsetq, int ldq, double[] workd, int offsetworkd) {
    arpack.dsapps(n, kev, np, shift, offsetshift, v, offsetv, ldv, h, offseth, ldh, resid, offsetresid, q, offsetq, ldq, workd, offsetworkd);
  }

  protected void ssappsK(int n, int kev, int np, float[] shift, int offsetshift, float[] v, int offsetv, int ldv, float[] h, int offseth, int ldh, float[] resid, int offsetresid, float[] q, int offsetq, int ldq, float[] workd, int offsetworkd) {
    arpack.ssapps(n, kev, np, shift, offsetshift, v, offsetv, ldv, h, offseth, ldh, resid, offsetresid, q, offsetq, ldq, workd, offsetworkd);
  }

  protected void dsaup2K(org.netlib.util.intW ido, String bmat, int n, String which, org.netlib.util.intW nev, org.netlib.util.intW np, double tol, double[] resid, int offsetresid, int mode, int iupd, int ishift, org.netlib.util.intW mxiter, double[] v, int offsetv, int ldv, double[] h, int offseth, int ldh, double[] ritz, int offsetritz, double[] bounds, int offsetbounds, double[] q, int offsetq, int ldq, double[] workl, int offsetworkl, int[] ipntr, int offsetipntr, double[] workd, int offsetworkd, org.netlib.util.intW info) {
    arpack.dsaup2(ido, bmat, n, which, nev, np, tol, resid, offsetresid, mode, iupd, ishift, mxiter, v, offsetv, ldv, h, offseth, ldh, ritz, offsetritz, bounds, offsetbounds, q, offsetq, ldq, workl, offsetworkl, ipntr, offsetipntr, workd, offsetworkd, info);
  }

  protected void ssaup2K(org.netlib.util.intW ido, String bmat, int n, String which, org.netlib.util.intW nev, org.netlib.util.intW np, float tol, float[] resid, int offsetresid, int mode, int iupd, int ishift, org.netlib.util.intW mxiter, float[] v, int offsetv, int ldv, float[] h, int offseth, int ldh, float[] ritz, int offsetritz, float[] bounds, int offsetbounds, float[] q, int offsetq, int ldq, float[] workl, int offsetworkl, int[] ipntr, int offsetipntr, float[] workd, int offsetworkd, org.netlib.util.intW info) {
    arpack.ssaup2(ido, bmat, n, which, nev, np, tol, resid, offsetresid, mode, iupd, ishift, mxiter, v, offsetv, ldv, h, offseth, ldh, ritz, offsetritz, bounds, offsetbounds, q, offsetq, ldq, workl, offsetworkl, ipntr, offsetipntr, workd, offsetworkd, info);
  }

  protected void dseigtK(double rnorm, int n, double[] h, int offseth, int ldh, double[] eig, int offseteig, double[] bounds, int offsetbounds, double[] workl, int offsetworkl, org.netlib.util.intW ierr) {
    arpack.dseigt(rnorm, n, h, offseth, ldh, eig, offseteig, bounds, offsetbounds, workl, offsetworkl, ierr);
  }

  protected void sseigtK(float rnorm, int n, float[] h, int offseth, int ldh, float[] eig, int offseteig, float[] bounds, int offsetbounds, float[] workl, int offsetworkl, org.netlib.util.intW ierr) {
    arpack.sseigt(rnorm, n, h, offseth, ldh, eig, offseteig, bounds, offsetbounds, workl, offsetworkl, ierr);
  }

  protected void dsesrtK(String which, boolean apply, int n, double[] x, int offsetx, int na, double[] a, int offseta, int lda) {
    arpack.dsesrt(which, apply, n, x, offsetx, na, a, offseta, lda);
  }

  protected void ssesrtK(String which, boolean apply, int n, float[] x, int offsetx, int na, float[] a, int offseta, int lda) {
    arpack.ssesrt(which, apply, n, x, offsetx, na, a, offseta, lda);
  }

  protected void dsaupdK(org.netlib.util.intW ido, String bmat, int n, String which, int nev, org.netlib.util.doubleW tol, double[] resid, int offsetresid, int ncv, double[] v, int offsetv, int ldv, int[] iparam, int offsetiparam, int[] ipntr, int offsetipntr, double[] workd, int offsetworkd, double[] workl, int offsetworkl, int lworkl, org.netlib.util.intW info) {
    arpack.dsaupd(ido, bmat, n, which, nev, tol, resid, offsetresid, ncv, v, offsetv, ldv, iparam, offsetiparam, ipntr, offsetipntr, workd, offsetworkd, workl, offsetworkl, lworkl, info);
  }

  protected void ssaupdK(org.netlib.util.intW ido, String bmat, int n, String which, int nev, org.netlib.util.floatW tol, float[] resid, int offsetresid, int ncv, float[] v, int offsetv, int ldv, int[] iparam, int offsetiparam, int[] ipntr, int offsetipntr, float[] workd, int offsetworkd, float[] workl, int offsetworkl, int lworkl, org.netlib.util.intW info) {
    arpack.ssaupd(ido, bmat, n, which, nev, tol, resid, offsetresid, ncv, v, offsetv, ldv, iparam, offsetiparam, ipntr, offsetipntr, workd, offsetworkd, workl, offsetworkl, lworkl, info);
  }

  protected void dseupdK(boolean rvec, String howmny, boolean[] select, int offsetselect, double[] d, int offsetd, double[] z, int offsetz, int ldz, double sigma, String bmat, int n, String which, org.netlib.util.intW nev, double tol, double[] resid, int offsetresid, int ncv, double[] v, int offsetv, int ldv, int[] iparam, int offsetiparam, int[] ipntr, int offsetipntr, double[] workd, int offsetworkd, double[] workl, int offsetworkl, int lworkl, org.netlib.util.intW info) {
    arpack.dseupd(rvec, howmny, select, offsetselect, d, offsetd, z, offsetz, ldz, sigma, bmat, n, which, nev, tol, resid, offsetresid, ncv, v, offsetv, ldv, iparam, offsetiparam, ipntr, offsetipntr, workd, offsetworkd, workl, offsetworkl, lworkl, info);
  }

  protected void sseupdK(boolean rvec, String howmny, boolean[] select, int offsetselect, float[] d, int offsetd, float[] z, int offsetz, int ldz, float sigma, String bmat, int n, String which, org.netlib.util.intW nev, float tol, float[] resid, int offsetresid, int ncv, float[] v, int offsetv, int ldv, int[] iparam, int offsetiparam, int[] ipntr, int offsetipntr, float[] workd, int offsetworkd, float[] workl, int offsetworkl, int lworkl, org.netlib.util.intW info) {
    arpack.sseupd(rvec, howmny, select, offsetselect, d, offsetd, z, offsetz, ldz, sigma, bmat, n, which, nev, tol, resid, offsetresid, ncv, v, offsetv, ldv, iparam, offsetiparam, ipntr, offsetipntr, workd, offsetworkd, workl, offsetworkl, lworkl, info);
  }

  protected void dsgetsK(int ishift, String which, org.netlib.util.intW kev, org.netlib.util.intW np, double[] ritz, int offsetritz, double[] bounds, int offsetbounds, double[] shifts, int offsetshifts) {
    arpack.dsgets(ishift, which, kev, np, ritz, offsetritz, bounds, offsetbounds, shifts, offsetshifts);
  }

  protected void ssgetsK(int ishift, String which, org.netlib.util.intW kev, org.netlib.util.intW np, float[] ritz, int offsetritz, float[] bounds, int offsetbounds, float[] shifts, int offsetshifts) {
    arpack.ssgets(ishift, which, kev, np, ritz, offsetritz, bounds, offsetbounds, shifts, offsetshifts);
  }

  protected void dsortcK(String which, boolean apply, int n, double[] xreal, int offsetxreal, double[] ximag, int offsetximag, double[] y, int offsety) {
    arpack.dsortc(which, apply, n, xreal, offsetxreal, ximag, offsetximag, y, offsety);
  }

  protected void ssortcK(String which, boolean apply, int n, float[] xreal, int offsetxreal, float[] ximag, int offsetximag, float[] y, int offsety) {
    arpack.ssortc(which, apply, n, xreal, offsetxreal, ximag, offsetximag, y, offsety);
  }

  protected void dsortrK(String which, boolean apply, int n, double[] x1, int offsetx1, double[] x2, int offsetx2) {
    arpack.dsortr(which, apply, n, x1, offsetx1, x2, offsetx2);
  }

  protected void ssortrK(String which, boolean apply, int n, float[] x1, int offsetx1, float[] x2, int offsetx2) {
    arpack.ssortr(which, apply, n, x1, offsetx1, x2, offsetx2);
  }

  protected void dstatnK() {
    arpack.dstatn();
  }

  protected void sstatnK() {
    arpack.sstatn();
  }

  protected void dstatsK() {
    arpack.dstats();
  }

  protected void sstatsK() {
    arpack.sstats();
  }

  protected void dstqrbK(int n, double[] d, int offsetd, double[] e, int offsete, double[] z, int offsetz, double[] work, int offsetwork, org.netlib.util.intW info) {
    arpack.dstqrb(n, d, offsetd, e, offsete, z, offsetz, work, offsetwork, info);
  }

  protected void sstqrbK(int n, float[] d, int offsetd, float[] e, int offsete, float[] z, int offsetz, float[] work, int offsetwork, org.netlib.util.intW info) {
    arpack.sstqrb(n, d, offsetd, e, offsete, z, offsetz, work, offsetwork, info);
  }

  protected int icnteqK(int n, int[] array, int offsetarray, int value) {
    return arpack.icnteq(n, array, offsetarray, value);
  }

  protected void icopyK(int n, int[] lx, int offsetlx, int incx, int[] ly, int offsetly, int incy) {
    arpack.icopy(n, lx, offsetlx, incx, ly, offsetly, incy);
  }

  protected void isetK(int n, int value, int[] array, int offsetarray, int inc) {
    arpack.iset(n, value, array, offsetarray, inc);
  }

  protected void iswapK(int n, int[] sx, int offsetsx, int incx, int[] sy, int offsetsy, int incy) {
    arpack.iswap(n, sx, offsetsx, incx, sy, offsetsy, incy);
  }

  protected void secondK(org.netlib.util.floatW t) {
    arpack.second(t);
  }
}
