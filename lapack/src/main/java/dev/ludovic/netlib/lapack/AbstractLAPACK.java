/*
 * Copyright 2020, 2021, Ludovic Henry
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 * Please contact git@ludovic.dev or visit ludovic.dev if you need additional
 * information or have any questions.
 */

package dev.ludovic.netlib.lapack;

import dev.ludovic.netlib.LAPACK;

abstract class AbstractLAPACK implements LAPACK {

  public void dbdsdc(String uplo, String compq, int n, double[] d, double[] e, double[] u, int ldu, double[] vt, int ldvt, double[] q, int[] iq, double[] work, int[] iwork, org.netlib.util.intW info) {
    dbdsdc(uplo, compq, n, d, 0, e, 0, u, 0, ldu, vt, 0, ldvt, q, 0, iq, 0, work, 0, iwork, 0, info);
  }

  public void dbdsdc(String uplo, String compq, int n, double[] d, int offsetd, double[] e, int offsete, double[] u, int offsetu, int ldu, double[] vt, int offsetvt, int ldvt, double[] q, int offsetq, int[] iq, int offsetiq, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dbdsdcK(uplo, compq, n, d, offsetd, e, offsete, u, offsetu, ldu, vt, offsetvt, ldvt, q, offsetq, iq, offsetiq, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dbdsdcK(String uplo, String compq, int n, double[] d, int offsetd, double[] e, int offsete, double[] u, int offsetu, int ldu, double[] vt, int offsetvt, int ldvt, double[] q, int offsetq, int[] iq, int offsetiq, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dbdsqr(String uplo, int n, int ncvt, int nru, int ncc, double[] d, double[] e, double[] vt, int ldvt, double[] u, int ldu, double[] c, int Ldc, double[] work, org.netlib.util.intW info) {
    dbdsqr(uplo, n, ncvt, nru, ncc, d, 0, e, 0, vt, 0, ldvt, u, 0, ldu, c, 0, Ldc, work, 0, info);
  }

  public void dbdsqr(String uplo, int n, int ncvt, int nru, int ncc, double[] d, int offsetd, double[] e, int offsete, double[] vt, int offsetvt, int ldvt, double[] u, int offsetu, int ldu, double[] c, int offsetc, int Ldc, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dbdsqrK(uplo, n, ncvt, nru, ncc, d, offsetd, e, offsete, vt, offsetvt, ldvt, u, offsetu, ldu, c, offsetc, Ldc, work, offsetwork, info);
  }

  protected abstract void dbdsqrK(String uplo, int n, int ncvt, int nru, int ncc, double[] d, int offsetd, double[] e, int offsete, double[] vt, int offsetvt, int ldvt, double[] u, int offsetu, int ldu, double[] c, int offsetc, int Ldc, double[] work, int offsetwork, org.netlib.util.intW info);

  public void ddisna(String job, int m, int n, double[] d, double[] sep, org.netlib.util.intW info) {
    ddisna(job, m, n, d, 0, sep, 0, info);
  }

  public void ddisna(String job, int m, int n, double[] d, int offsetd, double[] sep, int offsetsep, org.netlib.util.intW info) {
    //FIXME Add arguments check
    ddisnaK(job, m, n, d, offsetd, sep, offsetsep, info);
  }

  protected abstract void ddisnaK(String job, int m, int n, double[] d, int offsetd, double[] sep, int offsetsep, org.netlib.util.intW info);

  public void dgbbrd(String vect, int m, int n, int ncc, int kl, int ku, double[] ab, int ldab, double[] d, double[] e, double[] q, int ldq, double[] pt, int ldpt, double[] c, int Ldc, double[] work, org.netlib.util.intW info) {
    dgbbrd(vect, m, n, ncc, kl, ku, ab, 0, ldab, d, 0, e, 0, q, 0, ldq, pt, 0, ldpt, c, 0, Ldc, work, 0, info);
  }

  public void dgbbrd(String vect, int m, int n, int ncc, int kl, int ku, double[] ab, int offsetab, int ldab, double[] d, int offsetd, double[] e, int offsete, double[] q, int offsetq, int ldq, double[] pt, int offsetpt, int ldpt, double[] c, int offsetc, int Ldc, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgbbrdK(vect, m, n, ncc, kl, ku, ab, offsetab, ldab, d, offsetd, e, offsete, q, offsetq, ldq, pt, offsetpt, ldpt, c, offsetc, Ldc, work, offsetwork, info);
  }

  protected abstract void dgbbrdK(String vect, int m, int n, int ncc, int kl, int ku, double[] ab, int offsetab, int ldab, double[] d, int offsetd, double[] e, int offsete, double[] q, int offsetq, int ldq, double[] pt, int offsetpt, int ldpt, double[] c, int offsetc, int Ldc, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dgbcon(String norm, int n, int kl, int ku, double[] ab, int ldab, int[] ipiv, double anorm, org.netlib.util.doubleW rcond, double[] work, int[] iwork, org.netlib.util.intW info) {
    dgbcon(norm, n, kl, ku, ab, 0, ldab, ipiv, 0, anorm, rcond, work, 0, iwork, 0, info);
  }

  public void dgbcon(String norm, int n, int kl, int ku, double[] ab, int offsetab, int ldab, int[] ipiv, int offsetipiv, double anorm, org.netlib.util.doubleW rcond, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgbconK(norm, n, kl, ku, ab, offsetab, ldab, ipiv, offsetipiv, anorm, rcond, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dgbconK(String norm, int n, int kl, int ku, double[] ab, int offsetab, int ldab, int[] ipiv, int offsetipiv, double anorm, org.netlib.util.doubleW rcond, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dgbequ(int m, int n, int kl, int ku, double[] ab, int ldab, double[] r, double[] c, org.netlib.util.doubleW rowcnd, org.netlib.util.doubleW colcnd, org.netlib.util.doubleW amax, org.netlib.util.intW info) {
    dgbequ(m, n, kl, ku, ab, 0, ldab, r, 0, c, 0, rowcnd, colcnd, amax, info);
  }

  public void dgbequ(int m, int n, int kl, int ku, double[] ab, int offsetab, int ldab, double[] r, int offsetr, double[] c, int offsetc, org.netlib.util.doubleW rowcnd, org.netlib.util.doubleW colcnd, org.netlib.util.doubleW amax, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgbequK(m, n, kl, ku, ab, offsetab, ldab, r, offsetr, c, offsetc, rowcnd, colcnd, amax, info);
  }

  protected abstract void dgbequK(int m, int n, int kl, int ku, double[] ab, int offsetab, int ldab, double[] r, int offsetr, double[] c, int offsetc, org.netlib.util.doubleW rowcnd, org.netlib.util.doubleW colcnd, org.netlib.util.doubleW amax, org.netlib.util.intW info);

  public void dgbrfs(String trans, int n, int kl, int ku, int nrhs, double[] ab, int ldab, double[] afb, int ldafb, int[] ipiv, double[] b, int ldb, double[] x, int ldx, double[] ferr, double[] berr, double[] work, int[] iwork, org.netlib.util.intW info) {
    dgbrfs(trans, n, kl, ku, nrhs, ab, 0, ldab, afb, 0, ldafb, ipiv, 0, b, 0, ldb, x, 0, ldx, ferr, 0, berr, 0, work, 0, iwork, 0, info);
  }

  public void dgbrfs(String trans, int n, int kl, int ku, int nrhs, double[] ab, int offsetab, int ldab, double[] afb, int offsetafb, int ldafb, int[] ipiv, int offsetipiv, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgbrfsK(trans, n, kl, ku, nrhs, ab, offsetab, ldab, afb, offsetafb, ldafb, ipiv, offsetipiv, b, offsetb, ldb, x, offsetx, ldx, ferr, offsetferr, berr, offsetberr, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dgbrfsK(String trans, int n, int kl, int ku, int nrhs, double[] ab, int offsetab, int ldab, double[] afb, int offsetafb, int ldafb, int[] ipiv, int offsetipiv, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dgbsv(int n, int kl, int ku, int nrhs, double[] ab, int ldab, int[] ipiv, double[] b, int ldb, org.netlib.util.intW info) {
    dgbsv(n, kl, ku, nrhs, ab, 0, ldab, ipiv, 0, b, 0, ldb, info);
  }

  public void dgbsv(int n, int kl, int ku, int nrhs, double[] ab, int offsetab, int ldab, int[] ipiv, int offsetipiv, double[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgbsvK(n, kl, ku, nrhs, ab, offsetab, ldab, ipiv, offsetipiv, b, offsetb, ldb, info);
  }

  protected abstract void dgbsvK(int n, int kl, int ku, int nrhs, double[] ab, int offsetab, int ldab, int[] ipiv, int offsetipiv, double[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void dgbsvx(String fact, String trans, int n, int kl, int ku, int nrhs, double[] ab, int ldab, double[] afb, int ldafb, int[] ipiv, org.netlib.util.StringW equed, double[] r, double[] c, double[] b, int ldb, double[] x, int ldx, org.netlib.util.doubleW rcond, double[] ferr, double[] berr, double[] work, int[] iwork, org.netlib.util.intW info) {
    dgbsvx(fact, trans, n, kl, ku, nrhs, ab, 0, ldab, afb, 0, ldafb, ipiv, 0, equed, r, 0, c, 0, b, 0, ldb, x, 0, ldx, rcond, ferr, 0, berr, 0, work, 0, iwork, 0, info);
  }

  public void dgbsvx(String fact, String trans, int n, int kl, int ku, int nrhs, double[] ab, int offsetab, int ldab, double[] afb, int offsetafb, int ldafb, int[] ipiv, int offsetipiv, org.netlib.util.StringW equed, double[] r, int offsetr, double[] c, int offsetc, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, org.netlib.util.doubleW rcond, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgbsvxK(fact, trans, n, kl, ku, nrhs, ab, offsetab, ldab, afb, offsetafb, ldafb, ipiv, offsetipiv, equed, r, offsetr, c, offsetc, b, offsetb, ldb, x, offsetx, ldx, rcond, ferr, offsetferr, berr, offsetberr, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dgbsvxK(String fact, String trans, int n, int kl, int ku, int nrhs, double[] ab, int offsetab, int ldab, double[] afb, int offsetafb, int ldafb, int[] ipiv, int offsetipiv, org.netlib.util.StringW equed, double[] r, int offsetr, double[] c, int offsetc, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, org.netlib.util.doubleW rcond, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dgbtf2(int m, int n, int kl, int ku, double[] ab, int ldab, int[] ipiv, org.netlib.util.intW info) {
    dgbtf2(m, n, kl, ku, ab, 0, ldab, ipiv, 0, info);
  }

  public void dgbtf2(int m, int n, int kl, int ku, double[] ab, int offsetab, int ldab, int[] ipiv, int offsetipiv, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgbtf2K(m, n, kl, ku, ab, offsetab, ldab, ipiv, offsetipiv, info);
  }

  protected abstract void dgbtf2K(int m, int n, int kl, int ku, double[] ab, int offsetab, int ldab, int[] ipiv, int offsetipiv, org.netlib.util.intW info);

  public void dgbtrf(int m, int n, int kl, int ku, double[] ab, int ldab, int[] ipiv, org.netlib.util.intW info) {
    dgbtrf(m, n, kl, ku, ab, 0, ldab, ipiv, 0, info);
  }

  public void dgbtrf(int m, int n, int kl, int ku, double[] ab, int offsetab, int ldab, int[] ipiv, int offsetipiv, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgbtrfK(m, n, kl, ku, ab, offsetab, ldab, ipiv, offsetipiv, info);
  }

  protected abstract void dgbtrfK(int m, int n, int kl, int ku, double[] ab, int offsetab, int ldab, int[] ipiv, int offsetipiv, org.netlib.util.intW info);

  public void dgbtrs(String trans, int n, int kl, int ku, int nrhs, double[] ab, int ldab, int[] ipiv, double[] b, int ldb, org.netlib.util.intW info) {
    dgbtrs(trans, n, kl, ku, nrhs, ab, 0, ldab, ipiv, 0, b, 0, ldb, info);
  }

  public void dgbtrs(String trans, int n, int kl, int ku, int nrhs, double[] ab, int offsetab, int ldab, int[] ipiv, int offsetipiv, double[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgbtrsK(trans, n, kl, ku, nrhs, ab, offsetab, ldab, ipiv, offsetipiv, b, offsetb, ldb, info);
  }

  protected abstract void dgbtrsK(String trans, int n, int kl, int ku, int nrhs, double[] ab, int offsetab, int ldab, int[] ipiv, int offsetipiv, double[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void dgebak(String job, String side, int n, int ilo, int ihi, double[] scale, int m, double[] v, int ldv, org.netlib.util.intW info) {
    dgebak(job, side, n, ilo, ihi, scale, 0, m, v, 0, ldv, info);
  }

  public void dgebak(String job, String side, int n, int ilo, int ihi, double[] scale, int offsetscale, int m, double[] v, int offsetv, int ldv, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgebakK(job, side, n, ilo, ihi, scale, offsetscale, m, v, offsetv, ldv, info);
  }

  protected abstract void dgebakK(String job, String side, int n, int ilo, int ihi, double[] scale, int offsetscale, int m, double[] v, int offsetv, int ldv, org.netlib.util.intW info);

  public void dgebal(String job, int n, double[] a, int lda, org.netlib.util.intW ilo, org.netlib.util.intW ihi, double[] scale, org.netlib.util.intW info) {
    dgebal(job, n, a, 0, lda, ilo, ihi, scale, 0, info);
  }

  public void dgebal(String job, int n, double[] a, int offseta, int lda, org.netlib.util.intW ilo, org.netlib.util.intW ihi, double[] scale, int offsetscale, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgebalK(job, n, a, offseta, lda, ilo, ihi, scale, offsetscale, info);
  }

  protected abstract void dgebalK(String job, int n, double[] a, int offseta, int lda, org.netlib.util.intW ilo, org.netlib.util.intW ihi, double[] scale, int offsetscale, org.netlib.util.intW info);

  public void dgebd2(int m, int n, double[] a, int lda, double[] d, double[] e, double[] tauq, double[] taup, double[] work, org.netlib.util.intW info) {
    dgebd2(m, n, a, 0, lda, d, 0, e, 0, tauq, 0, taup, 0, work, 0, info);
  }

  public void dgebd2(int m, int n, double[] a, int offseta, int lda, double[] d, int offsetd, double[] e, int offsete, double[] tauq, int offsettauq, double[] taup, int offsettaup, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgebd2K(m, n, a, offseta, lda, d, offsetd, e, offsete, tauq, offsettauq, taup, offsettaup, work, offsetwork, info);
  }

  protected abstract void dgebd2K(int m, int n, double[] a, int offseta, int lda, double[] d, int offsetd, double[] e, int offsete, double[] tauq, int offsettauq, double[] taup, int offsettaup, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dgebrd(int m, int n, double[] a, int lda, double[] d, double[] e, double[] tauq, double[] taup, double[] work, int lwork, org.netlib.util.intW info) {
    dgebrd(m, n, a, 0, lda, d, 0, e, 0, tauq, 0, taup, 0, work, 0, lwork, info);
  }

  public void dgebrd(int m, int n, double[] a, int offseta, int lda, double[] d, int offsetd, double[] e, int offsete, double[] tauq, int offsettauq, double[] taup, int offsettaup, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgebrdK(m, n, a, offseta, lda, d, offsetd, e, offsete, tauq, offsettauq, taup, offsettaup, work, offsetwork, lwork, info);
  }

  protected abstract void dgebrdK(int m, int n, double[] a, int offseta, int lda, double[] d, int offsetd, double[] e, int offsete, double[] tauq, int offsettauq, double[] taup, int offsettaup, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dgecon(String norm, int n, double[] a, int lda, double anorm, org.netlib.util.doubleW rcond, double[] work, int[] iwork, org.netlib.util.intW info) {
    dgecon(norm, n, a, 0, lda, anorm, rcond, work, 0, iwork, 0, info);
  }

  public void dgecon(String norm, int n, double[] a, int offseta, int lda, double anorm, org.netlib.util.doubleW rcond, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgeconK(norm, n, a, offseta, lda, anorm, rcond, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dgeconK(String norm, int n, double[] a, int offseta, int lda, double anorm, org.netlib.util.doubleW rcond, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dgeequ(int m, int n, double[] a, int lda, double[] r, double[] c, org.netlib.util.doubleW rowcnd, org.netlib.util.doubleW colcnd, org.netlib.util.doubleW amax, org.netlib.util.intW info) {
    dgeequ(m, n, a, 0, lda, r, 0, c, 0, rowcnd, colcnd, amax, info);
  }

  public void dgeequ(int m, int n, double[] a, int offseta, int lda, double[] r, int offsetr, double[] c, int offsetc, org.netlib.util.doubleW rowcnd, org.netlib.util.doubleW colcnd, org.netlib.util.doubleW amax, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgeequK(m, n, a, offseta, lda, r, offsetr, c, offsetc, rowcnd, colcnd, amax, info);
  }

  protected abstract void dgeequK(int m, int n, double[] a, int offseta, int lda, double[] r, int offsetr, double[] c, int offsetc, org.netlib.util.doubleW rowcnd, org.netlib.util.doubleW colcnd, org.netlib.util.doubleW amax, org.netlib.util.intW info);

  public void dgees(String jobvs, String sort, java.lang.Object select, int n, double[] a, int lda, org.netlib.util.intW sdim, double[] wr, double[] wi, double[] vs, int ldvs, double[] work, int lwork, boolean[] bwork, org.netlib.util.intW info) {
    dgees(jobvs, sort, select, n, a, 0, lda, sdim, wr, 0, wi, 0, vs, 0, ldvs, work, 0, lwork, bwork, 0, info);
  }

  public void dgees(String jobvs, String sort, java.lang.Object select, int n, double[] a, int offseta, int lda, org.netlib.util.intW sdim, double[] wr, int offsetwr, double[] wi, int offsetwi, double[] vs, int offsetvs, int ldvs, double[] work, int offsetwork, int lwork, boolean[] bwork, int offsetbwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgeesK(jobvs, sort, select, n, a, offseta, lda, sdim, wr, offsetwr, wi, offsetwi, vs, offsetvs, ldvs, work, offsetwork, lwork, bwork, offsetbwork, info);
  }

  protected abstract void dgeesK(String jobvs, String sort, java.lang.Object select, int n, double[] a, int offseta, int lda, org.netlib.util.intW sdim, double[] wr, int offsetwr, double[] wi, int offsetwi, double[] vs, int offsetvs, int ldvs, double[] work, int offsetwork, int lwork, boolean[] bwork, int offsetbwork, org.netlib.util.intW info);

  public void dgeesx(String jobvs, String sort, java.lang.Object select, String sense, int n, double[] a, int lda, org.netlib.util.intW sdim, double[] wr, double[] wi, double[] vs, int ldvs, org.netlib.util.doubleW rconde, org.netlib.util.doubleW rcondv, double[] work, int lwork, int[] iwork, int liwork, boolean[] bwork, org.netlib.util.intW info) {
    dgeesx(jobvs, sort, select, sense, n, a, 0, lda, sdim, wr, 0, wi, 0, vs, 0, ldvs, rconde, rcondv, work, 0, lwork, iwork, 0, liwork, bwork, 0, info);
  }

  public void dgeesx(String jobvs, String sort, java.lang.Object select, String sense, int n, double[] a, int offseta, int lda, org.netlib.util.intW sdim, double[] wr, int offsetwr, double[] wi, int offsetwi, double[] vs, int offsetvs, int ldvs, org.netlib.util.doubleW rconde, org.netlib.util.doubleW rcondv, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, boolean[] bwork, int offsetbwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgeesxK(jobvs, sort, select, sense, n, a, offseta, lda, sdim, wr, offsetwr, wi, offsetwi, vs, offsetvs, ldvs, rconde, rcondv, work, offsetwork, lwork, iwork, offsetiwork, liwork, bwork, offsetbwork, info);
  }

  protected abstract void dgeesxK(String jobvs, String sort, java.lang.Object select, String sense, int n, double[] a, int offseta, int lda, org.netlib.util.intW sdim, double[] wr, int offsetwr, double[] wi, int offsetwi, double[] vs, int offsetvs, int ldvs, org.netlib.util.doubleW rconde, org.netlib.util.doubleW rcondv, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, boolean[] bwork, int offsetbwork, org.netlib.util.intW info);

  public void dgeev(String jobvl, String jobvr, int n, double[] a, int lda, double[] wr, double[] wi, double[] vl, int ldvl, double[] vr, int ldvr, double[] work, int lwork, org.netlib.util.intW info) {
    dgeev(jobvl, jobvr, n, a, 0, lda, wr, 0, wi, 0, vl, 0, ldvl, vr, 0, ldvr, work, 0, lwork, info);
  }

  public void dgeev(String jobvl, String jobvr, int n, double[] a, int offseta, int lda, double[] wr, int offsetwr, double[] wi, int offsetwi, double[] vl, int offsetvl, int ldvl, double[] vr, int offsetvr, int ldvr, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgeevK(jobvl, jobvr, n, a, offseta, lda, wr, offsetwr, wi, offsetwi, vl, offsetvl, ldvl, vr, offsetvr, ldvr, work, offsetwork, lwork, info);
  }

  protected abstract void dgeevK(String jobvl, String jobvr, int n, double[] a, int offseta, int lda, double[] wr, int offsetwr, double[] wi, int offsetwi, double[] vl, int offsetvl, int ldvl, double[] vr, int offsetvr, int ldvr, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dgeevx(String balanc, String jobvl, String jobvr, String sense, int n, double[] a, int lda, double[] wr, double[] wi, double[] vl, int ldvl, double[] vr, int ldvr, org.netlib.util.intW ilo, org.netlib.util.intW ihi, double[] scale, org.netlib.util.doubleW abnrm, double[] rconde, double[] rcondv, double[] work, int lwork, int[] iwork, org.netlib.util.intW info) {
    dgeevx(balanc, jobvl, jobvr, sense, n, a, 0, lda, wr, 0, wi, 0, vl, 0, ldvl, vr, 0, ldvr, ilo, ihi, scale, 0, abnrm, rconde, 0, rcondv, 0, work, 0, lwork, iwork, 0, info);
  }

  public void dgeevx(String balanc, String jobvl, String jobvr, String sense, int n, double[] a, int offseta, int lda, double[] wr, int offsetwr, double[] wi, int offsetwi, double[] vl, int offsetvl, int ldvl, double[] vr, int offsetvr, int ldvr, org.netlib.util.intW ilo, org.netlib.util.intW ihi, double[] scale, int offsetscale, org.netlib.util.doubleW abnrm, double[] rconde, int offsetrconde, double[] rcondv, int offsetrcondv, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgeevxK(balanc, jobvl, jobvr, sense, n, a, offseta, lda, wr, offsetwr, wi, offsetwi, vl, offsetvl, ldvl, vr, offsetvr, ldvr, ilo, ihi, scale, offsetscale, abnrm, rconde, offsetrconde, rcondv, offsetrcondv, work, offsetwork, lwork, iwork, offsetiwork, info);
  }

  protected abstract void dgeevxK(String balanc, String jobvl, String jobvr, String sense, int n, double[] a, int offseta, int lda, double[] wr, int offsetwr, double[] wi, int offsetwi, double[] vl, int offsetvl, int ldvl, double[] vr, int offsetvr, int ldvr, org.netlib.util.intW ilo, org.netlib.util.intW ihi, double[] scale, int offsetscale, org.netlib.util.doubleW abnrm, double[] rconde, int offsetrconde, double[] rcondv, int offsetrcondv, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dgegs(String jobvsl, String jobvsr, int n, double[] a, int lda, double[] b, int ldb, double[] alphar, double[] alphai, double[] beta, double[] vsl, int ldvsl, double[] vsr, int ldvsr, double[] work, int lwork, org.netlib.util.intW info) {
    dgegs(jobvsl, jobvsr, n, a, 0, lda, b, 0, ldb, alphar, 0, alphai, 0, beta, 0, vsl, 0, ldvsl, vsr, 0, ldvsr, work, 0, lwork, info);
  }

  public void dgegs(String jobvsl, String jobvsr, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] alphar, int offsetalphar, double[] alphai, int offsetalphai, double[] beta, int offsetbeta, double[] vsl, int offsetvsl, int ldvsl, double[] vsr, int offsetvsr, int ldvsr, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgegsK(jobvsl, jobvsr, n, a, offseta, lda, b, offsetb, ldb, alphar, offsetalphar, alphai, offsetalphai, beta, offsetbeta, vsl, offsetvsl, ldvsl, vsr, offsetvsr, ldvsr, work, offsetwork, lwork, info);
  }

  protected abstract void dgegsK(String jobvsl, String jobvsr, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] alphar, int offsetalphar, double[] alphai, int offsetalphai, double[] beta, int offsetbeta, double[] vsl, int offsetvsl, int ldvsl, double[] vsr, int offsetvsr, int ldvsr, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dgegv(String jobvl, String jobvr, int n, double[] a, int lda, double[] b, int ldb, double[] alphar, double[] alphai, double[] beta, double[] vl, int ldvl, double[] vr, int ldvr, double[] work, int lwork, org.netlib.util.intW info) {
    dgegv(jobvl, jobvr, n, a, 0, lda, b, 0, ldb, alphar, 0, alphai, 0, beta, 0, vl, 0, ldvl, vr, 0, ldvr, work, 0, lwork, info);
  }

  public void dgegv(String jobvl, String jobvr, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] alphar, int offsetalphar, double[] alphai, int offsetalphai, double[] beta, int offsetbeta, double[] vl, int offsetvl, int ldvl, double[] vr, int offsetvr, int ldvr, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgegvK(jobvl, jobvr, n, a, offseta, lda, b, offsetb, ldb, alphar, offsetalphar, alphai, offsetalphai, beta, offsetbeta, vl, offsetvl, ldvl, vr, offsetvr, ldvr, work, offsetwork, lwork, info);
  }

  protected abstract void dgegvK(String jobvl, String jobvr, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] alphar, int offsetalphar, double[] alphai, int offsetalphai, double[] beta, int offsetbeta, double[] vl, int offsetvl, int ldvl, double[] vr, int offsetvr, int ldvr, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dgehd2(int n, int ilo, int ihi, double[] a, int lda, double[] tau, double[] work, org.netlib.util.intW info) {
    dgehd2(n, ilo, ihi, a, 0, lda, tau, 0, work, 0, info);
  }

  public void dgehd2(int n, int ilo, int ihi, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgehd2K(n, ilo, ihi, a, offseta, lda, tau, offsettau, work, offsetwork, info);
  }

  protected abstract void dgehd2K(int n, int ilo, int ihi, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dgehrd(int n, int ilo, int ihi, double[] a, int lda, double[] tau, double[] work, int lwork, org.netlib.util.intW info) {
    dgehrd(n, ilo, ihi, a, 0, lda, tau, 0, work, 0, lwork, info);
  }

  public void dgehrd(int n, int ilo, int ihi, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgehrdK(n, ilo, ihi, a, offseta, lda, tau, offsettau, work, offsetwork, lwork, info);
  }

  protected abstract void dgehrdK(int n, int ilo, int ihi, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dgelq2(int m, int n, double[] a, int lda, double[] tau, double[] work, org.netlib.util.intW info) {
    dgelq2(m, n, a, 0, lda, tau, 0, work, 0, info);
  }

  public void dgelq2(int m, int n, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgelq2K(m, n, a, offseta, lda, tau, offsettau, work, offsetwork, info);
  }

  protected abstract void dgelq2K(int m, int n, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dgelqf(int m, int n, double[] a, int lda, double[] tau, double[] work, int lwork, org.netlib.util.intW info) {
    dgelqf(m, n, a, 0, lda, tau, 0, work, 0, lwork, info);
  }

  public void dgelqf(int m, int n, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgelqfK(m, n, a, offseta, lda, tau, offsettau, work, offsetwork, lwork, info);
  }

  protected abstract void dgelqfK(int m, int n, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dgels(String trans, int m, int n, int nrhs, double[] a, int lda, double[] b, int ldb, double[] work, int lwork, org.netlib.util.intW info) {
    dgels(trans, m, n, nrhs, a, 0, lda, b, 0, ldb, work, 0, lwork, info);
  }

  public void dgels(String trans, int m, int n, int nrhs, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgelsK(trans, m, n, nrhs, a, offseta, lda, b, offsetb, ldb, work, offsetwork, lwork, info);
  }

  protected abstract void dgelsK(String trans, int m, int n, int nrhs, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dgelsd(int m, int n, int nrhs, double[] a, int lda, double[] b, int ldb, double[] s, double rcond, org.netlib.util.intW rank, double[] work, int lwork, int[] iwork, org.netlib.util.intW info) {
    dgelsd(m, n, nrhs, a, 0, lda, b, 0, ldb, s, 0, rcond, rank, work, 0, lwork, iwork, 0, info);
  }

  public void dgelsd(int m, int n, int nrhs, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] s, int offsets, double rcond, org.netlib.util.intW rank, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgelsdK(m, n, nrhs, a, offseta, lda, b, offsetb, ldb, s, offsets, rcond, rank, work, offsetwork, lwork, iwork, offsetiwork, info);
  }

  protected abstract void dgelsdK(int m, int n, int nrhs, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] s, int offsets, double rcond, org.netlib.util.intW rank, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dgelss(int m, int n, int nrhs, double[] a, int lda, double[] b, int ldb, double[] s, double rcond, org.netlib.util.intW rank, double[] work, int lwork, org.netlib.util.intW info) {
    dgelss(m, n, nrhs, a, 0, lda, b, 0, ldb, s, 0, rcond, rank, work, 0, lwork, info);
  }

  public void dgelss(int m, int n, int nrhs, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] s, int offsets, double rcond, org.netlib.util.intW rank, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgelssK(m, n, nrhs, a, offseta, lda, b, offsetb, ldb, s, offsets, rcond, rank, work, offsetwork, lwork, info);
  }

  protected abstract void dgelssK(int m, int n, int nrhs, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] s, int offsets, double rcond, org.netlib.util.intW rank, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dgelsx(int m, int n, int nrhs, double[] a, int lda, double[] b, int ldb, int[] jpvt, double rcond, org.netlib.util.intW rank, double[] work, org.netlib.util.intW info) {
    dgelsx(m, n, nrhs, a, 0, lda, b, 0, ldb, jpvt, 0, rcond, rank, work, 0, info);
  }

  public void dgelsx(int m, int n, int nrhs, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, int[] jpvt, int offsetjpvt, double rcond, org.netlib.util.intW rank, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgelsxK(m, n, nrhs, a, offseta, lda, b, offsetb, ldb, jpvt, offsetjpvt, rcond, rank, work, offsetwork, info);
  }

  protected abstract void dgelsxK(int m, int n, int nrhs, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, int[] jpvt, int offsetjpvt, double rcond, org.netlib.util.intW rank, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dgelsy(int m, int n, int nrhs, double[] a, int lda, double[] b, int ldb, int[] jpvt, double rcond, org.netlib.util.intW rank, double[] work, int lwork, org.netlib.util.intW info) {
    dgelsy(m, n, nrhs, a, 0, lda, b, 0, ldb, jpvt, 0, rcond, rank, work, 0, lwork, info);
  }

  public void dgelsy(int m, int n, int nrhs, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, int[] jpvt, int offsetjpvt, double rcond, org.netlib.util.intW rank, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgelsyK(m, n, nrhs, a, offseta, lda, b, offsetb, ldb, jpvt, offsetjpvt, rcond, rank, work, offsetwork, lwork, info);
  }

  protected abstract void dgelsyK(int m, int n, int nrhs, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, int[] jpvt, int offsetjpvt, double rcond, org.netlib.util.intW rank, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dgeql2(int m, int n, double[] a, int lda, double[] tau, double[] work, org.netlib.util.intW info) {
    dgeql2(m, n, a, 0, lda, tau, 0, work, 0, info);
  }

  public void dgeql2(int m, int n, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgeql2K(m, n, a, offseta, lda, tau, offsettau, work, offsetwork, info);
  }

  protected abstract void dgeql2K(int m, int n, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dgeqlf(int m, int n, double[] a, int lda, double[] tau, double[] work, int lwork, org.netlib.util.intW info) {
    dgeqlf(m, n, a, 0, lda, tau, 0, work, 0, lwork, info);
  }

  public void dgeqlf(int m, int n, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgeqlfK(m, n, a, offseta, lda, tau, offsettau, work, offsetwork, lwork, info);
  }

  protected abstract void dgeqlfK(int m, int n, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dgeqp3(int m, int n, double[] a, int lda, int[] jpvt, double[] tau, double[] work, int lwork, org.netlib.util.intW info) {
    dgeqp3(m, n, a, 0, lda, jpvt, 0, tau, 0, work, 0, lwork, info);
  }

  public void dgeqp3(int m, int n, double[] a, int offseta, int lda, int[] jpvt, int offsetjpvt, double[] tau, int offsettau, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgeqp3K(m, n, a, offseta, lda, jpvt, offsetjpvt, tau, offsettau, work, offsetwork, lwork, info);
  }

  protected abstract void dgeqp3K(int m, int n, double[] a, int offseta, int lda, int[] jpvt, int offsetjpvt, double[] tau, int offsettau, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dgeqpf(int m, int n, double[] a, int lda, int[] jpvt, double[] tau, double[] work, org.netlib.util.intW info) {
    dgeqpf(m, n, a, 0, lda, jpvt, 0, tau, 0, work, 0, info);
  }

  public void dgeqpf(int m, int n, double[] a, int offseta, int lda, int[] jpvt, int offsetjpvt, double[] tau, int offsettau, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgeqpfK(m, n, a, offseta, lda, jpvt, offsetjpvt, tau, offsettau, work, offsetwork, info);
  }

  protected abstract void dgeqpfK(int m, int n, double[] a, int offseta, int lda, int[] jpvt, int offsetjpvt, double[] tau, int offsettau, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dgeqr2(int m, int n, double[] a, int lda, double[] tau, double[] work, org.netlib.util.intW info) {
    dgeqr2(m, n, a, 0, lda, tau, 0, work, 0, info);
  }

  public void dgeqr2(int m, int n, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgeqr2K(m, n, a, offseta, lda, tau, offsettau, work, offsetwork, info);
  }

  protected abstract void dgeqr2K(int m, int n, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dgeqrf(int m, int n, double[] a, int lda, double[] tau, double[] work, int lwork, org.netlib.util.intW info) {
    dgeqrf(m, n, a, 0, lda, tau, 0, work, 0, lwork, info);
  }

  public void dgeqrf(int m, int n, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgeqrfK(m, n, a, offseta, lda, tau, offsettau, work, offsetwork, lwork, info);
  }

  protected abstract void dgeqrfK(int m, int n, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dgerfs(String trans, int n, int nrhs, double[] a, int lda, double[] af, int ldaf, int[] ipiv, double[] b, int ldb, double[] x, int ldx, double[] ferr, double[] berr, double[] work, int[] iwork, org.netlib.util.intW info) {
    dgerfs(trans, n, nrhs, a, 0, lda, af, 0, ldaf, ipiv, 0, b, 0, ldb, x, 0, ldx, ferr, 0, berr, 0, work, 0, iwork, 0, info);
  }

  public void dgerfs(String trans, int n, int nrhs, double[] a, int offseta, int lda, double[] af, int offsetaf, int ldaf, int[] ipiv, int offsetipiv, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgerfsK(trans, n, nrhs, a, offseta, lda, af, offsetaf, ldaf, ipiv, offsetipiv, b, offsetb, ldb, x, offsetx, ldx, ferr, offsetferr, berr, offsetberr, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dgerfsK(String trans, int n, int nrhs, double[] a, int offseta, int lda, double[] af, int offsetaf, int ldaf, int[] ipiv, int offsetipiv, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dgerq2(int m, int n, double[] a, int lda, double[] tau, double[] work, org.netlib.util.intW info) {
    dgerq2(m, n, a, 0, lda, tau, 0, work, 0, info);
  }

  public void dgerq2(int m, int n, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgerq2K(m, n, a, offseta, lda, tau, offsettau, work, offsetwork, info);
  }

  protected abstract void dgerq2K(int m, int n, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dgerqf(int m, int n, double[] a, int lda, double[] tau, double[] work, int lwork, org.netlib.util.intW info) {
    dgerqf(m, n, a, 0, lda, tau, 0, work, 0, lwork, info);
  }

  public void dgerqf(int m, int n, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgerqfK(m, n, a, offseta, lda, tau, offsettau, work, offsetwork, lwork, info);
  }

  protected abstract void dgerqfK(int m, int n, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dgesc2(int n, double[] a, int lda, double[] rhs, int[] ipiv, int[] jpiv, org.netlib.util.doubleW scale) {
    dgesc2(n, a, 0, lda, rhs, 0, ipiv, 0, jpiv, 0, scale);
  }

  public void dgesc2(int n, double[] a, int offseta, int lda, double[] rhs, int offsetrhs, int[] ipiv, int offsetipiv, int[] jpiv, int offsetjpiv, org.netlib.util.doubleW scale) {
    //FIXME Add arguments check
    dgesc2K(n, a, offseta, lda, rhs, offsetrhs, ipiv, offsetipiv, jpiv, offsetjpiv, scale);
  }

  protected abstract void dgesc2K(int n, double[] a, int offseta, int lda, double[] rhs, int offsetrhs, int[] ipiv, int offsetipiv, int[] jpiv, int offsetjpiv, org.netlib.util.doubleW scale);

  public void dgesdd(String jobz, int m, int n, double[] a, int lda, double[] s, double[] u, int ldu, double[] vt, int ldvt, double[] work, int lwork, int[] iwork, org.netlib.util.intW info) {
    dgesdd(jobz, m, n, a, 0, lda, s, 0, u, 0, ldu, vt, 0, ldvt, work, 0, lwork, iwork, 0, info);
  }

  public void dgesdd(String jobz, int m, int n, double[] a, int offseta, int lda, double[] s, int offsets, double[] u, int offsetu, int ldu, double[] vt, int offsetvt, int ldvt, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgesddK(jobz, m, n, a, offseta, lda, s, offsets, u, offsetu, ldu, vt, offsetvt, ldvt, work, offsetwork, lwork, iwork, offsetiwork, info);
  }

  protected abstract void dgesddK(String jobz, int m, int n, double[] a, int offseta, int lda, double[] s, int offsets, double[] u, int offsetu, int ldu, double[] vt, int offsetvt, int ldvt, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dgesv(int n, int nrhs, double[] a, int lda, int[] ipiv, double[] b, int ldb, org.netlib.util.intW info) {
    dgesv(n, nrhs, a, 0, lda, ipiv, 0, b, 0, ldb, info);
  }

  public void dgesv(int n, int nrhs, double[] a, int offseta, int lda, int[] ipiv, int offsetipiv, double[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgesvK(n, nrhs, a, offseta, lda, ipiv, offsetipiv, b, offsetb, ldb, info);
  }

  protected abstract void dgesvK(int n, int nrhs, double[] a, int offseta, int lda, int[] ipiv, int offsetipiv, double[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void dgesvd(String jobu, String jobvt, int m, int n, double[] a, int lda, double[] s, double[] u, int ldu, double[] vt, int ldvt, double[] work, int lwork, org.netlib.util.intW info) {
    dgesvd(jobu, jobvt, m, n, a, 0, lda, s, 0, u, 0, ldu, vt, 0, ldvt, work, 0, lwork, info);
  }

  public void dgesvd(String jobu, String jobvt, int m, int n, double[] a, int offseta, int lda, double[] s, int offsets, double[] u, int offsetu, int ldu, double[] vt, int offsetvt, int ldvt, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgesvdK(jobu, jobvt, m, n, a, offseta, lda, s, offsets, u, offsetu, ldu, vt, offsetvt, ldvt, work, offsetwork, lwork, info);
  }

  protected abstract void dgesvdK(String jobu, String jobvt, int m, int n, double[] a, int offseta, int lda, double[] s, int offsets, double[] u, int offsetu, int ldu, double[] vt, int offsetvt, int ldvt, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dgesvx(String fact, String trans, int n, int nrhs, double[] a, int lda, double[] af, int ldaf, int[] ipiv, org.netlib.util.StringW equed, double[] r, double[] c, double[] b, int ldb, double[] x, int ldx, org.netlib.util.doubleW rcond, double[] ferr, double[] berr, double[] work, int[] iwork, org.netlib.util.intW info) {
    dgesvx(fact, trans, n, nrhs, a, 0, lda, af, 0, ldaf, ipiv, 0, equed, r, 0, c, 0, b, 0, ldb, x, 0, ldx, rcond, ferr, 0, berr, 0, work, 0, iwork, 0, info);
  }

  public void dgesvx(String fact, String trans, int n, int nrhs, double[] a, int offseta, int lda, double[] af, int offsetaf, int ldaf, int[] ipiv, int offsetipiv, org.netlib.util.StringW equed, double[] r, int offsetr, double[] c, int offsetc, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, org.netlib.util.doubleW rcond, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgesvxK(fact, trans, n, nrhs, a, offseta, lda, af, offsetaf, ldaf, ipiv, offsetipiv, equed, r, offsetr, c, offsetc, b, offsetb, ldb, x, offsetx, ldx, rcond, ferr, offsetferr, berr, offsetberr, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dgesvxK(String fact, String trans, int n, int nrhs, double[] a, int offseta, int lda, double[] af, int offsetaf, int ldaf, int[] ipiv, int offsetipiv, org.netlib.util.StringW equed, double[] r, int offsetr, double[] c, int offsetc, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, org.netlib.util.doubleW rcond, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dgetc2(int n, double[] a, int lda, int[] ipiv, int[] jpiv, org.netlib.util.intW info) {
    dgetc2(n, a, 0, lda, ipiv, 0, jpiv, 0, info);
  }

  public void dgetc2(int n, double[] a, int offseta, int lda, int[] ipiv, int offsetipiv, int[] jpiv, int offsetjpiv, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgetc2K(n, a, offseta, lda, ipiv, offsetipiv, jpiv, offsetjpiv, info);
  }

  protected abstract void dgetc2K(int n, double[] a, int offseta, int lda, int[] ipiv, int offsetipiv, int[] jpiv, int offsetjpiv, org.netlib.util.intW info);

  public void dgetf2(int m, int n, double[] a, int lda, int[] ipiv, org.netlib.util.intW info) {
    dgetf2(m, n, a, 0, lda, ipiv, 0, info);
  }

  public void dgetf2(int m, int n, double[] a, int offseta, int lda, int[] ipiv, int offsetipiv, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgetf2K(m, n, a, offseta, lda, ipiv, offsetipiv, info);
  }

  protected abstract void dgetf2K(int m, int n, double[] a, int offseta, int lda, int[] ipiv, int offsetipiv, org.netlib.util.intW info);

  public void dgetrf(int m, int n, double[] a, int lda, int[] ipiv, org.netlib.util.intW info) {
    dgetrf(m, n, a, 0, lda, ipiv, 0, info);
  }

  public void dgetrf(int m, int n, double[] a, int offseta, int lda, int[] ipiv, int offsetipiv, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgetrfK(m, n, a, offseta, lda, ipiv, offsetipiv, info);
  }

  protected abstract void dgetrfK(int m, int n, double[] a, int offseta, int lda, int[] ipiv, int offsetipiv, org.netlib.util.intW info);

  public void dgetri(int n, double[] a, int lda, int[] ipiv, double[] work, int lwork, org.netlib.util.intW info) {
    dgetri(n, a, 0, lda, ipiv, 0, work, 0, lwork, info);
  }

  public void dgetri(int n, double[] a, int offseta, int lda, int[] ipiv, int offsetipiv, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgetriK(n, a, offseta, lda, ipiv, offsetipiv, work, offsetwork, lwork, info);
  }

  protected abstract void dgetriK(int n, double[] a, int offseta, int lda, int[] ipiv, int offsetipiv, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dgetrs(String trans, int n, int nrhs, double[] a, int lda, int[] ipiv, double[] b, int ldb, org.netlib.util.intW info) {
    dgetrs(trans, n, nrhs, a, 0, lda, ipiv, 0, b, 0, ldb, info);
  }

  public void dgetrs(String trans, int n, int nrhs, double[] a, int offseta, int lda, int[] ipiv, int offsetipiv, double[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgetrsK(trans, n, nrhs, a, offseta, lda, ipiv, offsetipiv, b, offsetb, ldb, info);
  }

  protected abstract void dgetrsK(String trans, int n, int nrhs, double[] a, int offseta, int lda, int[] ipiv, int offsetipiv, double[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void dggbak(String job, String side, int n, int ilo, int ihi, double[] lscale, double[] rscale, int m, double[] v, int ldv, org.netlib.util.intW info) {
    dggbak(job, side, n, ilo, ihi, lscale, 0, rscale, 0, m, v, 0, ldv, info);
  }

  public void dggbak(String job, String side, int n, int ilo, int ihi, double[] lscale, int offsetlscale, double[] rscale, int offsetrscale, int m, double[] v, int offsetv, int ldv, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dggbakK(job, side, n, ilo, ihi, lscale, offsetlscale, rscale, offsetrscale, m, v, offsetv, ldv, info);
  }

  protected abstract void dggbakK(String job, String side, int n, int ilo, int ihi, double[] lscale, int offsetlscale, double[] rscale, int offsetrscale, int m, double[] v, int offsetv, int ldv, org.netlib.util.intW info);

  public void dggbal(String job, int n, double[] a, int lda, double[] b, int ldb, org.netlib.util.intW ilo, org.netlib.util.intW ihi, double[] lscale, double[] rscale, double[] work, org.netlib.util.intW info) {
    dggbal(job, n, a, 0, lda, b, 0, ldb, ilo, ihi, lscale, 0, rscale, 0, work, 0, info);
  }

  public void dggbal(String job, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, org.netlib.util.intW ilo, org.netlib.util.intW ihi, double[] lscale, int offsetlscale, double[] rscale, int offsetrscale, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dggbalK(job, n, a, offseta, lda, b, offsetb, ldb, ilo, ihi, lscale, offsetlscale, rscale, offsetrscale, work, offsetwork, info);
  }

  protected abstract void dggbalK(String job, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, org.netlib.util.intW ilo, org.netlib.util.intW ihi, double[] lscale, int offsetlscale, double[] rscale, int offsetrscale, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dgges(String jobvsl, String jobvsr, String sort, java.lang.Object selctg, int n, double[] a, int lda, double[] b, int ldb, org.netlib.util.intW sdim, double[] alphar, double[] alphai, double[] beta, double[] vsl, int ldvsl, double[] vsr, int ldvsr, double[] work, int lwork, boolean[] bwork, org.netlib.util.intW info) {
    dgges(jobvsl, jobvsr, sort, selctg, n, a, 0, lda, b, 0, ldb, sdim, alphar, 0, alphai, 0, beta, 0, vsl, 0, ldvsl, vsr, 0, ldvsr, work, 0, lwork, bwork, 0, info);
  }

  public void dgges(String jobvsl, String jobvsr, String sort, java.lang.Object selctg, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, org.netlib.util.intW sdim, double[] alphar, int offsetalphar, double[] alphai, int offsetalphai, double[] beta, int offsetbeta, double[] vsl, int offsetvsl, int ldvsl, double[] vsr, int offsetvsr, int ldvsr, double[] work, int offsetwork, int lwork, boolean[] bwork, int offsetbwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dggesK(jobvsl, jobvsr, sort, selctg, n, a, offseta, lda, b, offsetb, ldb, sdim, alphar, offsetalphar, alphai, offsetalphai, beta, offsetbeta, vsl, offsetvsl, ldvsl, vsr, offsetvsr, ldvsr, work, offsetwork, lwork, bwork, offsetbwork, info);
  }

  protected abstract void dggesK(String jobvsl, String jobvsr, String sort, java.lang.Object selctg, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, org.netlib.util.intW sdim, double[] alphar, int offsetalphar, double[] alphai, int offsetalphai, double[] beta, int offsetbeta, double[] vsl, int offsetvsl, int ldvsl, double[] vsr, int offsetvsr, int ldvsr, double[] work, int offsetwork, int lwork, boolean[] bwork, int offsetbwork, org.netlib.util.intW info);

  public void dggesx(String jobvsl, String jobvsr, String sort, java.lang.Object selctg, String sense, int n, double[] a, int lda, double[] b, int ldb, org.netlib.util.intW sdim, double[] alphar, double[] alphai, double[] beta, double[] vsl, int ldvsl, double[] vsr, int ldvsr, double[] rconde, double[] rcondv, double[] work, int lwork, int[] iwork, int liwork, boolean[] bwork, org.netlib.util.intW info) {
    dggesx(jobvsl, jobvsr, sort, selctg, sense, n, a, 0, lda, b, 0, ldb, sdim, alphar, 0, alphai, 0, beta, 0, vsl, 0, ldvsl, vsr, 0, ldvsr, rconde, 0, rcondv, 0, work, 0, lwork, iwork, 0, liwork, bwork, 0, info);
  }

  public void dggesx(String jobvsl, String jobvsr, String sort, java.lang.Object selctg, String sense, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, org.netlib.util.intW sdim, double[] alphar, int offsetalphar, double[] alphai, int offsetalphai, double[] beta, int offsetbeta, double[] vsl, int offsetvsl, int ldvsl, double[] vsr, int offsetvsr, int ldvsr, double[] rconde, int offsetrconde, double[] rcondv, int offsetrcondv, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, boolean[] bwork, int offsetbwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dggesxK(jobvsl, jobvsr, sort, selctg, sense, n, a, offseta, lda, b, offsetb, ldb, sdim, alphar, offsetalphar, alphai, offsetalphai, beta, offsetbeta, vsl, offsetvsl, ldvsl, vsr, offsetvsr, ldvsr, rconde, offsetrconde, rcondv, offsetrcondv, work, offsetwork, lwork, iwork, offsetiwork, liwork, bwork, offsetbwork, info);
  }

  protected abstract void dggesxK(String jobvsl, String jobvsr, String sort, java.lang.Object selctg, String sense, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, org.netlib.util.intW sdim, double[] alphar, int offsetalphar, double[] alphai, int offsetalphai, double[] beta, int offsetbeta, double[] vsl, int offsetvsl, int ldvsl, double[] vsr, int offsetvsr, int ldvsr, double[] rconde, int offsetrconde, double[] rcondv, int offsetrcondv, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, boolean[] bwork, int offsetbwork, org.netlib.util.intW info);

  public void dggev(String jobvl, String jobvr, int n, double[] a, int lda, double[] b, int ldb, double[] alphar, double[] alphai, double[] beta, double[] vl, int ldvl, double[] vr, int ldvr, double[] work, int lwork, org.netlib.util.intW info) {
    dggev(jobvl, jobvr, n, a, 0, lda, b, 0, ldb, alphar, 0, alphai, 0, beta, 0, vl, 0, ldvl, vr, 0, ldvr, work, 0, lwork, info);
  }

  public void dggev(String jobvl, String jobvr, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] alphar, int offsetalphar, double[] alphai, int offsetalphai, double[] beta, int offsetbeta, double[] vl, int offsetvl, int ldvl, double[] vr, int offsetvr, int ldvr, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dggevK(jobvl, jobvr, n, a, offseta, lda, b, offsetb, ldb, alphar, offsetalphar, alphai, offsetalphai, beta, offsetbeta, vl, offsetvl, ldvl, vr, offsetvr, ldvr, work, offsetwork, lwork, info);
  }

  protected abstract void dggevK(String jobvl, String jobvr, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] alphar, int offsetalphar, double[] alphai, int offsetalphai, double[] beta, int offsetbeta, double[] vl, int offsetvl, int ldvl, double[] vr, int offsetvr, int ldvr, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dggevx(String balanc, String jobvl, String jobvr, String sense, int n, double[] a, int lda, double[] b, int ldb, double[] alphar, double[] alphai, double[] beta, double[] vl, int ldvl, double[] vr, int ldvr, org.netlib.util.intW ilo, org.netlib.util.intW ihi, double[] lscale, double[] rscale, org.netlib.util.doubleW abnrm, org.netlib.util.doubleW bbnrm, double[] rconde, double[] rcondv, double[] work, int lwork, int[] iwork, boolean[] bwork, org.netlib.util.intW info) {
    dggevx(balanc, jobvl, jobvr, sense, n, a, 0, lda, b, 0, ldb, alphar, 0, alphai, 0, beta, 0, vl, 0, ldvl, vr, 0, ldvr, ilo, ihi, lscale, 0, rscale, 0, abnrm, bbnrm, rconde, 0, rcondv, 0, work, 0, lwork, iwork, 0, bwork, 0, info);
  }

  public void dggevx(String balanc, String jobvl, String jobvr, String sense, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] alphar, int offsetalphar, double[] alphai, int offsetalphai, double[] beta, int offsetbeta, double[] vl, int offsetvl, int ldvl, double[] vr, int offsetvr, int ldvr, org.netlib.util.intW ilo, org.netlib.util.intW ihi, double[] lscale, int offsetlscale, double[] rscale, int offsetrscale, org.netlib.util.doubleW abnrm, org.netlib.util.doubleW bbnrm, double[] rconde, int offsetrconde, double[] rcondv, int offsetrcondv, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, boolean[] bwork, int offsetbwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dggevxK(balanc, jobvl, jobvr, sense, n, a, offseta, lda, b, offsetb, ldb, alphar, offsetalphar, alphai, offsetalphai, beta, offsetbeta, vl, offsetvl, ldvl, vr, offsetvr, ldvr, ilo, ihi, lscale, offsetlscale, rscale, offsetrscale, abnrm, bbnrm, rconde, offsetrconde, rcondv, offsetrcondv, work, offsetwork, lwork, iwork, offsetiwork, bwork, offsetbwork, info);
  }

  protected abstract void dggevxK(String balanc, String jobvl, String jobvr, String sense, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] alphar, int offsetalphar, double[] alphai, int offsetalphai, double[] beta, int offsetbeta, double[] vl, int offsetvl, int ldvl, double[] vr, int offsetvr, int ldvr, org.netlib.util.intW ilo, org.netlib.util.intW ihi, double[] lscale, int offsetlscale, double[] rscale, int offsetrscale, org.netlib.util.doubleW abnrm, org.netlib.util.doubleW bbnrm, double[] rconde, int offsetrconde, double[] rcondv, int offsetrcondv, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, boolean[] bwork, int offsetbwork, org.netlib.util.intW info);

  public void dggglm(int n, int m, int p, double[] a, int lda, double[] b, int ldb, double[] d, double[] x, double[] y, double[] work, int lwork, org.netlib.util.intW info) {
    dggglm(n, m, p, a, 0, lda, b, 0, ldb, d, 0, x, 0, y, 0, work, 0, lwork, info);
  }

  public void dggglm(int n, int m, int p, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] d, int offsetd, double[] x, int offsetx, double[] y, int offsety, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dggglmK(n, m, p, a, offseta, lda, b, offsetb, ldb, d, offsetd, x, offsetx, y, offsety, work, offsetwork, lwork, info);
  }

  protected abstract void dggglmK(int n, int m, int p, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] d, int offsetd, double[] x, int offsetx, double[] y, int offsety, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dgghrd(String compq, String compz, int n, int ilo, int ihi, double[] a, int lda, double[] b, int ldb, double[] q, int ldq, double[] z, int ldz, org.netlib.util.intW info) {
    dgghrd(compq, compz, n, ilo, ihi, a, 0, lda, b, 0, ldb, q, 0, ldq, z, 0, ldz, info);
  }

  public void dgghrd(String compq, String compz, int n, int ilo, int ihi, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] q, int offsetq, int ldq, double[] z, int offsetz, int ldz, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgghrdK(compq, compz, n, ilo, ihi, a, offseta, lda, b, offsetb, ldb, q, offsetq, ldq, z, offsetz, ldz, info);
  }

  protected abstract void dgghrdK(String compq, String compz, int n, int ilo, int ihi, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] q, int offsetq, int ldq, double[] z, int offsetz, int ldz, org.netlib.util.intW info);

  public void dgglse(int m, int n, int p, double[] a, int lda, double[] b, int ldb, double[] c, double[] d, double[] x, double[] work, int lwork, org.netlib.util.intW info) {
    dgglse(m, n, p, a, 0, lda, b, 0, ldb, c, 0, d, 0, x, 0, work, 0, lwork, info);
  }

  public void dgglse(int m, int n, int p, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] c, int offsetc, double[] d, int offsetd, double[] x, int offsetx, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgglseK(m, n, p, a, offseta, lda, b, offsetb, ldb, c, offsetc, d, offsetd, x, offsetx, work, offsetwork, lwork, info);
  }

  protected abstract void dgglseK(int m, int n, int p, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] c, int offsetc, double[] d, int offsetd, double[] x, int offsetx, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dggqrf(int n, int m, int p, double[] a, int lda, double[] taua, double[] b, int ldb, double[] taub, double[] work, int lwork, org.netlib.util.intW info) {
    dggqrf(n, m, p, a, 0, lda, taua, 0, b, 0, ldb, taub, 0, work, 0, lwork, info);
  }

  public void dggqrf(int n, int m, int p, double[] a, int offseta, int lda, double[] taua, int offsettaua, double[] b, int offsetb, int ldb, double[] taub, int offsettaub, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dggqrfK(n, m, p, a, offseta, lda, taua, offsettaua, b, offsetb, ldb, taub, offsettaub, work, offsetwork, lwork, info);
  }

  protected abstract void dggqrfK(int n, int m, int p, double[] a, int offseta, int lda, double[] taua, int offsettaua, double[] b, int offsetb, int ldb, double[] taub, int offsettaub, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dggrqf(int m, int p, int n, double[] a, int lda, double[] taua, double[] b, int ldb, double[] taub, double[] work, int lwork, org.netlib.util.intW info) {
    dggrqf(m, p, n, a, 0, lda, taua, 0, b, 0, ldb, taub, 0, work, 0, lwork, info);
  }

  public void dggrqf(int m, int p, int n, double[] a, int offseta, int lda, double[] taua, int offsettaua, double[] b, int offsetb, int ldb, double[] taub, int offsettaub, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dggrqfK(m, p, n, a, offseta, lda, taua, offsettaua, b, offsetb, ldb, taub, offsettaub, work, offsetwork, lwork, info);
  }

  protected abstract void dggrqfK(int m, int p, int n, double[] a, int offseta, int lda, double[] taua, int offsettaua, double[] b, int offsetb, int ldb, double[] taub, int offsettaub, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dggsvd(String jobu, String jobv, String jobq, int m, int n, int p, org.netlib.util.intW k, org.netlib.util.intW l, double[] a, int lda, double[] b, int ldb, double[] alpha, double[] beta, double[] u, int ldu, double[] v, int ldv, double[] q, int ldq, double[] work, int[] iwork, org.netlib.util.intW info) {
    dggsvd(jobu, jobv, jobq, m, n, p, k, l, a, 0, lda, b, 0, ldb, alpha, 0, beta, 0, u, 0, ldu, v, 0, ldv, q, 0, ldq, work, 0, iwork, 0, info);
  }

  public void dggsvd(String jobu, String jobv, String jobq, int m, int n, int p, org.netlib.util.intW k, org.netlib.util.intW l, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] alpha, int offsetalpha, double[] beta, int offsetbeta, double[] u, int offsetu, int ldu, double[] v, int offsetv, int ldv, double[] q, int offsetq, int ldq, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dggsvdK(jobu, jobv, jobq, m, n, p, k, l, a, offseta, lda, b, offsetb, ldb, alpha, offsetalpha, beta, offsetbeta, u, offsetu, ldu, v, offsetv, ldv, q, offsetq, ldq, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dggsvdK(String jobu, String jobv, String jobq, int m, int n, int p, org.netlib.util.intW k, org.netlib.util.intW l, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] alpha, int offsetalpha, double[] beta, int offsetbeta, double[] u, int offsetu, int ldu, double[] v, int offsetv, int ldv, double[] q, int offsetq, int ldq, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dggsvp(String jobu, String jobv, String jobq, int m, int p, int n, double[] a, int lda, double[] b, int ldb, double tola, double tolb, org.netlib.util.intW k, org.netlib.util.intW l, double[] u, int ldu, double[] v, int ldv, double[] q, int ldq, int[] iwork, double[] tau, double[] work, org.netlib.util.intW info) {
    dggsvp(jobu, jobv, jobq, m, p, n, a, 0, lda, b, 0, ldb, tola, tolb, k, l, u, 0, ldu, v, 0, ldv, q, 0, ldq, iwork, 0, tau, 0, work, 0, info);
  }

  public void dggsvp(String jobu, String jobv, String jobq, int m, int p, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double tola, double tolb, org.netlib.util.intW k, org.netlib.util.intW l, double[] u, int offsetu, int ldu, double[] v, int offsetv, int ldv, double[] q, int offsetq, int ldq, int[] iwork, int offsetiwork, double[] tau, int offsettau, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dggsvpK(jobu, jobv, jobq, m, p, n, a, offseta, lda, b, offsetb, ldb, tola, tolb, k, l, u, offsetu, ldu, v, offsetv, ldv, q, offsetq, ldq, iwork, offsetiwork, tau, offsettau, work, offsetwork, info);
  }

  protected abstract void dggsvpK(String jobu, String jobv, String jobq, int m, int p, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double tola, double tolb, org.netlib.util.intW k, org.netlib.util.intW l, double[] u, int offsetu, int ldu, double[] v, int offsetv, int ldv, double[] q, int offsetq, int ldq, int[] iwork, int offsetiwork, double[] tau, int offsettau, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dgtcon(String norm, int n, double[] dl, double[] d, double[] du, double[] du2, int[] ipiv, double anorm, org.netlib.util.doubleW rcond, double[] work, int[] iwork, org.netlib.util.intW info) {
    dgtcon(norm, n, dl, 0, d, 0, du, 0, du2, 0, ipiv, 0, anorm, rcond, work, 0, iwork, 0, info);
  }

  public void dgtcon(String norm, int n, double[] dl, int offsetdl, double[] d, int offsetd, double[] du, int offsetdu, double[] du2, int offsetdu2, int[] ipiv, int offsetipiv, double anorm, org.netlib.util.doubleW rcond, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgtconK(norm, n, dl, offsetdl, d, offsetd, du, offsetdu, du2, offsetdu2, ipiv, offsetipiv, anorm, rcond, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dgtconK(String norm, int n, double[] dl, int offsetdl, double[] d, int offsetd, double[] du, int offsetdu, double[] du2, int offsetdu2, int[] ipiv, int offsetipiv, double anorm, org.netlib.util.doubleW rcond, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dgtrfs(String trans, int n, int nrhs, double[] dl, double[] d, double[] du, double[] dlf, double[] df, double[] duf, double[] du2, int[] ipiv, double[] b, int ldb, double[] x, int ldx, double[] ferr, double[] berr, double[] work, int[] iwork, org.netlib.util.intW info) {
    dgtrfs(trans, n, nrhs, dl, 0, d, 0, du, 0, dlf, 0, df, 0, duf, 0, du2, 0, ipiv, 0, b, 0, ldb, x, 0, ldx, ferr, 0, berr, 0, work, 0, iwork, 0, info);
  }

  public void dgtrfs(String trans, int n, int nrhs, double[] dl, int offsetdl, double[] d, int offsetd, double[] du, int offsetdu, double[] dlf, int offsetdlf, double[] df, int offsetdf, double[] duf, int offsetduf, double[] du2, int offsetdu2, int[] ipiv, int offsetipiv, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgtrfsK(trans, n, nrhs, dl, offsetdl, d, offsetd, du, offsetdu, dlf, offsetdlf, df, offsetdf, duf, offsetduf, du2, offsetdu2, ipiv, offsetipiv, b, offsetb, ldb, x, offsetx, ldx, ferr, offsetferr, berr, offsetberr, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dgtrfsK(String trans, int n, int nrhs, double[] dl, int offsetdl, double[] d, int offsetd, double[] du, int offsetdu, double[] dlf, int offsetdlf, double[] df, int offsetdf, double[] duf, int offsetduf, double[] du2, int offsetdu2, int[] ipiv, int offsetipiv, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dgtsv(int n, int nrhs, double[] dl, double[] d, double[] du, double[] b, int ldb, org.netlib.util.intW info) {
    dgtsv(n, nrhs, dl, 0, d, 0, du, 0, b, 0, ldb, info);
  }

  public void dgtsv(int n, int nrhs, double[] dl, int offsetdl, double[] d, int offsetd, double[] du, int offsetdu, double[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgtsvK(n, nrhs, dl, offsetdl, d, offsetd, du, offsetdu, b, offsetb, ldb, info);
  }

  protected abstract void dgtsvK(int n, int nrhs, double[] dl, int offsetdl, double[] d, int offsetd, double[] du, int offsetdu, double[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void dgtsvx(String fact, String trans, int n, int nrhs, double[] dl, double[] d, double[] du, double[] dlf, double[] df, double[] duf, double[] du2, int[] ipiv, double[] b, int ldb, double[] x, int ldx, org.netlib.util.doubleW rcond, double[] ferr, double[] berr, double[] work, int[] iwork, org.netlib.util.intW info) {
    dgtsvx(fact, trans, n, nrhs, dl, 0, d, 0, du, 0, dlf, 0, df, 0, duf, 0, du2, 0, ipiv, 0, b, 0, ldb, x, 0, ldx, rcond, ferr, 0, berr, 0, work, 0, iwork, 0, info);
  }

  public void dgtsvx(String fact, String trans, int n, int nrhs, double[] dl, int offsetdl, double[] d, int offsetd, double[] du, int offsetdu, double[] dlf, int offsetdlf, double[] df, int offsetdf, double[] duf, int offsetduf, double[] du2, int offsetdu2, int[] ipiv, int offsetipiv, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, org.netlib.util.doubleW rcond, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgtsvxK(fact, trans, n, nrhs, dl, offsetdl, d, offsetd, du, offsetdu, dlf, offsetdlf, df, offsetdf, duf, offsetduf, du2, offsetdu2, ipiv, offsetipiv, b, offsetb, ldb, x, offsetx, ldx, rcond, ferr, offsetferr, berr, offsetberr, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dgtsvxK(String fact, String trans, int n, int nrhs, double[] dl, int offsetdl, double[] d, int offsetd, double[] du, int offsetdu, double[] dlf, int offsetdlf, double[] df, int offsetdf, double[] duf, int offsetduf, double[] du2, int offsetdu2, int[] ipiv, int offsetipiv, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, org.netlib.util.doubleW rcond, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dgttrf(int n, double[] dl, double[] d, double[] du, double[] du2, int[] ipiv, org.netlib.util.intW info) {
    dgttrf(n, dl, 0, d, 0, du, 0, du2, 0, ipiv, 0, info);
  }

  public void dgttrf(int n, double[] dl, int offsetdl, double[] d, int offsetd, double[] du, int offsetdu, double[] du2, int offsetdu2, int[] ipiv, int offsetipiv, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgttrfK(n, dl, offsetdl, d, offsetd, du, offsetdu, du2, offsetdu2, ipiv, offsetipiv, info);
  }

  protected abstract void dgttrfK(int n, double[] dl, int offsetdl, double[] d, int offsetd, double[] du, int offsetdu, double[] du2, int offsetdu2, int[] ipiv, int offsetipiv, org.netlib.util.intW info);

  public void dgttrs(String trans, int n, int nrhs, double[] dl, double[] d, double[] du, double[] du2, int[] ipiv, double[] b, int ldb, org.netlib.util.intW info) {
    dgttrs(trans, n, nrhs, dl, 0, d, 0, du, 0, du2, 0, ipiv, 0, b, 0, ldb, info);
  }

  public void dgttrs(String trans, int n, int nrhs, double[] dl, int offsetdl, double[] d, int offsetd, double[] du, int offsetdu, double[] du2, int offsetdu2, int[] ipiv, int offsetipiv, double[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dgttrsK(trans, n, nrhs, dl, offsetdl, d, offsetd, du, offsetdu, du2, offsetdu2, ipiv, offsetipiv, b, offsetb, ldb, info);
  }

  protected abstract void dgttrsK(String trans, int n, int nrhs, double[] dl, int offsetdl, double[] d, int offsetd, double[] du, int offsetdu, double[] du2, int offsetdu2, int[] ipiv, int offsetipiv, double[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void dgtts2(int itrans, int n, int nrhs, double[] dl, double[] d, double[] du, double[] du2, int[] ipiv, double[] b, int ldb) {
    dgtts2(itrans, n, nrhs, dl, 0, d, 0, du, 0, du2, 0, ipiv, 0, b, 0, ldb);
  }

  public void dgtts2(int itrans, int n, int nrhs, double[] dl, int offsetdl, double[] d, int offsetd, double[] du, int offsetdu, double[] du2, int offsetdu2, int[] ipiv, int offsetipiv, double[] b, int offsetb, int ldb) {
    //FIXME Add arguments check
    dgtts2K(itrans, n, nrhs, dl, offsetdl, d, offsetd, du, offsetdu, du2, offsetdu2, ipiv, offsetipiv, b, offsetb, ldb);
  }

  protected abstract void dgtts2K(int itrans, int n, int nrhs, double[] dl, int offsetdl, double[] d, int offsetd, double[] du, int offsetdu, double[] du2, int offsetdu2, int[] ipiv, int offsetipiv, double[] b, int offsetb, int ldb);

  public void dhgeqz(String job, String compq, String compz, int n, int ilo, int ihi, double[] h, int ldh, double[] t, int ldt, double[] alphar, double[] alphai, double[] beta, double[] q, int ldq, double[] z, int ldz, double[] work, int lwork, org.netlib.util.intW info) {
    dhgeqz(job, compq, compz, n, ilo, ihi, h, 0, ldh, t, 0, ldt, alphar, 0, alphai, 0, beta, 0, q, 0, ldq, z, 0, ldz, work, 0, lwork, info);
  }

  public void dhgeqz(String job, String compq, String compz, int n, int ilo, int ihi, double[] h, int offseth, int ldh, double[] t, int offsett, int ldt, double[] alphar, int offsetalphar, double[] alphai, int offsetalphai, double[] beta, int offsetbeta, double[] q, int offsetq, int ldq, double[] z, int offsetz, int ldz, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dhgeqzK(job, compq, compz, n, ilo, ihi, h, offseth, ldh, t, offsett, ldt, alphar, offsetalphar, alphai, offsetalphai, beta, offsetbeta, q, offsetq, ldq, z, offsetz, ldz, work, offsetwork, lwork, info);
  }

  protected abstract void dhgeqzK(String job, String compq, String compz, int n, int ilo, int ihi, double[] h, int offseth, int ldh, double[] t, int offsett, int ldt, double[] alphar, int offsetalphar, double[] alphai, int offsetalphai, double[] beta, int offsetbeta, double[] q, int offsetq, int ldq, double[] z, int offsetz, int ldz, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dhsein(String side, String eigsrc, String initv, boolean[] select, int n, double[] h, int ldh, double[] wr, double[] wi, double[] vl, int ldvl, double[] vr, int ldvr, int mm, org.netlib.util.intW m, double[] work, int[] ifaill, int[] ifailr, org.netlib.util.intW info) {
    dhsein(side, eigsrc, initv, select, 0, n, h, 0, ldh, wr, 0, wi, 0, vl, 0, ldvl, vr, 0, ldvr, mm, m, work, 0, ifaill, 0, ifailr, 0, info);
  }

  public void dhsein(String side, String eigsrc, String initv, boolean[] select, int offsetselect, int n, double[] h, int offseth, int ldh, double[] wr, int offsetwr, double[] wi, int offsetwi, double[] vl, int offsetvl, int ldvl, double[] vr, int offsetvr, int ldvr, int mm, org.netlib.util.intW m, double[] work, int offsetwork, int[] ifaill, int offsetifaill, int[] ifailr, int offsetifailr, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dhseinK(side, eigsrc, initv, select, offsetselect, n, h, offseth, ldh, wr, offsetwr, wi, offsetwi, vl, offsetvl, ldvl, vr, offsetvr, ldvr, mm, m, work, offsetwork, ifaill, offsetifaill, ifailr, offsetifailr, info);
  }

  protected abstract void dhseinK(String side, String eigsrc, String initv, boolean[] select, int offsetselect, int n, double[] h, int offseth, int ldh, double[] wr, int offsetwr, double[] wi, int offsetwi, double[] vl, int offsetvl, int ldvl, double[] vr, int offsetvr, int ldvr, int mm, org.netlib.util.intW m, double[] work, int offsetwork, int[] ifaill, int offsetifaill, int[] ifailr, int offsetifailr, org.netlib.util.intW info);

  public void dhseqr(String job, String compz, int n, int ilo, int ihi, double[] h, int ldh, double[] wr, double[] wi, double[] z, int ldz, double[] work, int lwork, org.netlib.util.intW info) {
    dhseqr(job, compz, n, ilo, ihi, h, 0, ldh, wr, 0, wi, 0, z, 0, ldz, work, 0, lwork, info);
  }

  public void dhseqr(String job, String compz, int n, int ilo, int ihi, double[] h, int offseth, int ldh, double[] wr, int offsetwr, double[] wi, int offsetwi, double[] z, int offsetz, int ldz, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dhseqrK(job, compz, n, ilo, ihi, h, offseth, ldh, wr, offsetwr, wi, offsetwi, z, offsetz, ldz, work, offsetwork, lwork, info);
  }

  protected abstract void dhseqrK(String job, String compz, int n, int ilo, int ihi, double[] h, int offseth, int ldh, double[] wr, int offsetwr, double[] wi, int offsetwi, double[] z, int offsetz, int ldz, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public boolean disnan(double din) {
    return disnanK(din);
  }

  protected abstract boolean disnanK(double din);

  public void dlabad(org.netlib.util.doubleW small, org.netlib.util.doubleW large) {
    dlabadK(small, large);
  }

  protected abstract void dlabadK(org.netlib.util.doubleW small, org.netlib.util.doubleW large);

  public void dlabrd(int m, int n, int nb, double[] a, int lda, double[] d, double[] e, double[] tauq, double[] taup, double[] x, int ldx, double[] y, int ldy) {
    dlabrd(m, n, nb, a, 0, lda, d, 0, e, 0, tauq, 0, taup, 0, x, 0, ldx, y, 0, ldy);
  }

  public void dlabrd(int m, int n, int nb, double[] a, int offseta, int lda, double[] d, int offsetd, double[] e, int offsete, double[] tauq, int offsettauq, double[] taup, int offsettaup, double[] x, int offsetx, int ldx, double[] y, int offsety, int ldy) {
    //FIXME Add arguments check
    dlabrdK(m, n, nb, a, offseta, lda, d, offsetd, e, offsete, tauq, offsettauq, taup, offsettaup, x, offsetx, ldx, y, offsety, ldy);
  }

  protected abstract void dlabrdK(int m, int n, int nb, double[] a, int offseta, int lda, double[] d, int offsetd, double[] e, int offsete, double[] tauq, int offsettauq, double[] taup, int offsettaup, double[] x, int offsetx, int ldx, double[] y, int offsety, int ldy);

  public void dlacn2(int n, double[] v, double[] x, int[] isgn, org.netlib.util.doubleW est, org.netlib.util.intW kase, int[] isave) {
    dlacn2(n, v, 0, x, 0, isgn, 0, est, kase, isave, 0);
  }

  public void dlacn2(int n, double[] v, int offsetv, double[] x, int offsetx, int[] isgn, int offsetisgn, org.netlib.util.doubleW est, org.netlib.util.intW kase, int[] isave, int offsetisave) {
    //FIXME Add arguments check
    dlacn2K(n, v, offsetv, x, offsetx, isgn, offsetisgn, est, kase, isave, offsetisave);
  }

  protected abstract void dlacn2K(int n, double[] v, int offsetv, double[] x, int offsetx, int[] isgn, int offsetisgn, org.netlib.util.doubleW est, org.netlib.util.intW kase, int[] isave, int offsetisave);

  public void dlacon(int n, double[] v, double[] x, int[] isgn, org.netlib.util.doubleW est, org.netlib.util.intW kase) {
    dlacon(n, v, 0, x, 0, isgn, 0, est, kase);
  }

  public void dlacon(int n, double[] v, int offsetv, double[] x, int offsetx, int[] isgn, int offsetisgn, org.netlib.util.doubleW est, org.netlib.util.intW kase) {
    //FIXME Add arguments check
    dlaconK(n, v, offsetv, x, offsetx, isgn, offsetisgn, est, kase);
  }

  protected abstract void dlaconK(int n, double[] v, int offsetv, double[] x, int offsetx, int[] isgn, int offsetisgn, org.netlib.util.doubleW est, org.netlib.util.intW kase);

  public void dlacpy(String uplo, int m, int n, double[] a, int lda, double[] b, int ldb) {
    dlacpy(uplo, m, n, a, 0, lda, b, 0, ldb);
  }

  public void dlacpy(String uplo, int m, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb) {
    //FIXME Add arguments check
    dlacpyK(uplo, m, n, a, offseta, lda, b, offsetb, ldb);
  }

  protected abstract void dlacpyK(String uplo, int m, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb);

  public void dladiv(double a, double b, double c, double d, org.netlib.util.doubleW p, org.netlib.util.doubleW q) {
    dladivK(a, b, c, d, p, q);
  }

  protected abstract void dladivK(double a, double b, double c, double d, org.netlib.util.doubleW p, org.netlib.util.doubleW q);

  public void dlae2(double a, double b, double c, org.netlib.util.doubleW rt1, org.netlib.util.doubleW rt2) {
    dlae2K(a, b, c, rt1, rt2);
  }

  protected abstract void dlae2K(double a, double b, double c, org.netlib.util.doubleW rt1, org.netlib.util.doubleW rt2);

  public void dlaebz(int ijob, int nitmax, int n, int mmax, int minp, int nbmin, double abstol, double reltol, double pivmin, double[] d, double[] e, double[] e2, int[] nval, double[] ab, double[] c, org.netlib.util.intW mout, int[] nab, double[] work, int[] iwork, org.netlib.util.intW info) {
    dlaebz(ijob, nitmax, n, mmax, minp, nbmin, abstol, reltol, pivmin, d, 0, e, 0, e2, 0, nval, 0, ab, 0, c, 0, mout, nab, 0, work, 0, iwork, 0, info);
  }

  public void dlaebz(int ijob, int nitmax, int n, int mmax, int minp, int nbmin, double abstol, double reltol, double pivmin, double[] d, int offsetd, double[] e, int offsete, double[] e2, int offsete2, int[] nval, int offsetnval, double[] ab, int offsetab, double[] c, int offsetc, org.netlib.util.intW mout, int[] nab, int offsetnab, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlaebzK(ijob, nitmax, n, mmax, minp, nbmin, abstol, reltol, pivmin, d, offsetd, e, offsete, e2, offsete2, nval, offsetnval, ab, offsetab, c, offsetc, mout, nab, offsetnab, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dlaebzK(int ijob, int nitmax, int n, int mmax, int minp, int nbmin, double abstol, double reltol, double pivmin, double[] d, int offsetd, double[] e, int offsete, double[] e2, int offsete2, int[] nval, int offsetnval, double[] ab, int offsetab, double[] c, int offsetc, org.netlib.util.intW mout, int[] nab, int offsetnab, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dlaed0(int icompq, int qsiz, int n, double[] d, double[] e, double[] q, int ldq, double[] qstore, int ldqs, double[] work, int[] iwork, org.netlib.util.intW info) {
    dlaed0(icompq, qsiz, n, d, 0, e, 0, q, 0, ldq, qstore, 0, ldqs, work, 0, iwork, 0, info);
  }

  public void dlaed0(int icompq, int qsiz, int n, double[] d, int offsetd, double[] e, int offsete, double[] q, int offsetq, int ldq, double[] qstore, int offsetqstore, int ldqs, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlaed0K(icompq, qsiz, n, d, offsetd, e, offsete, q, offsetq, ldq, qstore, offsetqstore, ldqs, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dlaed0K(int icompq, int qsiz, int n, double[] d, int offsetd, double[] e, int offsete, double[] q, int offsetq, int ldq, double[] qstore, int offsetqstore, int ldqs, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dlaed1(int n, double[] d, double[] q, int ldq, int[] indxq, org.netlib.util.doubleW rho, int cutpnt, double[] work, int[] iwork, org.netlib.util.intW info) {
    dlaed1(n, d, 0, q, 0, ldq, indxq, 0, rho, cutpnt, work, 0, iwork, 0, info);
  }

  public void dlaed1(int n, double[] d, int offsetd, double[] q, int offsetq, int ldq, int[] indxq, int offsetindxq, org.netlib.util.doubleW rho, int cutpnt, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlaed1K(n, d, offsetd, q, offsetq, ldq, indxq, offsetindxq, rho, cutpnt, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dlaed1K(int n, double[] d, int offsetd, double[] q, int offsetq, int ldq, int[] indxq, int offsetindxq, org.netlib.util.doubleW rho, int cutpnt, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dlaed2(org.netlib.util.intW k, int n, int n1, double[] d, double[] q, int ldq, int[] indxq, org.netlib.util.doubleW rho, double[] z, double[] dlamda, double[] w, double[] q2, int[] indx, int[] indxc, int[] indxp, int[] coltyp, org.netlib.util.intW info) {
    dlaed2(k, n, n1, d, 0, q, 0, ldq, indxq, 0, rho, z, 0, dlamda, 0, w, 0, q2, 0, indx, 0, indxc, 0, indxp, 0, coltyp, 0, info);
  }

  public void dlaed2(org.netlib.util.intW k, int n, int n1, double[] d, int offsetd, double[] q, int offsetq, int ldq, int[] indxq, int offsetindxq, org.netlib.util.doubleW rho, double[] z, int offsetz, double[] dlamda, int offsetdlamda, double[] w, int offsetw, double[] q2, int offsetq2, int[] indx, int offsetindx, int[] indxc, int offsetindxc, int[] indxp, int offsetindxp, int[] coltyp, int offsetcoltyp, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlaed2K(k, n, n1, d, offsetd, q, offsetq, ldq, indxq, offsetindxq, rho, z, offsetz, dlamda, offsetdlamda, w, offsetw, q2, offsetq2, indx, offsetindx, indxc, offsetindxc, indxp, offsetindxp, coltyp, offsetcoltyp, info);
  }

  protected abstract void dlaed2K(org.netlib.util.intW k, int n, int n1, double[] d, int offsetd, double[] q, int offsetq, int ldq, int[] indxq, int offsetindxq, org.netlib.util.doubleW rho, double[] z, int offsetz, double[] dlamda, int offsetdlamda, double[] w, int offsetw, double[] q2, int offsetq2, int[] indx, int offsetindx, int[] indxc, int offsetindxc, int[] indxp, int offsetindxp, int[] coltyp, int offsetcoltyp, org.netlib.util.intW info);

  public void dlaed3(int k, int n, int n1, double[] d, double[] q, int ldq, double rho, double[] dlamda, double[] q2, int[] indx, int[] ctot, double[] w, double[] s, org.netlib.util.intW info) {
    dlaed3(k, n, n1, d, 0, q, 0, ldq, rho, dlamda, 0, q2, 0, indx, 0, ctot, 0, w, 0, s, 0, info);
  }

  public void dlaed3(int k, int n, int n1, double[] d, int offsetd, double[] q, int offsetq, int ldq, double rho, double[] dlamda, int offsetdlamda, double[] q2, int offsetq2, int[] indx, int offsetindx, int[] ctot, int offsetctot, double[] w, int offsetw, double[] s, int offsets, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlaed3K(k, n, n1, d, offsetd, q, offsetq, ldq, rho, dlamda, offsetdlamda, q2, offsetq2, indx, offsetindx, ctot, offsetctot, w, offsetw, s, offsets, info);
  }

  protected abstract void dlaed3K(int k, int n, int n1, double[] d, int offsetd, double[] q, int offsetq, int ldq, double rho, double[] dlamda, int offsetdlamda, double[] q2, int offsetq2, int[] indx, int offsetindx, int[] ctot, int offsetctot, double[] w, int offsetw, double[] s, int offsets, org.netlib.util.intW info);

  public void dlaed4(int n, int i, double[] d, double[] z, double[] delta, double rho, org.netlib.util.doubleW dlam, org.netlib.util.intW info) {
    dlaed4(n, i, d, 0, z, 0, delta, 0, rho, dlam, info);
  }

  public void dlaed4(int n, int i, double[] d, int offsetd, double[] z, int offsetz, double[] delta, int offsetdelta, double rho, org.netlib.util.doubleW dlam, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlaed4K(n, i, d, offsetd, z, offsetz, delta, offsetdelta, rho, dlam, info);
  }

  protected abstract void dlaed4K(int n, int i, double[] d, int offsetd, double[] z, int offsetz, double[] delta, int offsetdelta, double rho, org.netlib.util.doubleW dlam, org.netlib.util.intW info);

  public void dlaed5(int i, double[] d, double[] z, double[] delta, double rho, org.netlib.util.doubleW dlam) {
    dlaed5(i, d, 0, z, 0, delta, 0, rho, dlam);
  }

  public void dlaed5(int i, double[] d, int offsetd, double[] z, int offsetz, double[] delta, int offsetdelta, double rho, org.netlib.util.doubleW dlam) {
    //FIXME Add arguments check
    dlaed5K(i, d, offsetd, z, offsetz, delta, offsetdelta, rho, dlam);
  }

  protected abstract void dlaed5K(int i, double[] d, int offsetd, double[] z, int offsetz, double[] delta, int offsetdelta, double rho, org.netlib.util.doubleW dlam);

  public void dlaed6(int kniter, boolean orgati, double rho, double[] d, double[] z, double finit, org.netlib.util.doubleW tau, org.netlib.util.intW info) {
    dlaed6(kniter, orgati, rho, d, 0, z, 0, finit, tau, info);
  }

  public void dlaed6(int kniter, boolean orgati, double rho, double[] d, int offsetd, double[] z, int offsetz, double finit, org.netlib.util.doubleW tau, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlaed6K(kniter, orgati, rho, d, offsetd, z, offsetz, finit, tau, info);
  }

  protected abstract void dlaed6K(int kniter, boolean orgati, double rho, double[] d, int offsetd, double[] z, int offsetz, double finit, org.netlib.util.doubleW tau, org.netlib.util.intW info);

  public void dlaed7(int icompq, int n, int qsiz, int tlvls, int curlvl, int curpbm, double[] d, double[] q, int ldq, int[] indxq, org.netlib.util.doubleW rho, int cutpnt, double[] qstore, int[] qptr, int[] prmptr, int[] perm, int[] givptr, int[] givcol, double[] givnum, double[] work, int[] iwork, org.netlib.util.intW info) {
    dlaed7(icompq, n, qsiz, tlvls, curlvl, curpbm, d, 0, q, 0, ldq, indxq, 0, rho, cutpnt, qstore, 0, qptr, 0, prmptr, 0, perm, 0, givptr, 0, givcol, 0, givnum, 0, work, 0, iwork, 0, info);
  }

  public void dlaed7(int icompq, int n, int qsiz, int tlvls, int curlvl, int curpbm, double[] d, int offsetd, double[] q, int offsetq, int ldq, int[] indxq, int offsetindxq, org.netlib.util.doubleW rho, int cutpnt, double[] qstore, int offsetqstore, int[] qptr, int offsetqptr, int[] prmptr, int offsetprmptr, int[] perm, int offsetperm, int[] givptr, int offsetgivptr, int[] givcol, int offsetgivcol, double[] givnum, int offsetgivnum, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlaed7K(icompq, n, qsiz, tlvls, curlvl, curpbm, d, offsetd, q, offsetq, ldq, indxq, offsetindxq, rho, cutpnt, qstore, offsetqstore, qptr, offsetqptr, prmptr, offsetprmptr, perm, offsetperm, givptr, offsetgivptr, givcol, offsetgivcol, givnum, offsetgivnum, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dlaed7K(int icompq, int n, int qsiz, int tlvls, int curlvl, int curpbm, double[] d, int offsetd, double[] q, int offsetq, int ldq, int[] indxq, int offsetindxq, org.netlib.util.doubleW rho, int cutpnt, double[] qstore, int offsetqstore, int[] qptr, int offsetqptr, int[] prmptr, int offsetprmptr, int[] perm, int offsetperm, int[] givptr, int offsetgivptr, int[] givcol, int offsetgivcol, double[] givnum, int offsetgivnum, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dlaed8(int icompq, org.netlib.util.intW k, int n, int qsiz, double[] d, double[] q, int ldq, int[] indxq, org.netlib.util.doubleW rho, int cutpnt, double[] z, double[] dlamda, double[] q2, int ldq2, double[] w, int[] perm, org.netlib.util.intW givptr, int[] givcol, double[] givnum, int[] indxp, int[] indx, org.netlib.util.intW info) {
    dlaed8(icompq, k, n, qsiz, d, 0, q, 0, ldq, indxq, 0, rho, cutpnt, z, 0, dlamda, 0, q2, 0, ldq2, w, 0, perm, 0, givptr, givcol, 0, givnum, 0, indxp, 0, indx, 0, info);
  }

  public void dlaed8(int icompq, org.netlib.util.intW k, int n, int qsiz, double[] d, int offsetd, double[] q, int offsetq, int ldq, int[] indxq, int offsetindxq, org.netlib.util.doubleW rho, int cutpnt, double[] z, int offsetz, double[] dlamda, int offsetdlamda, double[] q2, int offsetq2, int ldq2, double[] w, int offsetw, int[] perm, int offsetperm, org.netlib.util.intW givptr, int[] givcol, int offsetgivcol, double[] givnum, int offsetgivnum, int[] indxp, int offsetindxp, int[] indx, int offsetindx, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlaed8K(icompq, k, n, qsiz, d, offsetd, q, offsetq, ldq, indxq, offsetindxq, rho, cutpnt, z, offsetz, dlamda, offsetdlamda, q2, offsetq2, ldq2, w, offsetw, perm, offsetperm, givptr, givcol, offsetgivcol, givnum, offsetgivnum, indxp, offsetindxp, indx, offsetindx, info);
  }

  protected abstract void dlaed8K(int icompq, org.netlib.util.intW k, int n, int qsiz, double[] d, int offsetd, double[] q, int offsetq, int ldq, int[] indxq, int offsetindxq, org.netlib.util.doubleW rho, int cutpnt, double[] z, int offsetz, double[] dlamda, int offsetdlamda, double[] q2, int offsetq2, int ldq2, double[] w, int offsetw, int[] perm, int offsetperm, org.netlib.util.intW givptr, int[] givcol, int offsetgivcol, double[] givnum, int offsetgivnum, int[] indxp, int offsetindxp, int[] indx, int offsetindx, org.netlib.util.intW info);

  public void dlaed9(int k, int kstart, int kstop, int n, double[] d, double[] q, int ldq, double rho, double[] dlamda, double[] w, double[] s, int lds, org.netlib.util.intW info) {
    dlaed9(k, kstart, kstop, n, d, 0, q, 0, ldq, rho, dlamda, 0, w, 0, s, 0, lds, info);
  }

  public void dlaed9(int k, int kstart, int kstop, int n, double[] d, int offsetd, double[] q, int offsetq, int ldq, double rho, double[] dlamda, int offsetdlamda, double[] w, int offsetw, double[] s, int offsets, int lds, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlaed9K(k, kstart, kstop, n, d, offsetd, q, offsetq, ldq, rho, dlamda, offsetdlamda, w, offsetw, s, offsets, lds, info);
  }

  protected abstract void dlaed9K(int k, int kstart, int kstop, int n, double[] d, int offsetd, double[] q, int offsetq, int ldq, double rho, double[] dlamda, int offsetdlamda, double[] w, int offsetw, double[] s, int offsets, int lds, org.netlib.util.intW info);

  public void dlaeda(int n, int tlvls, int curlvl, int curpbm, int[] prmptr, int[] perm, int[] givptr, int[] givcol, double[] givnum, double[] q, int[] qptr, double[] z, double[] ztemp, org.netlib.util.intW info) {
    dlaeda(n, tlvls, curlvl, curpbm, prmptr, 0, perm, 0, givptr, 0, givcol, 0, givnum, 0, q, 0, qptr, 0, z, 0, ztemp, 0, info);
  }

  public void dlaeda(int n, int tlvls, int curlvl, int curpbm, int[] prmptr, int offsetprmptr, int[] perm, int offsetperm, int[] givptr, int offsetgivptr, int[] givcol, int offsetgivcol, double[] givnum, int offsetgivnum, double[] q, int offsetq, int[] qptr, int offsetqptr, double[] z, int offsetz, double[] ztemp, int offsetztemp, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlaedaK(n, tlvls, curlvl, curpbm, prmptr, offsetprmptr, perm, offsetperm, givptr, offsetgivptr, givcol, offsetgivcol, givnum, offsetgivnum, q, offsetq, qptr, offsetqptr, z, offsetz, ztemp, offsetztemp, info);
  }

  protected abstract void dlaedaK(int n, int tlvls, int curlvl, int curpbm, int[] prmptr, int offsetprmptr, int[] perm, int offsetperm, int[] givptr, int offsetgivptr, int[] givcol, int offsetgivcol, double[] givnum, int offsetgivnum, double[] q, int offsetq, int[] qptr, int offsetqptr, double[] z, int offsetz, double[] ztemp, int offsetztemp, org.netlib.util.intW info);

  public void dlaein(boolean rightv, boolean noinit, int n, double[] h, int ldh, double wr, double wi, double[] vr, double[] vi, double[] b, int ldb, double[] work, double eps3, double smlnum, double bignum, org.netlib.util.intW info) {
    dlaein(rightv, noinit, n, h, 0, ldh, wr, wi, vr, 0, vi, 0, b, 0, ldb, work, 0, eps3, smlnum, bignum, info);
  }

  public void dlaein(boolean rightv, boolean noinit, int n, double[] h, int offseth, int ldh, double wr, double wi, double[] vr, int offsetvr, double[] vi, int offsetvi, double[] b, int offsetb, int ldb, double[] work, int offsetwork, double eps3, double smlnum, double bignum, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlaeinK(rightv, noinit, n, h, offseth, ldh, wr, wi, vr, offsetvr, vi, offsetvi, b, offsetb, ldb, work, offsetwork, eps3, smlnum, bignum, info);
  }

  protected abstract void dlaeinK(boolean rightv, boolean noinit, int n, double[] h, int offseth, int ldh, double wr, double wi, double[] vr, int offsetvr, double[] vi, int offsetvi, double[] b, int offsetb, int ldb, double[] work, int offsetwork, double eps3, double smlnum, double bignum, org.netlib.util.intW info);

  public void dlaev2(double a, double b, double c, org.netlib.util.doubleW rt1, org.netlib.util.doubleW rt2, org.netlib.util.doubleW cs1, org.netlib.util.doubleW sn1) {
    dlaev2K(a, b, c, rt1, rt2, cs1, sn1);
  }

  protected abstract void dlaev2K(double a, double b, double c, org.netlib.util.doubleW rt1, org.netlib.util.doubleW rt2, org.netlib.util.doubleW cs1, org.netlib.util.doubleW sn1);

  public void dlaexc(boolean wantq, int n, double[] t, int ldt, double[] q, int ldq, int j1, int n1, int n2, double[] work, org.netlib.util.intW info) {
    dlaexc(wantq, n, t, 0, ldt, q, 0, ldq, j1, n1, n2, work, 0, info);
  }

  public void dlaexc(boolean wantq, int n, double[] t, int offsett, int ldt, double[] q, int offsetq, int ldq, int j1, int n1, int n2, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlaexcK(wantq, n, t, offsett, ldt, q, offsetq, ldq, j1, n1, n2, work, offsetwork, info);
  }

  protected abstract void dlaexcK(boolean wantq, int n, double[] t, int offsett, int ldt, double[] q, int offsetq, int ldq, int j1, int n1, int n2, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dlag2(double[] a, int lda, double[] b, int ldb, double safmin, org.netlib.util.doubleW scale1, org.netlib.util.doubleW scale2, org.netlib.util.doubleW wr1, org.netlib.util.doubleW wr2, org.netlib.util.doubleW wi) {
    dlag2(a, 0, lda, b, 0, ldb, safmin, scale1, scale2, wr1, wr2, wi);
  }

  public void dlag2(double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double safmin, org.netlib.util.doubleW scale1, org.netlib.util.doubleW scale2, org.netlib.util.doubleW wr1, org.netlib.util.doubleW wr2, org.netlib.util.doubleW wi) {
    //FIXME Add arguments check
    dlag2K(a, offseta, lda, b, offsetb, ldb, safmin, scale1, scale2, wr1, wr2, wi);
  }

  protected abstract void dlag2K(double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double safmin, org.netlib.util.doubleW scale1, org.netlib.util.doubleW scale2, org.netlib.util.doubleW wr1, org.netlib.util.doubleW wr2, org.netlib.util.doubleW wi);

  public void dlag2s(int m, int n, double[] a, int lda, float[] sa, int ldsa, org.netlib.util.intW info) {
    dlag2s(m, n, a, 0, lda, sa, 0, ldsa, info);
  }

  public void dlag2s(int m, int n, double[] a, int offseta, int lda, float[] sa, int offsetsa, int ldsa, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlag2sK(m, n, a, offseta, lda, sa, offsetsa, ldsa, info);
  }

  protected abstract void dlag2sK(int m, int n, double[] a, int offseta, int lda, float[] sa, int offsetsa, int ldsa, org.netlib.util.intW info);

  public void dlags2(boolean upper, double a1, double a2, double a3, double b1, double b2, double b3, org.netlib.util.doubleW csu, org.netlib.util.doubleW snu, org.netlib.util.doubleW csv, org.netlib.util.doubleW snv, org.netlib.util.doubleW csq, org.netlib.util.doubleW snq) {
    dlags2K(upper, a1, a2, a3, b1, b2, b3, csu, snu, csv, snv, csq, snq);
  }

  protected abstract void dlags2K(boolean upper, double a1, double a2, double a3, double b1, double b2, double b3, org.netlib.util.doubleW csu, org.netlib.util.doubleW snu, org.netlib.util.doubleW csv, org.netlib.util.doubleW snv, org.netlib.util.doubleW csq, org.netlib.util.doubleW snq);

  public void dlagtf(int n, double[] a, double lambda, double[] b, double[] c, double tol, double[] d, int[] in, org.netlib.util.intW info) {
    dlagtf(n, a, 0, lambda, b, 0, c, 0, tol, d, 0, in, 0, info);
  }

  public void dlagtf(int n, double[] a, int offseta, double lambda, double[] b, int offsetb, double[] c, int offsetc, double tol, double[] d, int offsetd, int[] in, int offsetin, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlagtfK(n, a, offseta, lambda, b, offsetb, c, offsetc, tol, d, offsetd, in, offsetin, info);
  }

  protected abstract void dlagtfK(int n, double[] a, int offseta, double lambda, double[] b, int offsetb, double[] c, int offsetc, double tol, double[] d, int offsetd, int[] in, int offsetin, org.netlib.util.intW info);

  public void dlagtm(String trans, int n, int nrhs, double alpha, double[] dl, double[] d, double[] du, double[] x, int ldx, double beta, double[] b, int ldb) {
    dlagtm(trans, n, nrhs, alpha, dl, 0, d, 0, du, 0, x, 0, ldx, beta, b, 0, ldb);
  }

  public void dlagtm(String trans, int n, int nrhs, double alpha, double[] dl, int offsetdl, double[] d, int offsetd, double[] du, int offsetdu, double[] x, int offsetx, int ldx, double beta, double[] b, int offsetb, int ldb) {
    //FIXME Add arguments check
    dlagtmK(trans, n, nrhs, alpha, dl, offsetdl, d, offsetd, du, offsetdu, x, offsetx, ldx, beta, b, offsetb, ldb);
  }

  protected abstract void dlagtmK(String trans, int n, int nrhs, double alpha, double[] dl, int offsetdl, double[] d, int offsetd, double[] du, int offsetdu, double[] x, int offsetx, int ldx, double beta, double[] b, int offsetb, int ldb);

  public void dlagts(int job, int n, double[] a, double[] b, double[] c, double[] d, int[] in, double[] y, org.netlib.util.doubleW tol, org.netlib.util.intW info) {
    dlagts(job, n, a, 0, b, 0, c, 0, d, 0, in, 0, y, 0, tol, info);
  }

  public void dlagts(int job, int n, double[] a, int offseta, double[] b, int offsetb, double[] c, int offsetc, double[] d, int offsetd, int[] in, int offsetin, double[] y, int offsety, org.netlib.util.doubleW tol, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlagtsK(job, n, a, offseta, b, offsetb, c, offsetc, d, offsetd, in, offsetin, y, offsety, tol, info);
  }

  protected abstract void dlagtsK(int job, int n, double[] a, int offseta, double[] b, int offsetb, double[] c, int offsetc, double[] d, int offsetd, int[] in, int offsetin, double[] y, int offsety, org.netlib.util.doubleW tol, org.netlib.util.intW info);

  public void dlagv2(double[] a, int lda, double[] b, int ldb, double[] alphar, double[] alphai, double[] beta, org.netlib.util.doubleW csl, org.netlib.util.doubleW snl, org.netlib.util.doubleW csr, org.netlib.util.doubleW snr) {
    dlagv2(a, 0, lda, b, 0, ldb, alphar, 0, alphai, 0, beta, 0, csl, snl, csr, snr);
  }

  public void dlagv2(double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] alphar, int offsetalphar, double[] alphai, int offsetalphai, double[] beta, int offsetbeta, org.netlib.util.doubleW csl, org.netlib.util.doubleW snl, org.netlib.util.doubleW csr, org.netlib.util.doubleW snr) {
    //FIXME Add arguments check
    dlagv2K(a, offseta, lda, b, offsetb, ldb, alphar, offsetalphar, alphai, offsetalphai, beta, offsetbeta, csl, snl, csr, snr);
  }

  protected abstract void dlagv2K(double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] alphar, int offsetalphar, double[] alphai, int offsetalphai, double[] beta, int offsetbeta, org.netlib.util.doubleW csl, org.netlib.util.doubleW snl, org.netlib.util.doubleW csr, org.netlib.util.doubleW snr);

  public void dlahqr(boolean wantt, boolean wantz, int n, int ilo, int ihi, double[] h, int ldh, double[] wr, double[] wi, int iloz, int ihiz, double[] z, int ldz, org.netlib.util.intW info) {
    dlahqr(wantt, wantz, n, ilo, ihi, h, 0, ldh, wr, 0, wi, 0, iloz, ihiz, z, 0, ldz, info);
  }

  public void dlahqr(boolean wantt, boolean wantz, int n, int ilo, int ihi, double[] h, int offseth, int ldh, double[] wr, int offsetwr, double[] wi, int offsetwi, int iloz, int ihiz, double[] z, int offsetz, int ldz, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlahqrK(wantt, wantz, n, ilo, ihi, h, offseth, ldh, wr, offsetwr, wi, offsetwi, iloz, ihiz, z, offsetz, ldz, info);
  }

  protected abstract void dlahqrK(boolean wantt, boolean wantz, int n, int ilo, int ihi, double[] h, int offseth, int ldh, double[] wr, int offsetwr, double[] wi, int offsetwi, int iloz, int ihiz, double[] z, int offsetz, int ldz, org.netlib.util.intW info);

  public void dlahr2(int n, int k, int nb, double[] a, int lda, double[] tau, double[] t, int ldt, double[] y, int ldy) {
    dlahr2(n, k, nb, a, 0, lda, tau, 0, t, 0, ldt, y, 0, ldy);
  }

  public void dlahr2(int n, int k, int nb, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] t, int offsett, int ldt, double[] y, int offsety, int ldy) {
    //FIXME Add arguments check
    dlahr2K(n, k, nb, a, offseta, lda, tau, offsettau, t, offsett, ldt, y, offsety, ldy);
  }

  protected abstract void dlahr2K(int n, int k, int nb, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] t, int offsett, int ldt, double[] y, int offsety, int ldy);

  public void dlahrd(int n, int k, int nb, double[] a, int lda, double[] tau, double[] t, int ldt, double[] y, int ldy) {
    dlahrd(n, k, nb, a, 0, lda, tau, 0, t, 0, ldt, y, 0, ldy);
  }

  public void dlahrd(int n, int k, int nb, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] t, int offsett, int ldt, double[] y, int offsety, int ldy) {
    //FIXME Add arguments check
    dlahrdK(n, k, nb, a, offseta, lda, tau, offsettau, t, offsett, ldt, y, offsety, ldy);
  }

  protected abstract void dlahrdK(int n, int k, int nb, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] t, int offsett, int ldt, double[] y, int offsety, int ldy);

  public void dlaic1(int job, int j, double[] x, double sest, double[] w, double gamma, org.netlib.util.doubleW sestpr, org.netlib.util.doubleW s, org.netlib.util.doubleW c) {
    dlaic1(job, j, x, 0, sest, w, 0, gamma, sestpr, s, c);
  }

  public void dlaic1(int job, int j, double[] x, int offsetx, double sest, double[] w, int offsetw, double gamma, org.netlib.util.doubleW sestpr, org.netlib.util.doubleW s, org.netlib.util.doubleW c) {
    //FIXME Add arguments check
    dlaic1K(job, j, x, offsetx, sest, w, offsetw, gamma, sestpr, s, c);
  }

  protected abstract void dlaic1K(int job, int j, double[] x, int offsetx, double sest, double[] w, int offsetw, double gamma, org.netlib.util.doubleW sestpr, org.netlib.util.doubleW s, org.netlib.util.doubleW c);

  public boolean dlaisnan(double din1, double din2) {
    return dlaisnanK(din1, din2);
  }

  protected abstract boolean dlaisnanK(double din1, double din2);

  public void dlaln2(boolean ltrans, int na, int nw, double smin, double ca, double[] a, int lda, double d1, double d2, double[] b, int ldb, double wr, double wi, double[] x, int ldx, org.netlib.util.doubleW scale, org.netlib.util.doubleW xnorm, org.netlib.util.intW info) {
    dlaln2(ltrans, na, nw, smin, ca, a, 0, lda, d1, d2, b, 0, ldb, wr, wi, x, 0, ldx, scale, xnorm, info);
  }

  public void dlaln2(boolean ltrans, int na, int nw, double smin, double ca, double[] a, int offseta, int lda, double d1, double d2, double[] b, int offsetb, int ldb, double wr, double wi, double[] x, int offsetx, int ldx, org.netlib.util.doubleW scale, org.netlib.util.doubleW xnorm, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlaln2K(ltrans, na, nw, smin, ca, a, offseta, lda, d1, d2, b, offsetb, ldb, wr, wi, x, offsetx, ldx, scale, xnorm, info);
  }

  protected abstract void dlaln2K(boolean ltrans, int na, int nw, double smin, double ca, double[] a, int offseta, int lda, double d1, double d2, double[] b, int offsetb, int ldb, double wr, double wi, double[] x, int offsetx, int ldx, org.netlib.util.doubleW scale, org.netlib.util.doubleW xnorm, org.netlib.util.intW info);

  public void dlals0(int icompq, int nl, int nr, int sqre, int nrhs, double[] b, int ldb, double[] bx, int ldbx, int[] perm, int givptr, int[] givcol, int ldgcol, double[] givnum, int ldgnum, double[] poles, double[] difl, double[] difr, double[] z, int k, double c, double s, double[] work, org.netlib.util.intW info) {
    dlals0(icompq, nl, nr, sqre, nrhs, b, 0, ldb, bx, 0, ldbx, perm, 0, givptr, givcol, 0, ldgcol, givnum, 0, ldgnum, poles, 0, difl, 0, difr, 0, z, 0, k, c, s, work, 0, info);
  }

  public void dlals0(int icompq, int nl, int nr, int sqre, int nrhs, double[] b, int offsetb, int ldb, double[] bx, int offsetbx, int ldbx, int[] perm, int offsetperm, int givptr, int[] givcol, int offsetgivcol, int ldgcol, double[] givnum, int offsetgivnum, int ldgnum, double[] poles, int offsetpoles, double[] difl, int offsetdifl, double[] difr, int offsetdifr, double[] z, int offsetz, int k, double c, double s, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlals0K(icompq, nl, nr, sqre, nrhs, b, offsetb, ldb, bx, offsetbx, ldbx, perm, offsetperm, givptr, givcol, offsetgivcol, ldgcol, givnum, offsetgivnum, ldgnum, poles, offsetpoles, difl, offsetdifl, difr, offsetdifr, z, offsetz, k, c, s, work, offsetwork, info);
  }

  protected abstract void dlals0K(int icompq, int nl, int nr, int sqre, int nrhs, double[] b, int offsetb, int ldb, double[] bx, int offsetbx, int ldbx, int[] perm, int offsetperm, int givptr, int[] givcol, int offsetgivcol, int ldgcol, double[] givnum, int offsetgivnum, int ldgnum, double[] poles, int offsetpoles, double[] difl, int offsetdifl, double[] difr, int offsetdifr, double[] z, int offsetz, int k, double c, double s, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dlalsa(int icompq, int smlsiz, int n, int nrhs, double[] b, int ldb, double[] bx, int ldbx, double[] u, int ldu, double[] vt, int[] k, double[] difl, double[] difr, double[] z, double[] poles, int[] givptr, int[] givcol, int ldgcol, int[] perm, double[] givnum, double[] c, double[] s, double[] work, int[] iwork, org.netlib.util.intW info) {
    dlalsa(icompq, smlsiz, n, nrhs, b, 0, ldb, bx, 0, ldbx, u, 0, ldu, vt, 0, k, 0, difl, 0, difr, 0, z, 0, poles, 0, givptr, 0, givcol, 0, ldgcol, perm, 0, givnum, 0, c, 0, s, 0, work, 0, iwork, 0, info);
  }

  public void dlalsa(int icompq, int smlsiz, int n, int nrhs, double[] b, int offsetb, int ldb, double[] bx, int offsetbx, int ldbx, double[] u, int offsetu, int ldu, double[] vt, int offsetvt, int[] k, int offsetk, double[] difl, int offsetdifl, double[] difr, int offsetdifr, double[] z, int offsetz, double[] poles, int offsetpoles, int[] givptr, int offsetgivptr, int[] givcol, int offsetgivcol, int ldgcol, int[] perm, int offsetperm, double[] givnum, int offsetgivnum, double[] c, int offsetc, double[] s, int offsets, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlalsaK(icompq, smlsiz, n, nrhs, b, offsetb, ldb, bx, offsetbx, ldbx, u, offsetu, ldu, vt, offsetvt, k, offsetk, difl, offsetdifl, difr, offsetdifr, z, offsetz, poles, offsetpoles, givptr, offsetgivptr, givcol, offsetgivcol, ldgcol, perm, offsetperm, givnum, offsetgivnum, c, offsetc, s, offsets, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dlalsaK(int icompq, int smlsiz, int n, int nrhs, double[] b, int offsetb, int ldb, double[] bx, int offsetbx, int ldbx, double[] u, int offsetu, int ldu, double[] vt, int offsetvt, int[] k, int offsetk, double[] difl, int offsetdifl, double[] difr, int offsetdifr, double[] z, int offsetz, double[] poles, int offsetpoles, int[] givptr, int offsetgivptr, int[] givcol, int offsetgivcol, int ldgcol, int[] perm, int offsetperm, double[] givnum, int offsetgivnum, double[] c, int offsetc, double[] s, int offsets, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dlalsd(String uplo, int smlsiz, int n, int nrhs, double[] d, double[] e, double[] b, int ldb, double rcond, org.netlib.util.intW rank, double[] work, int[] iwork, org.netlib.util.intW info) {
    dlalsd(uplo, smlsiz, n, nrhs, d, 0, e, 0, b, 0, ldb, rcond, rank, work, 0, iwork, 0, info);
  }

  public void dlalsd(String uplo, int smlsiz, int n, int nrhs, double[] d, int offsetd, double[] e, int offsete, double[] b, int offsetb, int ldb, double rcond, org.netlib.util.intW rank, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlalsdK(uplo, smlsiz, n, nrhs, d, offsetd, e, offsete, b, offsetb, ldb, rcond, rank, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dlalsdK(String uplo, int smlsiz, int n, int nrhs, double[] d, int offsetd, double[] e, int offsete, double[] b, int offsetb, int ldb, double rcond, org.netlib.util.intW rank, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dlamrg(int n1, int n2, double[] a, int dtrd1, int dtrd2, int[] index) {
    dlamrg(n1, n2, a, 0, dtrd1, dtrd2, index, 0);
  }

  public void dlamrg(int n1, int n2, double[] a, int offseta, int dtrd1, int dtrd2, int[] index, int offsetindex) {
    //FIXME Add arguments check
    dlamrgK(n1, n2, a, offseta, dtrd1, dtrd2, index, offsetindex);
  }

  protected abstract void dlamrgK(int n1, int n2, double[] a, int offseta, int dtrd1, int dtrd2, int[] index, int offsetindex);

  public int dlaneg(int n, double[] d, double[] lld, double sigma, double pivmin, int r) {
    return dlaneg(n, d, 0, lld, 0, sigma, pivmin, r);
  }

  public int dlaneg(int n, double[] d, int offsetd, double[] lld, int offsetlld, double sigma, double pivmin, int r) {
    //FIXME Add arguments check
    return dlanegK(n, d, offsetd, lld, offsetlld, sigma, pivmin, r);
  }

  protected abstract int dlanegK(int n, double[] d, int offsetd, double[] lld, int offsetlld, double sigma, double pivmin, int r);

  public double dlangb(String norm, int n, int kl, int ku, double[] ab, int ldab, double[] work) {
    return dlangb(norm, n, kl, ku, ab, 0, ldab, work, 0);
  }

  public double dlangb(String norm, int n, int kl, int ku, double[] ab, int offsetab, int ldab, double[] work, int offsetwork) {
    //FIXME Add arguments check
    return dlangbK(norm, n, kl, ku, ab, offsetab, ldab, work, offsetwork);
  }

  protected abstract double dlangbK(String norm, int n, int kl, int ku, double[] ab, int offsetab, int ldab, double[] work, int offsetwork);

  public double dlange(String norm, int m, int n, double[] a, int lda, double[] work) {
    return dlange(norm, m, n, a, 0, lda, work, 0);
  }

  public double dlange(String norm, int m, int n, double[] a, int offseta, int lda, double[] work, int offsetwork) {
    //FIXME Add arguments check
    return dlangeK(norm, m, n, a, offseta, lda, work, offsetwork);
  }

  protected abstract double dlangeK(String norm, int m, int n, double[] a, int offseta, int lda, double[] work, int offsetwork);

  public double dlangt(String norm, int n, double[] dl, double[] d, double[] du) {
    return dlangt(norm, n, dl, 0, d, 0, du, 0);
  }

  public double dlangt(String norm, int n, double[] dl, int offsetdl, double[] d, int offsetd, double[] du, int offsetdu) {
    //FIXME Add arguments check
    return dlangtK(norm, n, dl, offsetdl, d, offsetd, du, offsetdu);
  }

  protected abstract double dlangtK(String norm, int n, double[] dl, int offsetdl, double[] d, int offsetd, double[] du, int offsetdu);

  public double dlanhs(String norm, int n, double[] a, int lda, double[] work) {
    return dlanhs(norm, n, a, 0, lda, work, 0);
  }

  public double dlanhs(String norm, int n, double[] a, int offseta, int lda, double[] work, int offsetwork) {
    //FIXME Add arguments check
    return dlanhsK(norm, n, a, offseta, lda, work, offsetwork);
  }

  protected abstract double dlanhsK(String norm, int n, double[] a, int offseta, int lda, double[] work, int offsetwork);

  public double dlansb(String norm, String uplo, int n, int k, double[] ab, int ldab, double[] work) {
    return dlansb(norm, uplo, n, k, ab, 0, ldab, work, 0);
  }

  public double dlansb(String norm, String uplo, int n, int k, double[] ab, int offsetab, int ldab, double[] work, int offsetwork) {
    //FIXME Add arguments check
    return dlansbK(norm, uplo, n, k, ab, offsetab, ldab, work, offsetwork);
  }

  protected abstract double dlansbK(String norm, String uplo, int n, int k, double[] ab, int offsetab, int ldab, double[] work, int offsetwork);

  public double dlansp(String norm, String uplo, int n, double[] ap, double[] work) {
    return dlansp(norm, uplo, n, ap, 0, work, 0);
  }

  public double dlansp(String norm, String uplo, int n, double[] ap, int offsetap, double[] work, int offsetwork) {
    //FIXME Add arguments check
    return dlanspK(norm, uplo, n, ap, offsetap, work, offsetwork);
  }

  protected abstract double dlanspK(String norm, String uplo, int n, double[] ap, int offsetap, double[] work, int offsetwork);

  public double dlanst(String norm, int n, double[] d, double[] e) {
    return dlanst(norm, n, d, 0, e, 0);
  }

  public double dlanst(String norm, int n, double[] d, int offsetd, double[] e, int offsete) {
    //FIXME Add arguments check
    return dlanstK(norm, n, d, offsetd, e, offsete);
  }

  protected abstract double dlanstK(String norm, int n, double[] d, int offsetd, double[] e, int offsete);

  public double dlansy(String norm, String uplo, int n, double[] a, int lda, double[] work) {
    return dlansy(norm, uplo, n, a, 0, lda, work, 0);
  }

  public double dlansy(String norm, String uplo, int n, double[] a, int offseta, int lda, double[] work, int offsetwork) {
    //FIXME Add arguments check
    return dlansyK(norm, uplo, n, a, offseta, lda, work, offsetwork);
  }

  protected abstract double dlansyK(String norm, String uplo, int n, double[] a, int offseta, int lda, double[] work, int offsetwork);

  public double dlantb(String norm, String uplo, String diag, int n, int k, double[] ab, int ldab, double[] work) {
    return dlantb(norm, uplo, diag, n, k, ab, 0, ldab, work, 0);
  }

  public double dlantb(String norm, String uplo, String diag, int n, int k, double[] ab, int offsetab, int ldab, double[] work, int offsetwork) {
    //FIXME Add arguments check
    return dlantbK(norm, uplo, diag, n, k, ab, offsetab, ldab, work, offsetwork);
  }

  protected abstract double dlantbK(String norm, String uplo, String diag, int n, int k, double[] ab, int offsetab, int ldab, double[] work, int offsetwork);

  public double dlantp(String norm, String uplo, String diag, int n, double[] ap, double[] work) {
    return dlantp(norm, uplo, diag, n, ap, 0, work, 0);
  }

  public double dlantp(String norm, String uplo, String diag, int n, double[] ap, int offsetap, double[] work, int offsetwork) {
    //FIXME Add arguments check
    return dlantpK(norm, uplo, diag, n, ap, offsetap, work, offsetwork);
  }

  protected abstract double dlantpK(String norm, String uplo, String diag, int n, double[] ap, int offsetap, double[] work, int offsetwork);

  public double dlantr(String norm, String uplo, String diag, int m, int n, double[] a, int lda, double[] work) {
    return dlantr(norm, uplo, diag, m, n, a, 0, lda, work, 0);
  }

  public double dlantr(String norm, String uplo, String diag, int m, int n, double[] a, int offseta, int lda, double[] work, int offsetwork) {
    //FIXME Add arguments check
    return dlantrK(norm, uplo, diag, m, n, a, offseta, lda, work, offsetwork);
  }

  protected abstract double dlantrK(String norm, String uplo, String diag, int m, int n, double[] a, int offseta, int lda, double[] work, int offsetwork);

  public void dlanv2(org.netlib.util.doubleW a, org.netlib.util.doubleW b, org.netlib.util.doubleW c, org.netlib.util.doubleW d, org.netlib.util.doubleW rt1r, org.netlib.util.doubleW rt1i, org.netlib.util.doubleW rt2r, org.netlib.util.doubleW rt2i, org.netlib.util.doubleW cs, org.netlib.util.doubleW sn) {
    dlanv2K(a, b, c, d, rt1r, rt1i, rt2r, rt2i, cs, sn);
  }

  protected abstract void dlanv2K(org.netlib.util.doubleW a, org.netlib.util.doubleW b, org.netlib.util.doubleW c, org.netlib.util.doubleW d, org.netlib.util.doubleW rt1r, org.netlib.util.doubleW rt1i, org.netlib.util.doubleW rt2r, org.netlib.util.doubleW rt2i, org.netlib.util.doubleW cs, org.netlib.util.doubleW sn);

  public void dlapll(int n, double[] x, int incx, double[] y, int incy, org.netlib.util.doubleW ssmin) {
    dlapll(n, x, 0, incx, y, 0, incy, ssmin);
  }

  public void dlapll(int n, double[] x, int offsetx, int incx, double[] y, int offsety, int incy, org.netlib.util.doubleW ssmin) {
    //FIXME Add arguments check
    dlapllK(n, x, offsetx, incx, y, offsety, incy, ssmin);
  }

  protected abstract void dlapllK(int n, double[] x, int offsetx, int incx, double[] y, int offsety, int incy, org.netlib.util.doubleW ssmin);

  public void dlapmt(boolean forwrd, int m, int n, double[] x, int ldx, int[] k) {
    dlapmt(forwrd, m, n, x, 0, ldx, k, 0);
  }

  public void dlapmt(boolean forwrd, int m, int n, double[] x, int offsetx, int ldx, int[] k, int offsetk) {
    //FIXME Add arguments check
    dlapmtK(forwrd, m, n, x, offsetx, ldx, k, offsetk);
  }

  protected abstract void dlapmtK(boolean forwrd, int m, int n, double[] x, int offsetx, int ldx, int[] k, int offsetk);

  public double dlapy2(double x, double y) {
    return dlapy2K(x, y);
  }

  protected abstract double dlapy2K(double x, double y);

  public double dlapy3(double x, double y, double z) {
    return dlapy3K(x, y, z);
  }

  protected abstract double dlapy3K(double x, double y, double z);

  public void dlaqgb(int m, int n, int kl, int ku, double[] ab, int ldab, double[] r, double[] c, double rowcnd, double colcnd, double amax, org.netlib.util.StringW equed) {
    dlaqgb(m, n, kl, ku, ab, 0, ldab, r, 0, c, 0, rowcnd, colcnd, amax, equed);
  }

  public void dlaqgb(int m, int n, int kl, int ku, double[] ab, int offsetab, int ldab, double[] r, int offsetr, double[] c, int offsetc, double rowcnd, double colcnd, double amax, org.netlib.util.StringW equed) {
    //FIXME Add arguments check
    dlaqgbK(m, n, kl, ku, ab, offsetab, ldab, r, offsetr, c, offsetc, rowcnd, colcnd, amax, equed);
  }

  protected abstract void dlaqgbK(int m, int n, int kl, int ku, double[] ab, int offsetab, int ldab, double[] r, int offsetr, double[] c, int offsetc, double rowcnd, double colcnd, double amax, org.netlib.util.StringW equed);

  public void dlaqge(int m, int n, double[] a, int lda, double[] r, double[] c, double rowcnd, double colcnd, double amax, org.netlib.util.StringW equed) {
    dlaqge(m, n, a, 0, lda, r, 0, c, 0, rowcnd, colcnd, amax, equed);
  }

  public void dlaqge(int m, int n, double[] a, int offseta, int lda, double[] r, int offsetr, double[] c, int offsetc, double rowcnd, double colcnd, double amax, org.netlib.util.StringW equed) {
    //FIXME Add arguments check
    dlaqgeK(m, n, a, offseta, lda, r, offsetr, c, offsetc, rowcnd, colcnd, amax, equed);
  }

  protected abstract void dlaqgeK(int m, int n, double[] a, int offseta, int lda, double[] r, int offsetr, double[] c, int offsetc, double rowcnd, double colcnd, double amax, org.netlib.util.StringW equed);

  public void dlaqp2(int m, int n, int offset, double[] a, int lda, int[] jpvt, double[] tau, double[] vn1, double[] vn2, double[] work) {
    dlaqp2(m, n, offset, a, 0, lda, jpvt, 0, tau, 0, vn1, 0, vn2, 0, work, 0);
  }

  public void dlaqp2(int m, int n, int offset, double[] a, int offseta, int lda, int[] jpvt, int offsetjpvt, double[] tau, int offsettau, double[] vn1, int offsetvn1, double[] vn2, int offsetvn2, double[] work, int offsetwork) {
    //FIXME Add arguments check
    dlaqp2K(m, n, offset, a, offseta, lda, jpvt, offsetjpvt, tau, offsettau, vn1, offsetvn1, vn2, offsetvn2, work, offsetwork);
  }

  protected abstract void dlaqp2K(int m, int n, int offset, double[] a, int offseta, int lda, int[] jpvt, int offsetjpvt, double[] tau, int offsettau, double[] vn1, int offsetvn1, double[] vn2, int offsetvn2, double[] work, int offsetwork);

  public void dlaqps(int m, int n, int offset, int nb, org.netlib.util.intW kb, double[] a, int lda, int[] jpvt, double[] tau, double[] vn1, double[] vn2, double[] auxv, double[] f, int ldf) {
    dlaqps(m, n, offset, nb, kb, a, 0, lda, jpvt, 0, tau, 0, vn1, 0, vn2, 0, auxv, 0, f, 0, ldf);
  }

  public void dlaqps(int m, int n, int offset, int nb, org.netlib.util.intW kb, double[] a, int offseta, int lda, int[] jpvt, int offsetjpvt, double[] tau, int offsettau, double[] vn1, int offsetvn1, double[] vn2, int offsetvn2, double[] auxv, int offsetauxv, double[] f, int offsetf, int ldf) {
    //FIXME Add arguments check
    dlaqpsK(m, n, offset, nb, kb, a, offseta, lda, jpvt, offsetjpvt, tau, offsettau, vn1, offsetvn1, vn2, offsetvn2, auxv, offsetauxv, f, offsetf, ldf);
  }

  protected abstract void dlaqpsK(int m, int n, int offset, int nb, org.netlib.util.intW kb, double[] a, int offseta, int lda, int[] jpvt, int offsetjpvt, double[] tau, int offsettau, double[] vn1, int offsetvn1, double[] vn2, int offsetvn2, double[] auxv, int offsetauxv, double[] f, int offsetf, int ldf);

  public void dlaqr0(boolean wantt, boolean wantz, int n, int ilo, int ihi, double[] h, int ldh, double[] wr, double[] wi, int iloz, int ihiz, double[] z, int ldz, double[] work, int lwork, org.netlib.util.intW info) {
    dlaqr0(wantt, wantz, n, ilo, ihi, h, 0, ldh, wr, 0, wi, 0, iloz, ihiz, z, 0, ldz, work, 0, lwork, info);
  }

  public void dlaqr0(boolean wantt, boolean wantz, int n, int ilo, int ihi, double[] h, int offseth, int ldh, double[] wr, int offsetwr, double[] wi, int offsetwi, int iloz, int ihiz, double[] z, int offsetz, int ldz, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlaqr0K(wantt, wantz, n, ilo, ihi, h, offseth, ldh, wr, offsetwr, wi, offsetwi, iloz, ihiz, z, offsetz, ldz, work, offsetwork, lwork, info);
  }

  protected abstract void dlaqr0K(boolean wantt, boolean wantz, int n, int ilo, int ihi, double[] h, int offseth, int ldh, double[] wr, int offsetwr, double[] wi, int offsetwi, int iloz, int ihiz, double[] z, int offsetz, int ldz, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dlaqr1(int n, double[] h, int ldh, double sr1, double si1, double sr2, double si2, double[] v) {
    dlaqr1(n, h, 0, ldh, sr1, si1, sr2, si2, v, 0);
  }

  public void dlaqr1(int n, double[] h, int offseth, int ldh, double sr1, double si1, double sr2, double si2, double[] v, int offsetv) {
    //FIXME Add arguments check
    dlaqr1K(n, h, offseth, ldh, sr1, si1, sr2, si2, v, offsetv);
  }

  protected abstract void dlaqr1K(int n, double[] h, int offseth, int ldh, double sr1, double si1, double sr2, double si2, double[] v, int offsetv);

  public void dlaqr2(boolean wantt, boolean wantz, int n, int ktop, int kbot, int nw, double[] h, int ldh, int iloz, int ihiz, double[] z, int ldz, org.netlib.util.intW ns, org.netlib.util.intW nd, double[] sr, double[] si, double[] v, int ldv, int nh, double[] t, int ldt, int nv, double[] wv, int ldwv, double[] work, int lwork) {
    dlaqr2(wantt, wantz, n, ktop, kbot, nw, h, 0, ldh, iloz, ihiz, z, 0, ldz, ns, nd, sr, 0, si, 0, v, 0, ldv, nh, t, 0, ldt, nv, wv, 0, ldwv, work, 0, lwork);
  }

  public void dlaqr2(boolean wantt, boolean wantz, int n, int ktop, int kbot, int nw, double[] h, int offseth, int ldh, int iloz, int ihiz, double[] z, int offsetz, int ldz, org.netlib.util.intW ns, org.netlib.util.intW nd, double[] sr, int offsetsr, double[] si, int offsetsi, double[] v, int offsetv, int ldv, int nh, double[] t, int offsett, int ldt, int nv, double[] wv, int offsetwv, int ldwv, double[] work, int offsetwork, int lwork) {
    //FIXME Add arguments check
    dlaqr2K(wantt, wantz, n, ktop, kbot, nw, h, offseth, ldh, iloz, ihiz, z, offsetz, ldz, ns, nd, sr, offsetsr, si, offsetsi, v, offsetv, ldv, nh, t, offsett, ldt, nv, wv, offsetwv, ldwv, work, offsetwork, lwork);
  }

  protected abstract void dlaqr2K(boolean wantt, boolean wantz, int n, int ktop, int kbot, int nw, double[] h, int offseth, int ldh, int iloz, int ihiz, double[] z, int offsetz, int ldz, org.netlib.util.intW ns, org.netlib.util.intW nd, double[] sr, int offsetsr, double[] si, int offsetsi, double[] v, int offsetv, int ldv, int nh, double[] t, int offsett, int ldt, int nv, double[] wv, int offsetwv, int ldwv, double[] work, int offsetwork, int lwork);

  public void dlaqr3(boolean wantt, boolean wantz, int n, int ktop, int kbot, int nw, double[] h, int ldh, int iloz, int ihiz, double[] z, int ldz, org.netlib.util.intW ns, org.netlib.util.intW nd, double[] sr, double[] si, double[] v, int ldv, int nh, double[] t, int ldt, int nv, double[] wv, int ldwv, double[] work, int lwork) {
    dlaqr3(wantt, wantz, n, ktop, kbot, nw, h, 0, ldh, iloz, ihiz, z, 0, ldz, ns, nd, sr, 0, si, 0, v, 0, ldv, nh, t, 0, ldt, nv, wv, 0, ldwv, work, 0, lwork);
  }

  public void dlaqr3(boolean wantt, boolean wantz, int n, int ktop, int kbot, int nw, double[] h, int offseth, int ldh, int iloz, int ihiz, double[] z, int offsetz, int ldz, org.netlib.util.intW ns, org.netlib.util.intW nd, double[] sr, int offsetsr, double[] si, int offsetsi, double[] v, int offsetv, int ldv, int nh, double[] t, int offsett, int ldt, int nv, double[] wv, int offsetwv, int ldwv, double[] work, int offsetwork, int lwork) {
    //FIXME Add arguments check
    dlaqr3K(wantt, wantz, n, ktop, kbot, nw, h, offseth, ldh, iloz, ihiz, z, offsetz, ldz, ns, nd, sr, offsetsr, si, offsetsi, v, offsetv, ldv, nh, t, offsett, ldt, nv, wv, offsetwv, ldwv, work, offsetwork, lwork);
  }

  protected abstract void dlaqr3K(boolean wantt, boolean wantz, int n, int ktop, int kbot, int nw, double[] h, int offseth, int ldh, int iloz, int ihiz, double[] z, int offsetz, int ldz, org.netlib.util.intW ns, org.netlib.util.intW nd, double[] sr, int offsetsr, double[] si, int offsetsi, double[] v, int offsetv, int ldv, int nh, double[] t, int offsett, int ldt, int nv, double[] wv, int offsetwv, int ldwv, double[] work, int offsetwork, int lwork);

  public void dlaqr4(boolean wantt, boolean wantz, int n, int ilo, int ihi, double[] h, int ldh, double[] wr, double[] wi, int iloz, int ihiz, double[] z, int ldz, double[] work, int lwork, org.netlib.util.intW info) {
    dlaqr4(wantt, wantz, n, ilo, ihi, h, 0, ldh, wr, 0, wi, 0, iloz, ihiz, z, 0, ldz, work, 0, lwork, info);
  }

  public void dlaqr4(boolean wantt, boolean wantz, int n, int ilo, int ihi, double[] h, int offseth, int ldh, double[] wr, int offsetwr, double[] wi, int offsetwi, int iloz, int ihiz, double[] z, int offsetz, int ldz, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlaqr4K(wantt, wantz, n, ilo, ihi, h, offseth, ldh, wr, offsetwr, wi, offsetwi, iloz, ihiz, z, offsetz, ldz, work, offsetwork, lwork, info);
  }

  protected abstract void dlaqr4K(boolean wantt, boolean wantz, int n, int ilo, int ihi, double[] h, int offseth, int ldh, double[] wr, int offsetwr, double[] wi, int offsetwi, int iloz, int ihiz, double[] z, int offsetz, int ldz, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dlaqr5(boolean wantt, boolean wantz, int kacc22, int n, int ktop, int kbot, int nshfts, double[] sr, double[] si, double[] h, int ldh, int iloz, int ihiz, double[] z, int ldz, double[] v, int ldv, double[] u, int ldu, int nv, double[] wv, int ldwv, int nh, double[] wh, int ldwh) {
    dlaqr5(wantt, wantz, kacc22, n, ktop, kbot, nshfts, sr, 0, si, 0, h, 0, ldh, iloz, ihiz, z, 0, ldz, v, 0, ldv, u, 0, ldu, nv, wv, 0, ldwv, nh, wh, 0, ldwh);
  }

  public void dlaqr5(boolean wantt, boolean wantz, int kacc22, int n, int ktop, int kbot, int nshfts, double[] sr, int offsetsr, double[] si, int offsetsi, double[] h, int offseth, int ldh, int iloz, int ihiz, double[] z, int offsetz, int ldz, double[] v, int offsetv, int ldv, double[] u, int offsetu, int ldu, int nv, double[] wv, int offsetwv, int ldwv, int nh, double[] wh, int offsetwh, int ldwh) {
    //FIXME Add arguments check
    dlaqr5K(wantt, wantz, kacc22, n, ktop, kbot, nshfts, sr, offsetsr, si, offsetsi, h, offseth, ldh, iloz, ihiz, z, offsetz, ldz, v, offsetv, ldv, u, offsetu, ldu, nv, wv, offsetwv, ldwv, nh, wh, offsetwh, ldwh);
  }

  protected abstract void dlaqr5K(boolean wantt, boolean wantz, int kacc22, int n, int ktop, int kbot, int nshfts, double[] sr, int offsetsr, double[] si, int offsetsi, double[] h, int offseth, int ldh, int iloz, int ihiz, double[] z, int offsetz, int ldz, double[] v, int offsetv, int ldv, double[] u, int offsetu, int ldu, int nv, double[] wv, int offsetwv, int ldwv, int nh, double[] wh, int offsetwh, int ldwh);

  public void dlaqsb(String uplo, int n, int kd, double[] ab, int ldab, double[] s, double scond, double amax, org.netlib.util.StringW equed) {
    dlaqsb(uplo, n, kd, ab, 0, ldab, s, 0, scond, amax, equed);
  }

  public void dlaqsb(String uplo, int n, int kd, double[] ab, int offsetab, int ldab, double[] s, int offsets, double scond, double amax, org.netlib.util.StringW equed) {
    //FIXME Add arguments check
    dlaqsbK(uplo, n, kd, ab, offsetab, ldab, s, offsets, scond, amax, equed);
  }

  protected abstract void dlaqsbK(String uplo, int n, int kd, double[] ab, int offsetab, int ldab, double[] s, int offsets, double scond, double amax, org.netlib.util.StringW equed);

  public void dlaqsp(String uplo, int n, double[] ap, double[] s, double scond, double amax, org.netlib.util.StringW equed) {
    dlaqsp(uplo, n, ap, 0, s, 0, scond, amax, equed);
  }

  public void dlaqsp(String uplo, int n, double[] ap, int offsetap, double[] s, int offsets, double scond, double amax, org.netlib.util.StringW equed) {
    //FIXME Add arguments check
    dlaqspK(uplo, n, ap, offsetap, s, offsets, scond, amax, equed);
  }

  protected abstract void dlaqspK(String uplo, int n, double[] ap, int offsetap, double[] s, int offsets, double scond, double amax, org.netlib.util.StringW equed);

  public void dlaqsy(String uplo, int n, double[] a, int lda, double[] s, double scond, double amax, org.netlib.util.StringW equed) {
    dlaqsy(uplo, n, a, 0, lda, s, 0, scond, amax, equed);
  }

  public void dlaqsy(String uplo, int n, double[] a, int offseta, int lda, double[] s, int offsets, double scond, double amax, org.netlib.util.StringW equed) {
    //FIXME Add arguments check
    dlaqsyK(uplo, n, a, offseta, lda, s, offsets, scond, amax, equed);
  }

  protected abstract void dlaqsyK(String uplo, int n, double[] a, int offseta, int lda, double[] s, int offsets, double scond, double amax, org.netlib.util.StringW equed);

  public void dlaqtr(boolean ltran, boolean lreal, int n, double[] t, int ldt, double[] b, double w, org.netlib.util.doubleW scale, double[] x, double[] work, org.netlib.util.intW info) {
    dlaqtr(ltran, lreal, n, t, 0, ldt, b, 0, w, scale, x, 0, work, 0, info);
  }

  public void dlaqtr(boolean ltran, boolean lreal, int n, double[] t, int offsett, int ldt, double[] b, int offsetb, double w, org.netlib.util.doubleW scale, double[] x, int offsetx, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlaqtrK(ltran, lreal, n, t, offsett, ldt, b, offsetb, w, scale, x, offsetx, work, offsetwork, info);
  }

  protected abstract void dlaqtrK(boolean ltran, boolean lreal, int n, double[] t, int offsett, int ldt, double[] b, int offsetb, double w, org.netlib.util.doubleW scale, double[] x, int offsetx, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dlar1v(int n, int b1, int bn, double lambda, double[] d, double[] l, double[] ld, double[] lld, double pivmin, double gaptol, double[] z, boolean wantnc, org.netlib.util.intW negcnt, org.netlib.util.doubleW ztz, org.netlib.util.doubleW mingma, org.netlib.util.intW r, int[] isuppz, org.netlib.util.doubleW nrminv, org.netlib.util.doubleW resid, org.netlib.util.doubleW rqcorr, double[] work) {
    dlar1v(n, b1, bn, lambda, d, 0, l, 0, ld, 0, lld, 0, pivmin, gaptol, z, 0, wantnc, negcnt, ztz, mingma, r, isuppz, 0, nrminv, resid, rqcorr, work, 0);
  }

  public void dlar1v(int n, int b1, int bn, double lambda, double[] d, int offsetd, double[] l, int offsetl, double[] ld, int offsetld, double[] lld, int offsetlld, double pivmin, double gaptol, double[] z, int offsetz, boolean wantnc, org.netlib.util.intW negcnt, org.netlib.util.doubleW ztz, org.netlib.util.doubleW mingma, org.netlib.util.intW r, int[] isuppz, int offsetisuppz, org.netlib.util.doubleW nrminv, org.netlib.util.doubleW resid, org.netlib.util.doubleW rqcorr, double[] work, int offsetwork) {
    //FIXME Add arguments check
    dlar1vK(n, b1, bn, lambda, d, offsetd, l, offsetl, ld, offsetld, lld, offsetlld, pivmin, gaptol, z, offsetz, wantnc, negcnt, ztz, mingma, r, isuppz, offsetisuppz, nrminv, resid, rqcorr, work, offsetwork);
  }

  protected abstract void dlar1vK(int n, int b1, int bn, double lambda, double[] d, int offsetd, double[] l, int offsetl, double[] ld, int offsetld, double[] lld, int offsetlld, double pivmin, double gaptol, double[] z, int offsetz, boolean wantnc, org.netlib.util.intW negcnt, org.netlib.util.doubleW ztz, org.netlib.util.doubleW mingma, org.netlib.util.intW r, int[] isuppz, int offsetisuppz, org.netlib.util.doubleW nrminv, org.netlib.util.doubleW resid, org.netlib.util.doubleW rqcorr, double[] work, int offsetwork);

  public void dlar2v(int n, double[] x, double[] y, double[] z, int incx, double[] c, double[] s, int incc) {
    dlar2v(n, x, 0, y, 0, z, 0, incx, c, 0, s, 0, incc);
  }

  public void dlar2v(int n, double[] x, int offsetx, double[] y, int offsety, double[] z, int offsetz, int incx, double[] c, int offsetc, double[] s, int offsets, int incc) {
    //FIXME Add arguments check
    dlar2vK(n, x, offsetx, y, offsety, z, offsetz, incx, c, offsetc, s, offsets, incc);
  }

  protected abstract void dlar2vK(int n, double[] x, int offsetx, double[] y, int offsety, double[] z, int offsetz, int incx, double[] c, int offsetc, double[] s, int offsets, int incc);

  public void dlarf(String side, int m, int n, double[] v, int incv, double tau, double[] c, int Ldc, double[] work) {
    dlarf(side, m, n, v, 0, incv, tau, c, 0, Ldc, work, 0);
  }

  public void dlarf(String side, int m, int n, double[] v, int offsetv, int incv, double tau, double[] c, int offsetc, int Ldc, double[] work, int offsetwork) {
    //FIXME Add arguments check
    dlarfK(side, m, n, v, offsetv, incv, tau, c, offsetc, Ldc, work, offsetwork);
  }

  protected abstract void dlarfK(String side, int m, int n, double[] v, int offsetv, int incv, double tau, double[] c, int offsetc, int Ldc, double[] work, int offsetwork);

  public void dlarfb(String side, String trans, String direct, String storev, int m, int n, int k, double[] v, int ldv, double[] t, int ldt, double[] c, int Ldc, double[] work, int ldwork) {
    dlarfb(side, trans, direct, storev, m, n, k, v, 0, ldv, t, 0, ldt, c, 0, Ldc, work, 0, ldwork);
  }

  public void dlarfb(String side, String trans, String direct, String storev, int m, int n, int k, double[] v, int offsetv, int ldv, double[] t, int offsett, int ldt, double[] c, int offsetc, int Ldc, double[] work, int offsetwork, int ldwork) {
    //FIXME Add arguments check
    dlarfbK(side, trans, direct, storev, m, n, k, v, offsetv, ldv, t, offsett, ldt, c, offsetc, Ldc, work, offsetwork, ldwork);
  }

  protected abstract void dlarfbK(String side, String trans, String direct, String storev, int m, int n, int k, double[] v, int offsetv, int ldv, double[] t, int offsett, int ldt, double[] c, int offsetc, int Ldc, double[] work, int offsetwork, int ldwork);

  public void dlarfg(int n, org.netlib.util.doubleW alpha, double[] x, int incx, org.netlib.util.doubleW tau) {
    dlarfg(n, alpha, x, 0, incx, tau);
  }

  public void dlarfg(int n, org.netlib.util.doubleW alpha, double[] x, int offsetx, int incx, org.netlib.util.doubleW tau) {
    //FIXME Add arguments check
    dlarfgK(n, alpha, x, offsetx, incx, tau);
  }

  protected abstract void dlarfgK(int n, org.netlib.util.doubleW alpha, double[] x, int offsetx, int incx, org.netlib.util.doubleW tau);

  public void dlarft(String direct, String storev, int n, int k, double[] v, int ldv, double[] tau, double[] t, int ldt) {
    dlarft(direct, storev, n, k, v, 0, ldv, tau, 0, t, 0, ldt);
  }

  public void dlarft(String direct, String storev, int n, int k, double[] v, int offsetv, int ldv, double[] tau, int offsettau, double[] t, int offsett, int ldt) {
    //FIXME Add arguments check
    dlarftK(direct, storev, n, k, v, offsetv, ldv, tau, offsettau, t, offsett, ldt);
  }

  protected abstract void dlarftK(String direct, String storev, int n, int k, double[] v, int offsetv, int ldv, double[] tau, int offsettau, double[] t, int offsett, int ldt);

  public void dlarfx(String side, int m, int n, double[] v, double tau, double[] c, int Ldc, double[] work) {
    dlarfx(side, m, n, v, 0, tau, c, 0, Ldc, work, 0);
  }

  public void dlarfx(String side, int m, int n, double[] v, int offsetv, double tau, double[] c, int offsetc, int Ldc, double[] work, int offsetwork) {
    //FIXME Add arguments check
    dlarfxK(side, m, n, v, offsetv, tau, c, offsetc, Ldc, work, offsetwork);
  }

  protected abstract void dlarfxK(String side, int m, int n, double[] v, int offsetv, double tau, double[] c, int offsetc, int Ldc, double[] work, int offsetwork);

  public void dlargv(int n, double[] x, int incx, double[] y, int incy, double[] c, int incc) {
    dlargv(n, x, 0, incx, y, 0, incy, c, 0, incc);
  }

  public void dlargv(int n, double[] x, int offsetx, int incx, double[] y, int offsety, int incy, double[] c, int offsetc, int incc) {
    //FIXME Add arguments check
    dlargvK(n, x, offsetx, incx, y, offsety, incy, c, offsetc, incc);
  }

  protected abstract void dlargvK(int n, double[] x, int offsetx, int incx, double[] y, int offsety, int incy, double[] c, int offsetc, int incc);

  public void dlarnv(int idist, int[] iseed, int n, double[] x) {
    dlarnv(idist, iseed, 0, n, x, 0);
  }

  public void dlarnv(int idist, int[] iseed, int offsetiseed, int n, double[] x, int offsetx) {
    //FIXME Add arguments check
    dlarnvK(idist, iseed, offsetiseed, n, x, offsetx);
  }

  protected abstract void dlarnvK(int idist, int[] iseed, int offsetiseed, int n, double[] x, int offsetx);

  public void dlarra(int n, double[] d, double[] e, double[] e2, double spltol, double tnrm, org.netlib.util.intW nsplit, int[] isplit, org.netlib.util.intW info) {
    dlarra(n, d, 0, e, 0, e2, 0, spltol, tnrm, nsplit, isplit, 0, info);
  }

  public void dlarra(int n, double[] d, int offsetd, double[] e, int offsete, double[] e2, int offsete2, double spltol, double tnrm, org.netlib.util.intW nsplit, int[] isplit, int offsetisplit, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlarraK(n, d, offsetd, e, offsete, e2, offsete2, spltol, tnrm, nsplit, isplit, offsetisplit, info);
  }

  protected abstract void dlarraK(int n, double[] d, int offsetd, double[] e, int offsete, double[] e2, int offsete2, double spltol, double tnrm, org.netlib.util.intW nsplit, int[] isplit, int offsetisplit, org.netlib.util.intW info);

  public void dlarrb(int n, double[] d, double[] lld, int ifirst, int ilast, double rtol1, double rtol2, int offset, double[] w, double[] wgap, double[] werr, double[] work, int[] iwork, double pivmin, double spdiam, int twist, org.netlib.util.intW info) {
    dlarrb(n, d, 0, lld, 0, ifirst, ilast, rtol1, rtol2, offset, w, 0, wgap, 0, werr, 0, work, 0, iwork, 0, pivmin, spdiam, twist, info);
  }

  public void dlarrb(int n, double[] d, int offsetd, double[] lld, int offsetlld, int ifirst, int ilast, double rtol1, double rtol2, int offset, double[] w, int offsetw, double[] wgap, int offsetwgap, double[] werr, int offsetwerr, double[] work, int offsetwork, int[] iwork, int offsetiwork, double pivmin, double spdiam, int twist, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlarrbK(n, d, offsetd, lld, offsetlld, ifirst, ilast, rtol1, rtol2, offset, w, offsetw, wgap, offsetwgap, werr, offsetwerr, work, offsetwork, iwork, offsetiwork, pivmin, spdiam, twist, info);
  }

  protected abstract void dlarrbK(int n, double[] d, int offsetd, double[] lld, int offsetlld, int ifirst, int ilast, double rtol1, double rtol2, int offset, double[] w, int offsetw, double[] wgap, int offsetwgap, double[] werr, int offsetwerr, double[] work, int offsetwork, int[] iwork, int offsetiwork, double pivmin, double spdiam, int twist, org.netlib.util.intW info);

  public void dlarrc(String jobt, int n, double vl, double vu, double[] d, double[] e, double pivmin, org.netlib.util.intW eigcnt, org.netlib.util.intW lcnt, org.netlib.util.intW rcnt, org.netlib.util.intW info) {
    dlarrc(jobt, n, vl, vu, d, 0, e, 0, pivmin, eigcnt, lcnt, rcnt, info);
  }

  public void dlarrc(String jobt, int n, double vl, double vu, double[] d, int offsetd, double[] e, int offsete, double pivmin, org.netlib.util.intW eigcnt, org.netlib.util.intW lcnt, org.netlib.util.intW rcnt, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlarrcK(jobt, n, vl, vu, d, offsetd, e, offsete, pivmin, eigcnt, lcnt, rcnt, info);
  }

  protected abstract void dlarrcK(String jobt, int n, double vl, double vu, double[] d, int offsetd, double[] e, int offsete, double pivmin, org.netlib.util.intW eigcnt, org.netlib.util.intW lcnt, org.netlib.util.intW rcnt, org.netlib.util.intW info);

  public void dlarrd(String range, String order, int n, double vl, double vu, int il, int iu, double[] gers, double reltol, double[] d, double[] e, double[] e2, double pivmin, int nsplit, int[] isplit, org.netlib.util.intW m, double[] w, double[] werr, org.netlib.util.doubleW wl, org.netlib.util.doubleW wu, int[] iblock, int[] indexw, double[] work, int[] iwork, org.netlib.util.intW info) {
    dlarrd(range, order, n, vl, vu, il, iu, gers, 0, reltol, d, 0, e, 0, e2, 0, pivmin, nsplit, isplit, 0, m, w, 0, werr, 0, wl, wu, iblock, 0, indexw, 0, work, 0, iwork, 0, info);
  }

  public void dlarrd(String range, String order, int n, double vl, double vu, int il, int iu, double[] gers, int offsetgers, double reltol, double[] d, int offsetd, double[] e, int offsete, double[] e2, int offsete2, double pivmin, int nsplit, int[] isplit, int offsetisplit, org.netlib.util.intW m, double[] w, int offsetw, double[] werr, int offsetwerr, org.netlib.util.doubleW wl, org.netlib.util.doubleW wu, int[] iblock, int offsetiblock, int[] indexw, int offsetindexw, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlarrdK(range, order, n, vl, vu, il, iu, gers, offsetgers, reltol, d, offsetd, e, offsete, e2, offsete2, pivmin, nsplit, isplit, offsetisplit, m, w, offsetw, werr, offsetwerr, wl, wu, iblock, offsetiblock, indexw, offsetindexw, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dlarrdK(String range, String order, int n, double vl, double vu, int il, int iu, double[] gers, int offsetgers, double reltol, double[] d, int offsetd, double[] e, int offsete, double[] e2, int offsete2, double pivmin, int nsplit, int[] isplit, int offsetisplit, org.netlib.util.intW m, double[] w, int offsetw, double[] werr, int offsetwerr, org.netlib.util.doubleW wl, org.netlib.util.doubleW wu, int[] iblock, int offsetiblock, int[] indexw, int offsetindexw, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dlarre(String range, int n, org.netlib.util.doubleW vl, org.netlib.util.doubleW vu, int il, int iu, double[] d, double[] e, double[] e2, double rtol1, double rtol2, double spltol, org.netlib.util.intW nsplit, int[] isplit, org.netlib.util.intW m, double[] w, double[] werr, double[] wgap, int[] iblock, int[] indexw, double[] gers, org.netlib.util.doubleW pivmin, double[] work, int[] iwork, org.netlib.util.intW info) {
    dlarre(range, n, vl, vu, il, iu, d, 0, e, 0, e2, 0, rtol1, rtol2, spltol, nsplit, isplit, 0, m, w, 0, werr, 0, wgap, 0, iblock, 0, indexw, 0, gers, 0, pivmin, work, 0, iwork, 0, info);
  }

  public void dlarre(String range, int n, org.netlib.util.doubleW vl, org.netlib.util.doubleW vu, int il, int iu, double[] d, int offsetd, double[] e, int offsete, double[] e2, int offsete2, double rtol1, double rtol2, double spltol, org.netlib.util.intW nsplit, int[] isplit, int offsetisplit, org.netlib.util.intW m, double[] w, int offsetw, double[] werr, int offsetwerr, double[] wgap, int offsetwgap, int[] iblock, int offsetiblock, int[] indexw, int offsetindexw, double[] gers, int offsetgers, org.netlib.util.doubleW pivmin, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlarreK(range, n, vl, vu, il, iu, d, offsetd, e, offsete, e2, offsete2, rtol1, rtol2, spltol, nsplit, isplit, offsetisplit, m, w, offsetw, werr, offsetwerr, wgap, offsetwgap, iblock, offsetiblock, indexw, offsetindexw, gers, offsetgers, pivmin, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dlarreK(String range, int n, org.netlib.util.doubleW vl, org.netlib.util.doubleW vu, int il, int iu, double[] d, int offsetd, double[] e, int offsete, double[] e2, int offsete2, double rtol1, double rtol2, double spltol, org.netlib.util.intW nsplit, int[] isplit, int offsetisplit, org.netlib.util.intW m, double[] w, int offsetw, double[] werr, int offsetwerr, double[] wgap, int offsetwgap, int[] iblock, int offsetiblock, int[] indexw, int offsetindexw, double[] gers, int offsetgers, org.netlib.util.doubleW pivmin, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dlarrf(int n, double[] d, double[] l, double[] ld, int clstrt, int clend, double[] w, double[] wgap, double[] werr, double spdiam, double clgapl, double clgapr, double pivmin, org.netlib.util.doubleW sigma, double[] dplus, double[] lplus, double[] work, org.netlib.util.intW info) {
    dlarrf(n, d, 0, l, 0, ld, 0, clstrt, clend, w, 0, wgap, 0, werr, 0, spdiam, clgapl, clgapr, pivmin, sigma, dplus, 0, lplus, 0, work, 0, info);
  }

  public void dlarrf(int n, double[] d, int offsetd, double[] l, int offsetl, double[] ld, int offsetld, int clstrt, int clend, double[] w, int offsetw, double[] wgap, int offsetwgap, double[] werr, int offsetwerr, double spdiam, double clgapl, double clgapr, double pivmin, org.netlib.util.doubleW sigma, double[] dplus, int offsetdplus, double[] lplus, int offsetlplus, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlarrfK(n, d, offsetd, l, offsetl, ld, offsetld, clstrt, clend, w, offsetw, wgap, offsetwgap, werr, offsetwerr, spdiam, clgapl, clgapr, pivmin, sigma, dplus, offsetdplus, lplus, offsetlplus, work, offsetwork, info);
  }

  protected abstract void dlarrfK(int n, double[] d, int offsetd, double[] l, int offsetl, double[] ld, int offsetld, int clstrt, int clend, double[] w, int offsetw, double[] wgap, int offsetwgap, double[] werr, int offsetwerr, double spdiam, double clgapl, double clgapr, double pivmin, org.netlib.util.doubleW sigma, double[] dplus, int offsetdplus, double[] lplus, int offsetlplus, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dlarrj(int n, double[] d, double[] e2, int ifirst, int ilast, double rtol, int offset, double[] w, double[] werr, double[] work, int[] iwork, double pivmin, double spdiam, org.netlib.util.intW info) {
    dlarrj(n, d, 0, e2, 0, ifirst, ilast, rtol, offset, w, 0, werr, 0, work, 0, iwork, 0, pivmin, spdiam, info);
  }

  public void dlarrj(int n, double[] d, int offsetd, double[] e2, int offsete2, int ifirst, int ilast, double rtol, int offset, double[] w, int offsetw, double[] werr, int offsetwerr, double[] work, int offsetwork, int[] iwork, int offsetiwork, double pivmin, double spdiam, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlarrjK(n, d, offsetd, e2, offsete2, ifirst, ilast, rtol, offset, w, offsetw, werr, offsetwerr, work, offsetwork, iwork, offsetiwork, pivmin, spdiam, info);
  }

  protected abstract void dlarrjK(int n, double[] d, int offsetd, double[] e2, int offsete2, int ifirst, int ilast, double rtol, int offset, double[] w, int offsetw, double[] werr, int offsetwerr, double[] work, int offsetwork, int[] iwork, int offsetiwork, double pivmin, double spdiam, org.netlib.util.intW info);

  public void dlarrk(int n, int iw, double gl, double gu, double[] d, double[] e2, double pivmin, double reltol, org.netlib.util.doubleW w, org.netlib.util.doubleW werr, org.netlib.util.intW info) {
    dlarrk(n, iw, gl, gu, d, 0, e2, 0, pivmin, reltol, w, werr, info);
  }

  public void dlarrk(int n, int iw, double gl, double gu, double[] d, int offsetd, double[] e2, int offsete2, double pivmin, double reltol, org.netlib.util.doubleW w, org.netlib.util.doubleW werr, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlarrkK(n, iw, gl, gu, d, offsetd, e2, offsete2, pivmin, reltol, w, werr, info);
  }

  protected abstract void dlarrkK(int n, int iw, double gl, double gu, double[] d, int offsetd, double[] e2, int offsete2, double pivmin, double reltol, org.netlib.util.doubleW w, org.netlib.util.doubleW werr, org.netlib.util.intW info);

  public void dlarrr(int n, double[] d, double[] e, org.netlib.util.intW info) {
    dlarrr(n, d, 0, e, 0, info);
  }

  public void dlarrr(int n, double[] d, int offsetd, double[] e, int offsete, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlarrrK(n, d, offsetd, e, offsete, info);
  }

  protected abstract void dlarrrK(int n, double[] d, int offsetd, double[] e, int offsete, org.netlib.util.intW info);

  public void dlarrv(int n, double vl, double vu, double[] d, double[] l, double pivmin, int[] isplit, int m, int dol, int dou, double minrgp, org.netlib.util.doubleW rtol1, org.netlib.util.doubleW rtol2, double[] w, double[] werr, double[] wgap, int[] iblock, int[] indexw, double[] gers, double[] z, int ldz, int[] isuppz, double[] work, int[] iwork, org.netlib.util.intW info) {
    dlarrv(n, vl, vu, d, 0, l, 0, pivmin, isplit, 0, m, dol, dou, minrgp, rtol1, rtol2, w, 0, werr, 0, wgap, 0, iblock, 0, indexw, 0, gers, 0, z, 0, ldz, isuppz, 0, work, 0, iwork, 0, info);
  }

  public void dlarrv(int n, double vl, double vu, double[] d, int offsetd, double[] l, int offsetl, double pivmin, int[] isplit, int offsetisplit, int m, int dol, int dou, double minrgp, org.netlib.util.doubleW rtol1, org.netlib.util.doubleW rtol2, double[] w, int offsetw, double[] werr, int offsetwerr, double[] wgap, int offsetwgap, int[] iblock, int offsetiblock, int[] indexw, int offsetindexw, double[] gers, int offsetgers, double[] z, int offsetz, int ldz, int[] isuppz, int offsetisuppz, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlarrvK(n, vl, vu, d, offsetd, l, offsetl, pivmin, isplit, offsetisplit, m, dol, dou, minrgp, rtol1, rtol2, w, offsetw, werr, offsetwerr, wgap, offsetwgap, iblock, offsetiblock, indexw, offsetindexw, gers, offsetgers, z, offsetz, ldz, isuppz, offsetisuppz, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dlarrvK(int n, double vl, double vu, double[] d, int offsetd, double[] l, int offsetl, double pivmin, int[] isplit, int offsetisplit, int m, int dol, int dou, double minrgp, org.netlib.util.doubleW rtol1, org.netlib.util.doubleW rtol2, double[] w, int offsetw, double[] werr, int offsetwerr, double[] wgap, int offsetwgap, int[] iblock, int offsetiblock, int[] indexw, int offsetindexw, double[] gers, int offsetgers, double[] z, int offsetz, int ldz, int[] isuppz, int offsetisuppz, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dlartg(double f, double g, org.netlib.util.doubleW cs, org.netlib.util.doubleW sn, org.netlib.util.doubleW r) {
    dlartgK(f, g, cs, sn, r);
  }

  protected abstract void dlartgK(double f, double g, org.netlib.util.doubleW cs, org.netlib.util.doubleW sn, org.netlib.util.doubleW r);

  public void dlartv(int n, double[] x, int incx, double[] y, int incy, double[] c, double[] s, int incc) {
    dlartv(n, x, 0, incx, y, 0, incy, c, 0, s, 0, incc);
  }

  public void dlartv(int n, double[] x, int offsetx, int incx, double[] y, int offsety, int incy, double[] c, int offsetc, double[] s, int offsets, int incc) {
    //FIXME Add arguments check
    dlartvK(n, x, offsetx, incx, y, offsety, incy, c, offsetc, s, offsets, incc);
  }

  protected abstract void dlartvK(int n, double[] x, int offsetx, int incx, double[] y, int offsety, int incy, double[] c, int offsetc, double[] s, int offsets, int incc);

  public void dlaruv(int[] iseed, int n, double[] x) {
    dlaruv(iseed, 0, n, x, 0);
  }

  public void dlaruv(int[] iseed, int offsetiseed, int n, double[] x, int offsetx) {
    //FIXME Add arguments check
    dlaruvK(iseed, offsetiseed, n, x, offsetx);
  }

  protected abstract void dlaruvK(int[] iseed, int offsetiseed, int n, double[] x, int offsetx);

  public void dlarz(String side, int m, int n, int l, double[] v, int incv, double tau, double[] c, int Ldc, double[] work) {
    dlarz(side, m, n, l, v, 0, incv, tau, c, 0, Ldc, work, 0);
  }

  public void dlarz(String side, int m, int n, int l, double[] v, int offsetv, int incv, double tau, double[] c, int offsetc, int Ldc, double[] work, int offsetwork) {
    //FIXME Add arguments check
    dlarzK(side, m, n, l, v, offsetv, incv, tau, c, offsetc, Ldc, work, offsetwork);
  }

  protected abstract void dlarzK(String side, int m, int n, int l, double[] v, int offsetv, int incv, double tau, double[] c, int offsetc, int Ldc, double[] work, int offsetwork);

  public void dlarzb(String side, String trans, String direct, String storev, int m, int n, int k, int l, double[] v, int ldv, double[] t, int ldt, double[] c, int Ldc, double[] work, int ldwork) {
    dlarzb(side, trans, direct, storev, m, n, k, l, v, 0, ldv, t, 0, ldt, c, 0, Ldc, work, 0, ldwork);
  }

  public void dlarzb(String side, String trans, String direct, String storev, int m, int n, int k, int l, double[] v, int offsetv, int ldv, double[] t, int offsett, int ldt, double[] c, int offsetc, int Ldc, double[] work, int offsetwork, int ldwork) {
    //FIXME Add arguments check
    dlarzbK(side, trans, direct, storev, m, n, k, l, v, offsetv, ldv, t, offsett, ldt, c, offsetc, Ldc, work, offsetwork, ldwork);
  }

  protected abstract void dlarzbK(String side, String trans, String direct, String storev, int m, int n, int k, int l, double[] v, int offsetv, int ldv, double[] t, int offsett, int ldt, double[] c, int offsetc, int Ldc, double[] work, int offsetwork, int ldwork);

  public void dlarzt(String direct, String storev, int n, int k, double[] v, int ldv, double[] tau, double[] t, int ldt) {
    dlarzt(direct, storev, n, k, v, 0, ldv, tau, 0, t, 0, ldt);
  }

  public void dlarzt(String direct, String storev, int n, int k, double[] v, int offsetv, int ldv, double[] tau, int offsettau, double[] t, int offsett, int ldt) {
    //FIXME Add arguments check
    dlarztK(direct, storev, n, k, v, offsetv, ldv, tau, offsettau, t, offsett, ldt);
  }

  protected abstract void dlarztK(String direct, String storev, int n, int k, double[] v, int offsetv, int ldv, double[] tau, int offsettau, double[] t, int offsett, int ldt);

  public void dlas2(double f, double g, double h, org.netlib.util.doubleW ssmin, org.netlib.util.doubleW ssmax) {
    dlas2K(f, g, h, ssmin, ssmax);
  }

  protected abstract void dlas2K(double f, double g, double h, org.netlib.util.doubleW ssmin, org.netlib.util.doubleW ssmax);

  public void dlascl(String type, int kl, int ku, double cfrom, double cto, int m, int n, double[] a, int lda, org.netlib.util.intW info) {
    dlascl(type, kl, ku, cfrom, cto, m, n, a, 0, lda, info);
  }

  public void dlascl(String type, int kl, int ku, double cfrom, double cto, int m, int n, double[] a, int offseta, int lda, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlasclK(type, kl, ku, cfrom, cto, m, n, a, offseta, lda, info);
  }

  protected abstract void dlasclK(String type, int kl, int ku, double cfrom, double cto, int m, int n, double[] a, int offseta, int lda, org.netlib.util.intW info);

  public void dlasd0(int n, int sqre, double[] d, double[] e, double[] u, int ldu, double[] vt, int ldvt, int smlsiz, int[] iwork, double[] work, org.netlib.util.intW info) {
    dlasd0(n, sqre, d, 0, e, 0, u, 0, ldu, vt, 0, ldvt, smlsiz, iwork, 0, work, 0, info);
  }

  public void dlasd0(int n, int sqre, double[] d, int offsetd, double[] e, int offsete, double[] u, int offsetu, int ldu, double[] vt, int offsetvt, int ldvt, int smlsiz, int[] iwork, int offsetiwork, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlasd0K(n, sqre, d, offsetd, e, offsete, u, offsetu, ldu, vt, offsetvt, ldvt, smlsiz, iwork, offsetiwork, work, offsetwork, info);
  }

  protected abstract void dlasd0K(int n, int sqre, double[] d, int offsetd, double[] e, int offsete, double[] u, int offsetu, int ldu, double[] vt, int offsetvt, int ldvt, int smlsiz, int[] iwork, int offsetiwork, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dlasd1(int nl, int nr, int sqre, double[] d, org.netlib.util.doubleW alpha, org.netlib.util.doubleW beta, double[] u, int ldu, double[] vt, int ldvt, int[] idxq, int[] iwork, double[] work, org.netlib.util.intW info) {
    dlasd1(nl, nr, sqre, d, 0, alpha, beta, u, 0, ldu, vt, 0, ldvt, idxq, 0, iwork, 0, work, 0, info);
  }

  public void dlasd1(int nl, int nr, int sqre, double[] d, int offsetd, org.netlib.util.doubleW alpha, org.netlib.util.doubleW beta, double[] u, int offsetu, int ldu, double[] vt, int offsetvt, int ldvt, int[] idxq, int offsetidxq, int[] iwork, int offsetiwork, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlasd1K(nl, nr, sqre, d, offsetd, alpha, beta, u, offsetu, ldu, vt, offsetvt, ldvt, idxq, offsetidxq, iwork, offsetiwork, work, offsetwork, info);
  }

  protected abstract void dlasd1K(int nl, int nr, int sqre, double[] d, int offsetd, org.netlib.util.doubleW alpha, org.netlib.util.doubleW beta, double[] u, int offsetu, int ldu, double[] vt, int offsetvt, int ldvt, int[] idxq, int offsetidxq, int[] iwork, int offsetiwork, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dlasd2(int nl, int nr, int sqre, org.netlib.util.intW k, double[] d, double[] z, double alpha, double beta, double[] u, int ldu, double[] vt, int ldvt, double[] dsigma, double[] u2, int ldu2, double[] vt2, int ldvt2, int[] idxp, int[] idx, int[] idxc, int[] idxq, int[] coltyp, org.netlib.util.intW info) {
    dlasd2(nl, nr, sqre, k, d, 0, z, 0, alpha, beta, u, 0, ldu, vt, 0, ldvt, dsigma, 0, u2, 0, ldu2, vt2, 0, ldvt2, idxp, 0, idx, 0, idxc, 0, idxq, 0, coltyp, 0, info);
  }

  public void dlasd2(int nl, int nr, int sqre, org.netlib.util.intW k, double[] d, int offsetd, double[] z, int offsetz, double alpha, double beta, double[] u, int offsetu, int ldu, double[] vt, int offsetvt, int ldvt, double[] dsigma, int offsetdsigma, double[] u2, int offsetu2, int ldu2, double[] vt2, int offsetvt2, int ldvt2, int[] idxp, int offsetidxp, int[] idx, int offsetidx, int[] idxc, int offsetidxc, int[] idxq, int offsetidxq, int[] coltyp, int offsetcoltyp, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlasd2K(nl, nr, sqre, k, d, offsetd, z, offsetz, alpha, beta, u, offsetu, ldu, vt, offsetvt, ldvt, dsigma, offsetdsigma, u2, offsetu2, ldu2, vt2, offsetvt2, ldvt2, idxp, offsetidxp, idx, offsetidx, idxc, offsetidxc, idxq, offsetidxq, coltyp, offsetcoltyp, info);
  }

  protected abstract void dlasd2K(int nl, int nr, int sqre, org.netlib.util.intW k, double[] d, int offsetd, double[] z, int offsetz, double alpha, double beta, double[] u, int offsetu, int ldu, double[] vt, int offsetvt, int ldvt, double[] dsigma, int offsetdsigma, double[] u2, int offsetu2, int ldu2, double[] vt2, int offsetvt2, int ldvt2, int[] idxp, int offsetidxp, int[] idx, int offsetidx, int[] idxc, int offsetidxc, int[] idxq, int offsetidxq, int[] coltyp, int offsetcoltyp, org.netlib.util.intW info);

  public void dlasd3(int nl, int nr, int sqre, int k, double[] d, double[] q, int ldq, double[] dsigma, double[] u, int ldu, double[] u2, int ldu2, double[] vt, int ldvt, double[] vt2, int ldvt2, int[] idxc, int[] ctot, double[] z, org.netlib.util.intW info) {
    dlasd3(nl, nr, sqre, k, d, 0, q, 0, ldq, dsigma, 0, u, 0, ldu, u2, 0, ldu2, vt, 0, ldvt, vt2, 0, ldvt2, idxc, 0, ctot, 0, z, 0, info);
  }

  public void dlasd3(int nl, int nr, int sqre, int k, double[] d, int offsetd, double[] q, int offsetq, int ldq, double[] dsigma, int offsetdsigma, double[] u, int offsetu, int ldu, double[] u2, int offsetu2, int ldu2, double[] vt, int offsetvt, int ldvt, double[] vt2, int offsetvt2, int ldvt2, int[] idxc, int offsetidxc, int[] ctot, int offsetctot, double[] z, int offsetz, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlasd3K(nl, nr, sqre, k, d, offsetd, q, offsetq, ldq, dsigma, offsetdsigma, u, offsetu, ldu, u2, offsetu2, ldu2, vt, offsetvt, ldvt, vt2, offsetvt2, ldvt2, idxc, offsetidxc, ctot, offsetctot, z, offsetz, info);
  }

  protected abstract void dlasd3K(int nl, int nr, int sqre, int k, double[] d, int offsetd, double[] q, int offsetq, int ldq, double[] dsigma, int offsetdsigma, double[] u, int offsetu, int ldu, double[] u2, int offsetu2, int ldu2, double[] vt, int offsetvt, int ldvt, double[] vt2, int offsetvt2, int ldvt2, int[] idxc, int offsetidxc, int[] ctot, int offsetctot, double[] z, int offsetz, org.netlib.util.intW info);

  public void dlasd4(int n, int i, double[] d, double[] z, double[] delta, double rho, org.netlib.util.doubleW sigma, double[] work, org.netlib.util.intW info) {
    dlasd4(n, i, d, 0, z, 0, delta, 0, rho, sigma, work, 0, info);
  }

  public void dlasd4(int n, int i, double[] d, int offsetd, double[] z, int offsetz, double[] delta, int offsetdelta, double rho, org.netlib.util.doubleW sigma, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlasd4K(n, i, d, offsetd, z, offsetz, delta, offsetdelta, rho, sigma, work, offsetwork, info);
  }

  protected abstract void dlasd4K(int n, int i, double[] d, int offsetd, double[] z, int offsetz, double[] delta, int offsetdelta, double rho, org.netlib.util.doubleW sigma, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dlasd5(int i, double[] d, double[] z, double[] delta, double rho, org.netlib.util.doubleW dsigma, double[] work) {
    dlasd5(i, d, 0, z, 0, delta, 0, rho, dsigma, work, 0);
  }

  public void dlasd5(int i, double[] d, int offsetd, double[] z, int offsetz, double[] delta, int offsetdelta, double rho, org.netlib.util.doubleW dsigma, double[] work, int offsetwork) {
    //FIXME Add arguments check
    dlasd5K(i, d, offsetd, z, offsetz, delta, offsetdelta, rho, dsigma, work, offsetwork);
  }

  protected abstract void dlasd5K(int i, double[] d, int offsetd, double[] z, int offsetz, double[] delta, int offsetdelta, double rho, org.netlib.util.doubleW dsigma, double[] work, int offsetwork);

  public void dlasd6(int icompq, int nl, int nr, int sqre, double[] d, double[] vf, double[] vl, org.netlib.util.doubleW alpha, org.netlib.util.doubleW beta, int[] idxq, int[] perm, org.netlib.util.intW givptr, int[] givcol, int ldgcol, double[] givnum, int ldgnum, double[] poles, double[] difl, double[] difr, double[] z, org.netlib.util.intW k, org.netlib.util.doubleW c, org.netlib.util.doubleW s, double[] work, int[] iwork, org.netlib.util.intW info) {
    dlasd6(icompq, nl, nr, sqre, d, 0, vf, 0, vl, 0, alpha, beta, idxq, 0, perm, 0, givptr, givcol, 0, ldgcol, givnum, 0, ldgnum, poles, 0, difl, 0, difr, 0, z, 0, k, c, s, work, 0, iwork, 0, info);
  }

  public void dlasd6(int icompq, int nl, int nr, int sqre, double[] d, int offsetd, double[] vf, int offsetvf, double[] vl, int offsetvl, org.netlib.util.doubleW alpha, org.netlib.util.doubleW beta, int[] idxq, int offsetidxq, int[] perm, int offsetperm, org.netlib.util.intW givptr, int[] givcol, int offsetgivcol, int ldgcol, double[] givnum, int offsetgivnum, int ldgnum, double[] poles, int offsetpoles, double[] difl, int offsetdifl, double[] difr, int offsetdifr, double[] z, int offsetz, org.netlib.util.intW k, org.netlib.util.doubleW c, org.netlib.util.doubleW s, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlasd6K(icompq, nl, nr, sqre, d, offsetd, vf, offsetvf, vl, offsetvl, alpha, beta, idxq, offsetidxq, perm, offsetperm, givptr, givcol, offsetgivcol, ldgcol, givnum, offsetgivnum, ldgnum, poles, offsetpoles, difl, offsetdifl, difr, offsetdifr, z, offsetz, k, c, s, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dlasd6K(int icompq, int nl, int nr, int sqre, double[] d, int offsetd, double[] vf, int offsetvf, double[] vl, int offsetvl, org.netlib.util.doubleW alpha, org.netlib.util.doubleW beta, int[] idxq, int offsetidxq, int[] perm, int offsetperm, org.netlib.util.intW givptr, int[] givcol, int offsetgivcol, int ldgcol, double[] givnum, int offsetgivnum, int ldgnum, double[] poles, int offsetpoles, double[] difl, int offsetdifl, double[] difr, int offsetdifr, double[] z, int offsetz, org.netlib.util.intW k, org.netlib.util.doubleW c, org.netlib.util.doubleW s, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dlasd7(int icompq, int nl, int nr, int sqre, org.netlib.util.intW k, double[] d, double[] z, double[] zw, double[] vf, double[] vfw, double[] vl, double[] vlw, double alpha, double beta, double[] dsigma, int[] idx, int[] idxp, int[] idxq, int[] perm, org.netlib.util.intW givptr, int[] givcol, int ldgcol, double[] givnum, int ldgnum, org.netlib.util.doubleW c, org.netlib.util.doubleW s, org.netlib.util.intW info) {
    dlasd7(icompq, nl, nr, sqre, k, d, 0, z, 0, zw, 0, vf, 0, vfw, 0, vl, 0, vlw, 0, alpha, beta, dsigma, 0, idx, 0, idxp, 0, idxq, 0, perm, 0, givptr, givcol, 0, ldgcol, givnum, 0, ldgnum, c, s, info);
  }

  public void dlasd7(int icompq, int nl, int nr, int sqre, org.netlib.util.intW k, double[] d, int offsetd, double[] z, int offsetz, double[] zw, int offsetzw, double[] vf, int offsetvf, double[] vfw, int offsetvfw, double[] vl, int offsetvl, double[] vlw, int offsetvlw, double alpha, double beta, double[] dsigma, int offsetdsigma, int[] idx, int offsetidx, int[] idxp, int offsetidxp, int[] idxq, int offsetidxq, int[] perm, int offsetperm, org.netlib.util.intW givptr, int[] givcol, int offsetgivcol, int ldgcol, double[] givnum, int offsetgivnum, int ldgnum, org.netlib.util.doubleW c, org.netlib.util.doubleW s, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlasd7K(icompq, nl, nr, sqre, k, d, offsetd, z, offsetz, zw, offsetzw, vf, offsetvf, vfw, offsetvfw, vl, offsetvl, vlw, offsetvlw, alpha, beta, dsigma, offsetdsigma, idx, offsetidx, idxp, offsetidxp, idxq, offsetidxq, perm, offsetperm, givptr, givcol, offsetgivcol, ldgcol, givnum, offsetgivnum, ldgnum, c, s, info);
  }

  protected abstract void dlasd7K(int icompq, int nl, int nr, int sqre, org.netlib.util.intW k, double[] d, int offsetd, double[] z, int offsetz, double[] zw, int offsetzw, double[] vf, int offsetvf, double[] vfw, int offsetvfw, double[] vl, int offsetvl, double[] vlw, int offsetvlw, double alpha, double beta, double[] dsigma, int offsetdsigma, int[] idx, int offsetidx, int[] idxp, int offsetidxp, int[] idxq, int offsetidxq, int[] perm, int offsetperm, org.netlib.util.intW givptr, int[] givcol, int offsetgivcol, int ldgcol, double[] givnum, int offsetgivnum, int ldgnum, org.netlib.util.doubleW c, org.netlib.util.doubleW s, org.netlib.util.intW info);

  public void dlasd8(int icompq, int k, double[] d, double[] z, double[] vf, double[] vl, double[] difl, double[] difr, int lddifr, double[] dsigma, double[] work, org.netlib.util.intW info) {
    dlasd8(icompq, k, d, 0, z, 0, vf, 0, vl, 0, difl, 0, difr, 0, lddifr, dsigma, 0, work, 0, info);
  }

  public void dlasd8(int icompq, int k, double[] d, int offsetd, double[] z, int offsetz, double[] vf, int offsetvf, double[] vl, int offsetvl, double[] difl, int offsetdifl, double[] difr, int offsetdifr, int lddifr, double[] dsigma, int offsetdsigma, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlasd8K(icompq, k, d, offsetd, z, offsetz, vf, offsetvf, vl, offsetvl, difl, offsetdifl, difr, offsetdifr, lddifr, dsigma, offsetdsigma, work, offsetwork, info);
  }

  protected abstract void dlasd8K(int icompq, int k, double[] d, int offsetd, double[] z, int offsetz, double[] vf, int offsetvf, double[] vl, int offsetvl, double[] difl, int offsetdifl, double[] difr, int offsetdifr, int lddifr, double[] dsigma, int offsetdsigma, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dlasda(int icompq, int smlsiz, int n, int sqre, double[] d, double[] e, double[] u, int ldu, double[] vt, int[] k, double[] difl, double[] difr, double[] z, double[] poles, int[] givptr, int[] givcol, int ldgcol, int[] perm, double[] givnum, double[] c, double[] s, double[] work, int[] iwork, org.netlib.util.intW info) {
    dlasda(icompq, smlsiz, n, sqre, d, 0, e, 0, u, 0, ldu, vt, 0, k, 0, difl, 0, difr, 0, z, 0, poles, 0, givptr, 0, givcol, 0, ldgcol, perm, 0, givnum, 0, c, 0, s, 0, work, 0, iwork, 0, info);
  }

  public void dlasda(int icompq, int smlsiz, int n, int sqre, double[] d, int offsetd, double[] e, int offsete, double[] u, int offsetu, int ldu, double[] vt, int offsetvt, int[] k, int offsetk, double[] difl, int offsetdifl, double[] difr, int offsetdifr, double[] z, int offsetz, double[] poles, int offsetpoles, int[] givptr, int offsetgivptr, int[] givcol, int offsetgivcol, int ldgcol, int[] perm, int offsetperm, double[] givnum, int offsetgivnum, double[] c, int offsetc, double[] s, int offsets, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlasdaK(icompq, smlsiz, n, sqre, d, offsetd, e, offsete, u, offsetu, ldu, vt, offsetvt, k, offsetk, difl, offsetdifl, difr, offsetdifr, z, offsetz, poles, offsetpoles, givptr, offsetgivptr, givcol, offsetgivcol, ldgcol, perm, offsetperm, givnum, offsetgivnum, c, offsetc, s, offsets, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dlasdaK(int icompq, int smlsiz, int n, int sqre, double[] d, int offsetd, double[] e, int offsete, double[] u, int offsetu, int ldu, double[] vt, int offsetvt, int[] k, int offsetk, double[] difl, int offsetdifl, double[] difr, int offsetdifr, double[] z, int offsetz, double[] poles, int offsetpoles, int[] givptr, int offsetgivptr, int[] givcol, int offsetgivcol, int ldgcol, int[] perm, int offsetperm, double[] givnum, int offsetgivnum, double[] c, int offsetc, double[] s, int offsets, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dlasdq(String uplo, int sqre, int n, int ncvt, int nru, int ncc, double[] d, double[] e, double[] vt, int ldvt, double[] u, int ldu, double[] c, int Ldc, double[] work, org.netlib.util.intW info) {
    dlasdq(uplo, sqre, n, ncvt, nru, ncc, d, 0, e, 0, vt, 0, ldvt, u, 0, ldu, c, 0, Ldc, work, 0, info);
  }

  public void dlasdq(String uplo, int sqre, int n, int ncvt, int nru, int ncc, double[] d, int offsetd, double[] e, int offsete, double[] vt, int offsetvt, int ldvt, double[] u, int offsetu, int ldu, double[] c, int offsetc, int Ldc, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlasdqK(uplo, sqre, n, ncvt, nru, ncc, d, offsetd, e, offsete, vt, offsetvt, ldvt, u, offsetu, ldu, c, offsetc, Ldc, work, offsetwork, info);
  }

  protected abstract void dlasdqK(String uplo, int sqre, int n, int ncvt, int nru, int ncc, double[] d, int offsetd, double[] e, int offsete, double[] vt, int offsetvt, int ldvt, double[] u, int offsetu, int ldu, double[] c, int offsetc, int Ldc, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dlasdt(int n, org.netlib.util.intW lvl, org.netlib.util.intW nd, int[] inode, int[] ndiml, int[] ndimr, int msub) {
    dlasdt(n, lvl, nd, inode, 0, ndiml, 0, ndimr, 0, msub);
  }

  public void dlasdt(int n, org.netlib.util.intW lvl, org.netlib.util.intW nd, int[] inode, int offsetinode, int[] ndiml, int offsetndiml, int[] ndimr, int offsetndimr, int msub) {
    //FIXME Add arguments check
    dlasdtK(n, lvl, nd, inode, offsetinode, ndiml, offsetndiml, ndimr, offsetndimr, msub);
  }

  protected abstract void dlasdtK(int n, org.netlib.util.intW lvl, org.netlib.util.intW nd, int[] inode, int offsetinode, int[] ndiml, int offsetndiml, int[] ndimr, int offsetndimr, int msub);

  public void dlaset(String uplo, int m, int n, double alpha, double beta, double[] a, int lda) {
    dlaset(uplo, m, n, alpha, beta, a, 0, lda);
  }

  public void dlaset(String uplo, int m, int n, double alpha, double beta, double[] a, int offseta, int lda) {
    //FIXME Add arguments check
    dlasetK(uplo, m, n, alpha, beta, a, offseta, lda);
  }

  protected abstract void dlasetK(String uplo, int m, int n, double alpha, double beta, double[] a, int offseta, int lda);

  public void dlasq1(int n, double[] d, double[] e, double[] work, org.netlib.util.intW info) {
    dlasq1(n, d, 0, e, 0, work, 0, info);
  }

  public void dlasq1(int n, double[] d, int offsetd, double[] e, int offsete, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlasq1K(n, d, offsetd, e, offsete, work, offsetwork, info);
  }

  protected abstract void dlasq1K(int n, double[] d, int offsetd, double[] e, int offsete, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dlasq2(int n, double[] z, org.netlib.util.intW info) {
    dlasq2(n, z, 0, info);
  }

  public void dlasq2(int n, double[] z, int offsetz, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlasq2K(n, z, offsetz, info);
  }

  protected abstract void dlasq2K(int n, double[] z, int offsetz, org.netlib.util.intW info);

  public void dlasq3(int i0, org.netlib.util.intW n0, double[] z, int pp, org.netlib.util.doubleW dmin, org.netlib.util.doubleW sigma, org.netlib.util.doubleW desig, org.netlib.util.doubleW qmax, org.netlib.util.intW nfail, org.netlib.util.intW iter, org.netlib.util.intW ndiv, boolean ieee) {
    dlasq3(i0, n0, z, 0, pp, dmin, sigma, desig, qmax, nfail, iter, ndiv, ieee);
  }

  public void dlasq3(int i0, org.netlib.util.intW n0, double[] z, int offsetz, int pp, org.netlib.util.doubleW dmin, org.netlib.util.doubleW sigma, org.netlib.util.doubleW desig, org.netlib.util.doubleW qmax, org.netlib.util.intW nfail, org.netlib.util.intW iter, org.netlib.util.intW ndiv, boolean ieee) {
    //FIXME Add arguments check
    dlasq3K(i0, n0, z, offsetz, pp, dmin, sigma, desig, qmax, nfail, iter, ndiv, ieee);
  }

  protected abstract void dlasq3K(int i0, org.netlib.util.intW n0, double[] z, int offsetz, int pp, org.netlib.util.doubleW dmin, org.netlib.util.doubleW sigma, org.netlib.util.doubleW desig, org.netlib.util.doubleW qmax, org.netlib.util.intW nfail, org.netlib.util.intW iter, org.netlib.util.intW ndiv, boolean ieee);

  public void dlasq4(int i0, int n0, double[] z, int pp, int n0in, double dmin, double dmin1, double dmin2, double dn, double dn1, double dn2, org.netlib.util.doubleW tau, org.netlib.util.intW ttype) {
    dlasq4(i0, n0, z, 0, pp, n0in, dmin, dmin1, dmin2, dn, dn1, dn2, tau, ttype);
  }

  public void dlasq4(int i0, int n0, double[] z, int offsetz, int pp, int n0in, double dmin, double dmin1, double dmin2, double dn, double dn1, double dn2, org.netlib.util.doubleW tau, org.netlib.util.intW ttype) {
    //FIXME Add arguments check
    dlasq4K(i0, n0, z, offsetz, pp, n0in, dmin, dmin1, dmin2, dn, dn1, dn2, tau, ttype);
  }

  protected abstract void dlasq4K(int i0, int n0, double[] z, int offsetz, int pp, int n0in, double dmin, double dmin1, double dmin2, double dn, double dn1, double dn2, org.netlib.util.doubleW tau, org.netlib.util.intW ttype);

  public void dlasq5(int i0, int n0, double[] z, int pp, double tau, org.netlib.util.doubleW dmin, org.netlib.util.doubleW dmin1, org.netlib.util.doubleW dmin2, org.netlib.util.doubleW dn, org.netlib.util.doubleW dnm1, org.netlib.util.doubleW dnm2, boolean ieee) {
    dlasq5(i0, n0, z, 0, pp, tau, dmin, dmin1, dmin2, dn, dnm1, dnm2, ieee);
  }

  public void dlasq5(int i0, int n0, double[] z, int offsetz, int pp, double tau, org.netlib.util.doubleW dmin, org.netlib.util.doubleW dmin1, org.netlib.util.doubleW dmin2, org.netlib.util.doubleW dn, org.netlib.util.doubleW dnm1, org.netlib.util.doubleW dnm2, boolean ieee) {
    //FIXME Add arguments check
    dlasq5K(i0, n0, z, offsetz, pp, tau, dmin, dmin1, dmin2, dn, dnm1, dnm2, ieee);
  }

  protected abstract void dlasq5K(int i0, int n0, double[] z, int offsetz, int pp, double tau, org.netlib.util.doubleW dmin, org.netlib.util.doubleW dmin1, org.netlib.util.doubleW dmin2, org.netlib.util.doubleW dn, org.netlib.util.doubleW dnm1, org.netlib.util.doubleW dnm2, boolean ieee);

  public void dlasq6(int i0, int n0, double[] z, int pp, org.netlib.util.doubleW dmin, org.netlib.util.doubleW dmin1, org.netlib.util.doubleW dmin2, org.netlib.util.doubleW dn, org.netlib.util.doubleW dnm1, org.netlib.util.doubleW dnm2) {
    dlasq6(i0, n0, z, 0, pp, dmin, dmin1, dmin2, dn, dnm1, dnm2);
  }

  public void dlasq6(int i0, int n0, double[] z, int offsetz, int pp, org.netlib.util.doubleW dmin, org.netlib.util.doubleW dmin1, org.netlib.util.doubleW dmin2, org.netlib.util.doubleW dn, org.netlib.util.doubleW dnm1, org.netlib.util.doubleW dnm2) {
    //FIXME Add arguments check
    dlasq6K(i0, n0, z, offsetz, pp, dmin, dmin1, dmin2, dn, dnm1, dnm2);
  }

  protected abstract void dlasq6K(int i0, int n0, double[] z, int offsetz, int pp, org.netlib.util.doubleW dmin, org.netlib.util.doubleW dmin1, org.netlib.util.doubleW dmin2, org.netlib.util.doubleW dn, org.netlib.util.doubleW dnm1, org.netlib.util.doubleW dnm2);

  public void dlasr(String side, String pivot, String direct, int m, int n, double[] c, double[] s, double[] a, int lda) {
    dlasr(side, pivot, direct, m, n, c, 0, s, 0, a, 0, lda);
  }

  public void dlasr(String side, String pivot, String direct, int m, int n, double[] c, int offsetc, double[] s, int offsets, double[] a, int offseta, int lda) {
    //FIXME Add arguments check
    dlasrK(side, pivot, direct, m, n, c, offsetc, s, offsets, a, offseta, lda);
  }

  protected abstract void dlasrK(String side, String pivot, String direct, int m, int n, double[] c, int offsetc, double[] s, int offsets, double[] a, int offseta, int lda);

  public void dlasrt(String id, int n, double[] d, org.netlib.util.intW info) {
    dlasrt(id, n, d, 0, info);
  }

  public void dlasrt(String id, int n, double[] d, int offsetd, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlasrtK(id, n, d, offsetd, info);
  }

  protected abstract void dlasrtK(String id, int n, double[] d, int offsetd, org.netlib.util.intW info);

  public void dlassq(int n, double[] x, int incx, org.netlib.util.doubleW scale, org.netlib.util.doubleW sumsq) {
    dlassq(n, x, 0, incx, scale, sumsq);
  }

  public void dlassq(int n, double[] x, int offsetx, int incx, org.netlib.util.doubleW scale, org.netlib.util.doubleW sumsq) {
    //FIXME Add arguments check
    dlassqK(n, x, offsetx, incx, scale, sumsq);
  }

  protected abstract void dlassqK(int n, double[] x, int offsetx, int incx, org.netlib.util.doubleW scale, org.netlib.util.doubleW sumsq);

  public void dlasv2(double f, double g, double h, org.netlib.util.doubleW ssmin, org.netlib.util.doubleW ssmax, org.netlib.util.doubleW snr, org.netlib.util.doubleW csr, org.netlib.util.doubleW snl, org.netlib.util.doubleW csl) {
    dlasv2K(f, g, h, ssmin, ssmax, snr, csr, snl, csl);
  }

  protected abstract void dlasv2K(double f, double g, double h, org.netlib.util.doubleW ssmin, org.netlib.util.doubleW ssmax, org.netlib.util.doubleW snr, org.netlib.util.doubleW csr, org.netlib.util.doubleW snl, org.netlib.util.doubleW csl);

  public void dlaswp(int n, double[] a, int lda, int k1, int k2, int[] ipiv, int incx) {
    dlaswp(n, a, 0, lda, k1, k2, ipiv, 0, incx);
  }

  public void dlaswp(int n, double[] a, int offseta, int lda, int k1, int k2, int[] ipiv, int offsetipiv, int incx) {
    //FIXME Add arguments check
    dlaswpK(n, a, offseta, lda, k1, k2, ipiv, offsetipiv, incx);
  }

  protected abstract void dlaswpK(int n, double[] a, int offseta, int lda, int k1, int k2, int[] ipiv, int offsetipiv, int incx);

  public void dlasy2(boolean ltranl, boolean ltranr, int isgn, int n1, int n2, double[] tl, int ldtl, double[] tr, int ldtr, double[] b, int ldb, org.netlib.util.doubleW scale, double[] x, int ldx, org.netlib.util.doubleW xnorm, org.netlib.util.intW info) {
    dlasy2(ltranl, ltranr, isgn, n1, n2, tl, 0, ldtl, tr, 0, ldtr, b, 0, ldb, scale, x, 0, ldx, xnorm, info);
  }

  public void dlasy2(boolean ltranl, boolean ltranr, int isgn, int n1, int n2, double[] tl, int offsettl, int ldtl, double[] tr, int offsettr, int ldtr, double[] b, int offsetb, int ldb, org.netlib.util.doubleW scale, double[] x, int offsetx, int ldx, org.netlib.util.doubleW xnorm, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlasy2K(ltranl, ltranr, isgn, n1, n2, tl, offsettl, ldtl, tr, offsettr, ldtr, b, offsetb, ldb, scale, x, offsetx, ldx, xnorm, info);
  }

  protected abstract void dlasy2K(boolean ltranl, boolean ltranr, int isgn, int n1, int n2, double[] tl, int offsettl, int ldtl, double[] tr, int offsettr, int ldtr, double[] b, int offsetb, int ldb, org.netlib.util.doubleW scale, double[] x, int offsetx, int ldx, org.netlib.util.doubleW xnorm, org.netlib.util.intW info);

  public void dlasyf(String uplo, int n, int nb, org.netlib.util.intW kb, double[] a, int lda, int[] ipiv, double[] w, int ldw, org.netlib.util.intW info) {
    dlasyf(uplo, n, nb, kb, a, 0, lda, ipiv, 0, w, 0, ldw, info);
  }

  public void dlasyf(String uplo, int n, int nb, org.netlib.util.intW kb, double[] a, int offseta, int lda, int[] ipiv, int offsetipiv, double[] w, int offsetw, int ldw, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlasyfK(uplo, n, nb, kb, a, offseta, lda, ipiv, offsetipiv, w, offsetw, ldw, info);
  }

  protected abstract void dlasyfK(String uplo, int n, int nb, org.netlib.util.intW kb, double[] a, int offseta, int lda, int[] ipiv, int offsetipiv, double[] w, int offsetw, int ldw, org.netlib.util.intW info);

  public void dlatbs(String uplo, String trans, String diag, String normin, int n, int kd, double[] ab, int ldab, double[] x, org.netlib.util.doubleW scale, double[] cnorm, org.netlib.util.intW info) {
    dlatbs(uplo, trans, diag, normin, n, kd, ab, 0, ldab, x, 0, scale, cnorm, 0, info);
  }

  public void dlatbs(String uplo, String trans, String diag, String normin, int n, int kd, double[] ab, int offsetab, int ldab, double[] x, int offsetx, org.netlib.util.doubleW scale, double[] cnorm, int offsetcnorm, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlatbsK(uplo, trans, diag, normin, n, kd, ab, offsetab, ldab, x, offsetx, scale, cnorm, offsetcnorm, info);
  }

  protected abstract void dlatbsK(String uplo, String trans, String diag, String normin, int n, int kd, double[] ab, int offsetab, int ldab, double[] x, int offsetx, org.netlib.util.doubleW scale, double[] cnorm, int offsetcnorm, org.netlib.util.intW info);

  public void dlatdf(int ijob, int n, double[] z, int ldz, double[] rhs, org.netlib.util.doubleW rdsum, org.netlib.util.doubleW rdscal, int[] ipiv, int[] jpiv) {
    dlatdf(ijob, n, z, 0, ldz, rhs, 0, rdsum, rdscal, ipiv, 0, jpiv, 0);
  }

  public void dlatdf(int ijob, int n, double[] z, int offsetz, int ldz, double[] rhs, int offsetrhs, org.netlib.util.doubleW rdsum, org.netlib.util.doubleW rdscal, int[] ipiv, int offsetipiv, int[] jpiv, int offsetjpiv) {
    //FIXME Add arguments check
    dlatdfK(ijob, n, z, offsetz, ldz, rhs, offsetrhs, rdsum, rdscal, ipiv, offsetipiv, jpiv, offsetjpiv);
  }

  protected abstract void dlatdfK(int ijob, int n, double[] z, int offsetz, int ldz, double[] rhs, int offsetrhs, org.netlib.util.doubleW rdsum, org.netlib.util.doubleW rdscal, int[] ipiv, int offsetipiv, int[] jpiv, int offsetjpiv);

  public void dlatps(String uplo, String trans, String diag, String normin, int n, double[] ap, double[] x, org.netlib.util.doubleW scale, double[] cnorm, org.netlib.util.intW info) {
    dlatps(uplo, trans, diag, normin, n, ap, 0, x, 0, scale, cnorm, 0, info);
  }

  public void dlatps(String uplo, String trans, String diag, String normin, int n, double[] ap, int offsetap, double[] x, int offsetx, org.netlib.util.doubleW scale, double[] cnorm, int offsetcnorm, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlatpsK(uplo, trans, diag, normin, n, ap, offsetap, x, offsetx, scale, cnorm, offsetcnorm, info);
  }

  protected abstract void dlatpsK(String uplo, String trans, String diag, String normin, int n, double[] ap, int offsetap, double[] x, int offsetx, org.netlib.util.doubleW scale, double[] cnorm, int offsetcnorm, org.netlib.util.intW info);

  public void dlatrd(String uplo, int n, int nb, double[] a, int lda, double[] e, double[] tau, double[] w, int ldw) {
    dlatrd(uplo, n, nb, a, 0, lda, e, 0, tau, 0, w, 0, ldw);
  }

  public void dlatrd(String uplo, int n, int nb, double[] a, int offseta, int lda, double[] e, int offsete, double[] tau, int offsettau, double[] w, int offsetw, int ldw) {
    //FIXME Add arguments check
    dlatrdK(uplo, n, nb, a, offseta, lda, e, offsete, tau, offsettau, w, offsetw, ldw);
  }

  protected abstract void dlatrdK(String uplo, int n, int nb, double[] a, int offseta, int lda, double[] e, int offsete, double[] tau, int offsettau, double[] w, int offsetw, int ldw);

  public void dlatrs(String uplo, String trans, String diag, String normin, int n, double[] a, int lda, double[] x, org.netlib.util.doubleW scale, double[] cnorm, org.netlib.util.intW info) {
    dlatrs(uplo, trans, diag, normin, n, a, 0, lda, x, 0, scale, cnorm, 0, info);
  }

  public void dlatrs(String uplo, String trans, String diag, String normin, int n, double[] a, int offseta, int lda, double[] x, int offsetx, org.netlib.util.doubleW scale, double[] cnorm, int offsetcnorm, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlatrsK(uplo, trans, diag, normin, n, a, offseta, lda, x, offsetx, scale, cnorm, offsetcnorm, info);
  }

  protected abstract void dlatrsK(String uplo, String trans, String diag, String normin, int n, double[] a, int offseta, int lda, double[] x, int offsetx, org.netlib.util.doubleW scale, double[] cnorm, int offsetcnorm, org.netlib.util.intW info);

  public void dlatrz(int m, int n, int l, double[] a, int lda, double[] tau, double[] work) {
    dlatrz(m, n, l, a, 0, lda, tau, 0, work, 0);
  }

  public void dlatrz(int m, int n, int l, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork) {
    //FIXME Add arguments check
    dlatrzK(m, n, l, a, offseta, lda, tau, offsettau, work, offsetwork);
  }

  protected abstract void dlatrzK(int m, int n, int l, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork);

  public void dlatzm(String side, int m, int n, double[] v, int incv, double tau, double[] c1, double[] c2, int Ldc, double[] work) {
    dlatzm(side, m, n, v, 0, incv, tau, c1, 0, c2, 0, Ldc, work, 0);
  }

  public void dlatzm(String side, int m, int n, double[] v, int offsetv, int incv, double tau, double[] c1, int offsetc1, double[] c2, int offsetc2, int Ldc, double[] work, int offsetwork) {
    //FIXME Add arguments check
    dlatzmK(side, m, n, v, offsetv, incv, tau, c1, offsetc1, c2, offsetc2, Ldc, work, offsetwork);
  }

  protected abstract void dlatzmK(String side, int m, int n, double[] v, int offsetv, int incv, double tau, double[] c1, int offsetc1, double[] c2, int offsetc2, int Ldc, double[] work, int offsetwork);

  public void dlauu2(String uplo, int n, double[] a, int lda, org.netlib.util.intW info) {
    dlauu2(uplo, n, a, 0, lda, info);
  }

  public void dlauu2(String uplo, int n, double[] a, int offseta, int lda, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlauu2K(uplo, n, a, offseta, lda, info);
  }

  protected abstract void dlauu2K(String uplo, int n, double[] a, int offseta, int lda, org.netlib.util.intW info);

  public void dlauum(String uplo, int n, double[] a, int lda, org.netlib.util.intW info) {
    dlauum(uplo, n, a, 0, lda, info);
  }

  public void dlauum(String uplo, int n, double[] a, int offseta, int lda, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dlauumK(uplo, n, a, offseta, lda, info);
  }

  protected abstract void dlauumK(String uplo, int n, double[] a, int offseta, int lda, org.netlib.util.intW info);

  public void dlazq3(int i0, org.netlib.util.intW n0, double[] z, int pp, org.netlib.util.doubleW dmin, org.netlib.util.doubleW sigma, org.netlib.util.doubleW desig, org.netlib.util.doubleW qmax, org.netlib.util.intW nfail, org.netlib.util.intW iter, org.netlib.util.intW ndiv, boolean ieee, org.netlib.util.intW ttype, org.netlib.util.doubleW dmin1, org.netlib.util.doubleW dmin2, org.netlib.util.doubleW dn, org.netlib.util.doubleW dn1, org.netlib.util.doubleW dn2, org.netlib.util.doubleW tau) {
    dlazq3(i0, n0, z, 0, pp, dmin, sigma, desig, qmax, nfail, iter, ndiv, ieee, ttype, dmin1, dmin2, dn, dn1, dn2, tau);
  }

  public void dlazq3(int i0, org.netlib.util.intW n0, double[] z, int offsetz, int pp, org.netlib.util.doubleW dmin, org.netlib.util.doubleW sigma, org.netlib.util.doubleW desig, org.netlib.util.doubleW qmax, org.netlib.util.intW nfail, org.netlib.util.intW iter, org.netlib.util.intW ndiv, boolean ieee, org.netlib.util.intW ttype, org.netlib.util.doubleW dmin1, org.netlib.util.doubleW dmin2, org.netlib.util.doubleW dn, org.netlib.util.doubleW dn1, org.netlib.util.doubleW dn2, org.netlib.util.doubleW tau) {
    //FIXME Add arguments check
    dlazq3K(i0, n0, z, offsetz, pp, dmin, sigma, desig, qmax, nfail, iter, ndiv, ieee, ttype, dmin1, dmin2, dn, dn1, dn2, tau);
  }

  protected abstract void dlazq3K(int i0, org.netlib.util.intW n0, double[] z, int offsetz, int pp, org.netlib.util.doubleW dmin, org.netlib.util.doubleW sigma, org.netlib.util.doubleW desig, org.netlib.util.doubleW qmax, org.netlib.util.intW nfail, org.netlib.util.intW iter, org.netlib.util.intW ndiv, boolean ieee, org.netlib.util.intW ttype, org.netlib.util.doubleW dmin1, org.netlib.util.doubleW dmin2, org.netlib.util.doubleW dn, org.netlib.util.doubleW dn1, org.netlib.util.doubleW dn2, org.netlib.util.doubleW tau);

  public void dlazq4(int i0, int n0, double[] z, int pp, int n0in, double dmin, double dmin1, double dmin2, double dn, double dn1, double dn2, org.netlib.util.doubleW tau, org.netlib.util.intW ttype, org.netlib.util.doubleW g) {
    dlazq4(i0, n0, z, 0, pp, n0in, dmin, dmin1, dmin2, dn, dn1, dn2, tau, ttype, g);
  }

  public void dlazq4(int i0, int n0, double[] z, int offsetz, int pp, int n0in, double dmin, double dmin1, double dmin2, double dn, double dn1, double dn2, org.netlib.util.doubleW tau, org.netlib.util.intW ttype, org.netlib.util.doubleW g) {
    //FIXME Add arguments check
    dlazq4K(i0, n0, z, offsetz, pp, n0in, dmin, dmin1, dmin2, dn, dn1, dn2, tau, ttype, g);
  }

  protected abstract void dlazq4K(int i0, int n0, double[] z, int offsetz, int pp, int n0in, double dmin, double dmin1, double dmin2, double dn, double dn1, double dn2, org.netlib.util.doubleW tau, org.netlib.util.intW ttype, org.netlib.util.doubleW g);

  public void dopgtr(String uplo, int n, double[] ap, double[] tau, double[] q, int ldq, double[] work, org.netlib.util.intW info) {
    dopgtr(uplo, n, ap, 0, tau, 0, q, 0, ldq, work, 0, info);
  }

  public void dopgtr(String uplo, int n, double[] ap, int offsetap, double[] tau, int offsettau, double[] q, int offsetq, int ldq, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dopgtrK(uplo, n, ap, offsetap, tau, offsettau, q, offsetq, ldq, work, offsetwork, info);
  }

  protected abstract void dopgtrK(String uplo, int n, double[] ap, int offsetap, double[] tau, int offsettau, double[] q, int offsetq, int ldq, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dopmtr(String side, String uplo, String trans, int m, int n, double[] ap, double[] tau, double[] c, int Ldc, double[] work, org.netlib.util.intW info) {
    dopmtr(side, uplo, trans, m, n, ap, 0, tau, 0, c, 0, Ldc, work, 0, info);
  }

  public void dopmtr(String side, String uplo, String trans, int m, int n, double[] ap, int offsetap, double[] tau, int offsettau, double[] c, int offsetc, int Ldc, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dopmtrK(side, uplo, trans, m, n, ap, offsetap, tau, offsettau, c, offsetc, Ldc, work, offsetwork, info);
  }

  protected abstract void dopmtrK(String side, String uplo, String trans, int m, int n, double[] ap, int offsetap, double[] tau, int offsettau, double[] c, int offsetc, int Ldc, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dorg2l(int m, int n, int k, double[] a, int lda, double[] tau, double[] work, org.netlib.util.intW info) {
    dorg2l(m, n, k, a, 0, lda, tau, 0, work, 0, info);
  }

  public void dorg2l(int m, int n, int k, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dorg2lK(m, n, k, a, offseta, lda, tau, offsettau, work, offsetwork, info);
  }

  protected abstract void dorg2lK(int m, int n, int k, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dorg2r(int m, int n, int k, double[] a, int lda, double[] tau, double[] work, org.netlib.util.intW info) {
    dorg2r(m, n, k, a, 0, lda, tau, 0, work, 0, info);
  }

  public void dorg2r(int m, int n, int k, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dorg2rK(m, n, k, a, offseta, lda, tau, offsettau, work, offsetwork, info);
  }

  protected abstract void dorg2rK(int m, int n, int k, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dorgbr(String vect, int m, int n, int k, double[] a, int lda, double[] tau, double[] work, int lwork, org.netlib.util.intW info) {
    dorgbr(vect, m, n, k, a, 0, lda, tau, 0, work, 0, lwork, info);
  }

  public void dorgbr(String vect, int m, int n, int k, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dorgbrK(vect, m, n, k, a, offseta, lda, tau, offsettau, work, offsetwork, lwork, info);
  }

  protected abstract void dorgbrK(String vect, int m, int n, int k, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dorghr(int n, int ilo, int ihi, double[] a, int lda, double[] tau, double[] work, int lwork, org.netlib.util.intW info) {
    dorghr(n, ilo, ihi, a, 0, lda, tau, 0, work, 0, lwork, info);
  }

  public void dorghr(int n, int ilo, int ihi, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dorghrK(n, ilo, ihi, a, offseta, lda, tau, offsettau, work, offsetwork, lwork, info);
  }

  protected abstract void dorghrK(int n, int ilo, int ihi, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dorgl2(int m, int n, int k, double[] a, int lda, double[] tau, double[] work, org.netlib.util.intW info) {
    dorgl2(m, n, k, a, 0, lda, tau, 0, work, 0, info);
  }

  public void dorgl2(int m, int n, int k, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dorgl2K(m, n, k, a, offseta, lda, tau, offsettau, work, offsetwork, info);
  }

  protected abstract void dorgl2K(int m, int n, int k, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dorglq(int m, int n, int k, double[] a, int lda, double[] tau, double[] work, int lwork, org.netlib.util.intW info) {
    dorglq(m, n, k, a, 0, lda, tau, 0, work, 0, lwork, info);
  }

  public void dorglq(int m, int n, int k, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dorglqK(m, n, k, a, offseta, lda, tau, offsettau, work, offsetwork, lwork, info);
  }

  protected abstract void dorglqK(int m, int n, int k, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dorgql(int m, int n, int k, double[] a, int lda, double[] tau, double[] work, int lwork, org.netlib.util.intW info) {
    dorgql(m, n, k, a, 0, lda, tau, 0, work, 0, lwork, info);
  }

  public void dorgql(int m, int n, int k, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dorgqlK(m, n, k, a, offseta, lda, tau, offsettau, work, offsetwork, lwork, info);
  }

  protected abstract void dorgqlK(int m, int n, int k, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dorgqr(int m, int n, int k, double[] a, int lda, double[] tau, double[] work, int lwork, org.netlib.util.intW info) {
    dorgqr(m, n, k, a, 0, lda, tau, 0, work, 0, lwork, info);
  }

  public void dorgqr(int m, int n, int k, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dorgqrK(m, n, k, a, offseta, lda, tau, offsettau, work, offsetwork, lwork, info);
  }

  protected abstract void dorgqrK(int m, int n, int k, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dorgr2(int m, int n, int k, double[] a, int lda, double[] tau, double[] work, org.netlib.util.intW info) {
    dorgr2(m, n, k, a, 0, lda, tau, 0, work, 0, info);
  }

  public void dorgr2(int m, int n, int k, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dorgr2K(m, n, k, a, offseta, lda, tau, offsettau, work, offsetwork, info);
  }

  protected abstract void dorgr2K(int m, int n, int k, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dorgrq(int m, int n, int k, double[] a, int lda, double[] tau, double[] work, int lwork, org.netlib.util.intW info) {
    dorgrq(m, n, k, a, 0, lda, tau, 0, work, 0, lwork, info);
  }

  public void dorgrq(int m, int n, int k, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dorgrqK(m, n, k, a, offseta, lda, tau, offsettau, work, offsetwork, lwork, info);
  }

  protected abstract void dorgrqK(int m, int n, int k, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dorgtr(String uplo, int n, double[] a, int lda, double[] tau, double[] work, int lwork, org.netlib.util.intW info) {
    dorgtr(uplo, n, a, 0, lda, tau, 0, work, 0, lwork, info);
  }

  public void dorgtr(String uplo, int n, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dorgtrK(uplo, n, a, offseta, lda, tau, offsettau, work, offsetwork, lwork, info);
  }

  protected abstract void dorgtrK(String uplo, int n, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dorm2l(String side, String trans, int m, int n, int k, double[] a, int lda, double[] tau, double[] c, int Ldc, double[] work, org.netlib.util.intW info) {
    dorm2l(side, trans, m, n, k, a, 0, lda, tau, 0, c, 0, Ldc, work, 0, info);
  }

  public void dorm2l(String side, String trans, int m, int n, int k, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] c, int offsetc, int Ldc, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dorm2lK(side, trans, m, n, k, a, offseta, lda, tau, offsettau, c, offsetc, Ldc, work, offsetwork, info);
  }

  protected abstract void dorm2lK(String side, String trans, int m, int n, int k, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] c, int offsetc, int Ldc, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dorm2r(String side, String trans, int m, int n, int k, double[] a, int lda, double[] tau, double[] c, int Ldc, double[] work, org.netlib.util.intW info) {
    dorm2r(side, trans, m, n, k, a, 0, lda, tau, 0, c, 0, Ldc, work, 0, info);
  }

  public void dorm2r(String side, String trans, int m, int n, int k, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] c, int offsetc, int Ldc, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dorm2rK(side, trans, m, n, k, a, offseta, lda, tau, offsettau, c, offsetc, Ldc, work, offsetwork, info);
  }

  protected abstract void dorm2rK(String side, String trans, int m, int n, int k, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] c, int offsetc, int Ldc, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dormbr(String vect, String side, String trans, int m, int n, int k, double[] a, int lda, double[] tau, double[] c, int Ldc, double[] work, int lwork, org.netlib.util.intW info) {
    dormbr(vect, side, trans, m, n, k, a, 0, lda, tau, 0, c, 0, Ldc, work, 0, lwork, info);
  }

  public void dormbr(String vect, String side, String trans, int m, int n, int k, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] c, int offsetc, int Ldc, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dormbrK(vect, side, trans, m, n, k, a, offseta, lda, tau, offsettau, c, offsetc, Ldc, work, offsetwork, lwork, info);
  }

  protected abstract void dormbrK(String vect, String side, String trans, int m, int n, int k, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] c, int offsetc, int Ldc, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dormhr(String side, String trans, int m, int n, int ilo, int ihi, double[] a, int lda, double[] tau, double[] c, int Ldc, double[] work, int lwork, org.netlib.util.intW info) {
    dormhr(side, trans, m, n, ilo, ihi, a, 0, lda, tau, 0, c, 0, Ldc, work, 0, lwork, info);
  }

  public void dormhr(String side, String trans, int m, int n, int ilo, int ihi, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] c, int offsetc, int Ldc, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dormhrK(side, trans, m, n, ilo, ihi, a, offseta, lda, tau, offsettau, c, offsetc, Ldc, work, offsetwork, lwork, info);
  }

  protected abstract void dormhrK(String side, String trans, int m, int n, int ilo, int ihi, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] c, int offsetc, int Ldc, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dorml2(String side, String trans, int m, int n, int k, double[] a, int lda, double[] tau, double[] c, int Ldc, double[] work, org.netlib.util.intW info) {
    dorml2(side, trans, m, n, k, a, 0, lda, tau, 0, c, 0, Ldc, work, 0, info);
  }

  public void dorml2(String side, String trans, int m, int n, int k, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] c, int offsetc, int Ldc, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dorml2K(side, trans, m, n, k, a, offseta, lda, tau, offsettau, c, offsetc, Ldc, work, offsetwork, info);
  }

  protected abstract void dorml2K(String side, String trans, int m, int n, int k, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] c, int offsetc, int Ldc, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dormlq(String side, String trans, int m, int n, int k, double[] a, int lda, double[] tau, double[] c, int Ldc, double[] work, int lwork, org.netlib.util.intW info) {
    dormlq(side, trans, m, n, k, a, 0, lda, tau, 0, c, 0, Ldc, work, 0, lwork, info);
  }

  public void dormlq(String side, String trans, int m, int n, int k, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] c, int offsetc, int Ldc, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dormlqK(side, trans, m, n, k, a, offseta, lda, tau, offsettau, c, offsetc, Ldc, work, offsetwork, lwork, info);
  }

  protected abstract void dormlqK(String side, String trans, int m, int n, int k, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] c, int offsetc, int Ldc, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dormql(String side, String trans, int m, int n, int k, double[] a, int lda, double[] tau, double[] c, int Ldc, double[] work, int lwork, org.netlib.util.intW info) {
    dormql(side, trans, m, n, k, a, 0, lda, tau, 0, c, 0, Ldc, work, 0, lwork, info);
  }

  public void dormql(String side, String trans, int m, int n, int k, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] c, int offsetc, int Ldc, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dormqlK(side, trans, m, n, k, a, offseta, lda, tau, offsettau, c, offsetc, Ldc, work, offsetwork, lwork, info);
  }

  protected abstract void dormqlK(String side, String trans, int m, int n, int k, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] c, int offsetc, int Ldc, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dormqr(String side, String trans, int m, int n, int k, double[] a, int lda, double[] tau, double[] c, int Ldc, double[] work, int lwork, org.netlib.util.intW info) {
    dormqr(side, trans, m, n, k, a, 0, lda, tau, 0, c, 0, Ldc, work, 0, lwork, info);
  }

  public void dormqr(String side, String trans, int m, int n, int k, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] c, int offsetc, int Ldc, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dormqrK(side, trans, m, n, k, a, offseta, lda, tau, offsettau, c, offsetc, Ldc, work, offsetwork, lwork, info);
  }

  protected abstract void dormqrK(String side, String trans, int m, int n, int k, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] c, int offsetc, int Ldc, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dormr2(String side, String trans, int m, int n, int k, double[] a, int lda, double[] tau, double[] c, int Ldc, double[] work, org.netlib.util.intW info) {
    dormr2(side, trans, m, n, k, a, 0, lda, tau, 0, c, 0, Ldc, work, 0, info);
  }

  public void dormr2(String side, String trans, int m, int n, int k, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] c, int offsetc, int Ldc, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dormr2K(side, trans, m, n, k, a, offseta, lda, tau, offsettau, c, offsetc, Ldc, work, offsetwork, info);
  }

  protected abstract void dormr2K(String side, String trans, int m, int n, int k, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] c, int offsetc, int Ldc, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dormr3(String side, String trans, int m, int n, int k, int l, double[] a, int lda, double[] tau, double[] c, int Ldc, double[] work, org.netlib.util.intW info) {
    dormr3(side, trans, m, n, k, l, a, 0, lda, tau, 0, c, 0, Ldc, work, 0, info);
  }

  public void dormr3(String side, String trans, int m, int n, int k, int l, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] c, int offsetc, int Ldc, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dormr3K(side, trans, m, n, k, l, a, offseta, lda, tau, offsettau, c, offsetc, Ldc, work, offsetwork, info);
  }

  protected abstract void dormr3K(String side, String trans, int m, int n, int k, int l, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] c, int offsetc, int Ldc, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dormrq(String side, String trans, int m, int n, int k, double[] a, int lda, double[] tau, double[] c, int Ldc, double[] work, int lwork, org.netlib.util.intW info) {
    dormrq(side, trans, m, n, k, a, 0, lda, tau, 0, c, 0, Ldc, work, 0, lwork, info);
  }

  public void dormrq(String side, String trans, int m, int n, int k, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] c, int offsetc, int Ldc, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dormrqK(side, trans, m, n, k, a, offseta, lda, tau, offsettau, c, offsetc, Ldc, work, offsetwork, lwork, info);
  }

  protected abstract void dormrqK(String side, String trans, int m, int n, int k, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] c, int offsetc, int Ldc, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dormrz(String side, String trans, int m, int n, int k, int l, double[] a, int lda, double[] tau, double[] c, int Ldc, double[] work, int lwork, org.netlib.util.intW info) {
    dormrz(side, trans, m, n, k, l, a, 0, lda, tau, 0, c, 0, Ldc, work, 0, lwork, info);
  }

  public void dormrz(String side, String trans, int m, int n, int k, int l, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] c, int offsetc, int Ldc, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dormrzK(side, trans, m, n, k, l, a, offseta, lda, tau, offsettau, c, offsetc, Ldc, work, offsetwork, lwork, info);
  }

  protected abstract void dormrzK(String side, String trans, int m, int n, int k, int l, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] c, int offsetc, int Ldc, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dormtr(String side, String uplo, String trans, int m, int n, double[] a, int lda, double[] tau, double[] c, int Ldc, double[] work, int lwork, org.netlib.util.intW info) {
    dormtr(side, uplo, trans, m, n, a, 0, lda, tau, 0, c, 0, Ldc, work, 0, lwork, info);
  }

  public void dormtr(String side, String uplo, String trans, int m, int n, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] c, int offsetc, int Ldc, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dormtrK(side, uplo, trans, m, n, a, offseta, lda, tau, offsettau, c, offsetc, Ldc, work, offsetwork, lwork, info);
  }

  protected abstract void dormtrK(String side, String uplo, String trans, int m, int n, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] c, int offsetc, int Ldc, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dpbcon(String uplo, int n, int kd, double[] ab, int ldab, double anorm, org.netlib.util.doubleW rcond, double[] work, int[] iwork, org.netlib.util.intW info) {
    dpbcon(uplo, n, kd, ab, 0, ldab, anorm, rcond, work, 0, iwork, 0, info);
  }

  public void dpbcon(String uplo, int n, int kd, double[] ab, int offsetab, int ldab, double anorm, org.netlib.util.doubleW rcond, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dpbconK(uplo, n, kd, ab, offsetab, ldab, anorm, rcond, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dpbconK(String uplo, int n, int kd, double[] ab, int offsetab, int ldab, double anorm, org.netlib.util.doubleW rcond, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dpbequ(String uplo, int n, int kd, double[] ab, int ldab, double[] s, org.netlib.util.doubleW scond, org.netlib.util.doubleW amax, org.netlib.util.intW info) {
    dpbequ(uplo, n, kd, ab, 0, ldab, s, 0, scond, amax, info);
  }

  public void dpbequ(String uplo, int n, int kd, double[] ab, int offsetab, int ldab, double[] s, int offsets, org.netlib.util.doubleW scond, org.netlib.util.doubleW amax, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dpbequK(uplo, n, kd, ab, offsetab, ldab, s, offsets, scond, amax, info);
  }

  protected abstract void dpbequK(String uplo, int n, int kd, double[] ab, int offsetab, int ldab, double[] s, int offsets, org.netlib.util.doubleW scond, org.netlib.util.doubleW amax, org.netlib.util.intW info);

  public void dpbrfs(String uplo, int n, int kd, int nrhs, double[] ab, int ldab, double[] afb, int ldafb, double[] b, int ldb, double[] x, int ldx, double[] ferr, double[] berr, double[] work, int[] iwork, org.netlib.util.intW info) {
    dpbrfs(uplo, n, kd, nrhs, ab, 0, ldab, afb, 0, ldafb, b, 0, ldb, x, 0, ldx, ferr, 0, berr, 0, work, 0, iwork, 0, info);
  }

  public void dpbrfs(String uplo, int n, int kd, int nrhs, double[] ab, int offsetab, int ldab, double[] afb, int offsetafb, int ldafb, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dpbrfsK(uplo, n, kd, nrhs, ab, offsetab, ldab, afb, offsetafb, ldafb, b, offsetb, ldb, x, offsetx, ldx, ferr, offsetferr, berr, offsetberr, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dpbrfsK(String uplo, int n, int kd, int nrhs, double[] ab, int offsetab, int ldab, double[] afb, int offsetafb, int ldafb, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dpbstf(String uplo, int n, int kd, double[] ab, int ldab, org.netlib.util.intW info) {
    dpbstf(uplo, n, kd, ab, 0, ldab, info);
  }

  public void dpbstf(String uplo, int n, int kd, double[] ab, int offsetab, int ldab, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dpbstfK(uplo, n, kd, ab, offsetab, ldab, info);
  }

  protected abstract void dpbstfK(String uplo, int n, int kd, double[] ab, int offsetab, int ldab, org.netlib.util.intW info);

  public void dpbsv(String uplo, int n, int kd, int nrhs, double[] ab, int ldab, double[] b, int ldb, org.netlib.util.intW info) {
    dpbsv(uplo, n, kd, nrhs, ab, 0, ldab, b, 0, ldb, info);
  }

  public void dpbsv(String uplo, int n, int kd, int nrhs, double[] ab, int offsetab, int ldab, double[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dpbsvK(uplo, n, kd, nrhs, ab, offsetab, ldab, b, offsetb, ldb, info);
  }

  protected abstract void dpbsvK(String uplo, int n, int kd, int nrhs, double[] ab, int offsetab, int ldab, double[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void dpbsvx(String fact, String uplo, int n, int kd, int nrhs, double[] ab, int ldab, double[] afb, int ldafb, org.netlib.util.StringW equed, double[] s, double[] b, int ldb, double[] x, int ldx, org.netlib.util.doubleW rcond, double[] ferr, double[] berr, double[] work, int[] iwork, org.netlib.util.intW info) {
    dpbsvx(fact, uplo, n, kd, nrhs, ab, 0, ldab, afb, 0, ldafb, equed, s, 0, b, 0, ldb, x, 0, ldx, rcond, ferr, 0, berr, 0, work, 0, iwork, 0, info);
  }

  public void dpbsvx(String fact, String uplo, int n, int kd, int nrhs, double[] ab, int offsetab, int ldab, double[] afb, int offsetafb, int ldafb, org.netlib.util.StringW equed, double[] s, int offsets, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, org.netlib.util.doubleW rcond, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dpbsvxK(fact, uplo, n, kd, nrhs, ab, offsetab, ldab, afb, offsetafb, ldafb, equed, s, offsets, b, offsetb, ldb, x, offsetx, ldx, rcond, ferr, offsetferr, berr, offsetberr, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dpbsvxK(String fact, String uplo, int n, int kd, int nrhs, double[] ab, int offsetab, int ldab, double[] afb, int offsetafb, int ldafb, org.netlib.util.StringW equed, double[] s, int offsets, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, org.netlib.util.doubleW rcond, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dpbtf2(String uplo, int n, int kd, double[] ab, int ldab, org.netlib.util.intW info) {
    dpbtf2(uplo, n, kd, ab, 0, ldab, info);
  }

  public void dpbtf2(String uplo, int n, int kd, double[] ab, int offsetab, int ldab, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dpbtf2K(uplo, n, kd, ab, offsetab, ldab, info);
  }

  protected abstract void dpbtf2K(String uplo, int n, int kd, double[] ab, int offsetab, int ldab, org.netlib.util.intW info);

  public void dpbtrf(String uplo, int n, int kd, double[] ab, int ldab, org.netlib.util.intW info) {
    dpbtrf(uplo, n, kd, ab, 0, ldab, info);
  }

  public void dpbtrf(String uplo, int n, int kd, double[] ab, int offsetab, int ldab, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dpbtrfK(uplo, n, kd, ab, offsetab, ldab, info);
  }

  protected abstract void dpbtrfK(String uplo, int n, int kd, double[] ab, int offsetab, int ldab, org.netlib.util.intW info);

  public void dpbtrs(String uplo, int n, int kd, int nrhs, double[] ab, int ldab, double[] b, int ldb, org.netlib.util.intW info) {
    dpbtrs(uplo, n, kd, nrhs, ab, 0, ldab, b, 0, ldb, info);
  }

  public void dpbtrs(String uplo, int n, int kd, int nrhs, double[] ab, int offsetab, int ldab, double[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dpbtrsK(uplo, n, kd, nrhs, ab, offsetab, ldab, b, offsetb, ldb, info);
  }

  protected abstract void dpbtrsK(String uplo, int n, int kd, int nrhs, double[] ab, int offsetab, int ldab, double[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void dpocon(String uplo, int n, double[] a, int lda, double anorm, org.netlib.util.doubleW rcond, double[] work, int[] iwork, org.netlib.util.intW info) {
    dpocon(uplo, n, a, 0, lda, anorm, rcond, work, 0, iwork, 0, info);
  }

  public void dpocon(String uplo, int n, double[] a, int offseta, int lda, double anorm, org.netlib.util.doubleW rcond, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dpoconK(uplo, n, a, offseta, lda, anorm, rcond, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dpoconK(String uplo, int n, double[] a, int offseta, int lda, double anorm, org.netlib.util.doubleW rcond, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dpoequ(int n, double[] a, int lda, double[] s, org.netlib.util.doubleW scond, org.netlib.util.doubleW amax, org.netlib.util.intW info) {
    dpoequ(n, a, 0, lda, s, 0, scond, amax, info);
  }

  public void dpoequ(int n, double[] a, int offseta, int lda, double[] s, int offsets, org.netlib.util.doubleW scond, org.netlib.util.doubleW amax, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dpoequK(n, a, offseta, lda, s, offsets, scond, amax, info);
  }

  protected abstract void dpoequK(int n, double[] a, int offseta, int lda, double[] s, int offsets, org.netlib.util.doubleW scond, org.netlib.util.doubleW amax, org.netlib.util.intW info);

  public void dporfs(String uplo, int n, int nrhs, double[] a, int lda, double[] af, int ldaf, double[] b, int ldb, double[] x, int ldx, double[] ferr, double[] berr, double[] work, int[] iwork, org.netlib.util.intW info) {
    dporfs(uplo, n, nrhs, a, 0, lda, af, 0, ldaf, b, 0, ldb, x, 0, ldx, ferr, 0, berr, 0, work, 0, iwork, 0, info);
  }

  public void dporfs(String uplo, int n, int nrhs, double[] a, int offseta, int lda, double[] af, int offsetaf, int ldaf, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dporfsK(uplo, n, nrhs, a, offseta, lda, af, offsetaf, ldaf, b, offsetb, ldb, x, offsetx, ldx, ferr, offsetferr, berr, offsetberr, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dporfsK(String uplo, int n, int nrhs, double[] a, int offseta, int lda, double[] af, int offsetaf, int ldaf, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dposv(String uplo, int n, int nrhs, double[] a, int lda, double[] b, int ldb, org.netlib.util.intW info) {
    dposv(uplo, n, nrhs, a, 0, lda, b, 0, ldb, info);
  }

  public void dposv(String uplo, int n, int nrhs, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dposvK(uplo, n, nrhs, a, offseta, lda, b, offsetb, ldb, info);
  }

  protected abstract void dposvK(String uplo, int n, int nrhs, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void dposvx(String fact, String uplo, int n, int nrhs, double[] a, int lda, double[] af, int ldaf, org.netlib.util.StringW equed, double[] s, double[] b, int ldb, double[] x, int ldx, org.netlib.util.doubleW rcond, double[] ferr, double[] berr, double[] work, int[] iwork, org.netlib.util.intW info) {
    dposvx(fact, uplo, n, nrhs, a, 0, lda, af, 0, ldaf, equed, s, 0, b, 0, ldb, x, 0, ldx, rcond, ferr, 0, berr, 0, work, 0, iwork, 0, info);
  }

  public void dposvx(String fact, String uplo, int n, int nrhs, double[] a, int offseta, int lda, double[] af, int offsetaf, int ldaf, org.netlib.util.StringW equed, double[] s, int offsets, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, org.netlib.util.doubleW rcond, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dposvxK(fact, uplo, n, nrhs, a, offseta, lda, af, offsetaf, ldaf, equed, s, offsets, b, offsetb, ldb, x, offsetx, ldx, rcond, ferr, offsetferr, berr, offsetberr, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dposvxK(String fact, String uplo, int n, int nrhs, double[] a, int offseta, int lda, double[] af, int offsetaf, int ldaf, org.netlib.util.StringW equed, double[] s, int offsets, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, org.netlib.util.doubleW rcond, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dpotf2(String uplo, int n, double[] a, int lda, org.netlib.util.intW info) {
    dpotf2(uplo, n, a, 0, lda, info);
  }

  public void dpotf2(String uplo, int n, double[] a, int offseta, int lda, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dpotf2K(uplo, n, a, offseta, lda, info);
  }

  protected abstract void dpotf2K(String uplo, int n, double[] a, int offseta, int lda, org.netlib.util.intW info);

  public void dpotrf(String uplo, int n, double[] a, int lda, org.netlib.util.intW info) {
    dpotrf(uplo, n, a, 0, lda, info);
  }

  public void dpotrf(String uplo, int n, double[] a, int offseta, int lda, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dpotrfK(uplo, n, a, offseta, lda, info);
  }

  protected abstract void dpotrfK(String uplo, int n, double[] a, int offseta, int lda, org.netlib.util.intW info);

  public void dpotri(String uplo, int n, double[] a, int lda, org.netlib.util.intW info) {
    dpotri(uplo, n, a, 0, lda, info);
  }

  public void dpotri(String uplo, int n, double[] a, int offseta, int lda, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dpotriK(uplo, n, a, offseta, lda, info);
  }

  protected abstract void dpotriK(String uplo, int n, double[] a, int offseta, int lda, org.netlib.util.intW info);

  public void dpotrs(String uplo, int n, int nrhs, double[] a, int lda, double[] b, int ldb, org.netlib.util.intW info) {
    dpotrs(uplo, n, nrhs, a, 0, lda, b, 0, ldb, info);
  }

  public void dpotrs(String uplo, int n, int nrhs, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dpotrsK(uplo, n, nrhs, a, offseta, lda, b, offsetb, ldb, info);
  }

  protected abstract void dpotrsK(String uplo, int n, int nrhs, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void dppcon(String uplo, int n, double[] ap, double anorm, org.netlib.util.doubleW rcond, double[] work, int[] iwork, org.netlib.util.intW info) {
    dppcon(uplo, n, ap, 0, anorm, rcond, work, 0, iwork, 0, info);
  }

  public void dppcon(String uplo, int n, double[] ap, int offsetap, double anorm, org.netlib.util.doubleW rcond, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dppconK(uplo, n, ap, offsetap, anorm, rcond, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dppconK(String uplo, int n, double[] ap, int offsetap, double anorm, org.netlib.util.doubleW rcond, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dppequ(String uplo, int n, double[] ap, double[] s, org.netlib.util.doubleW scond, org.netlib.util.doubleW amax, org.netlib.util.intW info) {
    dppequ(uplo, n, ap, 0, s, 0, scond, amax, info);
  }

  public void dppequ(String uplo, int n, double[] ap, int offsetap, double[] s, int offsets, org.netlib.util.doubleW scond, org.netlib.util.doubleW amax, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dppequK(uplo, n, ap, offsetap, s, offsets, scond, amax, info);
  }

  protected abstract void dppequK(String uplo, int n, double[] ap, int offsetap, double[] s, int offsets, org.netlib.util.doubleW scond, org.netlib.util.doubleW amax, org.netlib.util.intW info);

  public void dpprfs(String uplo, int n, int nrhs, double[] ap, double[] afp, double[] b, int ldb, double[] x, int ldx, double[] ferr, double[] berr, double[] work, int[] iwork, org.netlib.util.intW info) {
    dpprfs(uplo, n, nrhs, ap, 0, afp, 0, b, 0, ldb, x, 0, ldx, ferr, 0, berr, 0, work, 0, iwork, 0, info);
  }

  public void dpprfs(String uplo, int n, int nrhs, double[] ap, int offsetap, double[] afp, int offsetafp, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dpprfsK(uplo, n, nrhs, ap, offsetap, afp, offsetafp, b, offsetb, ldb, x, offsetx, ldx, ferr, offsetferr, berr, offsetberr, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dpprfsK(String uplo, int n, int nrhs, double[] ap, int offsetap, double[] afp, int offsetafp, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dppsv(String uplo, int n, int nrhs, double[] ap, double[] b, int ldb, org.netlib.util.intW info) {
    dppsv(uplo, n, nrhs, ap, 0, b, 0, ldb, info);
  }

  public void dppsv(String uplo, int n, int nrhs, double[] ap, int offsetap, double[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dppsvK(uplo, n, nrhs, ap, offsetap, b, offsetb, ldb, info);
  }

  protected abstract void dppsvK(String uplo, int n, int nrhs, double[] ap, int offsetap, double[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void dppsvx(String fact, String uplo, int n, int nrhs, double[] ap, double[] afp, org.netlib.util.StringW equed, double[] s, double[] b, int ldb, double[] x, int ldx, org.netlib.util.doubleW rcond, double[] ferr, double[] berr, double[] work, int[] iwork, org.netlib.util.intW info) {
    dppsvx(fact, uplo, n, nrhs, ap, 0, afp, 0, equed, s, 0, b, 0, ldb, x, 0, ldx, rcond, ferr, 0, berr, 0, work, 0, iwork, 0, info);
  }

  public void dppsvx(String fact, String uplo, int n, int nrhs, double[] ap, int offsetap, double[] afp, int offsetafp, org.netlib.util.StringW equed, double[] s, int offsets, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, org.netlib.util.doubleW rcond, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dppsvxK(fact, uplo, n, nrhs, ap, offsetap, afp, offsetafp, equed, s, offsets, b, offsetb, ldb, x, offsetx, ldx, rcond, ferr, offsetferr, berr, offsetberr, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dppsvxK(String fact, String uplo, int n, int nrhs, double[] ap, int offsetap, double[] afp, int offsetafp, org.netlib.util.StringW equed, double[] s, int offsets, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, org.netlib.util.doubleW rcond, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dpptrf(String uplo, int n, double[] ap, org.netlib.util.intW info) {
    dpptrf(uplo, n, ap, 0, info);
  }

  public void dpptrf(String uplo, int n, double[] ap, int offsetap, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dpptrfK(uplo, n, ap, offsetap, info);
  }

  protected abstract void dpptrfK(String uplo, int n, double[] ap, int offsetap, org.netlib.util.intW info);

  public void dpptri(String uplo, int n, double[] ap, org.netlib.util.intW info) {
    dpptri(uplo, n, ap, 0, info);
  }

  public void dpptri(String uplo, int n, double[] ap, int offsetap, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dpptriK(uplo, n, ap, offsetap, info);
  }

  protected abstract void dpptriK(String uplo, int n, double[] ap, int offsetap, org.netlib.util.intW info);

  public void dpptrs(String uplo, int n, int nrhs, double[] ap, double[] b, int ldb, org.netlib.util.intW info) {
    dpptrs(uplo, n, nrhs, ap, 0, b, 0, ldb, info);
  }

  public void dpptrs(String uplo, int n, int nrhs, double[] ap, int offsetap, double[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dpptrsK(uplo, n, nrhs, ap, offsetap, b, offsetb, ldb, info);
  }

  protected abstract void dpptrsK(String uplo, int n, int nrhs, double[] ap, int offsetap, double[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void dptcon(int n, double[] d, double[] e, double anorm, org.netlib.util.doubleW rcond, double[] work, org.netlib.util.intW info) {
    dptcon(n, d, 0, e, 0, anorm, rcond, work, 0, info);
  }

  public void dptcon(int n, double[] d, int offsetd, double[] e, int offsete, double anorm, org.netlib.util.doubleW rcond, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dptconK(n, d, offsetd, e, offsete, anorm, rcond, work, offsetwork, info);
  }

  protected abstract void dptconK(int n, double[] d, int offsetd, double[] e, int offsete, double anorm, org.netlib.util.doubleW rcond, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dpteqr(String compz, int n, double[] d, double[] e, double[] z, int ldz, double[] work, org.netlib.util.intW info) {
    dpteqr(compz, n, d, 0, e, 0, z, 0, ldz, work, 0, info);
  }

  public void dpteqr(String compz, int n, double[] d, int offsetd, double[] e, int offsete, double[] z, int offsetz, int ldz, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dpteqrK(compz, n, d, offsetd, e, offsete, z, offsetz, ldz, work, offsetwork, info);
  }

  protected abstract void dpteqrK(String compz, int n, double[] d, int offsetd, double[] e, int offsete, double[] z, int offsetz, int ldz, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dptrfs(int n, int nrhs, double[] d, double[] e, double[] df, double[] ef, double[] b, int ldb, double[] x, int ldx, double[] ferr, double[] berr, double[] work, org.netlib.util.intW info) {
    dptrfs(n, nrhs, d, 0, e, 0, df, 0, ef, 0, b, 0, ldb, x, 0, ldx, ferr, 0, berr, 0, work, 0, info);
  }

  public void dptrfs(int n, int nrhs, double[] d, int offsetd, double[] e, int offsete, double[] df, int offsetdf, double[] ef, int offsetef, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dptrfsK(n, nrhs, d, offsetd, e, offsete, df, offsetdf, ef, offsetef, b, offsetb, ldb, x, offsetx, ldx, ferr, offsetferr, berr, offsetberr, work, offsetwork, info);
  }

  protected abstract void dptrfsK(int n, int nrhs, double[] d, int offsetd, double[] e, int offsete, double[] df, int offsetdf, double[] ef, int offsetef, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dptsv(int n, int nrhs, double[] d, double[] e, double[] b, int ldb, org.netlib.util.intW info) {
    dptsv(n, nrhs, d, 0, e, 0, b, 0, ldb, info);
  }

  public void dptsv(int n, int nrhs, double[] d, int offsetd, double[] e, int offsete, double[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dptsvK(n, nrhs, d, offsetd, e, offsete, b, offsetb, ldb, info);
  }

  protected abstract void dptsvK(int n, int nrhs, double[] d, int offsetd, double[] e, int offsete, double[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void dptsvx(String fact, int n, int nrhs, double[] d, double[] e, double[] df, double[] ef, double[] b, int ldb, double[] x, int ldx, org.netlib.util.doubleW rcond, double[] ferr, double[] berr, double[] work, org.netlib.util.intW info) {
    dptsvx(fact, n, nrhs, d, 0, e, 0, df, 0, ef, 0, b, 0, ldb, x, 0, ldx, rcond, ferr, 0, berr, 0, work, 0, info);
  }

  public void dptsvx(String fact, int n, int nrhs, double[] d, int offsetd, double[] e, int offsete, double[] df, int offsetdf, double[] ef, int offsetef, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, org.netlib.util.doubleW rcond, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dptsvxK(fact, n, nrhs, d, offsetd, e, offsete, df, offsetdf, ef, offsetef, b, offsetb, ldb, x, offsetx, ldx, rcond, ferr, offsetferr, berr, offsetberr, work, offsetwork, info);
  }

  protected abstract void dptsvxK(String fact, int n, int nrhs, double[] d, int offsetd, double[] e, int offsete, double[] df, int offsetdf, double[] ef, int offsetef, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, org.netlib.util.doubleW rcond, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dpttrf(int n, double[] d, double[] e, org.netlib.util.intW info) {
    dpttrf(n, d, 0, e, 0, info);
  }

  public void dpttrf(int n, double[] d, int offsetd, double[] e, int offsete, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dpttrfK(n, d, offsetd, e, offsete, info);
  }

  protected abstract void dpttrfK(int n, double[] d, int offsetd, double[] e, int offsete, org.netlib.util.intW info);

  public void dpttrs(int n, int nrhs, double[] d, double[] e, double[] b, int ldb, org.netlib.util.intW info) {
    dpttrs(n, nrhs, d, 0, e, 0, b, 0, ldb, info);
  }

  public void dpttrs(int n, int nrhs, double[] d, int offsetd, double[] e, int offsete, double[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dpttrsK(n, nrhs, d, offsetd, e, offsete, b, offsetb, ldb, info);
  }

  protected abstract void dpttrsK(int n, int nrhs, double[] d, int offsetd, double[] e, int offsete, double[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void dptts2(int n, int nrhs, double[] d, double[] e, double[] b, int ldb) {
    dptts2(n, nrhs, d, 0, e, 0, b, 0, ldb);
  }

  public void dptts2(int n, int nrhs, double[] d, int offsetd, double[] e, int offsete, double[] b, int offsetb, int ldb) {
    //FIXME Add arguments check
    dptts2K(n, nrhs, d, offsetd, e, offsete, b, offsetb, ldb);
  }

  protected abstract void dptts2K(int n, int nrhs, double[] d, int offsetd, double[] e, int offsete, double[] b, int offsetb, int ldb);

  public void drscl(int n, double sa, double[] sx, int incx) {
    drscl(n, sa, sx, 0, incx);
  }

  public void drscl(int n, double sa, double[] sx, int offsetsx, int incx) {
    //FIXME Add arguments check
    drsclK(n, sa, sx, offsetsx, incx);
  }

  protected abstract void drsclK(int n, double sa, double[] sx, int offsetsx, int incx);

  public void dsbev(String jobz, String uplo, int n, int kd, double[] ab, int ldab, double[] w, double[] z, int ldz, double[] work, org.netlib.util.intW info) {
    dsbev(jobz, uplo, n, kd, ab, 0, ldab, w, 0, z, 0, ldz, work, 0, info);
  }

  public void dsbev(String jobz, String uplo, int n, int kd, double[] ab, int offsetab, int ldab, double[] w, int offsetw, double[] z, int offsetz, int ldz, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dsbevK(jobz, uplo, n, kd, ab, offsetab, ldab, w, offsetw, z, offsetz, ldz, work, offsetwork, info);
  }

  protected abstract void dsbevK(String jobz, String uplo, int n, int kd, double[] ab, int offsetab, int ldab, double[] w, int offsetw, double[] z, int offsetz, int ldz, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dsbevd(String jobz, String uplo, int n, int kd, double[] ab, int ldab, double[] w, double[] z, int ldz, double[] work, int lwork, int[] iwork, int liwork, org.netlib.util.intW info) {
    dsbevd(jobz, uplo, n, kd, ab, 0, ldab, w, 0, z, 0, ldz, work, 0, lwork, iwork, 0, liwork, info);
  }

  public void dsbevd(String jobz, String uplo, int n, int kd, double[] ab, int offsetab, int ldab, double[] w, int offsetw, double[] z, int offsetz, int ldz, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dsbevdK(jobz, uplo, n, kd, ab, offsetab, ldab, w, offsetw, z, offsetz, ldz, work, offsetwork, lwork, iwork, offsetiwork, liwork, info);
  }

  protected abstract void dsbevdK(String jobz, String uplo, int n, int kd, double[] ab, int offsetab, int ldab, double[] w, int offsetw, double[] z, int offsetz, int ldz, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info);

  public void dsbevx(String jobz, String range, String uplo, int n, int kd, double[] ab, int ldab, double[] q, int ldq, double vl, double vu, int il, int iu, double abstol, org.netlib.util.intW m, double[] w, double[] z, int ldz, double[] work, int[] iwork, int[] ifail, org.netlib.util.intW info) {
    dsbevx(jobz, range, uplo, n, kd, ab, 0, ldab, q, 0, ldq, vl, vu, il, iu, abstol, m, w, 0, z, 0, ldz, work, 0, iwork, 0, ifail, 0, info);
  }

  public void dsbevx(String jobz, String range, String uplo, int n, int kd, double[] ab, int offsetab, int ldab, double[] q, int offsetq, int ldq, double vl, double vu, int il, int iu, double abstol, org.netlib.util.intW m, double[] w, int offsetw, double[] z, int offsetz, int ldz, double[] work, int offsetwork, int[] iwork, int offsetiwork, int[] ifail, int offsetifail, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dsbevxK(jobz, range, uplo, n, kd, ab, offsetab, ldab, q, offsetq, ldq, vl, vu, il, iu, abstol, m, w, offsetw, z, offsetz, ldz, work, offsetwork, iwork, offsetiwork, ifail, offsetifail, info);
  }

  protected abstract void dsbevxK(String jobz, String range, String uplo, int n, int kd, double[] ab, int offsetab, int ldab, double[] q, int offsetq, int ldq, double vl, double vu, int il, int iu, double abstol, org.netlib.util.intW m, double[] w, int offsetw, double[] z, int offsetz, int ldz, double[] work, int offsetwork, int[] iwork, int offsetiwork, int[] ifail, int offsetifail, org.netlib.util.intW info);

  public void dsbgst(String vect, String uplo, int n, int ka, int kb, double[] ab, int ldab, double[] bb, int ldbb, double[] x, int ldx, double[] work, org.netlib.util.intW info) {
    dsbgst(vect, uplo, n, ka, kb, ab, 0, ldab, bb, 0, ldbb, x, 0, ldx, work, 0, info);
  }

  public void dsbgst(String vect, String uplo, int n, int ka, int kb, double[] ab, int offsetab, int ldab, double[] bb, int offsetbb, int ldbb, double[] x, int offsetx, int ldx, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dsbgstK(vect, uplo, n, ka, kb, ab, offsetab, ldab, bb, offsetbb, ldbb, x, offsetx, ldx, work, offsetwork, info);
  }

  protected abstract void dsbgstK(String vect, String uplo, int n, int ka, int kb, double[] ab, int offsetab, int ldab, double[] bb, int offsetbb, int ldbb, double[] x, int offsetx, int ldx, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dsbgv(String jobz, String uplo, int n, int ka, int kb, double[] ab, int ldab, double[] bb, int ldbb, double[] w, double[] z, int ldz, double[] work, org.netlib.util.intW info) {
    dsbgv(jobz, uplo, n, ka, kb, ab, 0, ldab, bb, 0, ldbb, w, 0, z, 0, ldz, work, 0, info);
  }

  public void dsbgv(String jobz, String uplo, int n, int ka, int kb, double[] ab, int offsetab, int ldab, double[] bb, int offsetbb, int ldbb, double[] w, int offsetw, double[] z, int offsetz, int ldz, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dsbgvK(jobz, uplo, n, ka, kb, ab, offsetab, ldab, bb, offsetbb, ldbb, w, offsetw, z, offsetz, ldz, work, offsetwork, info);
  }

  protected abstract void dsbgvK(String jobz, String uplo, int n, int ka, int kb, double[] ab, int offsetab, int ldab, double[] bb, int offsetbb, int ldbb, double[] w, int offsetw, double[] z, int offsetz, int ldz, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dsbgvd(String jobz, String uplo, int n, int ka, int kb, double[] ab, int ldab, double[] bb, int ldbb, double[] w, double[] z, int ldz, double[] work, int lwork, int[] iwork, int liwork, org.netlib.util.intW info) {
    dsbgvd(jobz, uplo, n, ka, kb, ab, 0, ldab, bb, 0, ldbb, w, 0, z, 0, ldz, work, 0, lwork, iwork, 0, liwork, info);
  }

  public void dsbgvd(String jobz, String uplo, int n, int ka, int kb, double[] ab, int offsetab, int ldab, double[] bb, int offsetbb, int ldbb, double[] w, int offsetw, double[] z, int offsetz, int ldz, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dsbgvdK(jobz, uplo, n, ka, kb, ab, offsetab, ldab, bb, offsetbb, ldbb, w, offsetw, z, offsetz, ldz, work, offsetwork, lwork, iwork, offsetiwork, liwork, info);
  }

  protected abstract void dsbgvdK(String jobz, String uplo, int n, int ka, int kb, double[] ab, int offsetab, int ldab, double[] bb, int offsetbb, int ldbb, double[] w, int offsetw, double[] z, int offsetz, int ldz, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info);

  public void dsbgvx(String jobz, String range, String uplo, int n, int ka, int kb, double[] ab, int ldab, double[] bb, int ldbb, double[] q, int ldq, double vl, double vu, int il, int iu, double abstol, org.netlib.util.intW m, double[] w, double[] z, int ldz, double[] work, int[] iwork, int[] ifail, org.netlib.util.intW info) {
    dsbgvx(jobz, range, uplo, n, ka, kb, ab, 0, ldab, bb, 0, ldbb, q, 0, ldq, vl, vu, il, iu, abstol, m, w, 0, z, 0, ldz, work, 0, iwork, 0, ifail, 0, info);
  }

  public void dsbgvx(String jobz, String range, String uplo, int n, int ka, int kb, double[] ab, int offsetab, int ldab, double[] bb, int offsetbb, int ldbb, double[] q, int offsetq, int ldq, double vl, double vu, int il, int iu, double abstol, org.netlib.util.intW m, double[] w, int offsetw, double[] z, int offsetz, int ldz, double[] work, int offsetwork, int[] iwork, int offsetiwork, int[] ifail, int offsetifail, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dsbgvxK(jobz, range, uplo, n, ka, kb, ab, offsetab, ldab, bb, offsetbb, ldbb, q, offsetq, ldq, vl, vu, il, iu, abstol, m, w, offsetw, z, offsetz, ldz, work, offsetwork, iwork, offsetiwork, ifail, offsetifail, info);
  }

  protected abstract void dsbgvxK(String jobz, String range, String uplo, int n, int ka, int kb, double[] ab, int offsetab, int ldab, double[] bb, int offsetbb, int ldbb, double[] q, int offsetq, int ldq, double vl, double vu, int il, int iu, double abstol, org.netlib.util.intW m, double[] w, int offsetw, double[] z, int offsetz, int ldz, double[] work, int offsetwork, int[] iwork, int offsetiwork, int[] ifail, int offsetifail, org.netlib.util.intW info);

  public void dsbtrd(String vect, String uplo, int n, int kd, double[] ab, int ldab, double[] d, double[] e, double[] q, int ldq, double[] work, org.netlib.util.intW info) {
    dsbtrd(vect, uplo, n, kd, ab, 0, ldab, d, 0, e, 0, q, 0, ldq, work, 0, info);
  }

  public void dsbtrd(String vect, String uplo, int n, int kd, double[] ab, int offsetab, int ldab, double[] d, int offsetd, double[] e, int offsete, double[] q, int offsetq, int ldq, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dsbtrdK(vect, uplo, n, kd, ab, offsetab, ldab, d, offsetd, e, offsete, q, offsetq, ldq, work, offsetwork, info);
  }

  protected abstract void dsbtrdK(String vect, String uplo, int n, int kd, double[] ab, int offsetab, int ldab, double[] d, int offsetd, double[] e, int offsete, double[] q, int offsetq, int ldq, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dsgesv(int n, int nrhs, double[] a, int lda, int[] ipiv, double[] b, int ldb, double[] x, int ldx, double[] work, float[] swork, org.netlib.util.intW iter, org.netlib.util.intW info) {
    dsgesv(n, nrhs, a, 0, lda, ipiv, 0, b, 0, ldb, x, 0, ldx, work, 0, swork, 0, iter, info);
  }

  public void dsgesv(int n, int nrhs, double[] a, int offseta, int lda, int[] ipiv, int offsetipiv, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, double[] work, int offsetwork, float[] swork, int offsetswork, org.netlib.util.intW iter, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dsgesvK(n, nrhs, a, offseta, lda, ipiv, offsetipiv, b, offsetb, ldb, x, offsetx, ldx, work, offsetwork, swork, offsetswork, iter, info);
  }

  protected abstract void dsgesvK(int n, int nrhs, double[] a, int offseta, int lda, int[] ipiv, int offsetipiv, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, double[] work, int offsetwork, float[] swork, int offsetswork, org.netlib.util.intW iter, org.netlib.util.intW info);

  public void dspcon(String uplo, int n, double[] ap, int[] ipiv, double anorm, org.netlib.util.doubleW rcond, double[] work, int[] iwork, org.netlib.util.intW info) {
    dspcon(uplo, n, ap, 0, ipiv, 0, anorm, rcond, work, 0, iwork, 0, info);
  }

  public void dspcon(String uplo, int n, double[] ap, int offsetap, int[] ipiv, int offsetipiv, double anorm, org.netlib.util.doubleW rcond, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dspconK(uplo, n, ap, offsetap, ipiv, offsetipiv, anorm, rcond, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dspconK(String uplo, int n, double[] ap, int offsetap, int[] ipiv, int offsetipiv, double anorm, org.netlib.util.doubleW rcond, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dspev(String jobz, String uplo, int n, double[] ap, double[] w, double[] z, int ldz, double[] work, org.netlib.util.intW info) {
    dspev(jobz, uplo, n, ap, 0, w, 0, z, 0, ldz, work, 0, info);
  }

  public void dspev(String jobz, String uplo, int n, double[] ap, int offsetap, double[] w, int offsetw, double[] z, int offsetz, int ldz, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dspevK(jobz, uplo, n, ap, offsetap, w, offsetw, z, offsetz, ldz, work, offsetwork, info);
  }

  protected abstract void dspevK(String jobz, String uplo, int n, double[] ap, int offsetap, double[] w, int offsetw, double[] z, int offsetz, int ldz, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dspevd(String jobz, String uplo, int n, double[] ap, double[] w, double[] z, int ldz, double[] work, int lwork, int[] iwork, int liwork, org.netlib.util.intW info) {
    dspevd(jobz, uplo, n, ap, 0, w, 0, z, 0, ldz, work, 0, lwork, iwork, 0, liwork, info);
  }

  public void dspevd(String jobz, String uplo, int n, double[] ap, int offsetap, double[] w, int offsetw, double[] z, int offsetz, int ldz, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dspevdK(jobz, uplo, n, ap, offsetap, w, offsetw, z, offsetz, ldz, work, offsetwork, lwork, iwork, offsetiwork, liwork, info);
  }

  protected abstract void dspevdK(String jobz, String uplo, int n, double[] ap, int offsetap, double[] w, int offsetw, double[] z, int offsetz, int ldz, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info);

  public void dspevx(String jobz, String range, String uplo, int n, double[] ap, double vl, double vu, int il, int iu, double abstol, org.netlib.util.intW m, double[] w, double[] z, int ldz, double[] work, int[] iwork, int[] ifail, org.netlib.util.intW info) {
    dspevx(jobz, range, uplo, n, ap, 0, vl, vu, il, iu, abstol, m, w, 0, z, 0, ldz, work, 0, iwork, 0, ifail, 0, info);
  }

  public void dspevx(String jobz, String range, String uplo, int n, double[] ap, int offsetap, double vl, double vu, int il, int iu, double abstol, org.netlib.util.intW m, double[] w, int offsetw, double[] z, int offsetz, int ldz, double[] work, int offsetwork, int[] iwork, int offsetiwork, int[] ifail, int offsetifail, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dspevxK(jobz, range, uplo, n, ap, offsetap, vl, vu, il, iu, abstol, m, w, offsetw, z, offsetz, ldz, work, offsetwork, iwork, offsetiwork, ifail, offsetifail, info);
  }

  protected abstract void dspevxK(String jobz, String range, String uplo, int n, double[] ap, int offsetap, double vl, double vu, int il, int iu, double abstol, org.netlib.util.intW m, double[] w, int offsetw, double[] z, int offsetz, int ldz, double[] work, int offsetwork, int[] iwork, int offsetiwork, int[] ifail, int offsetifail, org.netlib.util.intW info);

  public void dspgst(int itype, String uplo, int n, double[] ap, double[] bp, org.netlib.util.intW info) {
    dspgst(itype, uplo, n, ap, 0, bp, 0, info);
  }

  public void dspgst(int itype, String uplo, int n, double[] ap, int offsetap, double[] bp, int offsetbp, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dspgstK(itype, uplo, n, ap, offsetap, bp, offsetbp, info);
  }

  protected abstract void dspgstK(int itype, String uplo, int n, double[] ap, int offsetap, double[] bp, int offsetbp, org.netlib.util.intW info);

  public void dspgv(int itype, String jobz, String uplo, int n, double[] ap, double[] bp, double[] w, double[] z, int ldz, double[] work, org.netlib.util.intW info) {
    dspgv(itype, jobz, uplo, n, ap, 0, bp, 0, w, 0, z, 0, ldz, work, 0, info);
  }

  public void dspgv(int itype, String jobz, String uplo, int n, double[] ap, int offsetap, double[] bp, int offsetbp, double[] w, int offsetw, double[] z, int offsetz, int ldz, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dspgvK(itype, jobz, uplo, n, ap, offsetap, bp, offsetbp, w, offsetw, z, offsetz, ldz, work, offsetwork, info);
  }

  protected abstract void dspgvK(int itype, String jobz, String uplo, int n, double[] ap, int offsetap, double[] bp, int offsetbp, double[] w, int offsetw, double[] z, int offsetz, int ldz, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dspgvd(int itype, String jobz, String uplo, int n, double[] ap, double[] bp, double[] w, double[] z, int ldz, double[] work, int lwork, int[] iwork, int liwork, org.netlib.util.intW info) {
    dspgvd(itype, jobz, uplo, n, ap, 0, bp, 0, w, 0, z, 0, ldz, work, 0, lwork, iwork, 0, liwork, info);
  }

  public void dspgvd(int itype, String jobz, String uplo, int n, double[] ap, int offsetap, double[] bp, int offsetbp, double[] w, int offsetw, double[] z, int offsetz, int ldz, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dspgvdK(itype, jobz, uplo, n, ap, offsetap, bp, offsetbp, w, offsetw, z, offsetz, ldz, work, offsetwork, lwork, iwork, offsetiwork, liwork, info);
  }

  protected abstract void dspgvdK(int itype, String jobz, String uplo, int n, double[] ap, int offsetap, double[] bp, int offsetbp, double[] w, int offsetw, double[] z, int offsetz, int ldz, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info);

  public void dspgvx(int itype, String jobz, String range, String uplo, int n, double[] ap, double[] bp, double vl, double vu, int il, int iu, double abstol, org.netlib.util.intW m, double[] w, double[] z, int ldz, double[] work, int[] iwork, int[] ifail, org.netlib.util.intW info) {
    dspgvx(itype, jobz, range, uplo, n, ap, 0, bp, 0, vl, vu, il, iu, abstol, m, w, 0, z, 0, ldz, work, 0, iwork, 0, ifail, 0, info);
  }

  public void dspgvx(int itype, String jobz, String range, String uplo, int n, double[] ap, int offsetap, double[] bp, int offsetbp, double vl, double vu, int il, int iu, double abstol, org.netlib.util.intW m, double[] w, int offsetw, double[] z, int offsetz, int ldz, double[] work, int offsetwork, int[] iwork, int offsetiwork, int[] ifail, int offsetifail, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dspgvxK(itype, jobz, range, uplo, n, ap, offsetap, bp, offsetbp, vl, vu, il, iu, abstol, m, w, offsetw, z, offsetz, ldz, work, offsetwork, iwork, offsetiwork, ifail, offsetifail, info);
  }

  protected abstract void dspgvxK(int itype, String jobz, String range, String uplo, int n, double[] ap, int offsetap, double[] bp, int offsetbp, double vl, double vu, int il, int iu, double abstol, org.netlib.util.intW m, double[] w, int offsetw, double[] z, int offsetz, int ldz, double[] work, int offsetwork, int[] iwork, int offsetiwork, int[] ifail, int offsetifail, org.netlib.util.intW info);

  public void dsprfs(String uplo, int n, int nrhs, double[] ap, double[] afp, int[] ipiv, double[] b, int ldb, double[] x, int ldx, double[] ferr, double[] berr, double[] work, int[] iwork, org.netlib.util.intW info) {
    dsprfs(uplo, n, nrhs, ap, 0, afp, 0, ipiv, 0, b, 0, ldb, x, 0, ldx, ferr, 0, berr, 0, work, 0, iwork, 0, info);
  }

  public void dsprfs(String uplo, int n, int nrhs, double[] ap, int offsetap, double[] afp, int offsetafp, int[] ipiv, int offsetipiv, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dsprfsK(uplo, n, nrhs, ap, offsetap, afp, offsetafp, ipiv, offsetipiv, b, offsetb, ldb, x, offsetx, ldx, ferr, offsetferr, berr, offsetberr, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dsprfsK(String uplo, int n, int nrhs, double[] ap, int offsetap, double[] afp, int offsetafp, int[] ipiv, int offsetipiv, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dspsv(String uplo, int n, int nrhs, double[] ap, int[] ipiv, double[] b, int ldb, org.netlib.util.intW info) {
    dspsv(uplo, n, nrhs, ap, 0, ipiv, 0, b, 0, ldb, info);
  }

  public void dspsv(String uplo, int n, int nrhs, double[] ap, int offsetap, int[] ipiv, int offsetipiv, double[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dspsvK(uplo, n, nrhs, ap, offsetap, ipiv, offsetipiv, b, offsetb, ldb, info);
  }

  protected abstract void dspsvK(String uplo, int n, int nrhs, double[] ap, int offsetap, int[] ipiv, int offsetipiv, double[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void dspsvx(String fact, String uplo, int n, int nrhs, double[] ap, double[] afp, int[] ipiv, double[] b, int ldb, double[] x, int ldx, org.netlib.util.doubleW rcond, double[] ferr, double[] berr, double[] work, int[] iwork, org.netlib.util.intW info) {
    dspsvx(fact, uplo, n, nrhs, ap, 0, afp, 0, ipiv, 0, b, 0, ldb, x, 0, ldx, rcond, ferr, 0, berr, 0, work, 0, iwork, 0, info);
  }

  public void dspsvx(String fact, String uplo, int n, int nrhs, double[] ap, int offsetap, double[] afp, int offsetafp, int[] ipiv, int offsetipiv, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, org.netlib.util.doubleW rcond, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dspsvxK(fact, uplo, n, nrhs, ap, offsetap, afp, offsetafp, ipiv, offsetipiv, b, offsetb, ldb, x, offsetx, ldx, rcond, ferr, offsetferr, berr, offsetberr, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dspsvxK(String fact, String uplo, int n, int nrhs, double[] ap, int offsetap, double[] afp, int offsetafp, int[] ipiv, int offsetipiv, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, org.netlib.util.doubleW rcond, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dsptrd(String uplo, int n, double[] ap, double[] d, double[] e, double[] tau, org.netlib.util.intW info) {
    dsptrd(uplo, n, ap, 0, d, 0, e, 0, tau, 0, info);
  }

  public void dsptrd(String uplo, int n, double[] ap, int offsetap, double[] d, int offsetd, double[] e, int offsete, double[] tau, int offsettau, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dsptrdK(uplo, n, ap, offsetap, d, offsetd, e, offsete, tau, offsettau, info);
  }

  protected abstract void dsptrdK(String uplo, int n, double[] ap, int offsetap, double[] d, int offsetd, double[] e, int offsete, double[] tau, int offsettau, org.netlib.util.intW info);

  public void dsptrf(String uplo, int n, double[] ap, int[] ipiv, org.netlib.util.intW info) {
    dsptrf(uplo, n, ap, 0, ipiv, 0, info);
  }

  public void dsptrf(String uplo, int n, double[] ap, int offsetap, int[] ipiv, int offsetipiv, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dsptrfK(uplo, n, ap, offsetap, ipiv, offsetipiv, info);
  }

  protected abstract void dsptrfK(String uplo, int n, double[] ap, int offsetap, int[] ipiv, int offsetipiv, org.netlib.util.intW info);

  public void dsptri(String uplo, int n, double[] ap, int[] ipiv, double[] work, org.netlib.util.intW info) {
    dsptri(uplo, n, ap, 0, ipiv, 0, work, 0, info);
  }

  public void dsptri(String uplo, int n, double[] ap, int offsetap, int[] ipiv, int offsetipiv, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dsptriK(uplo, n, ap, offsetap, ipiv, offsetipiv, work, offsetwork, info);
  }

  protected abstract void dsptriK(String uplo, int n, double[] ap, int offsetap, int[] ipiv, int offsetipiv, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dsptrs(String uplo, int n, int nrhs, double[] ap, int[] ipiv, double[] b, int ldb, org.netlib.util.intW info) {
    dsptrs(uplo, n, nrhs, ap, 0, ipiv, 0, b, 0, ldb, info);
  }

  public void dsptrs(String uplo, int n, int nrhs, double[] ap, int offsetap, int[] ipiv, int offsetipiv, double[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dsptrsK(uplo, n, nrhs, ap, offsetap, ipiv, offsetipiv, b, offsetb, ldb, info);
  }

  protected abstract void dsptrsK(String uplo, int n, int nrhs, double[] ap, int offsetap, int[] ipiv, int offsetipiv, double[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void dstebz(String range, String order, int n, double vl, double vu, int il, int iu, double abstol, double[] d, double[] e, org.netlib.util.intW m, org.netlib.util.intW nsplit, double[] w, int[] iblock, int[] isplit, double[] work, int[] iwork, org.netlib.util.intW info) {
    dstebz(range, order, n, vl, vu, il, iu, abstol, d, 0, e, 0, m, nsplit, w, 0, iblock, 0, isplit, 0, work, 0, iwork, 0, info);
  }

  public void dstebz(String range, String order, int n, double vl, double vu, int il, int iu, double abstol, double[] d, int offsetd, double[] e, int offsete, org.netlib.util.intW m, org.netlib.util.intW nsplit, double[] w, int offsetw, int[] iblock, int offsetiblock, int[] isplit, int offsetisplit, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dstebzK(range, order, n, vl, vu, il, iu, abstol, d, offsetd, e, offsete, m, nsplit, w, offsetw, iblock, offsetiblock, isplit, offsetisplit, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dstebzK(String range, String order, int n, double vl, double vu, int il, int iu, double abstol, double[] d, int offsetd, double[] e, int offsete, org.netlib.util.intW m, org.netlib.util.intW nsplit, double[] w, int offsetw, int[] iblock, int offsetiblock, int[] isplit, int offsetisplit, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dstedc(String compz, int n, double[] d, double[] e, double[] z, int ldz, double[] work, int lwork, int[] iwork, int liwork, org.netlib.util.intW info) {
    dstedc(compz, n, d, 0, e, 0, z, 0, ldz, work, 0, lwork, iwork, 0, liwork, info);
  }

  public void dstedc(String compz, int n, double[] d, int offsetd, double[] e, int offsete, double[] z, int offsetz, int ldz, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dstedcK(compz, n, d, offsetd, e, offsete, z, offsetz, ldz, work, offsetwork, lwork, iwork, offsetiwork, liwork, info);
  }

  protected abstract void dstedcK(String compz, int n, double[] d, int offsetd, double[] e, int offsete, double[] z, int offsetz, int ldz, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info);

  public void dstegr(String jobz, String range, int n, double[] d, double[] e, double vl, double vu, int il, int iu, double abstol, org.netlib.util.intW m, double[] w, double[] z, int ldz, int[] isuppz, double[] work, int lwork, int[] iwork, int liwork, org.netlib.util.intW info) {
    dstegr(jobz, range, n, d, 0, e, 0, vl, vu, il, iu, abstol, m, w, 0, z, 0, ldz, isuppz, 0, work, 0, lwork, iwork, 0, liwork, info);
  }

  public void dstegr(String jobz, String range, int n, double[] d, int offsetd, double[] e, int offsete, double vl, double vu, int il, int iu, double abstol, org.netlib.util.intW m, double[] w, int offsetw, double[] z, int offsetz, int ldz, int[] isuppz, int offsetisuppz, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dstegrK(jobz, range, n, d, offsetd, e, offsete, vl, vu, il, iu, abstol, m, w, offsetw, z, offsetz, ldz, isuppz, offsetisuppz, work, offsetwork, lwork, iwork, offsetiwork, liwork, info);
  }

  protected abstract void dstegrK(String jobz, String range, int n, double[] d, int offsetd, double[] e, int offsete, double vl, double vu, int il, int iu, double abstol, org.netlib.util.intW m, double[] w, int offsetw, double[] z, int offsetz, int ldz, int[] isuppz, int offsetisuppz, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info);

  public void dstein(int n, double[] d, double[] e, int m, double[] w, int[] iblock, int[] isplit, double[] z, int ldz, double[] work, int[] iwork, int[] ifail, org.netlib.util.intW info) {
    dstein(n, d, 0, e, 0, m, w, 0, iblock, 0, isplit, 0, z, 0, ldz, work, 0, iwork, 0, ifail, 0, info);
  }

  public void dstein(int n, double[] d, int offsetd, double[] e, int offsete, int m, double[] w, int offsetw, int[] iblock, int offsetiblock, int[] isplit, int offsetisplit, double[] z, int offsetz, int ldz, double[] work, int offsetwork, int[] iwork, int offsetiwork, int[] ifail, int offsetifail, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dsteinK(n, d, offsetd, e, offsete, m, w, offsetw, iblock, offsetiblock, isplit, offsetisplit, z, offsetz, ldz, work, offsetwork, iwork, offsetiwork, ifail, offsetifail, info);
  }

  protected abstract void dsteinK(int n, double[] d, int offsetd, double[] e, int offsete, int m, double[] w, int offsetw, int[] iblock, int offsetiblock, int[] isplit, int offsetisplit, double[] z, int offsetz, int ldz, double[] work, int offsetwork, int[] iwork, int offsetiwork, int[] ifail, int offsetifail, org.netlib.util.intW info);

  public void dstemr(String jobz, String range, int n, double[] d, double[] e, double vl, double vu, int il, int iu, org.netlib.util.intW m, double[] w, double[] z, int ldz, int nzc, int[] isuppz, org.netlib.util.booleanW tryrac, double[] work, int lwork, int[] iwork, int liwork, org.netlib.util.intW info) {
    dstemr(jobz, range, n, d, 0, e, 0, vl, vu, il, iu, m, w, 0, z, 0, ldz, nzc, isuppz, 0, tryrac, work, 0, lwork, iwork, 0, liwork, info);
  }

  public void dstemr(String jobz, String range, int n, double[] d, int offsetd, double[] e, int offsete, double vl, double vu, int il, int iu, org.netlib.util.intW m, double[] w, int offsetw, double[] z, int offsetz, int ldz, int nzc, int[] isuppz, int offsetisuppz, org.netlib.util.booleanW tryrac, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dstemrK(jobz, range, n, d, offsetd, e, offsete, vl, vu, il, iu, m, w, offsetw, z, offsetz, ldz, nzc, isuppz, offsetisuppz, tryrac, work, offsetwork, lwork, iwork, offsetiwork, liwork, info);
  }

  protected abstract void dstemrK(String jobz, String range, int n, double[] d, int offsetd, double[] e, int offsete, double vl, double vu, int il, int iu, org.netlib.util.intW m, double[] w, int offsetw, double[] z, int offsetz, int ldz, int nzc, int[] isuppz, int offsetisuppz, org.netlib.util.booleanW tryrac, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info);

  public void dsteqr(String compz, int n, double[] d, double[] e, double[] z, int ldz, double[] work, org.netlib.util.intW info) {
    dsteqr(compz, n, d, 0, e, 0, z, 0, ldz, work, 0, info);
  }

  public void dsteqr(String compz, int n, double[] d, int offsetd, double[] e, int offsete, double[] z, int offsetz, int ldz, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dsteqrK(compz, n, d, offsetd, e, offsete, z, offsetz, ldz, work, offsetwork, info);
  }

  protected abstract void dsteqrK(String compz, int n, double[] d, int offsetd, double[] e, int offsete, double[] z, int offsetz, int ldz, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dsterf(int n, double[] d, double[] e, org.netlib.util.intW info) {
    dsterf(n, d, 0, e, 0, info);
  }

  public void dsterf(int n, double[] d, int offsetd, double[] e, int offsete, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dsterfK(n, d, offsetd, e, offsete, info);
  }

  protected abstract void dsterfK(int n, double[] d, int offsetd, double[] e, int offsete, org.netlib.util.intW info);

  public void dstev(String jobz, int n, double[] d, double[] e, double[] z, int ldz, double[] work, org.netlib.util.intW info) {
    dstev(jobz, n, d, 0, e, 0, z, 0, ldz, work, 0, info);
  }

  public void dstev(String jobz, int n, double[] d, int offsetd, double[] e, int offsete, double[] z, int offsetz, int ldz, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dstevK(jobz, n, d, offsetd, e, offsete, z, offsetz, ldz, work, offsetwork, info);
  }

  protected abstract void dstevK(String jobz, int n, double[] d, int offsetd, double[] e, int offsete, double[] z, int offsetz, int ldz, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dstevd(String jobz, int n, double[] d, double[] e, double[] z, int ldz, double[] work, int lwork, int[] iwork, int liwork, org.netlib.util.intW info) {
    dstevd(jobz, n, d, 0, e, 0, z, 0, ldz, work, 0, lwork, iwork, 0, liwork, info);
  }

  public void dstevd(String jobz, int n, double[] d, int offsetd, double[] e, int offsete, double[] z, int offsetz, int ldz, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dstevdK(jobz, n, d, offsetd, e, offsete, z, offsetz, ldz, work, offsetwork, lwork, iwork, offsetiwork, liwork, info);
  }

  protected abstract void dstevdK(String jobz, int n, double[] d, int offsetd, double[] e, int offsete, double[] z, int offsetz, int ldz, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info);

  public void dstevr(String jobz, String range, int n, double[] d, double[] e, double vl, double vu, int il, int iu, double abstol, org.netlib.util.intW m, double[] w, double[] z, int ldz, int[] isuppz, double[] work, int lwork, int[] iwork, int liwork, org.netlib.util.intW info) {
    dstevr(jobz, range, n, d, 0, e, 0, vl, vu, il, iu, abstol, m, w, 0, z, 0, ldz, isuppz, 0, work, 0, lwork, iwork, 0, liwork, info);
  }

  public void dstevr(String jobz, String range, int n, double[] d, int offsetd, double[] e, int offsete, double vl, double vu, int il, int iu, double abstol, org.netlib.util.intW m, double[] w, int offsetw, double[] z, int offsetz, int ldz, int[] isuppz, int offsetisuppz, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dstevrK(jobz, range, n, d, offsetd, e, offsete, vl, vu, il, iu, abstol, m, w, offsetw, z, offsetz, ldz, isuppz, offsetisuppz, work, offsetwork, lwork, iwork, offsetiwork, liwork, info);
  }

  protected abstract void dstevrK(String jobz, String range, int n, double[] d, int offsetd, double[] e, int offsete, double vl, double vu, int il, int iu, double abstol, org.netlib.util.intW m, double[] w, int offsetw, double[] z, int offsetz, int ldz, int[] isuppz, int offsetisuppz, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info);

  public void dstevx(String jobz, String range, int n, double[] d, double[] e, double vl, double vu, int il, int iu, double abstol, org.netlib.util.intW m, double[] w, double[] z, int ldz, double[] work, int[] iwork, int[] ifail, org.netlib.util.intW info) {
    dstevx(jobz, range, n, d, 0, e, 0, vl, vu, il, iu, abstol, m, w, 0, z, 0, ldz, work, 0, iwork, 0, ifail, 0, info);
  }

  public void dstevx(String jobz, String range, int n, double[] d, int offsetd, double[] e, int offsete, double vl, double vu, int il, int iu, double abstol, org.netlib.util.intW m, double[] w, int offsetw, double[] z, int offsetz, int ldz, double[] work, int offsetwork, int[] iwork, int offsetiwork, int[] ifail, int offsetifail, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dstevxK(jobz, range, n, d, offsetd, e, offsete, vl, vu, il, iu, abstol, m, w, offsetw, z, offsetz, ldz, work, offsetwork, iwork, offsetiwork, ifail, offsetifail, info);
  }

  protected abstract void dstevxK(String jobz, String range, int n, double[] d, int offsetd, double[] e, int offsete, double vl, double vu, int il, int iu, double abstol, org.netlib.util.intW m, double[] w, int offsetw, double[] z, int offsetz, int ldz, double[] work, int offsetwork, int[] iwork, int offsetiwork, int[] ifail, int offsetifail, org.netlib.util.intW info);

  public void dsycon(String uplo, int n, double[] a, int lda, int[] ipiv, double anorm, org.netlib.util.doubleW rcond, double[] work, int[] iwork, org.netlib.util.intW info) {
    dsycon(uplo, n, a, 0, lda, ipiv, 0, anorm, rcond, work, 0, iwork, 0, info);
  }

  public void dsycon(String uplo, int n, double[] a, int offseta, int lda, int[] ipiv, int offsetipiv, double anorm, org.netlib.util.doubleW rcond, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dsyconK(uplo, n, a, offseta, lda, ipiv, offsetipiv, anorm, rcond, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dsyconK(String uplo, int n, double[] a, int offseta, int lda, int[] ipiv, int offsetipiv, double anorm, org.netlib.util.doubleW rcond, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dsyev(String jobz, String uplo, int n, double[] a, int lda, double[] w, double[] work, int lwork, org.netlib.util.intW info) {
    dsyev(jobz, uplo, n, a, 0, lda, w, 0, work, 0, lwork, info);
  }

  public void dsyev(String jobz, String uplo, int n, double[] a, int offseta, int lda, double[] w, int offsetw, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dsyevK(jobz, uplo, n, a, offseta, lda, w, offsetw, work, offsetwork, lwork, info);
  }

  protected abstract void dsyevK(String jobz, String uplo, int n, double[] a, int offseta, int lda, double[] w, int offsetw, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dsyevd(String jobz, String uplo, int n, double[] a, int lda, double[] w, double[] work, int lwork, int[] iwork, int liwork, org.netlib.util.intW info) {
    dsyevd(jobz, uplo, n, a, 0, lda, w, 0, work, 0, lwork, iwork, 0, liwork, info);
  }

  public void dsyevd(String jobz, String uplo, int n, double[] a, int offseta, int lda, double[] w, int offsetw, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dsyevdK(jobz, uplo, n, a, offseta, lda, w, offsetw, work, offsetwork, lwork, iwork, offsetiwork, liwork, info);
  }

  protected abstract void dsyevdK(String jobz, String uplo, int n, double[] a, int offseta, int lda, double[] w, int offsetw, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info);

  public void dsyevr(String jobz, String range, String uplo, int n, double[] a, int lda, double vl, double vu, int il, int iu, double abstol, org.netlib.util.intW m, double[] w, double[] z, int ldz, int[] isuppz, double[] work, int lwork, int[] iwork, int liwork, org.netlib.util.intW info) {
    dsyevr(jobz, range, uplo, n, a, 0, lda, vl, vu, il, iu, abstol, m, w, 0, z, 0, ldz, isuppz, 0, work, 0, lwork, iwork, 0, liwork, info);
  }

  public void dsyevr(String jobz, String range, String uplo, int n, double[] a, int offseta, int lda, double vl, double vu, int il, int iu, double abstol, org.netlib.util.intW m, double[] w, int offsetw, double[] z, int offsetz, int ldz, int[] isuppz, int offsetisuppz, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dsyevrK(jobz, range, uplo, n, a, offseta, lda, vl, vu, il, iu, abstol, m, w, offsetw, z, offsetz, ldz, isuppz, offsetisuppz, work, offsetwork, lwork, iwork, offsetiwork, liwork, info);
  }

  protected abstract void dsyevrK(String jobz, String range, String uplo, int n, double[] a, int offseta, int lda, double vl, double vu, int il, int iu, double abstol, org.netlib.util.intW m, double[] w, int offsetw, double[] z, int offsetz, int ldz, int[] isuppz, int offsetisuppz, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info);

  public void dsyevx(String jobz, String range, String uplo, int n, double[] a, int lda, double vl, double vu, int il, int iu, double abstol, org.netlib.util.intW m, double[] w, double[] z, int ldz, double[] work, int lwork, int[] iwork, int[] ifail, org.netlib.util.intW info) {
    dsyevx(jobz, range, uplo, n, a, 0, lda, vl, vu, il, iu, abstol, m, w, 0, z, 0, ldz, work, 0, lwork, iwork, 0, ifail, 0, info);
  }

  public void dsyevx(String jobz, String range, String uplo, int n, double[] a, int offseta, int lda, double vl, double vu, int il, int iu, double abstol, org.netlib.util.intW m, double[] w, int offsetw, double[] z, int offsetz, int ldz, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int[] ifail, int offsetifail, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dsyevxK(jobz, range, uplo, n, a, offseta, lda, vl, vu, il, iu, abstol, m, w, offsetw, z, offsetz, ldz, work, offsetwork, lwork, iwork, offsetiwork, ifail, offsetifail, info);
  }

  protected abstract void dsyevxK(String jobz, String range, String uplo, int n, double[] a, int offseta, int lda, double vl, double vu, int il, int iu, double abstol, org.netlib.util.intW m, double[] w, int offsetw, double[] z, int offsetz, int ldz, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int[] ifail, int offsetifail, org.netlib.util.intW info);

  public void dsygs2(int itype, String uplo, int n, double[] a, int lda, double[] b, int ldb, org.netlib.util.intW info) {
    dsygs2(itype, uplo, n, a, 0, lda, b, 0, ldb, info);
  }

  public void dsygs2(int itype, String uplo, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dsygs2K(itype, uplo, n, a, offseta, lda, b, offsetb, ldb, info);
  }

  protected abstract void dsygs2K(int itype, String uplo, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void dsygst(int itype, String uplo, int n, double[] a, int lda, double[] b, int ldb, org.netlib.util.intW info) {
    dsygst(itype, uplo, n, a, 0, lda, b, 0, ldb, info);
  }

  public void dsygst(int itype, String uplo, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dsygstK(itype, uplo, n, a, offseta, lda, b, offsetb, ldb, info);
  }

  protected abstract void dsygstK(int itype, String uplo, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void dsygv(int itype, String jobz, String uplo, int n, double[] a, int lda, double[] b, int ldb, double[] w, double[] work, int lwork, org.netlib.util.intW info) {
    dsygv(itype, jobz, uplo, n, a, 0, lda, b, 0, ldb, w, 0, work, 0, lwork, info);
  }

  public void dsygv(int itype, String jobz, String uplo, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] w, int offsetw, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dsygvK(itype, jobz, uplo, n, a, offseta, lda, b, offsetb, ldb, w, offsetw, work, offsetwork, lwork, info);
  }

  protected abstract void dsygvK(int itype, String jobz, String uplo, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] w, int offsetw, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dsygvd(int itype, String jobz, String uplo, int n, double[] a, int lda, double[] b, int ldb, double[] w, double[] work, int lwork, int[] iwork, int liwork, org.netlib.util.intW info) {
    dsygvd(itype, jobz, uplo, n, a, 0, lda, b, 0, ldb, w, 0, work, 0, lwork, iwork, 0, liwork, info);
  }

  public void dsygvd(int itype, String jobz, String uplo, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] w, int offsetw, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dsygvdK(itype, jobz, uplo, n, a, offseta, lda, b, offsetb, ldb, w, offsetw, work, offsetwork, lwork, iwork, offsetiwork, liwork, info);
  }

  protected abstract void dsygvdK(int itype, String jobz, String uplo, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] w, int offsetw, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info);

  public void dsygvx(int itype, String jobz, String range, String uplo, int n, double[] a, int lda, double[] b, int ldb, double vl, double vu, int il, int iu, double abstol, org.netlib.util.intW m, double[] w, double[] z, int ldz, double[] work, int lwork, int[] iwork, int[] ifail, org.netlib.util.intW info) {
    dsygvx(itype, jobz, range, uplo, n, a, 0, lda, b, 0, ldb, vl, vu, il, iu, abstol, m, w, 0, z, 0, ldz, work, 0, lwork, iwork, 0, ifail, 0, info);
  }

  public void dsygvx(int itype, String jobz, String range, String uplo, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double vl, double vu, int il, int iu, double abstol, org.netlib.util.intW m, double[] w, int offsetw, double[] z, int offsetz, int ldz, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int[] ifail, int offsetifail, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dsygvxK(itype, jobz, range, uplo, n, a, offseta, lda, b, offsetb, ldb, vl, vu, il, iu, abstol, m, w, offsetw, z, offsetz, ldz, work, offsetwork, lwork, iwork, offsetiwork, ifail, offsetifail, info);
  }

  protected abstract void dsygvxK(int itype, String jobz, String range, String uplo, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double vl, double vu, int il, int iu, double abstol, org.netlib.util.intW m, double[] w, int offsetw, double[] z, int offsetz, int ldz, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int[] ifail, int offsetifail, org.netlib.util.intW info);

  public void dsyrfs(String uplo, int n, int nrhs, double[] a, int lda, double[] af, int ldaf, int[] ipiv, double[] b, int ldb, double[] x, int ldx, double[] ferr, double[] berr, double[] work, int[] iwork, org.netlib.util.intW info) {
    dsyrfs(uplo, n, nrhs, a, 0, lda, af, 0, ldaf, ipiv, 0, b, 0, ldb, x, 0, ldx, ferr, 0, berr, 0, work, 0, iwork, 0, info);
  }

  public void dsyrfs(String uplo, int n, int nrhs, double[] a, int offseta, int lda, double[] af, int offsetaf, int ldaf, int[] ipiv, int offsetipiv, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dsyrfsK(uplo, n, nrhs, a, offseta, lda, af, offsetaf, ldaf, ipiv, offsetipiv, b, offsetb, ldb, x, offsetx, ldx, ferr, offsetferr, berr, offsetberr, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dsyrfsK(String uplo, int n, int nrhs, double[] a, int offseta, int lda, double[] af, int offsetaf, int ldaf, int[] ipiv, int offsetipiv, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dsysv(String uplo, int n, int nrhs, double[] a, int lda, int[] ipiv, double[] b, int ldb, double[] work, int lwork, org.netlib.util.intW info) {
    dsysv(uplo, n, nrhs, a, 0, lda, ipiv, 0, b, 0, ldb, work, 0, lwork, info);
  }

  public void dsysv(String uplo, int n, int nrhs, double[] a, int offseta, int lda, int[] ipiv, int offsetipiv, double[] b, int offsetb, int ldb, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dsysvK(uplo, n, nrhs, a, offseta, lda, ipiv, offsetipiv, b, offsetb, ldb, work, offsetwork, lwork, info);
  }

  protected abstract void dsysvK(String uplo, int n, int nrhs, double[] a, int offseta, int lda, int[] ipiv, int offsetipiv, double[] b, int offsetb, int ldb, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dsysvx(String fact, String uplo, int n, int nrhs, double[] a, int lda, double[] af, int ldaf, int[] ipiv, double[] b, int ldb, double[] x, int ldx, org.netlib.util.doubleW rcond, double[] ferr, double[] berr, double[] work, int lwork, int[] iwork, org.netlib.util.intW info) {
    dsysvx(fact, uplo, n, nrhs, a, 0, lda, af, 0, ldaf, ipiv, 0, b, 0, ldb, x, 0, ldx, rcond, ferr, 0, berr, 0, work, 0, lwork, iwork, 0, info);
  }

  public void dsysvx(String fact, String uplo, int n, int nrhs, double[] a, int offseta, int lda, double[] af, int offsetaf, int ldaf, int[] ipiv, int offsetipiv, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, org.netlib.util.doubleW rcond, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dsysvxK(fact, uplo, n, nrhs, a, offseta, lda, af, offsetaf, ldaf, ipiv, offsetipiv, b, offsetb, ldb, x, offsetx, ldx, rcond, ferr, offsetferr, berr, offsetberr, work, offsetwork, lwork, iwork, offsetiwork, info);
  }

  protected abstract void dsysvxK(String fact, String uplo, int n, int nrhs, double[] a, int offseta, int lda, double[] af, int offsetaf, int ldaf, int[] ipiv, int offsetipiv, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, org.netlib.util.doubleW rcond, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dsytd2(String uplo, int n, double[] a, int lda, double[] d, double[] e, double[] tau, org.netlib.util.intW info) {
    dsytd2(uplo, n, a, 0, lda, d, 0, e, 0, tau, 0, info);
  }

  public void dsytd2(String uplo, int n, double[] a, int offseta, int lda, double[] d, int offsetd, double[] e, int offsete, double[] tau, int offsettau, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dsytd2K(uplo, n, a, offseta, lda, d, offsetd, e, offsete, tau, offsettau, info);
  }

  protected abstract void dsytd2K(String uplo, int n, double[] a, int offseta, int lda, double[] d, int offsetd, double[] e, int offsete, double[] tau, int offsettau, org.netlib.util.intW info);

  public void dsytf2(String uplo, int n, double[] a, int lda, int[] ipiv, org.netlib.util.intW info) {
    dsytf2(uplo, n, a, 0, lda, ipiv, 0, info);
  }

  public void dsytf2(String uplo, int n, double[] a, int offseta, int lda, int[] ipiv, int offsetipiv, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dsytf2K(uplo, n, a, offseta, lda, ipiv, offsetipiv, info);
  }

  protected abstract void dsytf2K(String uplo, int n, double[] a, int offseta, int lda, int[] ipiv, int offsetipiv, org.netlib.util.intW info);

  public void dsytrd(String uplo, int n, double[] a, int lda, double[] d, double[] e, double[] tau, double[] work, int lwork, org.netlib.util.intW info) {
    dsytrd(uplo, n, a, 0, lda, d, 0, e, 0, tau, 0, work, 0, lwork, info);
  }

  public void dsytrd(String uplo, int n, double[] a, int offseta, int lda, double[] d, int offsetd, double[] e, int offsete, double[] tau, int offsettau, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dsytrdK(uplo, n, a, offseta, lda, d, offsetd, e, offsete, tau, offsettau, work, offsetwork, lwork, info);
  }

  protected abstract void dsytrdK(String uplo, int n, double[] a, int offseta, int lda, double[] d, int offsetd, double[] e, int offsete, double[] tau, int offsettau, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dsytrf(String uplo, int n, double[] a, int lda, int[] ipiv, double[] work, int lwork, org.netlib.util.intW info) {
    dsytrf(uplo, n, a, 0, lda, ipiv, 0, work, 0, lwork, info);
  }

  public void dsytrf(String uplo, int n, double[] a, int offseta, int lda, int[] ipiv, int offsetipiv, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dsytrfK(uplo, n, a, offseta, lda, ipiv, offsetipiv, work, offsetwork, lwork, info);
  }

  protected abstract void dsytrfK(String uplo, int n, double[] a, int offseta, int lda, int[] ipiv, int offsetipiv, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dsytri(String uplo, int n, double[] a, int lda, int[] ipiv, double[] work, org.netlib.util.intW info) {
    dsytri(uplo, n, a, 0, lda, ipiv, 0, work, 0, info);
  }

  public void dsytri(String uplo, int n, double[] a, int offseta, int lda, int[] ipiv, int offsetipiv, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dsytriK(uplo, n, a, offseta, lda, ipiv, offsetipiv, work, offsetwork, info);
  }

  protected abstract void dsytriK(String uplo, int n, double[] a, int offseta, int lda, int[] ipiv, int offsetipiv, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dsytrs(String uplo, int n, int nrhs, double[] a, int lda, int[] ipiv, double[] b, int ldb, org.netlib.util.intW info) {
    dsytrs(uplo, n, nrhs, a, 0, lda, ipiv, 0, b, 0, ldb, info);
  }

  public void dsytrs(String uplo, int n, int nrhs, double[] a, int offseta, int lda, int[] ipiv, int offsetipiv, double[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dsytrsK(uplo, n, nrhs, a, offseta, lda, ipiv, offsetipiv, b, offsetb, ldb, info);
  }

  protected abstract void dsytrsK(String uplo, int n, int nrhs, double[] a, int offseta, int lda, int[] ipiv, int offsetipiv, double[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void dtbcon(String norm, String uplo, String diag, int n, int kd, double[] ab, int ldab, org.netlib.util.doubleW rcond, double[] work, int[] iwork, org.netlib.util.intW info) {
    dtbcon(norm, uplo, diag, n, kd, ab, 0, ldab, rcond, work, 0, iwork, 0, info);
  }

  public void dtbcon(String norm, String uplo, String diag, int n, int kd, double[] ab, int offsetab, int ldab, org.netlib.util.doubleW rcond, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dtbconK(norm, uplo, diag, n, kd, ab, offsetab, ldab, rcond, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dtbconK(String norm, String uplo, String diag, int n, int kd, double[] ab, int offsetab, int ldab, org.netlib.util.doubleW rcond, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dtbrfs(String uplo, String trans, String diag, int n, int kd, int nrhs, double[] ab, int ldab, double[] b, int ldb, double[] x, int ldx, double[] ferr, double[] berr, double[] work, int[] iwork, org.netlib.util.intW info) {
    dtbrfs(uplo, trans, diag, n, kd, nrhs, ab, 0, ldab, b, 0, ldb, x, 0, ldx, ferr, 0, berr, 0, work, 0, iwork, 0, info);
  }

  public void dtbrfs(String uplo, String trans, String diag, int n, int kd, int nrhs, double[] ab, int offsetab, int ldab, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dtbrfsK(uplo, trans, diag, n, kd, nrhs, ab, offsetab, ldab, b, offsetb, ldb, x, offsetx, ldx, ferr, offsetferr, berr, offsetberr, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dtbrfsK(String uplo, String trans, String diag, int n, int kd, int nrhs, double[] ab, int offsetab, int ldab, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dtbtrs(String uplo, String trans, String diag, int n, int kd, int nrhs, double[] ab, int ldab, double[] b, int ldb, org.netlib.util.intW info) {
    dtbtrs(uplo, trans, diag, n, kd, nrhs, ab, 0, ldab, b, 0, ldb, info);
  }

  public void dtbtrs(String uplo, String trans, String diag, int n, int kd, int nrhs, double[] ab, int offsetab, int ldab, double[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dtbtrsK(uplo, trans, diag, n, kd, nrhs, ab, offsetab, ldab, b, offsetb, ldb, info);
  }

  protected abstract void dtbtrsK(String uplo, String trans, String diag, int n, int kd, int nrhs, double[] ab, int offsetab, int ldab, double[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void dtgevc(String side, String howmny, boolean[] select, int n, double[] s, int lds, double[] p, int ldp, double[] vl, int ldvl, double[] vr, int ldvr, int mm, org.netlib.util.intW m, double[] work, org.netlib.util.intW info) {
    dtgevc(side, howmny, select, 0, n, s, 0, lds, p, 0, ldp, vl, 0, ldvl, vr, 0, ldvr, mm, m, work, 0, info);
  }

  public void dtgevc(String side, String howmny, boolean[] select, int offsetselect, int n, double[] s, int offsets, int lds, double[] p, int offsetp, int ldp, double[] vl, int offsetvl, int ldvl, double[] vr, int offsetvr, int ldvr, int mm, org.netlib.util.intW m, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dtgevcK(side, howmny, select, offsetselect, n, s, offsets, lds, p, offsetp, ldp, vl, offsetvl, ldvl, vr, offsetvr, ldvr, mm, m, work, offsetwork, info);
  }

  protected abstract void dtgevcK(String side, String howmny, boolean[] select, int offsetselect, int n, double[] s, int offsets, int lds, double[] p, int offsetp, int ldp, double[] vl, int offsetvl, int ldvl, double[] vr, int offsetvr, int ldvr, int mm, org.netlib.util.intW m, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dtgex2(boolean wantq, boolean wantz, int n, double[] a, int lda, double[] b, int ldb, double[] q, int ldq, double[] z, int ldz, int j1, int n1, int n2, double[] work, int lwork, org.netlib.util.intW info) {
    dtgex2(wantq, wantz, n, a, 0, lda, b, 0, ldb, q, 0, ldq, z, 0, ldz, j1, n1, n2, work, 0, lwork, info);
  }

  public void dtgex2(boolean wantq, boolean wantz, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] q, int offsetq, int ldq, double[] z, int offsetz, int ldz, int j1, int n1, int n2, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dtgex2K(wantq, wantz, n, a, offseta, lda, b, offsetb, ldb, q, offsetq, ldq, z, offsetz, ldz, j1, n1, n2, work, offsetwork, lwork, info);
  }

  protected abstract void dtgex2K(boolean wantq, boolean wantz, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] q, int offsetq, int ldq, double[] z, int offsetz, int ldz, int j1, int n1, int n2, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dtgexc(boolean wantq, boolean wantz, int n, double[] a, int lda, double[] b, int ldb, double[] q, int ldq, double[] z, int ldz, org.netlib.util.intW ifst, org.netlib.util.intW ilst, double[] work, int lwork, org.netlib.util.intW info) {
    dtgexc(wantq, wantz, n, a, 0, lda, b, 0, ldb, q, 0, ldq, z, 0, ldz, ifst, ilst, work, 0, lwork, info);
  }

  public void dtgexc(boolean wantq, boolean wantz, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] q, int offsetq, int ldq, double[] z, int offsetz, int ldz, org.netlib.util.intW ifst, org.netlib.util.intW ilst, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dtgexcK(wantq, wantz, n, a, offseta, lda, b, offsetb, ldb, q, offsetq, ldq, z, offsetz, ldz, ifst, ilst, work, offsetwork, lwork, info);
  }

  protected abstract void dtgexcK(boolean wantq, boolean wantz, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] q, int offsetq, int ldq, double[] z, int offsetz, int ldz, org.netlib.util.intW ifst, org.netlib.util.intW ilst, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void dtgsen(int ijob, boolean wantq, boolean wantz, boolean[] select, int n, double[] a, int lda, double[] b, int ldb, double[] alphar, double[] alphai, double[] beta, double[] q, int ldq, double[] z, int ldz, org.netlib.util.intW m, org.netlib.util.doubleW pl, org.netlib.util.doubleW pr, double[] dif, double[] work, int lwork, int[] iwork, int liwork, org.netlib.util.intW info) {
    dtgsen(ijob, wantq, wantz, select, 0, n, a, 0, lda, b, 0, ldb, alphar, 0, alphai, 0, beta, 0, q, 0, ldq, z, 0, ldz, m, pl, pr, dif, 0, work, 0, lwork, iwork, 0, liwork, info);
  }

  public void dtgsen(int ijob, boolean wantq, boolean wantz, boolean[] select, int offsetselect, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] alphar, int offsetalphar, double[] alphai, int offsetalphai, double[] beta, int offsetbeta, double[] q, int offsetq, int ldq, double[] z, int offsetz, int ldz, org.netlib.util.intW m, org.netlib.util.doubleW pl, org.netlib.util.doubleW pr, double[] dif, int offsetdif, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dtgsenK(ijob, wantq, wantz, select, offsetselect, n, a, offseta, lda, b, offsetb, ldb, alphar, offsetalphar, alphai, offsetalphai, beta, offsetbeta, q, offsetq, ldq, z, offsetz, ldz, m, pl, pr, dif, offsetdif, work, offsetwork, lwork, iwork, offsetiwork, liwork, info);
  }

  protected abstract void dtgsenK(int ijob, boolean wantq, boolean wantz, boolean[] select, int offsetselect, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] alphar, int offsetalphar, double[] alphai, int offsetalphai, double[] beta, int offsetbeta, double[] q, int offsetq, int ldq, double[] z, int offsetz, int ldz, org.netlib.util.intW m, org.netlib.util.doubleW pl, org.netlib.util.doubleW pr, double[] dif, int offsetdif, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info);

  public void dtgsja(String jobu, String jobv, String jobq, int m, int p, int n, int k, int l, double[] a, int lda, double[] b, int ldb, double tola, double tolb, double[] alpha, double[] beta, double[] u, int ldu, double[] v, int ldv, double[] q, int ldq, double[] work, org.netlib.util.intW ncycle, org.netlib.util.intW info) {
    dtgsja(jobu, jobv, jobq, m, p, n, k, l, a, 0, lda, b, 0, ldb, tola, tolb, alpha, 0, beta, 0, u, 0, ldu, v, 0, ldv, q, 0, ldq, work, 0, ncycle, info);
  }

  public void dtgsja(String jobu, String jobv, String jobq, int m, int p, int n, int k, int l, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double tola, double tolb, double[] alpha, int offsetalpha, double[] beta, int offsetbeta, double[] u, int offsetu, int ldu, double[] v, int offsetv, int ldv, double[] q, int offsetq, int ldq, double[] work, int offsetwork, org.netlib.util.intW ncycle, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dtgsjaK(jobu, jobv, jobq, m, p, n, k, l, a, offseta, lda, b, offsetb, ldb, tola, tolb, alpha, offsetalpha, beta, offsetbeta, u, offsetu, ldu, v, offsetv, ldv, q, offsetq, ldq, work, offsetwork, ncycle, info);
  }

  protected abstract void dtgsjaK(String jobu, String jobv, String jobq, int m, int p, int n, int k, int l, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double tola, double tolb, double[] alpha, int offsetalpha, double[] beta, int offsetbeta, double[] u, int offsetu, int ldu, double[] v, int offsetv, int ldv, double[] q, int offsetq, int ldq, double[] work, int offsetwork, org.netlib.util.intW ncycle, org.netlib.util.intW info);

  public void dtgsna(String job, String howmny, boolean[] select, int n, double[] a, int lda, double[] b, int ldb, double[] vl, int ldvl, double[] vr, int ldvr, double[] s, double[] dif, int mm, org.netlib.util.intW m, double[] work, int lwork, int[] iwork, org.netlib.util.intW info) {
    dtgsna(job, howmny, select, 0, n, a, 0, lda, b, 0, ldb, vl, 0, ldvl, vr, 0, ldvr, s, 0, dif, 0, mm, m, work, 0, lwork, iwork, 0, info);
  }

  public void dtgsna(String job, String howmny, boolean[] select, int offsetselect, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] vl, int offsetvl, int ldvl, double[] vr, int offsetvr, int ldvr, double[] s, int offsets, double[] dif, int offsetdif, int mm, org.netlib.util.intW m, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dtgsnaK(job, howmny, select, offsetselect, n, a, offseta, lda, b, offsetb, ldb, vl, offsetvl, ldvl, vr, offsetvr, ldvr, s, offsets, dif, offsetdif, mm, m, work, offsetwork, lwork, iwork, offsetiwork, info);
  }

  protected abstract void dtgsnaK(String job, String howmny, boolean[] select, int offsetselect, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] vl, int offsetvl, int ldvl, double[] vr, int offsetvr, int ldvr, double[] s, int offsets, double[] dif, int offsetdif, int mm, org.netlib.util.intW m, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dtgsy2(String trans, int ijob, int m, int n, double[] a, int lda, double[] b, int ldb, double[] c, int Ldc, double[] d, int ldd, double[] e, int lde, double[] f, int ldf, org.netlib.util.doubleW scale, org.netlib.util.doubleW rdsum, org.netlib.util.doubleW rdscal, int[] iwork, org.netlib.util.intW pq, org.netlib.util.intW info) {
    dtgsy2(trans, ijob, m, n, a, 0, lda, b, 0, ldb, c, 0, Ldc, d, 0, ldd, e, 0, lde, f, 0, ldf, scale, rdsum, rdscal, iwork, 0, pq, info);
  }

  public void dtgsy2(String trans, int ijob, int m, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] c, int offsetc, int Ldc, double[] d, int offsetd, int ldd, double[] e, int offsete, int lde, double[] f, int offsetf, int ldf, org.netlib.util.doubleW scale, org.netlib.util.doubleW rdsum, org.netlib.util.doubleW rdscal, int[] iwork, int offsetiwork, org.netlib.util.intW pq, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dtgsy2K(trans, ijob, m, n, a, offseta, lda, b, offsetb, ldb, c, offsetc, Ldc, d, offsetd, ldd, e, offsete, lde, f, offsetf, ldf, scale, rdsum, rdscal, iwork, offsetiwork, pq, info);
  }

  protected abstract void dtgsy2K(String trans, int ijob, int m, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] c, int offsetc, int Ldc, double[] d, int offsetd, int ldd, double[] e, int offsete, int lde, double[] f, int offsetf, int ldf, org.netlib.util.doubleW scale, org.netlib.util.doubleW rdsum, org.netlib.util.doubleW rdscal, int[] iwork, int offsetiwork, org.netlib.util.intW pq, org.netlib.util.intW info);

  public void dtgsyl(String trans, int ijob, int m, int n, double[] a, int lda, double[] b, int ldb, double[] c, int Ldc, double[] d, int ldd, double[] e, int lde, double[] f, int ldf, org.netlib.util.doubleW scale, org.netlib.util.doubleW dif, double[] work, int lwork, int[] iwork, org.netlib.util.intW info) {
    dtgsyl(trans, ijob, m, n, a, 0, lda, b, 0, ldb, c, 0, Ldc, d, 0, ldd, e, 0, lde, f, 0, ldf, scale, dif, work, 0, lwork, iwork, 0, info);
  }

  public void dtgsyl(String trans, int ijob, int m, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] c, int offsetc, int Ldc, double[] d, int offsetd, int ldd, double[] e, int offsete, int lde, double[] f, int offsetf, int ldf, org.netlib.util.doubleW scale, org.netlib.util.doubleW dif, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dtgsylK(trans, ijob, m, n, a, offseta, lda, b, offsetb, ldb, c, offsetc, Ldc, d, offsetd, ldd, e, offsete, lde, f, offsetf, ldf, scale, dif, work, offsetwork, lwork, iwork, offsetiwork, info);
  }

  protected abstract void dtgsylK(String trans, int ijob, int m, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] c, int offsetc, int Ldc, double[] d, int offsetd, int ldd, double[] e, int offsete, int lde, double[] f, int offsetf, int ldf, org.netlib.util.doubleW scale, org.netlib.util.doubleW dif, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dtpcon(String norm, String uplo, String diag, int n, double[] ap, org.netlib.util.doubleW rcond, double[] work, int[] iwork, org.netlib.util.intW info) {
    dtpcon(norm, uplo, diag, n, ap, 0, rcond, work, 0, iwork, 0, info);
  }

  public void dtpcon(String norm, String uplo, String diag, int n, double[] ap, int offsetap, org.netlib.util.doubleW rcond, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dtpconK(norm, uplo, diag, n, ap, offsetap, rcond, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dtpconK(String norm, String uplo, String diag, int n, double[] ap, int offsetap, org.netlib.util.doubleW rcond, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dtprfs(String uplo, String trans, String diag, int n, int nrhs, double[] ap, double[] b, int ldb, double[] x, int ldx, double[] ferr, double[] berr, double[] work, int[] iwork, org.netlib.util.intW info) {
    dtprfs(uplo, trans, diag, n, nrhs, ap, 0, b, 0, ldb, x, 0, ldx, ferr, 0, berr, 0, work, 0, iwork, 0, info);
  }

  public void dtprfs(String uplo, String trans, String diag, int n, int nrhs, double[] ap, int offsetap, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dtprfsK(uplo, trans, diag, n, nrhs, ap, offsetap, b, offsetb, ldb, x, offsetx, ldx, ferr, offsetferr, berr, offsetberr, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dtprfsK(String uplo, String trans, String diag, int n, int nrhs, double[] ap, int offsetap, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dtptri(String uplo, String diag, int n, double[] ap, org.netlib.util.intW info) {
    dtptri(uplo, diag, n, ap, 0, info);
  }

  public void dtptri(String uplo, String diag, int n, double[] ap, int offsetap, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dtptriK(uplo, diag, n, ap, offsetap, info);
  }

  protected abstract void dtptriK(String uplo, String diag, int n, double[] ap, int offsetap, org.netlib.util.intW info);

  public void dtptrs(String uplo, String trans, String diag, int n, int nrhs, double[] ap, double[] b, int ldb, org.netlib.util.intW info) {
    dtptrs(uplo, trans, diag, n, nrhs, ap, 0, b, 0, ldb, info);
  }

  public void dtptrs(String uplo, String trans, String diag, int n, int nrhs, double[] ap, int offsetap, double[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dtptrsK(uplo, trans, diag, n, nrhs, ap, offsetap, b, offsetb, ldb, info);
  }

  protected abstract void dtptrsK(String uplo, String trans, String diag, int n, int nrhs, double[] ap, int offsetap, double[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void dtrcon(String norm, String uplo, String diag, int n, double[] a, int lda, org.netlib.util.doubleW rcond, double[] work, int[] iwork, org.netlib.util.intW info) {
    dtrcon(norm, uplo, diag, n, a, 0, lda, rcond, work, 0, iwork, 0, info);
  }

  public void dtrcon(String norm, String uplo, String diag, int n, double[] a, int offseta, int lda, org.netlib.util.doubleW rcond, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dtrconK(norm, uplo, diag, n, a, offseta, lda, rcond, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dtrconK(String norm, String uplo, String diag, int n, double[] a, int offseta, int lda, org.netlib.util.doubleW rcond, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dtrevc(String side, String howmny, boolean[] select, int n, double[] t, int ldt, double[] vl, int ldvl, double[] vr, int ldvr, int mm, org.netlib.util.intW m, double[] work, org.netlib.util.intW info) {
    dtrevc(side, howmny, select, 0, n, t, 0, ldt, vl, 0, ldvl, vr, 0, ldvr, mm, m, work, 0, info);
  }

  public void dtrevc(String side, String howmny, boolean[] select, int offsetselect, int n, double[] t, int offsett, int ldt, double[] vl, int offsetvl, int ldvl, double[] vr, int offsetvr, int ldvr, int mm, org.netlib.util.intW m, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dtrevcK(side, howmny, select, offsetselect, n, t, offsett, ldt, vl, offsetvl, ldvl, vr, offsetvr, ldvr, mm, m, work, offsetwork, info);
  }

  protected abstract void dtrevcK(String side, String howmny, boolean[] select, int offsetselect, int n, double[] t, int offsett, int ldt, double[] vl, int offsetvl, int ldvl, double[] vr, int offsetvr, int ldvr, int mm, org.netlib.util.intW m, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dtrexc(String compq, int n, double[] t, int ldt, double[] q, int ldq, org.netlib.util.intW ifst, org.netlib.util.intW ilst, double[] work, org.netlib.util.intW info) {
    dtrexc(compq, n, t, 0, ldt, q, 0, ldq, ifst, ilst, work, 0, info);
  }

  public void dtrexc(String compq, int n, double[] t, int offsett, int ldt, double[] q, int offsetq, int ldq, org.netlib.util.intW ifst, org.netlib.util.intW ilst, double[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dtrexcK(compq, n, t, offsett, ldt, q, offsetq, ldq, ifst, ilst, work, offsetwork, info);
  }

  protected abstract void dtrexcK(String compq, int n, double[] t, int offsett, int ldt, double[] q, int offsetq, int ldq, org.netlib.util.intW ifst, org.netlib.util.intW ilst, double[] work, int offsetwork, org.netlib.util.intW info);

  public void dtrrfs(String uplo, String trans, String diag, int n, int nrhs, double[] a, int lda, double[] b, int ldb, double[] x, int ldx, double[] ferr, double[] berr, double[] work, int[] iwork, org.netlib.util.intW info) {
    dtrrfs(uplo, trans, diag, n, nrhs, a, 0, lda, b, 0, ldb, x, 0, ldx, ferr, 0, berr, 0, work, 0, iwork, 0, info);
  }

  public void dtrrfs(String uplo, String trans, String diag, int n, int nrhs, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dtrrfsK(uplo, trans, diag, n, nrhs, a, offseta, lda, b, offsetb, ldb, x, offsetx, ldx, ferr, offsetferr, berr, offsetberr, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void dtrrfsK(String uplo, String trans, String diag, int n, int nrhs, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] x, int offsetx, int ldx, double[] ferr, int offsetferr, double[] berr, int offsetberr, double[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dtrsen(String job, String compq, boolean[] select, int n, double[] t, int ldt, double[] q, int ldq, double[] wr, double[] wi, org.netlib.util.intW m, org.netlib.util.doubleW s, org.netlib.util.doubleW sep, double[] work, int lwork, int[] iwork, int liwork, org.netlib.util.intW info) {
    dtrsen(job, compq, select, 0, n, t, 0, ldt, q, 0, ldq, wr, 0, wi, 0, m, s, sep, work, 0, lwork, iwork, 0, liwork, info);
  }

  public void dtrsen(String job, String compq, boolean[] select, int offsetselect, int n, double[] t, int offsett, int ldt, double[] q, int offsetq, int ldq, double[] wr, int offsetwr, double[] wi, int offsetwi, org.netlib.util.intW m, org.netlib.util.doubleW s, org.netlib.util.doubleW sep, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dtrsenK(job, compq, select, offsetselect, n, t, offsett, ldt, q, offsetq, ldq, wr, offsetwr, wi, offsetwi, m, s, sep, work, offsetwork, lwork, iwork, offsetiwork, liwork, info);
  }

  protected abstract void dtrsenK(String job, String compq, boolean[] select, int offsetselect, int n, double[] t, int offsett, int ldt, double[] q, int offsetq, int ldq, double[] wr, int offsetwr, double[] wi, int offsetwi, org.netlib.util.intW m, org.netlib.util.doubleW s, org.netlib.util.doubleW sep, double[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info);

  public void dtrsna(String job, String howmny, boolean[] select, int n, double[] t, int ldt, double[] vl, int ldvl, double[] vr, int ldvr, double[] s, double[] sep, int mm, org.netlib.util.intW m, double[] work, int ldwork, int[] iwork, org.netlib.util.intW info) {
    dtrsna(job, howmny, select, 0, n, t, 0, ldt, vl, 0, ldvl, vr, 0, ldvr, s, 0, sep, 0, mm, m, work, 0, ldwork, iwork, 0, info);
  }

  public void dtrsna(String job, String howmny, boolean[] select, int offsetselect, int n, double[] t, int offsett, int ldt, double[] vl, int offsetvl, int ldvl, double[] vr, int offsetvr, int ldvr, double[] s, int offsets, double[] sep, int offsetsep, int mm, org.netlib.util.intW m, double[] work, int offsetwork, int ldwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dtrsnaK(job, howmny, select, offsetselect, n, t, offsett, ldt, vl, offsetvl, ldvl, vr, offsetvr, ldvr, s, offsets, sep, offsetsep, mm, m, work, offsetwork, ldwork, iwork, offsetiwork, info);
  }

  protected abstract void dtrsnaK(String job, String howmny, boolean[] select, int offsetselect, int n, double[] t, int offsett, int ldt, double[] vl, int offsetvl, int ldvl, double[] vr, int offsetvr, int ldvr, double[] s, int offsets, double[] sep, int offsetsep, int mm, org.netlib.util.intW m, double[] work, int offsetwork, int ldwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void dtrsyl(String trana, String tranb, int isgn, int m, int n, double[] a, int lda, double[] b, int ldb, double[] c, int Ldc, org.netlib.util.doubleW scale, org.netlib.util.intW info) {
    dtrsyl(trana, tranb, isgn, m, n, a, 0, lda, b, 0, ldb, c, 0, Ldc, scale, info);
  }

  public void dtrsyl(String trana, String tranb, int isgn, int m, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] c, int offsetc, int Ldc, org.netlib.util.doubleW scale, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dtrsylK(trana, tranb, isgn, m, n, a, offseta, lda, b, offsetb, ldb, c, offsetc, Ldc, scale, info);
  }

  protected abstract void dtrsylK(String trana, String tranb, int isgn, int m, int n, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, double[] c, int offsetc, int Ldc, org.netlib.util.doubleW scale, org.netlib.util.intW info);

  public void dtrti2(String uplo, String diag, int n, double[] a, int lda, org.netlib.util.intW info) {
    dtrti2(uplo, diag, n, a, 0, lda, info);
  }

  public void dtrti2(String uplo, String diag, int n, double[] a, int offseta, int lda, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dtrti2K(uplo, diag, n, a, offseta, lda, info);
  }

  protected abstract void dtrti2K(String uplo, String diag, int n, double[] a, int offseta, int lda, org.netlib.util.intW info);

  public void dtrtri(String uplo, String diag, int n, double[] a, int lda, org.netlib.util.intW info) {
    dtrtri(uplo, diag, n, a, 0, lda, info);
  }

  public void dtrtri(String uplo, String diag, int n, double[] a, int offseta, int lda, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dtrtriK(uplo, diag, n, a, offseta, lda, info);
  }

  protected abstract void dtrtriK(String uplo, String diag, int n, double[] a, int offseta, int lda, org.netlib.util.intW info);

  public void dtrtrs(String uplo, String trans, String diag, int n, int nrhs, double[] a, int lda, double[] b, int ldb, org.netlib.util.intW info) {
    dtrtrs(uplo, trans, diag, n, nrhs, a, 0, lda, b, 0, ldb, info);
  }

  public void dtrtrs(String uplo, String trans, String diag, int n, int nrhs, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dtrtrsK(uplo, trans, diag, n, nrhs, a, offseta, lda, b, offsetb, ldb, info);
  }

  protected abstract void dtrtrsK(String uplo, String trans, String diag, int n, int nrhs, double[] a, int offseta, int lda, double[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void dtzrqf(int m, int n, double[] a, int lda, double[] tau, org.netlib.util.intW info) {
    dtzrqf(m, n, a, 0, lda, tau, 0, info);
  }

  public void dtzrqf(int m, int n, double[] a, int offseta, int lda, double[] tau, int offsettau, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dtzrqfK(m, n, a, offseta, lda, tau, offsettau, info);
  }

  protected abstract void dtzrqfK(int m, int n, double[] a, int offseta, int lda, double[] tau, int offsettau, org.netlib.util.intW info);

  public void dtzrzf(int m, int n, double[] a, int lda, double[] tau, double[] work, int lwork, org.netlib.util.intW info) {
    dtzrzf(m, n, a, 0, lda, tau, 0, work, 0, lwork, info);
  }

  public void dtzrzf(int m, int n, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    dtzrzfK(m, n, a, offseta, lda, tau, offsettau, work, offsetwork, lwork, info);
  }

  protected abstract void dtzrzfK(int m, int n, double[] a, int offseta, int lda, double[] tau, int offsettau, double[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public int ieeeck(int ispec, float zero, float one) {
    return ieeeckK(ispec, zero, one);
  }

  protected abstract int ieeeckK(int ispec, float zero, float one);

  public int ilaenv(int ispec, String name, String opts, int n1, int n2, int n3, int n4) {
    return ilaenvK(ispec, name, opts, n1, n2, n3, n4);
  }

  protected abstract int ilaenvK(int ispec, String name, String opts, int n1, int n2, int n3, int n4);

  public void ilaver(org.netlib.util.intW vers_major, org.netlib.util.intW vers_minor, org.netlib.util.intW vers_patch) {
    ilaverK(vers_major, vers_minor, vers_patch);
  }

  protected abstract void ilaverK(org.netlib.util.intW vers_major, org.netlib.util.intW vers_minor, org.netlib.util.intW vers_patch);

  public int iparmq(int ispec, String name, String opts, int n, int ilo, int ihi, int lwork) {
    return iparmqK(ispec, name, opts, n, ilo, ihi, lwork);
  }

  protected abstract int iparmqK(int ispec, String name, String opts, int n, int ilo, int ihi, int lwork);

  public boolean lsamen(int n, String ca, String cb) {
    return lsamenK(n, ca, cb);
  }

  protected abstract boolean lsamenK(int n, String ca, String cb);

  public void sbdsdc(String uplo, String compq, int n, float[] d, float[] e, float[] u, int ldu, float[] vt, int ldvt, float[] q, int[] iq, float[] work, int[] iwork, org.netlib.util.intW info) {
    sbdsdc(uplo, compq, n, d, 0, e, 0, u, 0, ldu, vt, 0, ldvt, q, 0, iq, 0, work, 0, iwork, 0, info);
  }

  public void sbdsdc(String uplo, String compq, int n, float[] d, int offsetd, float[] e, int offsete, float[] u, int offsetu, int ldu, float[] vt, int offsetvt, int ldvt, float[] q, int offsetq, int[] iq, int offsetiq, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sbdsdcK(uplo, compq, n, d, offsetd, e, offsete, u, offsetu, ldu, vt, offsetvt, ldvt, q, offsetq, iq, offsetiq, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void sbdsdcK(String uplo, String compq, int n, float[] d, int offsetd, float[] e, int offsete, float[] u, int offsetu, int ldu, float[] vt, int offsetvt, int ldvt, float[] q, int offsetq, int[] iq, int offsetiq, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void sbdsqr(String uplo, int n, int ncvt, int nru, int ncc, float[] d, float[] e, float[] vt, int ldvt, float[] u, int ldu, float[] c, int Ldc, float[] work, org.netlib.util.intW info) {
    sbdsqr(uplo, n, ncvt, nru, ncc, d, 0, e, 0, vt, 0, ldvt, u, 0, ldu, c, 0, Ldc, work, 0, info);
  }

  public void sbdsqr(String uplo, int n, int ncvt, int nru, int ncc, float[] d, int offsetd, float[] e, int offsete, float[] vt, int offsetvt, int ldvt, float[] u, int offsetu, int ldu, float[] c, int offsetc, int Ldc, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sbdsqrK(uplo, n, ncvt, nru, ncc, d, offsetd, e, offsete, vt, offsetvt, ldvt, u, offsetu, ldu, c, offsetc, Ldc, work, offsetwork, info);
  }

  protected abstract void sbdsqrK(String uplo, int n, int ncvt, int nru, int ncc, float[] d, int offsetd, float[] e, int offsete, float[] vt, int offsetvt, int ldvt, float[] u, int offsetu, int ldu, float[] c, int offsetc, int Ldc, float[] work, int offsetwork, org.netlib.util.intW info);

  public void sdisna(String job, int m, int n, float[] d, float[] sep, org.netlib.util.intW info) {
    sdisna(job, m, n, d, 0, sep, 0, info);
  }

  public void sdisna(String job, int m, int n, float[] d, int offsetd, float[] sep, int offsetsep, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sdisnaK(job, m, n, d, offsetd, sep, offsetsep, info);
  }

  protected abstract void sdisnaK(String job, int m, int n, float[] d, int offsetd, float[] sep, int offsetsep, org.netlib.util.intW info);

  public void sgbbrd(String vect, int m, int n, int ncc, int kl, int ku, float[] ab, int ldab, float[] d, float[] e, float[] q, int ldq, float[] pt, int ldpt, float[] c, int Ldc, float[] work, org.netlib.util.intW info) {
    sgbbrd(vect, m, n, ncc, kl, ku, ab, 0, ldab, d, 0, e, 0, q, 0, ldq, pt, 0, ldpt, c, 0, Ldc, work, 0, info);
  }

  public void sgbbrd(String vect, int m, int n, int ncc, int kl, int ku, float[] ab, int offsetab, int ldab, float[] d, int offsetd, float[] e, int offsete, float[] q, int offsetq, int ldq, float[] pt, int offsetpt, int ldpt, float[] c, int offsetc, int Ldc, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgbbrdK(vect, m, n, ncc, kl, ku, ab, offsetab, ldab, d, offsetd, e, offsete, q, offsetq, ldq, pt, offsetpt, ldpt, c, offsetc, Ldc, work, offsetwork, info);
  }

  protected abstract void sgbbrdK(String vect, int m, int n, int ncc, int kl, int ku, float[] ab, int offsetab, int ldab, float[] d, int offsetd, float[] e, int offsete, float[] q, int offsetq, int ldq, float[] pt, int offsetpt, int ldpt, float[] c, int offsetc, int Ldc, float[] work, int offsetwork, org.netlib.util.intW info);

  public void sgbcon(String norm, int n, int kl, int ku, float[] ab, int ldab, int[] ipiv, float anorm, org.netlib.util.floatW rcond, float[] work, int[] iwork, org.netlib.util.intW info) {
    sgbcon(norm, n, kl, ku, ab, 0, ldab, ipiv, 0, anorm, rcond, work, 0, iwork, 0, info);
  }

  public void sgbcon(String norm, int n, int kl, int ku, float[] ab, int offsetab, int ldab, int[] ipiv, int offsetipiv, float anorm, org.netlib.util.floatW rcond, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgbconK(norm, n, kl, ku, ab, offsetab, ldab, ipiv, offsetipiv, anorm, rcond, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void sgbconK(String norm, int n, int kl, int ku, float[] ab, int offsetab, int ldab, int[] ipiv, int offsetipiv, float anorm, org.netlib.util.floatW rcond, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void sgbequ(int m, int n, int kl, int ku, float[] ab, int ldab, float[] r, float[] c, org.netlib.util.floatW rowcnd, org.netlib.util.floatW colcnd, org.netlib.util.floatW amax, org.netlib.util.intW info) {
    sgbequ(m, n, kl, ku, ab, 0, ldab, r, 0, c, 0, rowcnd, colcnd, amax, info);
  }

  public void sgbequ(int m, int n, int kl, int ku, float[] ab, int offsetab, int ldab, float[] r, int offsetr, float[] c, int offsetc, org.netlib.util.floatW rowcnd, org.netlib.util.floatW colcnd, org.netlib.util.floatW amax, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgbequK(m, n, kl, ku, ab, offsetab, ldab, r, offsetr, c, offsetc, rowcnd, colcnd, amax, info);
  }

  protected abstract void sgbequK(int m, int n, int kl, int ku, float[] ab, int offsetab, int ldab, float[] r, int offsetr, float[] c, int offsetc, org.netlib.util.floatW rowcnd, org.netlib.util.floatW colcnd, org.netlib.util.floatW amax, org.netlib.util.intW info);

  public void sgbrfs(String trans, int n, int kl, int ku, int nrhs, float[] ab, int ldab, float[] afb, int ldafb, int[] ipiv, float[] b, int ldb, float[] x, int ldx, float[] ferr, float[] berr, float[] work, int[] iwork, org.netlib.util.intW info) {
    sgbrfs(trans, n, kl, ku, nrhs, ab, 0, ldab, afb, 0, ldafb, ipiv, 0, b, 0, ldb, x, 0, ldx, ferr, 0, berr, 0, work, 0, iwork, 0, info);
  }

  public void sgbrfs(String trans, int n, int kl, int ku, int nrhs, float[] ab, int offsetab, int ldab, float[] afb, int offsetafb, int ldafb, int[] ipiv, int offsetipiv, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgbrfsK(trans, n, kl, ku, nrhs, ab, offsetab, ldab, afb, offsetafb, ldafb, ipiv, offsetipiv, b, offsetb, ldb, x, offsetx, ldx, ferr, offsetferr, berr, offsetberr, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void sgbrfsK(String trans, int n, int kl, int ku, int nrhs, float[] ab, int offsetab, int ldab, float[] afb, int offsetafb, int ldafb, int[] ipiv, int offsetipiv, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void sgbsv(int n, int kl, int ku, int nrhs, float[] ab, int ldab, int[] ipiv, float[] b, int ldb, org.netlib.util.intW info) {
    sgbsv(n, kl, ku, nrhs, ab, 0, ldab, ipiv, 0, b, 0, ldb, info);
  }

  public void sgbsv(int n, int kl, int ku, int nrhs, float[] ab, int offsetab, int ldab, int[] ipiv, int offsetipiv, float[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgbsvK(n, kl, ku, nrhs, ab, offsetab, ldab, ipiv, offsetipiv, b, offsetb, ldb, info);
  }

  protected abstract void sgbsvK(int n, int kl, int ku, int nrhs, float[] ab, int offsetab, int ldab, int[] ipiv, int offsetipiv, float[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void sgbsvx(String fact, String trans, int n, int kl, int ku, int nrhs, float[] ab, int ldab, float[] afb, int ldafb, int[] ipiv, org.netlib.util.StringW equed, float[] r, float[] c, float[] b, int ldb, float[] x, int ldx, org.netlib.util.floatW rcond, float[] ferr, float[] berr, float[] work, int[] iwork, org.netlib.util.intW info) {
    sgbsvx(fact, trans, n, kl, ku, nrhs, ab, 0, ldab, afb, 0, ldafb, ipiv, 0, equed, r, 0, c, 0, b, 0, ldb, x, 0, ldx, rcond, ferr, 0, berr, 0, work, 0, iwork, 0, info);
  }

  public void sgbsvx(String fact, String trans, int n, int kl, int ku, int nrhs, float[] ab, int offsetab, int ldab, float[] afb, int offsetafb, int ldafb, int[] ipiv, int offsetipiv, org.netlib.util.StringW equed, float[] r, int offsetr, float[] c, int offsetc, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, org.netlib.util.floatW rcond, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgbsvxK(fact, trans, n, kl, ku, nrhs, ab, offsetab, ldab, afb, offsetafb, ldafb, ipiv, offsetipiv, equed, r, offsetr, c, offsetc, b, offsetb, ldb, x, offsetx, ldx, rcond, ferr, offsetferr, berr, offsetberr, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void sgbsvxK(String fact, String trans, int n, int kl, int ku, int nrhs, float[] ab, int offsetab, int ldab, float[] afb, int offsetafb, int ldafb, int[] ipiv, int offsetipiv, org.netlib.util.StringW equed, float[] r, int offsetr, float[] c, int offsetc, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, org.netlib.util.floatW rcond, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void sgbtf2(int m, int n, int kl, int ku, float[] ab, int ldab, int[] ipiv, org.netlib.util.intW info) {
    sgbtf2(m, n, kl, ku, ab, 0, ldab, ipiv, 0, info);
  }

  public void sgbtf2(int m, int n, int kl, int ku, float[] ab, int offsetab, int ldab, int[] ipiv, int offsetipiv, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgbtf2K(m, n, kl, ku, ab, offsetab, ldab, ipiv, offsetipiv, info);
  }

  protected abstract void sgbtf2K(int m, int n, int kl, int ku, float[] ab, int offsetab, int ldab, int[] ipiv, int offsetipiv, org.netlib.util.intW info);

  public void sgbtrf(int m, int n, int kl, int ku, float[] ab, int ldab, int[] ipiv, org.netlib.util.intW info) {
    sgbtrf(m, n, kl, ku, ab, 0, ldab, ipiv, 0, info);
  }

  public void sgbtrf(int m, int n, int kl, int ku, float[] ab, int offsetab, int ldab, int[] ipiv, int offsetipiv, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgbtrfK(m, n, kl, ku, ab, offsetab, ldab, ipiv, offsetipiv, info);
  }

  protected abstract void sgbtrfK(int m, int n, int kl, int ku, float[] ab, int offsetab, int ldab, int[] ipiv, int offsetipiv, org.netlib.util.intW info);

  public void sgbtrs(String trans, int n, int kl, int ku, int nrhs, float[] ab, int ldab, int[] ipiv, float[] b, int ldb, org.netlib.util.intW info) {
    sgbtrs(trans, n, kl, ku, nrhs, ab, 0, ldab, ipiv, 0, b, 0, ldb, info);
  }

  public void sgbtrs(String trans, int n, int kl, int ku, int nrhs, float[] ab, int offsetab, int ldab, int[] ipiv, int offsetipiv, float[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgbtrsK(trans, n, kl, ku, nrhs, ab, offsetab, ldab, ipiv, offsetipiv, b, offsetb, ldb, info);
  }

  protected abstract void sgbtrsK(String trans, int n, int kl, int ku, int nrhs, float[] ab, int offsetab, int ldab, int[] ipiv, int offsetipiv, float[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void sgebak(String job, String side, int n, int ilo, int ihi, float[] scale, int m, float[] v, int ldv, org.netlib.util.intW info) {
    sgebak(job, side, n, ilo, ihi, scale, 0, m, v, 0, ldv, info);
  }

  public void sgebak(String job, String side, int n, int ilo, int ihi, float[] scale, int offsetscale, int m, float[] v, int offsetv, int ldv, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgebakK(job, side, n, ilo, ihi, scale, offsetscale, m, v, offsetv, ldv, info);
  }

  protected abstract void sgebakK(String job, String side, int n, int ilo, int ihi, float[] scale, int offsetscale, int m, float[] v, int offsetv, int ldv, org.netlib.util.intW info);

  public void sgebal(String job, int n, float[] a, int lda, org.netlib.util.intW ilo, org.netlib.util.intW ihi, float[] scale, org.netlib.util.intW info) {
    sgebal(job, n, a, 0, lda, ilo, ihi, scale, 0, info);
  }

  public void sgebal(String job, int n, float[] a, int offseta, int lda, org.netlib.util.intW ilo, org.netlib.util.intW ihi, float[] scale, int offsetscale, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgebalK(job, n, a, offseta, lda, ilo, ihi, scale, offsetscale, info);
  }

  protected abstract void sgebalK(String job, int n, float[] a, int offseta, int lda, org.netlib.util.intW ilo, org.netlib.util.intW ihi, float[] scale, int offsetscale, org.netlib.util.intW info);

  public void sgebd2(int m, int n, float[] a, int lda, float[] d, float[] e, float[] tauq, float[] taup, float[] work, org.netlib.util.intW info) {
    sgebd2(m, n, a, 0, lda, d, 0, e, 0, tauq, 0, taup, 0, work, 0, info);
  }

  public void sgebd2(int m, int n, float[] a, int offseta, int lda, float[] d, int offsetd, float[] e, int offsete, float[] tauq, int offsettauq, float[] taup, int offsettaup, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgebd2K(m, n, a, offseta, lda, d, offsetd, e, offsete, tauq, offsettauq, taup, offsettaup, work, offsetwork, info);
  }

  protected abstract void sgebd2K(int m, int n, float[] a, int offseta, int lda, float[] d, int offsetd, float[] e, int offsete, float[] tauq, int offsettauq, float[] taup, int offsettaup, float[] work, int offsetwork, org.netlib.util.intW info);

  public void sgebrd(int m, int n, float[] a, int lda, float[] d, float[] e, float[] tauq, float[] taup, float[] work, int lwork, org.netlib.util.intW info) {
    sgebrd(m, n, a, 0, lda, d, 0, e, 0, tauq, 0, taup, 0, work, 0, lwork, info);
  }

  public void sgebrd(int m, int n, float[] a, int offseta, int lda, float[] d, int offsetd, float[] e, int offsete, float[] tauq, int offsettauq, float[] taup, int offsettaup, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgebrdK(m, n, a, offseta, lda, d, offsetd, e, offsete, tauq, offsettauq, taup, offsettaup, work, offsetwork, lwork, info);
  }

  protected abstract void sgebrdK(int m, int n, float[] a, int offseta, int lda, float[] d, int offsetd, float[] e, int offsete, float[] tauq, int offsettauq, float[] taup, int offsettaup, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void sgecon(String norm, int n, float[] a, int lda, float anorm, org.netlib.util.floatW rcond, float[] work, int[] iwork, org.netlib.util.intW info) {
    sgecon(norm, n, a, 0, lda, anorm, rcond, work, 0, iwork, 0, info);
  }

  public void sgecon(String norm, int n, float[] a, int offseta, int lda, float anorm, org.netlib.util.floatW rcond, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgeconK(norm, n, a, offseta, lda, anorm, rcond, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void sgeconK(String norm, int n, float[] a, int offseta, int lda, float anorm, org.netlib.util.floatW rcond, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void sgeequ(int m, int n, float[] a, int lda, float[] r, float[] c, org.netlib.util.floatW rowcnd, org.netlib.util.floatW colcnd, org.netlib.util.floatW amax, org.netlib.util.intW info) {
    sgeequ(m, n, a, 0, lda, r, 0, c, 0, rowcnd, colcnd, amax, info);
  }

  public void sgeequ(int m, int n, float[] a, int offseta, int lda, float[] r, int offsetr, float[] c, int offsetc, org.netlib.util.floatW rowcnd, org.netlib.util.floatW colcnd, org.netlib.util.floatW amax, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgeequK(m, n, a, offseta, lda, r, offsetr, c, offsetc, rowcnd, colcnd, amax, info);
  }

  protected abstract void sgeequK(int m, int n, float[] a, int offseta, int lda, float[] r, int offsetr, float[] c, int offsetc, org.netlib.util.floatW rowcnd, org.netlib.util.floatW colcnd, org.netlib.util.floatW amax, org.netlib.util.intW info);

  public void sgees(String jobvs, String sort, java.lang.Object select, int n, float[] a, int lda, org.netlib.util.intW sdim, float[] wr, float[] wi, float[] vs, int ldvs, float[] work, int lwork, boolean[] bwork, org.netlib.util.intW info) {
    sgees(jobvs, sort, select, n, a, 0, lda, sdim, wr, 0, wi, 0, vs, 0, ldvs, work, 0, lwork, bwork, 0, info);
  }

  public void sgees(String jobvs, String sort, java.lang.Object select, int n, float[] a, int offseta, int lda, org.netlib.util.intW sdim, float[] wr, int offsetwr, float[] wi, int offsetwi, float[] vs, int offsetvs, int ldvs, float[] work, int offsetwork, int lwork, boolean[] bwork, int offsetbwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgeesK(jobvs, sort, select, n, a, offseta, lda, sdim, wr, offsetwr, wi, offsetwi, vs, offsetvs, ldvs, work, offsetwork, lwork, bwork, offsetbwork, info);
  }

  protected abstract void sgeesK(String jobvs, String sort, java.lang.Object select, int n, float[] a, int offseta, int lda, org.netlib.util.intW sdim, float[] wr, int offsetwr, float[] wi, int offsetwi, float[] vs, int offsetvs, int ldvs, float[] work, int offsetwork, int lwork, boolean[] bwork, int offsetbwork, org.netlib.util.intW info);

  public void sgeesx(String jobvs, String sort, java.lang.Object select, String sense, int n, float[] a, int lda, org.netlib.util.intW sdim, float[] wr, float[] wi, float[] vs, int ldvs, org.netlib.util.floatW rconde, org.netlib.util.floatW rcondv, float[] work, int lwork, int[] iwork, int liwork, boolean[] bwork, org.netlib.util.intW info) {
    sgeesx(jobvs, sort, select, sense, n, a, 0, lda, sdim, wr, 0, wi, 0, vs, 0, ldvs, rconde, rcondv, work, 0, lwork, iwork, 0, liwork, bwork, 0, info);
  }

  public void sgeesx(String jobvs, String sort, java.lang.Object select, String sense, int n, float[] a, int offseta, int lda, org.netlib.util.intW sdim, float[] wr, int offsetwr, float[] wi, int offsetwi, float[] vs, int offsetvs, int ldvs, org.netlib.util.floatW rconde, org.netlib.util.floatW rcondv, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, boolean[] bwork, int offsetbwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgeesxK(jobvs, sort, select, sense, n, a, offseta, lda, sdim, wr, offsetwr, wi, offsetwi, vs, offsetvs, ldvs, rconde, rcondv, work, offsetwork, lwork, iwork, offsetiwork, liwork, bwork, offsetbwork, info);
  }

  protected abstract void sgeesxK(String jobvs, String sort, java.lang.Object select, String sense, int n, float[] a, int offseta, int lda, org.netlib.util.intW sdim, float[] wr, int offsetwr, float[] wi, int offsetwi, float[] vs, int offsetvs, int ldvs, org.netlib.util.floatW rconde, org.netlib.util.floatW rcondv, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, boolean[] bwork, int offsetbwork, org.netlib.util.intW info);

  public void sgeev(String jobvl, String jobvr, int n, float[] a, int lda, float[] wr, float[] wi, float[] vl, int ldvl, float[] vr, int ldvr, float[] work, int lwork, org.netlib.util.intW info) {
    sgeev(jobvl, jobvr, n, a, 0, lda, wr, 0, wi, 0, vl, 0, ldvl, vr, 0, ldvr, work, 0, lwork, info);
  }

  public void sgeev(String jobvl, String jobvr, int n, float[] a, int offseta, int lda, float[] wr, int offsetwr, float[] wi, int offsetwi, float[] vl, int offsetvl, int ldvl, float[] vr, int offsetvr, int ldvr, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgeevK(jobvl, jobvr, n, a, offseta, lda, wr, offsetwr, wi, offsetwi, vl, offsetvl, ldvl, vr, offsetvr, ldvr, work, offsetwork, lwork, info);
  }

  protected abstract void sgeevK(String jobvl, String jobvr, int n, float[] a, int offseta, int lda, float[] wr, int offsetwr, float[] wi, int offsetwi, float[] vl, int offsetvl, int ldvl, float[] vr, int offsetvr, int ldvr, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void sgeevx(String balanc, String jobvl, String jobvr, String sense, int n, float[] a, int lda, float[] wr, float[] wi, float[] vl, int ldvl, float[] vr, int ldvr, org.netlib.util.intW ilo, org.netlib.util.intW ihi, float[] scale, org.netlib.util.floatW abnrm, float[] rconde, float[] rcondv, float[] work, int lwork, int[] iwork, org.netlib.util.intW info) {
    sgeevx(balanc, jobvl, jobvr, sense, n, a, 0, lda, wr, 0, wi, 0, vl, 0, ldvl, vr, 0, ldvr, ilo, ihi, scale, 0, abnrm, rconde, 0, rcondv, 0, work, 0, lwork, iwork, 0, info);
  }

  public void sgeevx(String balanc, String jobvl, String jobvr, String sense, int n, float[] a, int offseta, int lda, float[] wr, int offsetwr, float[] wi, int offsetwi, float[] vl, int offsetvl, int ldvl, float[] vr, int offsetvr, int ldvr, org.netlib.util.intW ilo, org.netlib.util.intW ihi, float[] scale, int offsetscale, org.netlib.util.floatW abnrm, float[] rconde, int offsetrconde, float[] rcondv, int offsetrcondv, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgeevxK(balanc, jobvl, jobvr, sense, n, a, offseta, lda, wr, offsetwr, wi, offsetwi, vl, offsetvl, ldvl, vr, offsetvr, ldvr, ilo, ihi, scale, offsetscale, abnrm, rconde, offsetrconde, rcondv, offsetrcondv, work, offsetwork, lwork, iwork, offsetiwork, info);
  }

  protected abstract void sgeevxK(String balanc, String jobvl, String jobvr, String sense, int n, float[] a, int offseta, int lda, float[] wr, int offsetwr, float[] wi, int offsetwi, float[] vl, int offsetvl, int ldvl, float[] vr, int offsetvr, int ldvr, org.netlib.util.intW ilo, org.netlib.util.intW ihi, float[] scale, int offsetscale, org.netlib.util.floatW abnrm, float[] rconde, int offsetrconde, float[] rcondv, int offsetrcondv, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void sgegs(String jobvsl, String jobvsr, int n, float[] a, int lda, float[] b, int ldb, float[] alphar, float[] alphai, float[] beta, float[] vsl, int ldvsl, float[] vsr, int ldvsr, float[] work, int lwork, org.netlib.util.intW info) {
    sgegs(jobvsl, jobvsr, n, a, 0, lda, b, 0, ldb, alphar, 0, alphai, 0, beta, 0, vsl, 0, ldvsl, vsr, 0, ldvsr, work, 0, lwork, info);
  }

  public void sgegs(String jobvsl, String jobvsr, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] alphar, int offsetalphar, float[] alphai, int offsetalphai, float[] beta, int offsetbeta, float[] vsl, int offsetvsl, int ldvsl, float[] vsr, int offsetvsr, int ldvsr, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgegsK(jobvsl, jobvsr, n, a, offseta, lda, b, offsetb, ldb, alphar, offsetalphar, alphai, offsetalphai, beta, offsetbeta, vsl, offsetvsl, ldvsl, vsr, offsetvsr, ldvsr, work, offsetwork, lwork, info);
  }

  protected abstract void sgegsK(String jobvsl, String jobvsr, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] alphar, int offsetalphar, float[] alphai, int offsetalphai, float[] beta, int offsetbeta, float[] vsl, int offsetvsl, int ldvsl, float[] vsr, int offsetvsr, int ldvsr, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void sgegv(String jobvl, String jobvr, int n, float[] a, int lda, float[] b, int ldb, float[] alphar, float[] alphai, float[] beta, float[] vl, int ldvl, float[] vr, int ldvr, float[] work, int lwork, org.netlib.util.intW info) {
    sgegv(jobvl, jobvr, n, a, 0, lda, b, 0, ldb, alphar, 0, alphai, 0, beta, 0, vl, 0, ldvl, vr, 0, ldvr, work, 0, lwork, info);
  }

  public void sgegv(String jobvl, String jobvr, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] alphar, int offsetalphar, float[] alphai, int offsetalphai, float[] beta, int offsetbeta, float[] vl, int offsetvl, int ldvl, float[] vr, int offsetvr, int ldvr, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgegvK(jobvl, jobvr, n, a, offseta, lda, b, offsetb, ldb, alphar, offsetalphar, alphai, offsetalphai, beta, offsetbeta, vl, offsetvl, ldvl, vr, offsetvr, ldvr, work, offsetwork, lwork, info);
  }

  protected abstract void sgegvK(String jobvl, String jobvr, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] alphar, int offsetalphar, float[] alphai, int offsetalphai, float[] beta, int offsetbeta, float[] vl, int offsetvl, int ldvl, float[] vr, int offsetvr, int ldvr, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void sgehd2(int n, int ilo, int ihi, float[] a, int lda, float[] tau, float[] work, org.netlib.util.intW info) {
    sgehd2(n, ilo, ihi, a, 0, lda, tau, 0, work, 0, info);
  }

  public void sgehd2(int n, int ilo, int ihi, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgehd2K(n, ilo, ihi, a, offseta, lda, tau, offsettau, work, offsetwork, info);
  }

  protected abstract void sgehd2K(int n, int ilo, int ihi, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, org.netlib.util.intW info);

  public void sgehrd(int n, int ilo, int ihi, float[] a, int lda, float[] tau, float[] work, int lwork, org.netlib.util.intW info) {
    sgehrd(n, ilo, ihi, a, 0, lda, tau, 0, work, 0, lwork, info);
  }

  public void sgehrd(int n, int ilo, int ihi, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgehrdK(n, ilo, ihi, a, offseta, lda, tau, offsettau, work, offsetwork, lwork, info);
  }

  protected abstract void sgehrdK(int n, int ilo, int ihi, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void sgelq2(int m, int n, float[] a, int lda, float[] tau, float[] work, org.netlib.util.intW info) {
    sgelq2(m, n, a, 0, lda, tau, 0, work, 0, info);
  }

  public void sgelq2(int m, int n, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgelq2K(m, n, a, offseta, lda, tau, offsettau, work, offsetwork, info);
  }

  protected abstract void sgelq2K(int m, int n, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, org.netlib.util.intW info);

  public void sgelqf(int m, int n, float[] a, int lda, float[] tau, float[] work, int lwork, org.netlib.util.intW info) {
    sgelqf(m, n, a, 0, lda, tau, 0, work, 0, lwork, info);
  }

  public void sgelqf(int m, int n, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgelqfK(m, n, a, offseta, lda, tau, offsettau, work, offsetwork, lwork, info);
  }

  protected abstract void sgelqfK(int m, int n, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void sgels(String trans, int m, int n, int nrhs, float[] a, int lda, float[] b, int ldb, float[] work, int lwork, org.netlib.util.intW info) {
    sgels(trans, m, n, nrhs, a, 0, lda, b, 0, ldb, work, 0, lwork, info);
  }

  public void sgels(String trans, int m, int n, int nrhs, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgelsK(trans, m, n, nrhs, a, offseta, lda, b, offsetb, ldb, work, offsetwork, lwork, info);
  }

  protected abstract void sgelsK(String trans, int m, int n, int nrhs, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void sgelsd(int m, int n, int nrhs, float[] a, int lda, float[] b, int ldb, float[] s, float rcond, org.netlib.util.intW rank, float[] work, int lwork, int[] iwork, org.netlib.util.intW info) {
    sgelsd(m, n, nrhs, a, 0, lda, b, 0, ldb, s, 0, rcond, rank, work, 0, lwork, iwork, 0, info);
  }

  public void sgelsd(int m, int n, int nrhs, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] s, int offsets, float rcond, org.netlib.util.intW rank, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgelsdK(m, n, nrhs, a, offseta, lda, b, offsetb, ldb, s, offsets, rcond, rank, work, offsetwork, lwork, iwork, offsetiwork, info);
  }

  protected abstract void sgelsdK(int m, int n, int nrhs, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] s, int offsets, float rcond, org.netlib.util.intW rank, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void sgelss(int m, int n, int nrhs, float[] a, int lda, float[] b, int ldb, float[] s, float rcond, org.netlib.util.intW rank, float[] work, int lwork, org.netlib.util.intW info) {
    sgelss(m, n, nrhs, a, 0, lda, b, 0, ldb, s, 0, rcond, rank, work, 0, lwork, info);
  }

  public void sgelss(int m, int n, int nrhs, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] s, int offsets, float rcond, org.netlib.util.intW rank, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgelssK(m, n, nrhs, a, offseta, lda, b, offsetb, ldb, s, offsets, rcond, rank, work, offsetwork, lwork, info);
  }

  protected abstract void sgelssK(int m, int n, int nrhs, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] s, int offsets, float rcond, org.netlib.util.intW rank, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void sgelsx(int m, int n, int nrhs, float[] a, int lda, float[] b, int ldb, int[] jpvt, float rcond, org.netlib.util.intW rank, float[] work, org.netlib.util.intW info) {
    sgelsx(m, n, nrhs, a, 0, lda, b, 0, ldb, jpvt, 0, rcond, rank, work, 0, info);
  }

  public void sgelsx(int m, int n, int nrhs, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, int[] jpvt, int offsetjpvt, float rcond, org.netlib.util.intW rank, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgelsxK(m, n, nrhs, a, offseta, lda, b, offsetb, ldb, jpvt, offsetjpvt, rcond, rank, work, offsetwork, info);
  }

  protected abstract void sgelsxK(int m, int n, int nrhs, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, int[] jpvt, int offsetjpvt, float rcond, org.netlib.util.intW rank, float[] work, int offsetwork, org.netlib.util.intW info);

  public void sgelsy(int m, int n, int nrhs, float[] a, int lda, float[] b, int ldb, int[] jpvt, float rcond, org.netlib.util.intW rank, float[] work, int lwork, org.netlib.util.intW info) {
    sgelsy(m, n, nrhs, a, 0, lda, b, 0, ldb, jpvt, 0, rcond, rank, work, 0, lwork, info);
  }

  public void sgelsy(int m, int n, int nrhs, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, int[] jpvt, int offsetjpvt, float rcond, org.netlib.util.intW rank, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgelsyK(m, n, nrhs, a, offseta, lda, b, offsetb, ldb, jpvt, offsetjpvt, rcond, rank, work, offsetwork, lwork, info);
  }

  protected abstract void sgelsyK(int m, int n, int nrhs, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, int[] jpvt, int offsetjpvt, float rcond, org.netlib.util.intW rank, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void sgeql2(int m, int n, float[] a, int lda, float[] tau, float[] work, org.netlib.util.intW info) {
    sgeql2(m, n, a, 0, lda, tau, 0, work, 0, info);
  }

  public void sgeql2(int m, int n, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgeql2K(m, n, a, offseta, lda, tau, offsettau, work, offsetwork, info);
  }

  protected abstract void sgeql2K(int m, int n, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, org.netlib.util.intW info);

  public void sgeqlf(int m, int n, float[] a, int lda, float[] tau, float[] work, int lwork, org.netlib.util.intW info) {
    sgeqlf(m, n, a, 0, lda, tau, 0, work, 0, lwork, info);
  }

  public void sgeqlf(int m, int n, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgeqlfK(m, n, a, offseta, lda, tau, offsettau, work, offsetwork, lwork, info);
  }

  protected abstract void sgeqlfK(int m, int n, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void sgeqp3(int m, int n, float[] a, int lda, int[] jpvt, float[] tau, float[] work, int lwork, org.netlib.util.intW info) {
    sgeqp3(m, n, a, 0, lda, jpvt, 0, tau, 0, work, 0, lwork, info);
  }

  public void sgeqp3(int m, int n, float[] a, int offseta, int lda, int[] jpvt, int offsetjpvt, float[] tau, int offsettau, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgeqp3K(m, n, a, offseta, lda, jpvt, offsetjpvt, tau, offsettau, work, offsetwork, lwork, info);
  }

  protected abstract void sgeqp3K(int m, int n, float[] a, int offseta, int lda, int[] jpvt, int offsetjpvt, float[] tau, int offsettau, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void sgeqpf(int m, int n, float[] a, int lda, int[] jpvt, float[] tau, float[] work, org.netlib.util.intW info) {
    sgeqpf(m, n, a, 0, lda, jpvt, 0, tau, 0, work, 0, info);
  }

  public void sgeqpf(int m, int n, float[] a, int offseta, int lda, int[] jpvt, int offsetjpvt, float[] tau, int offsettau, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgeqpfK(m, n, a, offseta, lda, jpvt, offsetjpvt, tau, offsettau, work, offsetwork, info);
  }

  protected abstract void sgeqpfK(int m, int n, float[] a, int offseta, int lda, int[] jpvt, int offsetjpvt, float[] tau, int offsettau, float[] work, int offsetwork, org.netlib.util.intW info);

  public void sgeqr2(int m, int n, float[] a, int lda, float[] tau, float[] work, org.netlib.util.intW info) {
    sgeqr2(m, n, a, 0, lda, tau, 0, work, 0, info);
  }

  public void sgeqr2(int m, int n, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgeqr2K(m, n, a, offseta, lda, tau, offsettau, work, offsetwork, info);
  }

  protected abstract void sgeqr2K(int m, int n, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, org.netlib.util.intW info);

  public void sgeqrf(int m, int n, float[] a, int lda, float[] tau, float[] work, int lwork, org.netlib.util.intW info) {
    sgeqrf(m, n, a, 0, lda, tau, 0, work, 0, lwork, info);
  }

  public void sgeqrf(int m, int n, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgeqrfK(m, n, a, offseta, lda, tau, offsettau, work, offsetwork, lwork, info);
  }

  protected abstract void sgeqrfK(int m, int n, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void sgerfs(String trans, int n, int nrhs, float[] a, int lda, float[] af, int ldaf, int[] ipiv, float[] b, int ldb, float[] x, int ldx, float[] ferr, float[] berr, float[] work, int[] iwork, org.netlib.util.intW info) {
    sgerfs(trans, n, nrhs, a, 0, lda, af, 0, ldaf, ipiv, 0, b, 0, ldb, x, 0, ldx, ferr, 0, berr, 0, work, 0, iwork, 0, info);
  }

  public void sgerfs(String trans, int n, int nrhs, float[] a, int offseta, int lda, float[] af, int offsetaf, int ldaf, int[] ipiv, int offsetipiv, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgerfsK(trans, n, nrhs, a, offseta, lda, af, offsetaf, ldaf, ipiv, offsetipiv, b, offsetb, ldb, x, offsetx, ldx, ferr, offsetferr, berr, offsetberr, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void sgerfsK(String trans, int n, int nrhs, float[] a, int offseta, int lda, float[] af, int offsetaf, int ldaf, int[] ipiv, int offsetipiv, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void sgerq2(int m, int n, float[] a, int lda, float[] tau, float[] work, org.netlib.util.intW info) {
    sgerq2(m, n, a, 0, lda, tau, 0, work, 0, info);
  }

  public void sgerq2(int m, int n, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgerq2K(m, n, a, offseta, lda, tau, offsettau, work, offsetwork, info);
  }

  protected abstract void sgerq2K(int m, int n, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, org.netlib.util.intW info);

  public void sgerqf(int m, int n, float[] a, int lda, float[] tau, float[] work, int lwork, org.netlib.util.intW info) {
    sgerqf(m, n, a, 0, lda, tau, 0, work, 0, lwork, info);
  }

  public void sgerqf(int m, int n, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgerqfK(m, n, a, offseta, lda, tau, offsettau, work, offsetwork, lwork, info);
  }

  protected abstract void sgerqfK(int m, int n, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void sgesc2(int n, float[] a, int lda, float[] rhs, int[] ipiv, int[] jpiv, org.netlib.util.floatW scale) {
    sgesc2(n, a, 0, lda, rhs, 0, ipiv, 0, jpiv, 0, scale);
  }

  public void sgesc2(int n, float[] a, int offseta, int lda, float[] rhs, int offsetrhs, int[] ipiv, int offsetipiv, int[] jpiv, int offsetjpiv, org.netlib.util.floatW scale) {
    //FIXME Add arguments check
    sgesc2K(n, a, offseta, lda, rhs, offsetrhs, ipiv, offsetipiv, jpiv, offsetjpiv, scale);
  }

  protected abstract void sgesc2K(int n, float[] a, int offseta, int lda, float[] rhs, int offsetrhs, int[] ipiv, int offsetipiv, int[] jpiv, int offsetjpiv, org.netlib.util.floatW scale);

  public void sgesdd(String jobz, int m, int n, float[] a, int lda, float[] s, float[] u, int ldu, float[] vt, int ldvt, float[] work, int lwork, int[] iwork, org.netlib.util.intW info) {
    sgesdd(jobz, m, n, a, 0, lda, s, 0, u, 0, ldu, vt, 0, ldvt, work, 0, lwork, iwork, 0, info);
  }

  public void sgesdd(String jobz, int m, int n, float[] a, int offseta, int lda, float[] s, int offsets, float[] u, int offsetu, int ldu, float[] vt, int offsetvt, int ldvt, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgesddK(jobz, m, n, a, offseta, lda, s, offsets, u, offsetu, ldu, vt, offsetvt, ldvt, work, offsetwork, lwork, iwork, offsetiwork, info);
  }

  protected abstract void sgesddK(String jobz, int m, int n, float[] a, int offseta, int lda, float[] s, int offsets, float[] u, int offsetu, int ldu, float[] vt, int offsetvt, int ldvt, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void sgesv(int n, int nrhs, float[] a, int lda, int[] ipiv, float[] b, int ldb, org.netlib.util.intW info) {
    sgesv(n, nrhs, a, 0, lda, ipiv, 0, b, 0, ldb, info);
  }

  public void sgesv(int n, int nrhs, float[] a, int offseta, int lda, int[] ipiv, int offsetipiv, float[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgesvK(n, nrhs, a, offseta, lda, ipiv, offsetipiv, b, offsetb, ldb, info);
  }

  protected abstract void sgesvK(int n, int nrhs, float[] a, int offseta, int lda, int[] ipiv, int offsetipiv, float[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void sgesvd(String jobu, String jobvt, int m, int n, float[] a, int lda, float[] s, float[] u, int ldu, float[] vt, int ldvt, float[] work, int lwork, org.netlib.util.intW info) {
    sgesvd(jobu, jobvt, m, n, a, 0, lda, s, 0, u, 0, ldu, vt, 0, ldvt, work, 0, lwork, info);
  }

  public void sgesvd(String jobu, String jobvt, int m, int n, float[] a, int offseta, int lda, float[] s, int offsets, float[] u, int offsetu, int ldu, float[] vt, int offsetvt, int ldvt, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgesvdK(jobu, jobvt, m, n, a, offseta, lda, s, offsets, u, offsetu, ldu, vt, offsetvt, ldvt, work, offsetwork, lwork, info);
  }

  protected abstract void sgesvdK(String jobu, String jobvt, int m, int n, float[] a, int offseta, int lda, float[] s, int offsets, float[] u, int offsetu, int ldu, float[] vt, int offsetvt, int ldvt, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void sgesvx(String fact, String trans, int n, int nrhs, float[] a, int lda, float[] af, int ldaf, int[] ipiv, org.netlib.util.StringW equed, float[] r, float[] c, float[] b, int ldb, float[] x, int ldx, org.netlib.util.floatW rcond, float[] ferr, float[] berr, float[] work, int[] iwork, org.netlib.util.intW info) {
    sgesvx(fact, trans, n, nrhs, a, 0, lda, af, 0, ldaf, ipiv, 0, equed, r, 0, c, 0, b, 0, ldb, x, 0, ldx, rcond, ferr, 0, berr, 0, work, 0, iwork, 0, info);
  }

  public void sgesvx(String fact, String trans, int n, int nrhs, float[] a, int offseta, int lda, float[] af, int offsetaf, int ldaf, int[] ipiv, int offsetipiv, org.netlib.util.StringW equed, float[] r, int offsetr, float[] c, int offsetc, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, org.netlib.util.floatW rcond, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgesvxK(fact, trans, n, nrhs, a, offseta, lda, af, offsetaf, ldaf, ipiv, offsetipiv, equed, r, offsetr, c, offsetc, b, offsetb, ldb, x, offsetx, ldx, rcond, ferr, offsetferr, berr, offsetberr, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void sgesvxK(String fact, String trans, int n, int nrhs, float[] a, int offseta, int lda, float[] af, int offsetaf, int ldaf, int[] ipiv, int offsetipiv, org.netlib.util.StringW equed, float[] r, int offsetr, float[] c, int offsetc, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, org.netlib.util.floatW rcond, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void sgetc2(int n, float[] a, int lda, int[] ipiv, int[] jpiv, org.netlib.util.intW info) {
    sgetc2(n, a, 0, lda, ipiv, 0, jpiv, 0, info);
  }

  public void sgetc2(int n, float[] a, int offseta, int lda, int[] ipiv, int offsetipiv, int[] jpiv, int offsetjpiv, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgetc2K(n, a, offseta, lda, ipiv, offsetipiv, jpiv, offsetjpiv, info);
  }

  protected abstract void sgetc2K(int n, float[] a, int offseta, int lda, int[] ipiv, int offsetipiv, int[] jpiv, int offsetjpiv, org.netlib.util.intW info);

  public void sgetf2(int m, int n, float[] a, int lda, int[] ipiv, org.netlib.util.intW info) {
    sgetf2(m, n, a, 0, lda, ipiv, 0, info);
  }

  public void sgetf2(int m, int n, float[] a, int offseta, int lda, int[] ipiv, int offsetipiv, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgetf2K(m, n, a, offseta, lda, ipiv, offsetipiv, info);
  }

  protected abstract void sgetf2K(int m, int n, float[] a, int offseta, int lda, int[] ipiv, int offsetipiv, org.netlib.util.intW info);

  public void sgetrf(int m, int n, float[] a, int lda, int[] ipiv, org.netlib.util.intW info) {
    sgetrf(m, n, a, 0, lda, ipiv, 0, info);
  }

  public void sgetrf(int m, int n, float[] a, int offseta, int lda, int[] ipiv, int offsetipiv, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgetrfK(m, n, a, offseta, lda, ipiv, offsetipiv, info);
  }

  protected abstract void sgetrfK(int m, int n, float[] a, int offseta, int lda, int[] ipiv, int offsetipiv, org.netlib.util.intW info);

  public void sgetri(int n, float[] a, int lda, int[] ipiv, float[] work, int lwork, org.netlib.util.intW info) {
    sgetri(n, a, 0, lda, ipiv, 0, work, 0, lwork, info);
  }

  public void sgetri(int n, float[] a, int offseta, int lda, int[] ipiv, int offsetipiv, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgetriK(n, a, offseta, lda, ipiv, offsetipiv, work, offsetwork, lwork, info);
  }

  protected abstract void sgetriK(int n, float[] a, int offseta, int lda, int[] ipiv, int offsetipiv, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void sgetrs(String trans, int n, int nrhs, float[] a, int lda, int[] ipiv, float[] b, int ldb, org.netlib.util.intW info) {
    sgetrs(trans, n, nrhs, a, 0, lda, ipiv, 0, b, 0, ldb, info);
  }

  public void sgetrs(String trans, int n, int nrhs, float[] a, int offseta, int lda, int[] ipiv, int offsetipiv, float[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgetrsK(trans, n, nrhs, a, offseta, lda, ipiv, offsetipiv, b, offsetb, ldb, info);
  }

  protected abstract void sgetrsK(String trans, int n, int nrhs, float[] a, int offseta, int lda, int[] ipiv, int offsetipiv, float[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void sggbak(String job, String side, int n, int ilo, int ihi, float[] lscale, float[] rscale, int m, float[] v, int ldv, org.netlib.util.intW info) {
    sggbak(job, side, n, ilo, ihi, lscale, 0, rscale, 0, m, v, 0, ldv, info);
  }

  public void sggbak(String job, String side, int n, int ilo, int ihi, float[] lscale, int offsetlscale, float[] rscale, int offsetrscale, int m, float[] v, int offsetv, int ldv, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sggbakK(job, side, n, ilo, ihi, lscale, offsetlscale, rscale, offsetrscale, m, v, offsetv, ldv, info);
  }

  protected abstract void sggbakK(String job, String side, int n, int ilo, int ihi, float[] lscale, int offsetlscale, float[] rscale, int offsetrscale, int m, float[] v, int offsetv, int ldv, org.netlib.util.intW info);

  public void sggbal(String job, int n, float[] a, int lda, float[] b, int ldb, org.netlib.util.intW ilo, org.netlib.util.intW ihi, float[] lscale, float[] rscale, float[] work, org.netlib.util.intW info) {
    sggbal(job, n, a, 0, lda, b, 0, ldb, ilo, ihi, lscale, 0, rscale, 0, work, 0, info);
  }

  public void sggbal(String job, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, org.netlib.util.intW ilo, org.netlib.util.intW ihi, float[] lscale, int offsetlscale, float[] rscale, int offsetrscale, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sggbalK(job, n, a, offseta, lda, b, offsetb, ldb, ilo, ihi, lscale, offsetlscale, rscale, offsetrscale, work, offsetwork, info);
  }

  protected abstract void sggbalK(String job, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, org.netlib.util.intW ilo, org.netlib.util.intW ihi, float[] lscale, int offsetlscale, float[] rscale, int offsetrscale, float[] work, int offsetwork, org.netlib.util.intW info);

  public void sgges(String jobvsl, String jobvsr, String sort, java.lang.Object selctg, int n, float[] a, int lda, float[] b, int ldb, org.netlib.util.intW sdim, float[] alphar, float[] alphai, float[] beta, float[] vsl, int ldvsl, float[] vsr, int ldvsr, float[] work, int lwork, boolean[] bwork, org.netlib.util.intW info) {
    sgges(jobvsl, jobvsr, sort, selctg, n, a, 0, lda, b, 0, ldb, sdim, alphar, 0, alphai, 0, beta, 0, vsl, 0, ldvsl, vsr, 0, ldvsr, work, 0, lwork, bwork, 0, info);
  }

  public void sgges(String jobvsl, String jobvsr, String sort, java.lang.Object selctg, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, org.netlib.util.intW sdim, float[] alphar, int offsetalphar, float[] alphai, int offsetalphai, float[] beta, int offsetbeta, float[] vsl, int offsetvsl, int ldvsl, float[] vsr, int offsetvsr, int ldvsr, float[] work, int offsetwork, int lwork, boolean[] bwork, int offsetbwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sggesK(jobvsl, jobvsr, sort, selctg, n, a, offseta, lda, b, offsetb, ldb, sdim, alphar, offsetalphar, alphai, offsetalphai, beta, offsetbeta, vsl, offsetvsl, ldvsl, vsr, offsetvsr, ldvsr, work, offsetwork, lwork, bwork, offsetbwork, info);
  }

  protected abstract void sggesK(String jobvsl, String jobvsr, String sort, java.lang.Object selctg, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, org.netlib.util.intW sdim, float[] alphar, int offsetalphar, float[] alphai, int offsetalphai, float[] beta, int offsetbeta, float[] vsl, int offsetvsl, int ldvsl, float[] vsr, int offsetvsr, int ldvsr, float[] work, int offsetwork, int lwork, boolean[] bwork, int offsetbwork, org.netlib.util.intW info);

  public void sggesx(String jobvsl, String jobvsr, String sort, java.lang.Object selctg, String sense, int n, float[] a, int lda, float[] b, int ldb, org.netlib.util.intW sdim, float[] alphar, float[] alphai, float[] beta, float[] vsl, int ldvsl, float[] vsr, int ldvsr, float[] rconde, float[] rcondv, float[] work, int lwork, int[] iwork, int liwork, boolean[] bwork, org.netlib.util.intW info) {
    sggesx(jobvsl, jobvsr, sort, selctg, sense, n, a, 0, lda, b, 0, ldb, sdim, alphar, 0, alphai, 0, beta, 0, vsl, 0, ldvsl, vsr, 0, ldvsr, rconde, 0, rcondv, 0, work, 0, lwork, iwork, 0, liwork, bwork, 0, info);
  }

  public void sggesx(String jobvsl, String jobvsr, String sort, java.lang.Object selctg, String sense, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, org.netlib.util.intW sdim, float[] alphar, int offsetalphar, float[] alphai, int offsetalphai, float[] beta, int offsetbeta, float[] vsl, int offsetvsl, int ldvsl, float[] vsr, int offsetvsr, int ldvsr, float[] rconde, int offsetrconde, float[] rcondv, int offsetrcondv, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, boolean[] bwork, int offsetbwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sggesxK(jobvsl, jobvsr, sort, selctg, sense, n, a, offseta, lda, b, offsetb, ldb, sdim, alphar, offsetalphar, alphai, offsetalphai, beta, offsetbeta, vsl, offsetvsl, ldvsl, vsr, offsetvsr, ldvsr, rconde, offsetrconde, rcondv, offsetrcondv, work, offsetwork, lwork, iwork, offsetiwork, liwork, bwork, offsetbwork, info);
  }

  protected abstract void sggesxK(String jobvsl, String jobvsr, String sort, java.lang.Object selctg, String sense, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, org.netlib.util.intW sdim, float[] alphar, int offsetalphar, float[] alphai, int offsetalphai, float[] beta, int offsetbeta, float[] vsl, int offsetvsl, int ldvsl, float[] vsr, int offsetvsr, int ldvsr, float[] rconde, int offsetrconde, float[] rcondv, int offsetrcondv, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, boolean[] bwork, int offsetbwork, org.netlib.util.intW info);

  public void sggev(String jobvl, String jobvr, int n, float[] a, int lda, float[] b, int ldb, float[] alphar, float[] alphai, float[] beta, float[] vl, int ldvl, float[] vr, int ldvr, float[] work, int lwork, org.netlib.util.intW info) {
    sggev(jobvl, jobvr, n, a, 0, lda, b, 0, ldb, alphar, 0, alphai, 0, beta, 0, vl, 0, ldvl, vr, 0, ldvr, work, 0, lwork, info);
  }

  public void sggev(String jobvl, String jobvr, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] alphar, int offsetalphar, float[] alphai, int offsetalphai, float[] beta, int offsetbeta, float[] vl, int offsetvl, int ldvl, float[] vr, int offsetvr, int ldvr, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sggevK(jobvl, jobvr, n, a, offseta, lda, b, offsetb, ldb, alphar, offsetalphar, alphai, offsetalphai, beta, offsetbeta, vl, offsetvl, ldvl, vr, offsetvr, ldvr, work, offsetwork, lwork, info);
  }

  protected abstract void sggevK(String jobvl, String jobvr, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] alphar, int offsetalphar, float[] alphai, int offsetalphai, float[] beta, int offsetbeta, float[] vl, int offsetvl, int ldvl, float[] vr, int offsetvr, int ldvr, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void sggevx(String balanc, String jobvl, String jobvr, String sense, int n, float[] a, int lda, float[] b, int ldb, float[] alphar, float[] alphai, float[] beta, float[] vl, int ldvl, float[] vr, int ldvr, org.netlib.util.intW ilo, org.netlib.util.intW ihi, float[] lscale, float[] rscale, org.netlib.util.floatW abnrm, org.netlib.util.floatW bbnrm, float[] rconde, float[] rcondv, float[] work, int lwork, int[] iwork, boolean[] bwork, org.netlib.util.intW info) {
    sggevx(balanc, jobvl, jobvr, sense, n, a, 0, lda, b, 0, ldb, alphar, 0, alphai, 0, beta, 0, vl, 0, ldvl, vr, 0, ldvr, ilo, ihi, lscale, 0, rscale, 0, abnrm, bbnrm, rconde, 0, rcondv, 0, work, 0, lwork, iwork, 0, bwork, 0, info);
  }

  public void sggevx(String balanc, String jobvl, String jobvr, String sense, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] alphar, int offsetalphar, float[] alphai, int offsetalphai, float[] beta, int offsetbeta, float[] vl, int offsetvl, int ldvl, float[] vr, int offsetvr, int ldvr, org.netlib.util.intW ilo, org.netlib.util.intW ihi, float[] lscale, int offsetlscale, float[] rscale, int offsetrscale, org.netlib.util.floatW abnrm, org.netlib.util.floatW bbnrm, float[] rconde, int offsetrconde, float[] rcondv, int offsetrcondv, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, boolean[] bwork, int offsetbwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sggevxK(balanc, jobvl, jobvr, sense, n, a, offseta, lda, b, offsetb, ldb, alphar, offsetalphar, alphai, offsetalphai, beta, offsetbeta, vl, offsetvl, ldvl, vr, offsetvr, ldvr, ilo, ihi, lscale, offsetlscale, rscale, offsetrscale, abnrm, bbnrm, rconde, offsetrconde, rcondv, offsetrcondv, work, offsetwork, lwork, iwork, offsetiwork, bwork, offsetbwork, info);
  }

  protected abstract void sggevxK(String balanc, String jobvl, String jobvr, String sense, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] alphar, int offsetalphar, float[] alphai, int offsetalphai, float[] beta, int offsetbeta, float[] vl, int offsetvl, int ldvl, float[] vr, int offsetvr, int ldvr, org.netlib.util.intW ilo, org.netlib.util.intW ihi, float[] lscale, int offsetlscale, float[] rscale, int offsetrscale, org.netlib.util.floatW abnrm, org.netlib.util.floatW bbnrm, float[] rconde, int offsetrconde, float[] rcondv, int offsetrcondv, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, boolean[] bwork, int offsetbwork, org.netlib.util.intW info);

  public void sggglm(int n, int m, int p, float[] a, int lda, float[] b, int ldb, float[] d, float[] x, float[] y, float[] work, int lwork, org.netlib.util.intW info) {
    sggglm(n, m, p, a, 0, lda, b, 0, ldb, d, 0, x, 0, y, 0, work, 0, lwork, info);
  }

  public void sggglm(int n, int m, int p, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] d, int offsetd, float[] x, int offsetx, float[] y, int offsety, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sggglmK(n, m, p, a, offseta, lda, b, offsetb, ldb, d, offsetd, x, offsetx, y, offsety, work, offsetwork, lwork, info);
  }

  protected abstract void sggglmK(int n, int m, int p, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] d, int offsetd, float[] x, int offsetx, float[] y, int offsety, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void sgghrd(String compq, String compz, int n, int ilo, int ihi, float[] a, int lda, float[] b, int ldb, float[] q, int ldq, float[] z, int ldz, org.netlib.util.intW info) {
    sgghrd(compq, compz, n, ilo, ihi, a, 0, lda, b, 0, ldb, q, 0, ldq, z, 0, ldz, info);
  }

  public void sgghrd(String compq, String compz, int n, int ilo, int ihi, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] q, int offsetq, int ldq, float[] z, int offsetz, int ldz, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgghrdK(compq, compz, n, ilo, ihi, a, offseta, lda, b, offsetb, ldb, q, offsetq, ldq, z, offsetz, ldz, info);
  }

  protected abstract void sgghrdK(String compq, String compz, int n, int ilo, int ihi, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] q, int offsetq, int ldq, float[] z, int offsetz, int ldz, org.netlib.util.intW info);

  public void sgglse(int m, int n, int p, float[] a, int lda, float[] b, int ldb, float[] c, float[] d, float[] x, float[] work, int lwork, org.netlib.util.intW info) {
    sgglse(m, n, p, a, 0, lda, b, 0, ldb, c, 0, d, 0, x, 0, work, 0, lwork, info);
  }

  public void sgglse(int m, int n, int p, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] c, int offsetc, float[] d, int offsetd, float[] x, int offsetx, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgglseK(m, n, p, a, offseta, lda, b, offsetb, ldb, c, offsetc, d, offsetd, x, offsetx, work, offsetwork, lwork, info);
  }

  protected abstract void sgglseK(int m, int n, int p, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] c, int offsetc, float[] d, int offsetd, float[] x, int offsetx, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void sggqrf(int n, int m, int p, float[] a, int lda, float[] taua, float[] b, int ldb, float[] taub, float[] work, int lwork, org.netlib.util.intW info) {
    sggqrf(n, m, p, a, 0, lda, taua, 0, b, 0, ldb, taub, 0, work, 0, lwork, info);
  }

  public void sggqrf(int n, int m, int p, float[] a, int offseta, int lda, float[] taua, int offsettaua, float[] b, int offsetb, int ldb, float[] taub, int offsettaub, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sggqrfK(n, m, p, a, offseta, lda, taua, offsettaua, b, offsetb, ldb, taub, offsettaub, work, offsetwork, lwork, info);
  }

  protected abstract void sggqrfK(int n, int m, int p, float[] a, int offseta, int lda, float[] taua, int offsettaua, float[] b, int offsetb, int ldb, float[] taub, int offsettaub, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void sggrqf(int m, int p, int n, float[] a, int lda, float[] taua, float[] b, int ldb, float[] taub, float[] work, int lwork, org.netlib.util.intW info) {
    sggrqf(m, p, n, a, 0, lda, taua, 0, b, 0, ldb, taub, 0, work, 0, lwork, info);
  }

  public void sggrqf(int m, int p, int n, float[] a, int offseta, int lda, float[] taua, int offsettaua, float[] b, int offsetb, int ldb, float[] taub, int offsettaub, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sggrqfK(m, p, n, a, offseta, lda, taua, offsettaua, b, offsetb, ldb, taub, offsettaub, work, offsetwork, lwork, info);
  }

  protected abstract void sggrqfK(int m, int p, int n, float[] a, int offseta, int lda, float[] taua, int offsettaua, float[] b, int offsetb, int ldb, float[] taub, int offsettaub, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void sggsvd(String jobu, String jobv, String jobq, int m, int n, int p, org.netlib.util.intW k, org.netlib.util.intW l, float[] a, int lda, float[] b, int ldb, float[] alpha, float[] beta, float[] u, int ldu, float[] v, int ldv, float[] q, int ldq, float[] work, int[] iwork, org.netlib.util.intW info) {
    sggsvd(jobu, jobv, jobq, m, n, p, k, l, a, 0, lda, b, 0, ldb, alpha, 0, beta, 0, u, 0, ldu, v, 0, ldv, q, 0, ldq, work, 0, iwork, 0, info);
  }

  public void sggsvd(String jobu, String jobv, String jobq, int m, int n, int p, org.netlib.util.intW k, org.netlib.util.intW l, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] alpha, int offsetalpha, float[] beta, int offsetbeta, float[] u, int offsetu, int ldu, float[] v, int offsetv, int ldv, float[] q, int offsetq, int ldq, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sggsvdK(jobu, jobv, jobq, m, n, p, k, l, a, offseta, lda, b, offsetb, ldb, alpha, offsetalpha, beta, offsetbeta, u, offsetu, ldu, v, offsetv, ldv, q, offsetq, ldq, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void sggsvdK(String jobu, String jobv, String jobq, int m, int n, int p, org.netlib.util.intW k, org.netlib.util.intW l, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] alpha, int offsetalpha, float[] beta, int offsetbeta, float[] u, int offsetu, int ldu, float[] v, int offsetv, int ldv, float[] q, int offsetq, int ldq, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void sggsvp(String jobu, String jobv, String jobq, int m, int p, int n, float[] a, int lda, float[] b, int ldb, float tola, float tolb, org.netlib.util.intW k, org.netlib.util.intW l, float[] u, int ldu, float[] v, int ldv, float[] q, int ldq, int[] iwork, float[] tau, float[] work, org.netlib.util.intW info) {
    sggsvp(jobu, jobv, jobq, m, p, n, a, 0, lda, b, 0, ldb, tola, tolb, k, l, u, 0, ldu, v, 0, ldv, q, 0, ldq, iwork, 0, tau, 0, work, 0, info);
  }

  public void sggsvp(String jobu, String jobv, String jobq, int m, int p, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float tola, float tolb, org.netlib.util.intW k, org.netlib.util.intW l, float[] u, int offsetu, int ldu, float[] v, int offsetv, int ldv, float[] q, int offsetq, int ldq, int[] iwork, int offsetiwork, float[] tau, int offsettau, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sggsvpK(jobu, jobv, jobq, m, p, n, a, offseta, lda, b, offsetb, ldb, tola, tolb, k, l, u, offsetu, ldu, v, offsetv, ldv, q, offsetq, ldq, iwork, offsetiwork, tau, offsettau, work, offsetwork, info);
  }

  protected abstract void sggsvpK(String jobu, String jobv, String jobq, int m, int p, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float tola, float tolb, org.netlib.util.intW k, org.netlib.util.intW l, float[] u, int offsetu, int ldu, float[] v, int offsetv, int ldv, float[] q, int offsetq, int ldq, int[] iwork, int offsetiwork, float[] tau, int offsettau, float[] work, int offsetwork, org.netlib.util.intW info);

  public void sgtcon(String norm, int n, float[] dl, float[] d, float[] du, float[] du2, int[] ipiv, float anorm, org.netlib.util.floatW rcond, float[] work, int[] iwork, org.netlib.util.intW info) {
    sgtcon(norm, n, dl, 0, d, 0, du, 0, du2, 0, ipiv, 0, anorm, rcond, work, 0, iwork, 0, info);
  }

  public void sgtcon(String norm, int n, float[] dl, int offsetdl, float[] d, int offsetd, float[] du, int offsetdu, float[] du2, int offsetdu2, int[] ipiv, int offsetipiv, float anorm, org.netlib.util.floatW rcond, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgtconK(norm, n, dl, offsetdl, d, offsetd, du, offsetdu, du2, offsetdu2, ipiv, offsetipiv, anorm, rcond, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void sgtconK(String norm, int n, float[] dl, int offsetdl, float[] d, int offsetd, float[] du, int offsetdu, float[] du2, int offsetdu2, int[] ipiv, int offsetipiv, float anorm, org.netlib.util.floatW rcond, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void sgtrfs(String trans, int n, int nrhs, float[] dl, float[] d, float[] du, float[] dlf, float[] df, float[] duf, float[] du2, int[] ipiv, float[] b, int ldb, float[] x, int ldx, float[] ferr, float[] berr, float[] work, int[] iwork, org.netlib.util.intW info) {
    sgtrfs(trans, n, nrhs, dl, 0, d, 0, du, 0, dlf, 0, df, 0, duf, 0, du2, 0, ipiv, 0, b, 0, ldb, x, 0, ldx, ferr, 0, berr, 0, work, 0, iwork, 0, info);
  }

  public void sgtrfs(String trans, int n, int nrhs, float[] dl, int offsetdl, float[] d, int offsetd, float[] du, int offsetdu, float[] dlf, int offsetdlf, float[] df, int offsetdf, float[] duf, int offsetduf, float[] du2, int offsetdu2, int[] ipiv, int offsetipiv, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgtrfsK(trans, n, nrhs, dl, offsetdl, d, offsetd, du, offsetdu, dlf, offsetdlf, df, offsetdf, duf, offsetduf, du2, offsetdu2, ipiv, offsetipiv, b, offsetb, ldb, x, offsetx, ldx, ferr, offsetferr, berr, offsetberr, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void sgtrfsK(String trans, int n, int nrhs, float[] dl, int offsetdl, float[] d, int offsetd, float[] du, int offsetdu, float[] dlf, int offsetdlf, float[] df, int offsetdf, float[] duf, int offsetduf, float[] du2, int offsetdu2, int[] ipiv, int offsetipiv, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void sgtsv(int n, int nrhs, float[] dl, float[] d, float[] du, float[] b, int ldb, org.netlib.util.intW info) {
    sgtsv(n, nrhs, dl, 0, d, 0, du, 0, b, 0, ldb, info);
  }

  public void sgtsv(int n, int nrhs, float[] dl, int offsetdl, float[] d, int offsetd, float[] du, int offsetdu, float[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgtsvK(n, nrhs, dl, offsetdl, d, offsetd, du, offsetdu, b, offsetb, ldb, info);
  }

  protected abstract void sgtsvK(int n, int nrhs, float[] dl, int offsetdl, float[] d, int offsetd, float[] du, int offsetdu, float[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void sgtsvx(String fact, String trans, int n, int nrhs, float[] dl, float[] d, float[] du, float[] dlf, float[] df, float[] duf, float[] du2, int[] ipiv, float[] b, int ldb, float[] x, int ldx, org.netlib.util.floatW rcond, float[] ferr, float[] berr, float[] work, int[] iwork, org.netlib.util.intW info) {
    sgtsvx(fact, trans, n, nrhs, dl, 0, d, 0, du, 0, dlf, 0, df, 0, duf, 0, du2, 0, ipiv, 0, b, 0, ldb, x, 0, ldx, rcond, ferr, 0, berr, 0, work, 0, iwork, 0, info);
  }

  public void sgtsvx(String fact, String trans, int n, int nrhs, float[] dl, int offsetdl, float[] d, int offsetd, float[] du, int offsetdu, float[] dlf, int offsetdlf, float[] df, int offsetdf, float[] duf, int offsetduf, float[] du2, int offsetdu2, int[] ipiv, int offsetipiv, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, org.netlib.util.floatW rcond, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgtsvxK(fact, trans, n, nrhs, dl, offsetdl, d, offsetd, du, offsetdu, dlf, offsetdlf, df, offsetdf, duf, offsetduf, du2, offsetdu2, ipiv, offsetipiv, b, offsetb, ldb, x, offsetx, ldx, rcond, ferr, offsetferr, berr, offsetberr, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void sgtsvxK(String fact, String trans, int n, int nrhs, float[] dl, int offsetdl, float[] d, int offsetd, float[] du, int offsetdu, float[] dlf, int offsetdlf, float[] df, int offsetdf, float[] duf, int offsetduf, float[] du2, int offsetdu2, int[] ipiv, int offsetipiv, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, org.netlib.util.floatW rcond, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void sgttrf(int n, float[] dl, float[] d, float[] du, float[] du2, int[] ipiv, org.netlib.util.intW info) {
    sgttrf(n, dl, 0, d, 0, du, 0, du2, 0, ipiv, 0, info);
  }

  public void sgttrf(int n, float[] dl, int offsetdl, float[] d, int offsetd, float[] du, int offsetdu, float[] du2, int offsetdu2, int[] ipiv, int offsetipiv, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgttrfK(n, dl, offsetdl, d, offsetd, du, offsetdu, du2, offsetdu2, ipiv, offsetipiv, info);
  }

  protected abstract void sgttrfK(int n, float[] dl, int offsetdl, float[] d, int offsetd, float[] du, int offsetdu, float[] du2, int offsetdu2, int[] ipiv, int offsetipiv, org.netlib.util.intW info);

  public void sgttrs(String trans, int n, int nrhs, float[] dl, float[] d, float[] du, float[] du2, int[] ipiv, float[] b, int ldb, org.netlib.util.intW info) {
    sgttrs(trans, n, nrhs, dl, 0, d, 0, du, 0, du2, 0, ipiv, 0, b, 0, ldb, info);
  }

  public void sgttrs(String trans, int n, int nrhs, float[] dl, int offsetdl, float[] d, int offsetd, float[] du, int offsetdu, float[] du2, int offsetdu2, int[] ipiv, int offsetipiv, float[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sgttrsK(trans, n, nrhs, dl, offsetdl, d, offsetd, du, offsetdu, du2, offsetdu2, ipiv, offsetipiv, b, offsetb, ldb, info);
  }

  protected abstract void sgttrsK(String trans, int n, int nrhs, float[] dl, int offsetdl, float[] d, int offsetd, float[] du, int offsetdu, float[] du2, int offsetdu2, int[] ipiv, int offsetipiv, float[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void sgtts2(int itrans, int n, int nrhs, float[] dl, float[] d, float[] du, float[] du2, int[] ipiv, float[] b, int ldb) {
    sgtts2(itrans, n, nrhs, dl, 0, d, 0, du, 0, du2, 0, ipiv, 0, b, 0, ldb);
  }

  public void sgtts2(int itrans, int n, int nrhs, float[] dl, int offsetdl, float[] d, int offsetd, float[] du, int offsetdu, float[] du2, int offsetdu2, int[] ipiv, int offsetipiv, float[] b, int offsetb, int ldb) {
    //FIXME Add arguments check
    sgtts2K(itrans, n, nrhs, dl, offsetdl, d, offsetd, du, offsetdu, du2, offsetdu2, ipiv, offsetipiv, b, offsetb, ldb);
  }

  protected abstract void sgtts2K(int itrans, int n, int nrhs, float[] dl, int offsetdl, float[] d, int offsetd, float[] du, int offsetdu, float[] du2, int offsetdu2, int[] ipiv, int offsetipiv, float[] b, int offsetb, int ldb);

  public void shgeqz(String job, String compq, String compz, int n, int ilo, int ihi, float[] h, int ldh, float[] t, int ldt, float[] alphar, float[] alphai, float[] beta, float[] q, int ldq, float[] z, int ldz, float[] work, int lwork, org.netlib.util.intW info) {
    shgeqz(job, compq, compz, n, ilo, ihi, h, 0, ldh, t, 0, ldt, alphar, 0, alphai, 0, beta, 0, q, 0, ldq, z, 0, ldz, work, 0, lwork, info);
  }

  public void shgeqz(String job, String compq, String compz, int n, int ilo, int ihi, float[] h, int offseth, int ldh, float[] t, int offsett, int ldt, float[] alphar, int offsetalphar, float[] alphai, int offsetalphai, float[] beta, int offsetbeta, float[] q, int offsetq, int ldq, float[] z, int offsetz, int ldz, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    shgeqzK(job, compq, compz, n, ilo, ihi, h, offseth, ldh, t, offsett, ldt, alphar, offsetalphar, alphai, offsetalphai, beta, offsetbeta, q, offsetq, ldq, z, offsetz, ldz, work, offsetwork, lwork, info);
  }

  protected abstract void shgeqzK(String job, String compq, String compz, int n, int ilo, int ihi, float[] h, int offseth, int ldh, float[] t, int offsett, int ldt, float[] alphar, int offsetalphar, float[] alphai, int offsetalphai, float[] beta, int offsetbeta, float[] q, int offsetq, int ldq, float[] z, int offsetz, int ldz, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void shsein(String side, String eigsrc, String initv, boolean[] select, int n, float[] h, int ldh, float[] wr, float[] wi, float[] vl, int ldvl, float[] vr, int ldvr, int mm, org.netlib.util.intW m, float[] work, int[] ifaill, int[] ifailr, org.netlib.util.intW info) {
    shsein(side, eigsrc, initv, select, 0, n, h, 0, ldh, wr, 0, wi, 0, vl, 0, ldvl, vr, 0, ldvr, mm, m, work, 0, ifaill, 0, ifailr, 0, info);
  }

  public void shsein(String side, String eigsrc, String initv, boolean[] select, int offsetselect, int n, float[] h, int offseth, int ldh, float[] wr, int offsetwr, float[] wi, int offsetwi, float[] vl, int offsetvl, int ldvl, float[] vr, int offsetvr, int ldvr, int mm, org.netlib.util.intW m, float[] work, int offsetwork, int[] ifaill, int offsetifaill, int[] ifailr, int offsetifailr, org.netlib.util.intW info) {
    //FIXME Add arguments check
    shseinK(side, eigsrc, initv, select, offsetselect, n, h, offseth, ldh, wr, offsetwr, wi, offsetwi, vl, offsetvl, ldvl, vr, offsetvr, ldvr, mm, m, work, offsetwork, ifaill, offsetifaill, ifailr, offsetifailr, info);
  }

  protected abstract void shseinK(String side, String eigsrc, String initv, boolean[] select, int offsetselect, int n, float[] h, int offseth, int ldh, float[] wr, int offsetwr, float[] wi, int offsetwi, float[] vl, int offsetvl, int ldvl, float[] vr, int offsetvr, int ldvr, int mm, org.netlib.util.intW m, float[] work, int offsetwork, int[] ifaill, int offsetifaill, int[] ifailr, int offsetifailr, org.netlib.util.intW info);

  public void shseqr(String job, String compz, int n, int ilo, int ihi, float[] h, int ldh, float[] wr, float[] wi, float[] z, int ldz, float[] work, int lwork, org.netlib.util.intW info) {
    shseqr(job, compz, n, ilo, ihi, h, 0, ldh, wr, 0, wi, 0, z, 0, ldz, work, 0, lwork, info);
  }

  public void shseqr(String job, String compz, int n, int ilo, int ihi, float[] h, int offseth, int ldh, float[] wr, int offsetwr, float[] wi, int offsetwi, float[] z, int offsetz, int ldz, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    shseqrK(job, compz, n, ilo, ihi, h, offseth, ldh, wr, offsetwr, wi, offsetwi, z, offsetz, ldz, work, offsetwork, lwork, info);
  }

  protected abstract void shseqrK(String job, String compz, int n, int ilo, int ihi, float[] h, int offseth, int ldh, float[] wr, int offsetwr, float[] wi, int offsetwi, float[] z, int offsetz, int ldz, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public boolean sisnan(float sin) {
    return sisnanK(sin);
  }

  protected abstract boolean sisnanK(float sin);

  public void slabad(org.netlib.util.floatW small, org.netlib.util.floatW large) {
    slabadK(small, large);
  }

  protected abstract void slabadK(org.netlib.util.floatW small, org.netlib.util.floatW large);

  public void slabrd(int m, int n, int nb, float[] a, int lda, float[] d, float[] e, float[] tauq, float[] taup, float[] x, int ldx, float[] y, int ldy) {
    slabrd(m, n, nb, a, 0, lda, d, 0, e, 0, tauq, 0, taup, 0, x, 0, ldx, y, 0, ldy);
  }

  public void slabrd(int m, int n, int nb, float[] a, int offseta, int lda, float[] d, int offsetd, float[] e, int offsete, float[] tauq, int offsettauq, float[] taup, int offsettaup, float[] x, int offsetx, int ldx, float[] y, int offsety, int ldy) {
    //FIXME Add arguments check
    slabrdK(m, n, nb, a, offseta, lda, d, offsetd, e, offsete, tauq, offsettauq, taup, offsettaup, x, offsetx, ldx, y, offsety, ldy);
  }

  protected abstract void slabrdK(int m, int n, int nb, float[] a, int offseta, int lda, float[] d, int offsetd, float[] e, int offsete, float[] tauq, int offsettauq, float[] taup, int offsettaup, float[] x, int offsetx, int ldx, float[] y, int offsety, int ldy);

  public void slacn2(int n, float[] v, float[] x, int[] isgn, org.netlib.util.floatW est, org.netlib.util.intW kase, int[] isave) {
    slacn2(n, v, 0, x, 0, isgn, 0, est, kase, isave, 0);
  }

  public void slacn2(int n, float[] v, int offsetv, float[] x, int offsetx, int[] isgn, int offsetisgn, org.netlib.util.floatW est, org.netlib.util.intW kase, int[] isave, int offsetisave) {
    //FIXME Add arguments check
    slacn2K(n, v, offsetv, x, offsetx, isgn, offsetisgn, est, kase, isave, offsetisave);
  }

  protected abstract void slacn2K(int n, float[] v, int offsetv, float[] x, int offsetx, int[] isgn, int offsetisgn, org.netlib.util.floatW est, org.netlib.util.intW kase, int[] isave, int offsetisave);

  public void slacon(int n, float[] v, float[] x, int[] isgn, org.netlib.util.floatW est, org.netlib.util.intW kase) {
    slacon(n, v, 0, x, 0, isgn, 0, est, kase);
  }

  public void slacon(int n, float[] v, int offsetv, float[] x, int offsetx, int[] isgn, int offsetisgn, org.netlib.util.floatW est, org.netlib.util.intW kase) {
    //FIXME Add arguments check
    slaconK(n, v, offsetv, x, offsetx, isgn, offsetisgn, est, kase);
  }

  protected abstract void slaconK(int n, float[] v, int offsetv, float[] x, int offsetx, int[] isgn, int offsetisgn, org.netlib.util.floatW est, org.netlib.util.intW kase);

  public void slacpy(String uplo, int m, int n, float[] a, int lda, float[] b, int ldb) {
    slacpy(uplo, m, n, a, 0, lda, b, 0, ldb);
  }

  public void slacpy(String uplo, int m, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb) {
    //FIXME Add arguments check
    slacpyK(uplo, m, n, a, offseta, lda, b, offsetb, ldb);
  }

  protected abstract void slacpyK(String uplo, int m, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb);

  public void sladiv(float a, float b, float c, float d, org.netlib.util.floatW p, org.netlib.util.floatW q) {
    sladivK(a, b, c, d, p, q);
  }

  protected abstract void sladivK(float a, float b, float c, float d, org.netlib.util.floatW p, org.netlib.util.floatW q);

  public void slae2(float a, float b, float c, org.netlib.util.floatW rt1, org.netlib.util.floatW rt2) {
    slae2K(a, b, c, rt1, rt2);
  }

  protected abstract void slae2K(float a, float b, float c, org.netlib.util.floatW rt1, org.netlib.util.floatW rt2);

  public void slaebz(int ijob, int nitmax, int n, int mmax, int minp, int nbmin, float abstol, float reltol, float pivmin, float[] d, float[] e, float[] e2, int[] nval, float[] ab, float[] c, org.netlib.util.intW mout, int[] nab, float[] work, int[] iwork, org.netlib.util.intW info) {
    slaebz(ijob, nitmax, n, mmax, minp, nbmin, abstol, reltol, pivmin, d, 0, e, 0, e2, 0, nval, 0, ab, 0, c, 0, mout, nab, 0, work, 0, iwork, 0, info);
  }

  public void slaebz(int ijob, int nitmax, int n, int mmax, int minp, int nbmin, float abstol, float reltol, float pivmin, float[] d, int offsetd, float[] e, int offsete, float[] e2, int offsete2, int[] nval, int offsetnval, float[] ab, int offsetab, float[] c, int offsetc, org.netlib.util.intW mout, int[] nab, int offsetnab, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slaebzK(ijob, nitmax, n, mmax, minp, nbmin, abstol, reltol, pivmin, d, offsetd, e, offsete, e2, offsete2, nval, offsetnval, ab, offsetab, c, offsetc, mout, nab, offsetnab, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void slaebzK(int ijob, int nitmax, int n, int mmax, int minp, int nbmin, float abstol, float reltol, float pivmin, float[] d, int offsetd, float[] e, int offsete, float[] e2, int offsete2, int[] nval, int offsetnval, float[] ab, int offsetab, float[] c, int offsetc, org.netlib.util.intW mout, int[] nab, int offsetnab, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void slaed0(int icompq, int qsiz, int n, float[] d, float[] e, float[] q, int ldq, float[] qstore, int ldqs, float[] work, int[] iwork, org.netlib.util.intW info) {
    slaed0(icompq, qsiz, n, d, 0, e, 0, q, 0, ldq, qstore, 0, ldqs, work, 0, iwork, 0, info);
  }

  public void slaed0(int icompq, int qsiz, int n, float[] d, int offsetd, float[] e, int offsete, float[] q, int offsetq, int ldq, float[] qstore, int offsetqstore, int ldqs, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slaed0K(icompq, qsiz, n, d, offsetd, e, offsete, q, offsetq, ldq, qstore, offsetqstore, ldqs, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void slaed0K(int icompq, int qsiz, int n, float[] d, int offsetd, float[] e, int offsete, float[] q, int offsetq, int ldq, float[] qstore, int offsetqstore, int ldqs, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void slaed1(int n, float[] d, float[] q, int ldq, int[] indxq, org.netlib.util.floatW rho, int cutpnt, float[] work, int[] iwork, org.netlib.util.intW info) {
    slaed1(n, d, 0, q, 0, ldq, indxq, 0, rho, cutpnt, work, 0, iwork, 0, info);
  }

  public void slaed1(int n, float[] d, int offsetd, float[] q, int offsetq, int ldq, int[] indxq, int offsetindxq, org.netlib.util.floatW rho, int cutpnt, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slaed1K(n, d, offsetd, q, offsetq, ldq, indxq, offsetindxq, rho, cutpnt, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void slaed1K(int n, float[] d, int offsetd, float[] q, int offsetq, int ldq, int[] indxq, int offsetindxq, org.netlib.util.floatW rho, int cutpnt, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void slaed2(org.netlib.util.intW k, int n, int n1, float[] d, float[] q, int ldq, int[] indxq, org.netlib.util.floatW rho, float[] z, float[] dlamda, float[] w, float[] q2, int[] indx, int[] indxc, int[] indxp, int[] coltyp, org.netlib.util.intW info) {
    slaed2(k, n, n1, d, 0, q, 0, ldq, indxq, 0, rho, z, 0, dlamda, 0, w, 0, q2, 0, indx, 0, indxc, 0, indxp, 0, coltyp, 0, info);
  }

  public void slaed2(org.netlib.util.intW k, int n, int n1, float[] d, int offsetd, float[] q, int offsetq, int ldq, int[] indxq, int offsetindxq, org.netlib.util.floatW rho, float[] z, int offsetz, float[] dlamda, int offsetdlamda, float[] w, int offsetw, float[] q2, int offsetq2, int[] indx, int offsetindx, int[] indxc, int offsetindxc, int[] indxp, int offsetindxp, int[] coltyp, int offsetcoltyp, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slaed2K(k, n, n1, d, offsetd, q, offsetq, ldq, indxq, offsetindxq, rho, z, offsetz, dlamda, offsetdlamda, w, offsetw, q2, offsetq2, indx, offsetindx, indxc, offsetindxc, indxp, offsetindxp, coltyp, offsetcoltyp, info);
  }

  protected abstract void slaed2K(org.netlib.util.intW k, int n, int n1, float[] d, int offsetd, float[] q, int offsetq, int ldq, int[] indxq, int offsetindxq, org.netlib.util.floatW rho, float[] z, int offsetz, float[] dlamda, int offsetdlamda, float[] w, int offsetw, float[] q2, int offsetq2, int[] indx, int offsetindx, int[] indxc, int offsetindxc, int[] indxp, int offsetindxp, int[] coltyp, int offsetcoltyp, org.netlib.util.intW info);

  public void slaed3(int k, int n, int n1, float[] d, float[] q, int ldq, float rho, float[] dlamda, float[] q2, int[] indx, int[] ctot, float[] w, float[] s, org.netlib.util.intW info) {
    slaed3(k, n, n1, d, 0, q, 0, ldq, rho, dlamda, 0, q2, 0, indx, 0, ctot, 0, w, 0, s, 0, info);
  }

  public void slaed3(int k, int n, int n1, float[] d, int offsetd, float[] q, int offsetq, int ldq, float rho, float[] dlamda, int offsetdlamda, float[] q2, int offsetq2, int[] indx, int offsetindx, int[] ctot, int offsetctot, float[] w, int offsetw, float[] s, int offsets, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slaed3K(k, n, n1, d, offsetd, q, offsetq, ldq, rho, dlamda, offsetdlamda, q2, offsetq2, indx, offsetindx, ctot, offsetctot, w, offsetw, s, offsets, info);
  }

  protected abstract void slaed3K(int k, int n, int n1, float[] d, int offsetd, float[] q, int offsetq, int ldq, float rho, float[] dlamda, int offsetdlamda, float[] q2, int offsetq2, int[] indx, int offsetindx, int[] ctot, int offsetctot, float[] w, int offsetw, float[] s, int offsets, org.netlib.util.intW info);

  public void slaed4(int n, int i, float[] d, float[] z, float[] delta, float rho, org.netlib.util.floatW dlam, org.netlib.util.intW info) {
    slaed4(n, i, d, 0, z, 0, delta, 0, rho, dlam, info);
  }

  public void slaed4(int n, int i, float[] d, int offsetd, float[] z, int offsetz, float[] delta, int offsetdelta, float rho, org.netlib.util.floatW dlam, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slaed4K(n, i, d, offsetd, z, offsetz, delta, offsetdelta, rho, dlam, info);
  }

  protected abstract void slaed4K(int n, int i, float[] d, int offsetd, float[] z, int offsetz, float[] delta, int offsetdelta, float rho, org.netlib.util.floatW dlam, org.netlib.util.intW info);

  public void slaed5(int i, float[] d, float[] z, float[] delta, float rho, org.netlib.util.floatW dlam) {
    slaed5(i, d, 0, z, 0, delta, 0, rho, dlam);
  }

  public void slaed5(int i, float[] d, int offsetd, float[] z, int offsetz, float[] delta, int offsetdelta, float rho, org.netlib.util.floatW dlam) {
    //FIXME Add arguments check
    slaed5K(i, d, offsetd, z, offsetz, delta, offsetdelta, rho, dlam);
  }

  protected abstract void slaed5K(int i, float[] d, int offsetd, float[] z, int offsetz, float[] delta, int offsetdelta, float rho, org.netlib.util.floatW dlam);

  public void slaed6(int kniter, boolean orgati, float rho, float[] d, float[] z, float finit, org.netlib.util.floatW tau, org.netlib.util.intW info) {
    slaed6(kniter, orgati, rho, d, 0, z, 0, finit, tau, info);
  }

  public void slaed6(int kniter, boolean orgati, float rho, float[] d, int offsetd, float[] z, int offsetz, float finit, org.netlib.util.floatW tau, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slaed6K(kniter, orgati, rho, d, offsetd, z, offsetz, finit, tau, info);
  }

  protected abstract void slaed6K(int kniter, boolean orgati, float rho, float[] d, int offsetd, float[] z, int offsetz, float finit, org.netlib.util.floatW tau, org.netlib.util.intW info);

  public void slaed7(int icompq, int n, int qsiz, int tlvls, int curlvl, int curpbm, float[] d, float[] q, int ldq, int[] indxq, org.netlib.util.floatW rho, int cutpnt, float[] qstore, int[] qptr, int[] prmptr, int[] perm, int[] givptr, int[] givcol, float[] givnum, float[] work, int[] iwork, org.netlib.util.intW info) {
    slaed7(icompq, n, qsiz, tlvls, curlvl, curpbm, d, 0, q, 0, ldq, indxq, 0, rho, cutpnt, qstore, 0, qptr, 0, prmptr, 0, perm, 0, givptr, 0, givcol, 0, givnum, 0, work, 0, iwork, 0, info);
  }

  public void slaed7(int icompq, int n, int qsiz, int tlvls, int curlvl, int curpbm, float[] d, int offsetd, float[] q, int offsetq, int ldq, int[] indxq, int offsetindxq, org.netlib.util.floatW rho, int cutpnt, float[] qstore, int offsetqstore, int[] qptr, int offsetqptr, int[] prmptr, int offsetprmptr, int[] perm, int offsetperm, int[] givptr, int offsetgivptr, int[] givcol, int offsetgivcol, float[] givnum, int offsetgivnum, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slaed7K(icompq, n, qsiz, tlvls, curlvl, curpbm, d, offsetd, q, offsetq, ldq, indxq, offsetindxq, rho, cutpnt, qstore, offsetqstore, qptr, offsetqptr, prmptr, offsetprmptr, perm, offsetperm, givptr, offsetgivptr, givcol, offsetgivcol, givnum, offsetgivnum, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void slaed7K(int icompq, int n, int qsiz, int tlvls, int curlvl, int curpbm, float[] d, int offsetd, float[] q, int offsetq, int ldq, int[] indxq, int offsetindxq, org.netlib.util.floatW rho, int cutpnt, float[] qstore, int offsetqstore, int[] qptr, int offsetqptr, int[] prmptr, int offsetprmptr, int[] perm, int offsetperm, int[] givptr, int offsetgivptr, int[] givcol, int offsetgivcol, float[] givnum, int offsetgivnum, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void slaed8(int icompq, org.netlib.util.intW k, int n, int qsiz, float[] d, float[] q, int ldq, int[] indxq, org.netlib.util.floatW rho, int cutpnt, float[] z, float[] dlamda, float[] q2, int ldq2, float[] w, int[] perm, org.netlib.util.intW givptr, int[] givcol, float[] givnum, int[] indxp, int[] indx, org.netlib.util.intW info) {
    slaed8(icompq, k, n, qsiz, d, 0, q, 0, ldq, indxq, 0, rho, cutpnt, z, 0, dlamda, 0, q2, 0, ldq2, w, 0, perm, 0, givptr, givcol, 0, givnum, 0, indxp, 0, indx, 0, info);
  }

  public void slaed8(int icompq, org.netlib.util.intW k, int n, int qsiz, float[] d, int offsetd, float[] q, int offsetq, int ldq, int[] indxq, int offsetindxq, org.netlib.util.floatW rho, int cutpnt, float[] z, int offsetz, float[] dlamda, int offsetdlamda, float[] q2, int offsetq2, int ldq2, float[] w, int offsetw, int[] perm, int offsetperm, org.netlib.util.intW givptr, int[] givcol, int offsetgivcol, float[] givnum, int offsetgivnum, int[] indxp, int offsetindxp, int[] indx, int offsetindx, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slaed8K(icompq, k, n, qsiz, d, offsetd, q, offsetq, ldq, indxq, offsetindxq, rho, cutpnt, z, offsetz, dlamda, offsetdlamda, q2, offsetq2, ldq2, w, offsetw, perm, offsetperm, givptr, givcol, offsetgivcol, givnum, offsetgivnum, indxp, offsetindxp, indx, offsetindx, info);
  }

  protected abstract void slaed8K(int icompq, org.netlib.util.intW k, int n, int qsiz, float[] d, int offsetd, float[] q, int offsetq, int ldq, int[] indxq, int offsetindxq, org.netlib.util.floatW rho, int cutpnt, float[] z, int offsetz, float[] dlamda, int offsetdlamda, float[] q2, int offsetq2, int ldq2, float[] w, int offsetw, int[] perm, int offsetperm, org.netlib.util.intW givptr, int[] givcol, int offsetgivcol, float[] givnum, int offsetgivnum, int[] indxp, int offsetindxp, int[] indx, int offsetindx, org.netlib.util.intW info);

  public void slaed9(int k, int kstart, int kstop, int n, float[] d, float[] q, int ldq, float rho, float[] dlamda, float[] w, float[] s, int lds, org.netlib.util.intW info) {
    slaed9(k, kstart, kstop, n, d, 0, q, 0, ldq, rho, dlamda, 0, w, 0, s, 0, lds, info);
  }

  public void slaed9(int k, int kstart, int kstop, int n, float[] d, int offsetd, float[] q, int offsetq, int ldq, float rho, float[] dlamda, int offsetdlamda, float[] w, int offsetw, float[] s, int offsets, int lds, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slaed9K(k, kstart, kstop, n, d, offsetd, q, offsetq, ldq, rho, dlamda, offsetdlamda, w, offsetw, s, offsets, lds, info);
  }

  protected abstract void slaed9K(int k, int kstart, int kstop, int n, float[] d, int offsetd, float[] q, int offsetq, int ldq, float rho, float[] dlamda, int offsetdlamda, float[] w, int offsetw, float[] s, int offsets, int lds, org.netlib.util.intW info);

  public void slaeda(int n, int tlvls, int curlvl, int curpbm, int[] prmptr, int[] perm, int[] givptr, int[] givcol, float[] givnum, float[] q, int[] qptr, float[] z, float[] ztemp, org.netlib.util.intW info) {
    slaeda(n, tlvls, curlvl, curpbm, prmptr, 0, perm, 0, givptr, 0, givcol, 0, givnum, 0, q, 0, qptr, 0, z, 0, ztemp, 0, info);
  }

  public void slaeda(int n, int tlvls, int curlvl, int curpbm, int[] prmptr, int offsetprmptr, int[] perm, int offsetperm, int[] givptr, int offsetgivptr, int[] givcol, int offsetgivcol, float[] givnum, int offsetgivnum, float[] q, int offsetq, int[] qptr, int offsetqptr, float[] z, int offsetz, float[] ztemp, int offsetztemp, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slaedaK(n, tlvls, curlvl, curpbm, prmptr, offsetprmptr, perm, offsetperm, givptr, offsetgivptr, givcol, offsetgivcol, givnum, offsetgivnum, q, offsetq, qptr, offsetqptr, z, offsetz, ztemp, offsetztemp, info);
  }

  protected abstract void slaedaK(int n, int tlvls, int curlvl, int curpbm, int[] prmptr, int offsetprmptr, int[] perm, int offsetperm, int[] givptr, int offsetgivptr, int[] givcol, int offsetgivcol, float[] givnum, int offsetgivnum, float[] q, int offsetq, int[] qptr, int offsetqptr, float[] z, int offsetz, float[] ztemp, int offsetztemp, org.netlib.util.intW info);

  public void slaein(boolean rightv, boolean noinit, int n, float[] h, int ldh, float wr, float wi, float[] vr, float[] vi, float[] b, int ldb, float[] work, float eps3, float smlnum, float bignum, org.netlib.util.intW info) {
    slaein(rightv, noinit, n, h, 0, ldh, wr, wi, vr, 0, vi, 0, b, 0, ldb, work, 0, eps3, smlnum, bignum, info);
  }

  public void slaein(boolean rightv, boolean noinit, int n, float[] h, int offseth, int ldh, float wr, float wi, float[] vr, int offsetvr, float[] vi, int offsetvi, float[] b, int offsetb, int ldb, float[] work, int offsetwork, float eps3, float smlnum, float bignum, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slaeinK(rightv, noinit, n, h, offseth, ldh, wr, wi, vr, offsetvr, vi, offsetvi, b, offsetb, ldb, work, offsetwork, eps3, smlnum, bignum, info);
  }

  protected abstract void slaeinK(boolean rightv, boolean noinit, int n, float[] h, int offseth, int ldh, float wr, float wi, float[] vr, int offsetvr, float[] vi, int offsetvi, float[] b, int offsetb, int ldb, float[] work, int offsetwork, float eps3, float smlnum, float bignum, org.netlib.util.intW info);

  public void slaev2(float a, float b, float c, org.netlib.util.floatW rt1, org.netlib.util.floatW rt2, org.netlib.util.floatW cs1, org.netlib.util.floatW sn1) {
    slaev2K(a, b, c, rt1, rt2, cs1, sn1);
  }

  protected abstract void slaev2K(float a, float b, float c, org.netlib.util.floatW rt1, org.netlib.util.floatW rt2, org.netlib.util.floatW cs1, org.netlib.util.floatW sn1);

  public void slaexc(boolean wantq, int n, float[] t, int ldt, float[] q, int ldq, int j1, int n1, int n2, float[] work, org.netlib.util.intW info) {
    slaexc(wantq, n, t, 0, ldt, q, 0, ldq, j1, n1, n2, work, 0, info);
  }

  public void slaexc(boolean wantq, int n, float[] t, int offsett, int ldt, float[] q, int offsetq, int ldq, int j1, int n1, int n2, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slaexcK(wantq, n, t, offsett, ldt, q, offsetq, ldq, j1, n1, n2, work, offsetwork, info);
  }

  protected abstract void slaexcK(boolean wantq, int n, float[] t, int offsett, int ldt, float[] q, int offsetq, int ldq, int j1, int n1, int n2, float[] work, int offsetwork, org.netlib.util.intW info);

  public void slag2(float[] a, int lda, float[] b, int ldb, float safmin, org.netlib.util.floatW scale1, org.netlib.util.floatW scale2, org.netlib.util.floatW wr1, org.netlib.util.floatW wr2, org.netlib.util.floatW wi) {
    slag2(a, 0, lda, b, 0, ldb, safmin, scale1, scale2, wr1, wr2, wi);
  }

  public void slag2(float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float safmin, org.netlib.util.floatW scale1, org.netlib.util.floatW scale2, org.netlib.util.floatW wr1, org.netlib.util.floatW wr2, org.netlib.util.floatW wi) {
    //FIXME Add arguments check
    slag2K(a, offseta, lda, b, offsetb, ldb, safmin, scale1, scale2, wr1, wr2, wi);
  }

  protected abstract void slag2K(float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float safmin, org.netlib.util.floatW scale1, org.netlib.util.floatW scale2, org.netlib.util.floatW wr1, org.netlib.util.floatW wr2, org.netlib.util.floatW wi);

  public void slag2d(int m, int n, float[] sa, int ldsa, double[] a, int lda, org.netlib.util.intW info) {
    slag2d(m, n, sa, 0, ldsa, a, 0, lda, info);
  }

  public void slag2d(int m, int n, float[] sa, int offsetsa, int ldsa, double[] a, int offseta, int lda, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slag2dK(m, n, sa, offsetsa, ldsa, a, offseta, lda, info);
  }

  protected abstract void slag2dK(int m, int n, float[] sa, int offsetsa, int ldsa, double[] a, int offseta, int lda, org.netlib.util.intW info);

  public void slags2(boolean upper, float a1, float a2, float a3, float b1, float b2, float b3, org.netlib.util.floatW csu, org.netlib.util.floatW snu, org.netlib.util.floatW csv, org.netlib.util.floatW snv, org.netlib.util.floatW csq, org.netlib.util.floatW snq) {
    slags2K(upper, a1, a2, a3, b1, b2, b3, csu, snu, csv, snv, csq, snq);
  }

  protected abstract void slags2K(boolean upper, float a1, float a2, float a3, float b1, float b2, float b3, org.netlib.util.floatW csu, org.netlib.util.floatW snu, org.netlib.util.floatW csv, org.netlib.util.floatW snv, org.netlib.util.floatW csq, org.netlib.util.floatW snq);

  public void slagtf(int n, float[] a, float lambda, float[] b, float[] c, float tol, float[] d, int[] in, org.netlib.util.intW info) {
    slagtf(n, a, 0, lambda, b, 0, c, 0, tol, d, 0, in, 0, info);
  }

  public void slagtf(int n, float[] a, int offseta, float lambda, float[] b, int offsetb, float[] c, int offsetc, float tol, float[] d, int offsetd, int[] in, int offsetin, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slagtfK(n, a, offseta, lambda, b, offsetb, c, offsetc, tol, d, offsetd, in, offsetin, info);
  }

  protected abstract void slagtfK(int n, float[] a, int offseta, float lambda, float[] b, int offsetb, float[] c, int offsetc, float tol, float[] d, int offsetd, int[] in, int offsetin, org.netlib.util.intW info);

  public void slagtm(String trans, int n, int nrhs, float alpha, float[] dl, float[] d, float[] du, float[] x, int ldx, float beta, float[] b, int ldb) {
    slagtm(trans, n, nrhs, alpha, dl, 0, d, 0, du, 0, x, 0, ldx, beta, b, 0, ldb);
  }

  public void slagtm(String trans, int n, int nrhs, float alpha, float[] dl, int offsetdl, float[] d, int offsetd, float[] du, int offsetdu, float[] x, int offsetx, int ldx, float beta, float[] b, int offsetb, int ldb) {
    //FIXME Add arguments check
    slagtmK(trans, n, nrhs, alpha, dl, offsetdl, d, offsetd, du, offsetdu, x, offsetx, ldx, beta, b, offsetb, ldb);
  }

  protected abstract void slagtmK(String trans, int n, int nrhs, float alpha, float[] dl, int offsetdl, float[] d, int offsetd, float[] du, int offsetdu, float[] x, int offsetx, int ldx, float beta, float[] b, int offsetb, int ldb);

  public void slagts(int job, int n, float[] a, float[] b, float[] c, float[] d, int[] in, float[] y, org.netlib.util.floatW tol, org.netlib.util.intW info) {
    slagts(job, n, a, 0, b, 0, c, 0, d, 0, in, 0, y, 0, tol, info);
  }

  public void slagts(int job, int n, float[] a, int offseta, float[] b, int offsetb, float[] c, int offsetc, float[] d, int offsetd, int[] in, int offsetin, float[] y, int offsety, org.netlib.util.floatW tol, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slagtsK(job, n, a, offseta, b, offsetb, c, offsetc, d, offsetd, in, offsetin, y, offsety, tol, info);
  }

  protected abstract void slagtsK(int job, int n, float[] a, int offseta, float[] b, int offsetb, float[] c, int offsetc, float[] d, int offsetd, int[] in, int offsetin, float[] y, int offsety, org.netlib.util.floatW tol, org.netlib.util.intW info);

  public void slagv2(float[] a, int lda, float[] b, int ldb, float[] alphar, float[] alphai, float[] beta, org.netlib.util.floatW csl, org.netlib.util.floatW snl, org.netlib.util.floatW csr, org.netlib.util.floatW snr) {
    slagv2(a, 0, lda, b, 0, ldb, alphar, 0, alphai, 0, beta, 0, csl, snl, csr, snr);
  }

  public void slagv2(float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] alphar, int offsetalphar, float[] alphai, int offsetalphai, float[] beta, int offsetbeta, org.netlib.util.floatW csl, org.netlib.util.floatW snl, org.netlib.util.floatW csr, org.netlib.util.floatW snr) {
    //FIXME Add arguments check
    slagv2K(a, offseta, lda, b, offsetb, ldb, alphar, offsetalphar, alphai, offsetalphai, beta, offsetbeta, csl, snl, csr, snr);
  }

  protected abstract void slagv2K(float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] alphar, int offsetalphar, float[] alphai, int offsetalphai, float[] beta, int offsetbeta, org.netlib.util.floatW csl, org.netlib.util.floatW snl, org.netlib.util.floatW csr, org.netlib.util.floatW snr);

  public void slahqr(boolean wantt, boolean wantz, int n, int ilo, int ihi, float[] h, int ldh, float[] wr, float[] wi, int iloz, int ihiz, float[] z, int ldz, org.netlib.util.intW info) {
    slahqr(wantt, wantz, n, ilo, ihi, h, 0, ldh, wr, 0, wi, 0, iloz, ihiz, z, 0, ldz, info);
  }

  public void slahqr(boolean wantt, boolean wantz, int n, int ilo, int ihi, float[] h, int offseth, int ldh, float[] wr, int offsetwr, float[] wi, int offsetwi, int iloz, int ihiz, float[] z, int offsetz, int ldz, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slahqrK(wantt, wantz, n, ilo, ihi, h, offseth, ldh, wr, offsetwr, wi, offsetwi, iloz, ihiz, z, offsetz, ldz, info);
  }

  protected abstract void slahqrK(boolean wantt, boolean wantz, int n, int ilo, int ihi, float[] h, int offseth, int ldh, float[] wr, int offsetwr, float[] wi, int offsetwi, int iloz, int ihiz, float[] z, int offsetz, int ldz, org.netlib.util.intW info);

  public void slahr2(int n, int k, int nb, float[] a, int lda, float[] tau, float[] t, int ldt, float[] y, int ldy) {
    slahr2(n, k, nb, a, 0, lda, tau, 0, t, 0, ldt, y, 0, ldy);
  }

  public void slahr2(int n, int k, int nb, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] t, int offsett, int ldt, float[] y, int offsety, int ldy) {
    //FIXME Add arguments check
    slahr2K(n, k, nb, a, offseta, lda, tau, offsettau, t, offsett, ldt, y, offsety, ldy);
  }

  protected abstract void slahr2K(int n, int k, int nb, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] t, int offsett, int ldt, float[] y, int offsety, int ldy);

  public void slahrd(int n, int k, int nb, float[] a, int lda, float[] tau, float[] t, int ldt, float[] y, int ldy) {
    slahrd(n, k, nb, a, 0, lda, tau, 0, t, 0, ldt, y, 0, ldy);
  }

  public void slahrd(int n, int k, int nb, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] t, int offsett, int ldt, float[] y, int offsety, int ldy) {
    //FIXME Add arguments check
    slahrdK(n, k, nb, a, offseta, lda, tau, offsettau, t, offsett, ldt, y, offsety, ldy);
  }

  protected abstract void slahrdK(int n, int k, int nb, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] t, int offsett, int ldt, float[] y, int offsety, int ldy);

  public void slaic1(int job, int j, float[] x, float sest, float[] w, float gamma, org.netlib.util.floatW sestpr, org.netlib.util.floatW s, org.netlib.util.floatW c) {
    slaic1(job, j, x, 0, sest, w, 0, gamma, sestpr, s, c);
  }

  public void slaic1(int job, int j, float[] x, int offsetx, float sest, float[] w, int offsetw, float gamma, org.netlib.util.floatW sestpr, org.netlib.util.floatW s, org.netlib.util.floatW c) {
    //FIXME Add arguments check
    slaic1K(job, j, x, offsetx, sest, w, offsetw, gamma, sestpr, s, c);
  }

  protected abstract void slaic1K(int job, int j, float[] x, int offsetx, float sest, float[] w, int offsetw, float gamma, org.netlib.util.floatW sestpr, org.netlib.util.floatW s, org.netlib.util.floatW c);

  public boolean slaisnan(float sin1, float sin2) {
    return slaisnanK(sin1, sin2);
  }

  protected abstract boolean slaisnanK(float sin1, float sin2);

  public void slaln2(boolean ltrans, int na, int nw, float smin, float ca, float[] a, int lda, float d1, float d2, float[] b, int ldb, float wr, float wi, float[] x, int ldx, org.netlib.util.floatW scale, org.netlib.util.floatW xnorm, org.netlib.util.intW info) {
    slaln2(ltrans, na, nw, smin, ca, a, 0, lda, d1, d2, b, 0, ldb, wr, wi, x, 0, ldx, scale, xnorm, info);
  }

  public void slaln2(boolean ltrans, int na, int nw, float smin, float ca, float[] a, int offseta, int lda, float d1, float d2, float[] b, int offsetb, int ldb, float wr, float wi, float[] x, int offsetx, int ldx, org.netlib.util.floatW scale, org.netlib.util.floatW xnorm, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slaln2K(ltrans, na, nw, smin, ca, a, offseta, lda, d1, d2, b, offsetb, ldb, wr, wi, x, offsetx, ldx, scale, xnorm, info);
  }

  protected abstract void slaln2K(boolean ltrans, int na, int nw, float smin, float ca, float[] a, int offseta, int lda, float d1, float d2, float[] b, int offsetb, int ldb, float wr, float wi, float[] x, int offsetx, int ldx, org.netlib.util.floatW scale, org.netlib.util.floatW xnorm, org.netlib.util.intW info);

  public void slals0(int icompq, int nl, int nr, int sqre, int nrhs, float[] b, int ldb, float[] bx, int ldbx, int[] perm, int givptr, int[] givcol, int ldgcol, float[] givnum, int ldgnum, float[] poles, float[] difl, float[] difr, float[] z, int k, float c, float s, float[] work, org.netlib.util.intW info) {
    slals0(icompq, nl, nr, sqre, nrhs, b, 0, ldb, bx, 0, ldbx, perm, 0, givptr, givcol, 0, ldgcol, givnum, 0, ldgnum, poles, 0, difl, 0, difr, 0, z, 0, k, c, s, work, 0, info);
  }

  public void slals0(int icompq, int nl, int nr, int sqre, int nrhs, float[] b, int offsetb, int ldb, float[] bx, int offsetbx, int ldbx, int[] perm, int offsetperm, int givptr, int[] givcol, int offsetgivcol, int ldgcol, float[] givnum, int offsetgivnum, int ldgnum, float[] poles, int offsetpoles, float[] difl, int offsetdifl, float[] difr, int offsetdifr, float[] z, int offsetz, int k, float c, float s, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slals0K(icompq, nl, nr, sqre, nrhs, b, offsetb, ldb, bx, offsetbx, ldbx, perm, offsetperm, givptr, givcol, offsetgivcol, ldgcol, givnum, offsetgivnum, ldgnum, poles, offsetpoles, difl, offsetdifl, difr, offsetdifr, z, offsetz, k, c, s, work, offsetwork, info);
  }

  protected abstract void slals0K(int icompq, int nl, int nr, int sqre, int nrhs, float[] b, int offsetb, int ldb, float[] bx, int offsetbx, int ldbx, int[] perm, int offsetperm, int givptr, int[] givcol, int offsetgivcol, int ldgcol, float[] givnum, int offsetgivnum, int ldgnum, float[] poles, int offsetpoles, float[] difl, int offsetdifl, float[] difr, int offsetdifr, float[] z, int offsetz, int k, float c, float s, float[] work, int offsetwork, org.netlib.util.intW info);

  public void slalsa(int icompq, int smlsiz, int n, int nrhs, float[] b, int ldb, float[] bx, int ldbx, float[] u, int ldu, float[] vt, int[] k, float[] difl, float[] difr, float[] z, float[] poles, int[] givptr, int[] givcol, int ldgcol, int[] perm, float[] givnum, float[] c, float[] s, float[] work, int[] iwork, org.netlib.util.intW info) {
    slalsa(icompq, smlsiz, n, nrhs, b, 0, ldb, bx, 0, ldbx, u, 0, ldu, vt, 0, k, 0, difl, 0, difr, 0, z, 0, poles, 0, givptr, 0, givcol, 0, ldgcol, perm, 0, givnum, 0, c, 0, s, 0, work, 0, iwork, 0, info);
  }

  public void slalsa(int icompq, int smlsiz, int n, int nrhs, float[] b, int offsetb, int ldb, float[] bx, int offsetbx, int ldbx, float[] u, int offsetu, int ldu, float[] vt, int offsetvt, int[] k, int offsetk, float[] difl, int offsetdifl, float[] difr, int offsetdifr, float[] z, int offsetz, float[] poles, int offsetpoles, int[] givptr, int offsetgivptr, int[] givcol, int offsetgivcol, int ldgcol, int[] perm, int offsetperm, float[] givnum, int offsetgivnum, float[] c, int offsetc, float[] s, int offsets, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slalsaK(icompq, smlsiz, n, nrhs, b, offsetb, ldb, bx, offsetbx, ldbx, u, offsetu, ldu, vt, offsetvt, k, offsetk, difl, offsetdifl, difr, offsetdifr, z, offsetz, poles, offsetpoles, givptr, offsetgivptr, givcol, offsetgivcol, ldgcol, perm, offsetperm, givnum, offsetgivnum, c, offsetc, s, offsets, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void slalsaK(int icompq, int smlsiz, int n, int nrhs, float[] b, int offsetb, int ldb, float[] bx, int offsetbx, int ldbx, float[] u, int offsetu, int ldu, float[] vt, int offsetvt, int[] k, int offsetk, float[] difl, int offsetdifl, float[] difr, int offsetdifr, float[] z, int offsetz, float[] poles, int offsetpoles, int[] givptr, int offsetgivptr, int[] givcol, int offsetgivcol, int ldgcol, int[] perm, int offsetperm, float[] givnum, int offsetgivnum, float[] c, int offsetc, float[] s, int offsets, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void slalsd(String uplo, int smlsiz, int n, int nrhs, float[] d, float[] e, float[] b, int ldb, float rcond, org.netlib.util.intW rank, float[] work, int[] iwork, org.netlib.util.intW info) {
    slalsd(uplo, smlsiz, n, nrhs, d, 0, e, 0, b, 0, ldb, rcond, rank, work, 0, iwork, 0, info);
  }

  public void slalsd(String uplo, int smlsiz, int n, int nrhs, float[] d, int offsetd, float[] e, int offsete, float[] b, int offsetb, int ldb, float rcond, org.netlib.util.intW rank, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slalsdK(uplo, smlsiz, n, nrhs, d, offsetd, e, offsete, b, offsetb, ldb, rcond, rank, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void slalsdK(String uplo, int smlsiz, int n, int nrhs, float[] d, int offsetd, float[] e, int offsete, float[] b, int offsetb, int ldb, float rcond, org.netlib.util.intW rank, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void slamrg(int n1, int n2, float[] a, int strd1, int strd2, int[] index) {
    slamrg(n1, n2, a, 0, strd1, strd2, index, 0);
  }

  public void slamrg(int n1, int n2, float[] a, int offseta, int strd1, int strd2, int[] index, int offsetindex) {
    //FIXME Add arguments check
    slamrgK(n1, n2, a, offseta, strd1, strd2, index, offsetindex);
  }

  protected abstract void slamrgK(int n1, int n2, float[] a, int offseta, int strd1, int strd2, int[] index, int offsetindex);

  public int slaneg(int n, float[] d, float[] lld, float sigma, float pivmin, int r) {
    return slaneg(n, d, 0, lld, 0, sigma, pivmin, r);
  }

  public int slaneg(int n, float[] d, int offsetd, float[] lld, int offsetlld, float sigma, float pivmin, int r) {
    //FIXME Add arguments check
    return slanegK(n, d, offsetd, lld, offsetlld, sigma, pivmin, r);
  }

  protected abstract int slanegK(int n, float[] d, int offsetd, float[] lld, int offsetlld, float sigma, float pivmin, int r);

  public float slangb(String norm, int n, int kl, int ku, float[] ab, int ldab, float[] work) {
    return slangb(norm, n, kl, ku, ab, 0, ldab, work, 0);
  }

  public float slangb(String norm, int n, int kl, int ku, float[] ab, int offsetab, int ldab, float[] work, int offsetwork) {
    //FIXME Add arguments check
    return slangbK(norm, n, kl, ku, ab, offsetab, ldab, work, offsetwork);
  }

  protected abstract float slangbK(String norm, int n, int kl, int ku, float[] ab, int offsetab, int ldab, float[] work, int offsetwork);

  public float slange(String norm, int m, int n, float[] a, int lda, float[] work) {
    return slange(norm, m, n, a, 0, lda, work, 0);
  }

  public float slange(String norm, int m, int n, float[] a, int offseta, int lda, float[] work, int offsetwork) {
    //FIXME Add arguments check
    return slangeK(norm, m, n, a, offseta, lda, work, offsetwork);
  }

  protected abstract float slangeK(String norm, int m, int n, float[] a, int offseta, int lda, float[] work, int offsetwork);

  public float slangt(String norm, int n, float[] dl, float[] d, float[] du) {
    return slangt(norm, n, dl, 0, d, 0, du, 0);
  }

  public float slangt(String norm, int n, float[] dl, int offsetdl, float[] d, int offsetd, float[] du, int offsetdu) {
    //FIXME Add arguments check
    return slangtK(norm, n, dl, offsetdl, d, offsetd, du, offsetdu);
  }

  protected abstract float slangtK(String norm, int n, float[] dl, int offsetdl, float[] d, int offsetd, float[] du, int offsetdu);

  public float slanhs(String norm, int n, float[] a, int lda, float[] work) {
    return slanhs(norm, n, a, 0, lda, work, 0);
  }

  public float slanhs(String norm, int n, float[] a, int offseta, int lda, float[] work, int offsetwork) {
    //FIXME Add arguments check
    return slanhsK(norm, n, a, offseta, lda, work, offsetwork);
  }

  protected abstract float slanhsK(String norm, int n, float[] a, int offseta, int lda, float[] work, int offsetwork);

  public float slansb(String norm, String uplo, int n, int k, float[] ab, int ldab, float[] work) {
    return slansb(norm, uplo, n, k, ab, 0, ldab, work, 0);
  }

  public float slansb(String norm, String uplo, int n, int k, float[] ab, int offsetab, int ldab, float[] work, int offsetwork) {
    //FIXME Add arguments check
    return slansbK(norm, uplo, n, k, ab, offsetab, ldab, work, offsetwork);
  }

  protected abstract float slansbK(String norm, String uplo, int n, int k, float[] ab, int offsetab, int ldab, float[] work, int offsetwork);

  public float slansp(String norm, String uplo, int n, float[] ap, float[] work) {
    return slansp(norm, uplo, n, ap, 0, work, 0);
  }

  public float slansp(String norm, String uplo, int n, float[] ap, int offsetap, float[] work, int offsetwork) {
    //FIXME Add arguments check
    return slanspK(norm, uplo, n, ap, offsetap, work, offsetwork);
  }

  protected abstract float slanspK(String norm, String uplo, int n, float[] ap, int offsetap, float[] work, int offsetwork);

  public float slanst(String norm, int n, float[] d, float[] e) {
    return slanst(norm, n, d, 0, e, 0);
  }

  public float slanst(String norm, int n, float[] d, int offsetd, float[] e, int offsete) {
    //FIXME Add arguments check
    return slanstK(norm, n, d, offsetd, e, offsete);
  }

  protected abstract float slanstK(String norm, int n, float[] d, int offsetd, float[] e, int offsete);

  public float slansy(String norm, String uplo, int n, float[] a, int lda, float[] work) {
    return slansy(norm, uplo, n, a, 0, lda, work, 0);
  }

  public float slansy(String norm, String uplo, int n, float[] a, int offseta, int lda, float[] work, int offsetwork) {
    //FIXME Add arguments check
    return slansyK(norm, uplo, n, a, offseta, lda, work, offsetwork);
  }

  protected abstract float slansyK(String norm, String uplo, int n, float[] a, int offseta, int lda, float[] work, int offsetwork);

  public float slantb(String norm, String uplo, String diag, int n, int k, float[] ab, int ldab, float[] work) {
    return slantb(norm, uplo, diag, n, k, ab, 0, ldab, work, 0);
  }

  public float slantb(String norm, String uplo, String diag, int n, int k, float[] ab, int offsetab, int ldab, float[] work, int offsetwork) {
    //FIXME Add arguments check
    return slantbK(norm, uplo, diag, n, k, ab, offsetab, ldab, work, offsetwork);
  }

  protected abstract float slantbK(String norm, String uplo, String diag, int n, int k, float[] ab, int offsetab, int ldab, float[] work, int offsetwork);

  public float slantp(String norm, String uplo, String diag, int n, float[] ap, float[] work) {
    return slantp(norm, uplo, diag, n, ap, 0, work, 0);
  }

  public float slantp(String norm, String uplo, String diag, int n, float[] ap, int offsetap, float[] work, int offsetwork) {
    //FIXME Add arguments check
    return slantpK(norm, uplo, diag, n, ap, offsetap, work, offsetwork);
  }

  protected abstract float slantpK(String norm, String uplo, String diag, int n, float[] ap, int offsetap, float[] work, int offsetwork);

  public float slantr(String norm, String uplo, String diag, int m, int n, float[] a, int lda, float[] work) {
    return slantr(norm, uplo, diag, m, n, a, 0, lda, work, 0);
  }

  public float slantr(String norm, String uplo, String diag, int m, int n, float[] a, int offseta, int lda, float[] work, int offsetwork) {
    //FIXME Add arguments check
    return slantrK(norm, uplo, diag, m, n, a, offseta, lda, work, offsetwork);
  }

  protected abstract float slantrK(String norm, String uplo, String diag, int m, int n, float[] a, int offseta, int lda, float[] work, int offsetwork);

  public void slanv2(org.netlib.util.floatW a, org.netlib.util.floatW b, org.netlib.util.floatW c, org.netlib.util.floatW d, org.netlib.util.floatW rt1r, org.netlib.util.floatW rt1i, org.netlib.util.floatW rt2r, org.netlib.util.floatW rt2i, org.netlib.util.floatW cs, org.netlib.util.floatW sn) {
    slanv2K(a, b, c, d, rt1r, rt1i, rt2r, rt2i, cs, sn);
  }

  protected abstract void slanv2K(org.netlib.util.floatW a, org.netlib.util.floatW b, org.netlib.util.floatW c, org.netlib.util.floatW d, org.netlib.util.floatW rt1r, org.netlib.util.floatW rt1i, org.netlib.util.floatW rt2r, org.netlib.util.floatW rt2i, org.netlib.util.floatW cs, org.netlib.util.floatW sn);

  public void slapll(int n, float[] x, int incx, float[] y, int incy, org.netlib.util.floatW ssmin) {
    slapll(n, x, 0, incx, y, 0, incy, ssmin);
  }

  public void slapll(int n, float[] x, int offsetx, int incx, float[] y, int offsety, int incy, org.netlib.util.floatW ssmin) {
    //FIXME Add arguments check
    slapllK(n, x, offsetx, incx, y, offsety, incy, ssmin);
  }

  protected abstract void slapllK(int n, float[] x, int offsetx, int incx, float[] y, int offsety, int incy, org.netlib.util.floatW ssmin);

  public void slapmt(boolean forwrd, int m, int n, float[] x, int ldx, int[] k) {
    slapmt(forwrd, m, n, x, 0, ldx, k, 0);
  }

  public void slapmt(boolean forwrd, int m, int n, float[] x, int offsetx, int ldx, int[] k, int offsetk) {
    //FIXME Add arguments check
    slapmtK(forwrd, m, n, x, offsetx, ldx, k, offsetk);
  }

  protected abstract void slapmtK(boolean forwrd, int m, int n, float[] x, int offsetx, int ldx, int[] k, int offsetk);

  public float slapy2(float x, float y) {
    return slapy2K(x, y);
  }

  protected abstract float slapy2K(float x, float y);

  public float slapy3(float x, float y, float z) {
    return slapy3K(x, y, z);
  }

  protected abstract float slapy3K(float x, float y, float z);

  public void slaqgb(int m, int n, int kl, int ku, float[] ab, int ldab, float[] r, float[] c, float rowcnd, float colcnd, float amax, org.netlib.util.StringW equed) {
    slaqgb(m, n, kl, ku, ab, 0, ldab, r, 0, c, 0, rowcnd, colcnd, amax, equed);
  }

  public void slaqgb(int m, int n, int kl, int ku, float[] ab, int offsetab, int ldab, float[] r, int offsetr, float[] c, int offsetc, float rowcnd, float colcnd, float amax, org.netlib.util.StringW equed) {
    //FIXME Add arguments check
    slaqgbK(m, n, kl, ku, ab, offsetab, ldab, r, offsetr, c, offsetc, rowcnd, colcnd, amax, equed);
  }

  protected abstract void slaqgbK(int m, int n, int kl, int ku, float[] ab, int offsetab, int ldab, float[] r, int offsetr, float[] c, int offsetc, float rowcnd, float colcnd, float amax, org.netlib.util.StringW equed);

  public void slaqge(int m, int n, float[] a, int lda, float[] r, float[] c, float rowcnd, float colcnd, float amax, org.netlib.util.StringW equed) {
    slaqge(m, n, a, 0, lda, r, 0, c, 0, rowcnd, colcnd, amax, equed);
  }

  public void slaqge(int m, int n, float[] a, int offseta, int lda, float[] r, int offsetr, float[] c, int offsetc, float rowcnd, float colcnd, float amax, org.netlib.util.StringW equed) {
    //FIXME Add arguments check
    slaqgeK(m, n, a, offseta, lda, r, offsetr, c, offsetc, rowcnd, colcnd, amax, equed);
  }

  protected abstract void slaqgeK(int m, int n, float[] a, int offseta, int lda, float[] r, int offsetr, float[] c, int offsetc, float rowcnd, float colcnd, float amax, org.netlib.util.StringW equed);

  public void slaqp2(int m, int n, int offset, float[] a, int lda, int[] jpvt, float[] tau, float[] vn1, float[] vn2, float[] work) {
    slaqp2(m, n, offset, a, 0, lda, jpvt, 0, tau, 0, vn1, 0, vn2, 0, work, 0);
  }

  public void slaqp2(int m, int n, int offset, float[] a, int offseta, int lda, int[] jpvt, int offsetjpvt, float[] tau, int offsettau, float[] vn1, int offsetvn1, float[] vn2, int offsetvn2, float[] work, int offsetwork) {
    //FIXME Add arguments check
    slaqp2K(m, n, offset, a, offseta, lda, jpvt, offsetjpvt, tau, offsettau, vn1, offsetvn1, vn2, offsetvn2, work, offsetwork);
  }

  protected abstract void slaqp2K(int m, int n, int offset, float[] a, int offseta, int lda, int[] jpvt, int offsetjpvt, float[] tau, int offsettau, float[] vn1, int offsetvn1, float[] vn2, int offsetvn2, float[] work, int offsetwork);

  public void slaqps(int m, int n, int offset, int nb, org.netlib.util.intW kb, float[] a, int lda, int[] jpvt, float[] tau, float[] vn1, float[] vn2, float[] auxv, float[] f, int ldf) {
    slaqps(m, n, offset, nb, kb, a, 0, lda, jpvt, 0, tau, 0, vn1, 0, vn2, 0, auxv, 0, f, 0, ldf);
  }

  public void slaqps(int m, int n, int offset, int nb, org.netlib.util.intW kb, float[] a, int offseta, int lda, int[] jpvt, int offsetjpvt, float[] tau, int offsettau, float[] vn1, int offsetvn1, float[] vn2, int offsetvn2, float[] auxv, int offsetauxv, float[] f, int offsetf, int ldf) {
    //FIXME Add arguments check
    slaqpsK(m, n, offset, nb, kb, a, offseta, lda, jpvt, offsetjpvt, tau, offsettau, vn1, offsetvn1, vn2, offsetvn2, auxv, offsetauxv, f, offsetf, ldf);
  }

  protected abstract void slaqpsK(int m, int n, int offset, int nb, org.netlib.util.intW kb, float[] a, int offseta, int lda, int[] jpvt, int offsetjpvt, float[] tau, int offsettau, float[] vn1, int offsetvn1, float[] vn2, int offsetvn2, float[] auxv, int offsetauxv, float[] f, int offsetf, int ldf);

  public void slaqr0(boolean wantt, boolean wantz, int n, int ilo, int ihi, float[] h, int ldh, float[] wr, float[] wi, int iloz, int ihiz, float[] z, int ldz, float[] work, int lwork, org.netlib.util.intW info) {
    slaqr0(wantt, wantz, n, ilo, ihi, h, 0, ldh, wr, 0, wi, 0, iloz, ihiz, z, 0, ldz, work, 0, lwork, info);
  }

  public void slaqr0(boolean wantt, boolean wantz, int n, int ilo, int ihi, float[] h, int offseth, int ldh, float[] wr, int offsetwr, float[] wi, int offsetwi, int iloz, int ihiz, float[] z, int offsetz, int ldz, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slaqr0K(wantt, wantz, n, ilo, ihi, h, offseth, ldh, wr, offsetwr, wi, offsetwi, iloz, ihiz, z, offsetz, ldz, work, offsetwork, lwork, info);
  }

  protected abstract void slaqr0K(boolean wantt, boolean wantz, int n, int ilo, int ihi, float[] h, int offseth, int ldh, float[] wr, int offsetwr, float[] wi, int offsetwi, int iloz, int ihiz, float[] z, int offsetz, int ldz, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void slaqr1(int n, float[] h, int ldh, float sr1, float si1, float sr2, float si2, float[] v) {
    slaqr1(n, h, 0, ldh, sr1, si1, sr2, si2, v, 0);
  }

  public void slaqr1(int n, float[] h, int offseth, int ldh, float sr1, float si1, float sr2, float si2, float[] v, int offsetv) {
    //FIXME Add arguments check
    slaqr1K(n, h, offseth, ldh, sr1, si1, sr2, si2, v, offsetv);
  }

  protected abstract void slaqr1K(int n, float[] h, int offseth, int ldh, float sr1, float si1, float sr2, float si2, float[] v, int offsetv);

  public void slaqr2(boolean wantt, boolean wantz, int n, int ktop, int kbot, int nw, float[] h, int ldh, int iloz, int ihiz, float[] z, int ldz, org.netlib.util.intW ns, org.netlib.util.intW nd, float[] sr, float[] si, float[] v, int ldv, int nh, float[] t, int ldt, int nv, float[] wv, int ldwv, float[] work, int lwork) {
    slaqr2(wantt, wantz, n, ktop, kbot, nw, h, 0, ldh, iloz, ihiz, z, 0, ldz, ns, nd, sr, 0, si, 0, v, 0, ldv, nh, t, 0, ldt, nv, wv, 0, ldwv, work, 0, lwork);
  }

  public void slaqr2(boolean wantt, boolean wantz, int n, int ktop, int kbot, int nw, float[] h, int offseth, int ldh, int iloz, int ihiz, float[] z, int offsetz, int ldz, org.netlib.util.intW ns, org.netlib.util.intW nd, float[] sr, int offsetsr, float[] si, int offsetsi, float[] v, int offsetv, int ldv, int nh, float[] t, int offsett, int ldt, int nv, float[] wv, int offsetwv, int ldwv, float[] work, int offsetwork, int lwork) {
    //FIXME Add arguments check
    slaqr2K(wantt, wantz, n, ktop, kbot, nw, h, offseth, ldh, iloz, ihiz, z, offsetz, ldz, ns, nd, sr, offsetsr, si, offsetsi, v, offsetv, ldv, nh, t, offsett, ldt, nv, wv, offsetwv, ldwv, work, offsetwork, lwork);
  }

  protected abstract void slaqr2K(boolean wantt, boolean wantz, int n, int ktop, int kbot, int nw, float[] h, int offseth, int ldh, int iloz, int ihiz, float[] z, int offsetz, int ldz, org.netlib.util.intW ns, org.netlib.util.intW nd, float[] sr, int offsetsr, float[] si, int offsetsi, float[] v, int offsetv, int ldv, int nh, float[] t, int offsett, int ldt, int nv, float[] wv, int offsetwv, int ldwv, float[] work, int offsetwork, int lwork);

  public void slaqr3(boolean wantt, boolean wantz, int n, int ktop, int kbot, int nw, float[] h, int ldh, int iloz, int ihiz, float[] z, int ldz, org.netlib.util.intW ns, org.netlib.util.intW nd, float[] sr, float[] si, float[] v, int ldv, int nh, float[] t, int ldt, int nv, float[] wv, int ldwv, float[] work, int lwork) {
    slaqr3(wantt, wantz, n, ktop, kbot, nw, h, 0, ldh, iloz, ihiz, z, 0, ldz, ns, nd, sr, 0, si, 0, v, 0, ldv, nh, t, 0, ldt, nv, wv, 0, ldwv, work, 0, lwork);
  }

  public void slaqr3(boolean wantt, boolean wantz, int n, int ktop, int kbot, int nw, float[] h, int offseth, int ldh, int iloz, int ihiz, float[] z, int offsetz, int ldz, org.netlib.util.intW ns, org.netlib.util.intW nd, float[] sr, int offsetsr, float[] si, int offsetsi, float[] v, int offsetv, int ldv, int nh, float[] t, int offsett, int ldt, int nv, float[] wv, int offsetwv, int ldwv, float[] work, int offsetwork, int lwork) {
    //FIXME Add arguments check
    slaqr3K(wantt, wantz, n, ktop, kbot, nw, h, offseth, ldh, iloz, ihiz, z, offsetz, ldz, ns, nd, sr, offsetsr, si, offsetsi, v, offsetv, ldv, nh, t, offsett, ldt, nv, wv, offsetwv, ldwv, work, offsetwork, lwork);
  }

  protected abstract void slaqr3K(boolean wantt, boolean wantz, int n, int ktop, int kbot, int nw, float[] h, int offseth, int ldh, int iloz, int ihiz, float[] z, int offsetz, int ldz, org.netlib.util.intW ns, org.netlib.util.intW nd, float[] sr, int offsetsr, float[] si, int offsetsi, float[] v, int offsetv, int ldv, int nh, float[] t, int offsett, int ldt, int nv, float[] wv, int offsetwv, int ldwv, float[] work, int offsetwork, int lwork);

  public void slaqr4(boolean wantt, boolean wantz, int n, int ilo, int ihi, float[] h, int ldh, float[] wr, float[] wi, int iloz, int ihiz, float[] z, int ldz, float[] work, int lwork, org.netlib.util.intW info) {
    slaqr4(wantt, wantz, n, ilo, ihi, h, 0, ldh, wr, 0, wi, 0, iloz, ihiz, z, 0, ldz, work, 0, lwork, info);
  }

  public void slaqr4(boolean wantt, boolean wantz, int n, int ilo, int ihi, float[] h, int offseth, int ldh, float[] wr, int offsetwr, float[] wi, int offsetwi, int iloz, int ihiz, float[] z, int offsetz, int ldz, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slaqr4K(wantt, wantz, n, ilo, ihi, h, offseth, ldh, wr, offsetwr, wi, offsetwi, iloz, ihiz, z, offsetz, ldz, work, offsetwork, lwork, info);
  }

  protected abstract void slaqr4K(boolean wantt, boolean wantz, int n, int ilo, int ihi, float[] h, int offseth, int ldh, float[] wr, int offsetwr, float[] wi, int offsetwi, int iloz, int ihiz, float[] z, int offsetz, int ldz, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void slaqr5(boolean wantt, boolean wantz, int kacc22, int n, int ktop, int kbot, int nshfts, float[] sr, float[] si, float[] h, int ldh, int iloz, int ihiz, float[] z, int ldz, float[] v, int ldv, float[] u, int ldu, int nv, float[] wv, int ldwv, int nh, float[] wh, int ldwh) {
    slaqr5(wantt, wantz, kacc22, n, ktop, kbot, nshfts, sr, 0, si, 0, h, 0, ldh, iloz, ihiz, z, 0, ldz, v, 0, ldv, u, 0, ldu, nv, wv, 0, ldwv, nh, wh, 0, ldwh);
  }

  public void slaqr5(boolean wantt, boolean wantz, int kacc22, int n, int ktop, int kbot, int nshfts, float[] sr, int offsetsr, float[] si, int offsetsi, float[] h, int offseth, int ldh, int iloz, int ihiz, float[] z, int offsetz, int ldz, float[] v, int offsetv, int ldv, float[] u, int offsetu, int ldu, int nv, float[] wv, int offsetwv, int ldwv, int nh, float[] wh, int offsetwh, int ldwh) {
    //FIXME Add arguments check
    slaqr5K(wantt, wantz, kacc22, n, ktop, kbot, nshfts, sr, offsetsr, si, offsetsi, h, offseth, ldh, iloz, ihiz, z, offsetz, ldz, v, offsetv, ldv, u, offsetu, ldu, nv, wv, offsetwv, ldwv, nh, wh, offsetwh, ldwh);
  }

  protected abstract void slaqr5K(boolean wantt, boolean wantz, int kacc22, int n, int ktop, int kbot, int nshfts, float[] sr, int offsetsr, float[] si, int offsetsi, float[] h, int offseth, int ldh, int iloz, int ihiz, float[] z, int offsetz, int ldz, float[] v, int offsetv, int ldv, float[] u, int offsetu, int ldu, int nv, float[] wv, int offsetwv, int ldwv, int nh, float[] wh, int offsetwh, int ldwh);

  public void slaqsb(String uplo, int n, int kd, float[] ab, int ldab, float[] s, float scond, float amax, org.netlib.util.StringW equed) {
    slaqsb(uplo, n, kd, ab, 0, ldab, s, 0, scond, amax, equed);
  }

  public void slaqsb(String uplo, int n, int kd, float[] ab, int offsetab, int ldab, float[] s, int offsets, float scond, float amax, org.netlib.util.StringW equed) {
    //FIXME Add arguments check
    slaqsbK(uplo, n, kd, ab, offsetab, ldab, s, offsets, scond, amax, equed);
  }

  protected abstract void slaqsbK(String uplo, int n, int kd, float[] ab, int offsetab, int ldab, float[] s, int offsets, float scond, float amax, org.netlib.util.StringW equed);

  public void slaqsp(String uplo, int n, float[] ap, float[] s, float scond, float amax, org.netlib.util.StringW equed) {
    slaqsp(uplo, n, ap, 0, s, 0, scond, amax, equed);
  }

  public void slaqsp(String uplo, int n, float[] ap, int offsetap, float[] s, int offsets, float scond, float amax, org.netlib.util.StringW equed) {
    //FIXME Add arguments check
    slaqspK(uplo, n, ap, offsetap, s, offsets, scond, amax, equed);
  }

  protected abstract void slaqspK(String uplo, int n, float[] ap, int offsetap, float[] s, int offsets, float scond, float amax, org.netlib.util.StringW equed);

  public void slaqsy(String uplo, int n, float[] a, int lda, float[] s, float scond, float amax, org.netlib.util.StringW equed) {
    slaqsy(uplo, n, a, 0, lda, s, 0, scond, amax, equed);
  }

  public void slaqsy(String uplo, int n, float[] a, int offseta, int lda, float[] s, int offsets, float scond, float amax, org.netlib.util.StringW equed) {
    //FIXME Add arguments check
    slaqsyK(uplo, n, a, offseta, lda, s, offsets, scond, amax, equed);
  }

  protected abstract void slaqsyK(String uplo, int n, float[] a, int offseta, int lda, float[] s, int offsets, float scond, float amax, org.netlib.util.StringW equed);

  public void slaqtr(boolean ltran, boolean lreal, int n, float[] t, int ldt, float[] b, float w, org.netlib.util.floatW scale, float[] x, float[] work, org.netlib.util.intW info) {
    slaqtr(ltran, lreal, n, t, 0, ldt, b, 0, w, scale, x, 0, work, 0, info);
  }

  public void slaqtr(boolean ltran, boolean lreal, int n, float[] t, int offsett, int ldt, float[] b, int offsetb, float w, org.netlib.util.floatW scale, float[] x, int offsetx, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slaqtrK(ltran, lreal, n, t, offsett, ldt, b, offsetb, w, scale, x, offsetx, work, offsetwork, info);
  }

  protected abstract void slaqtrK(boolean ltran, boolean lreal, int n, float[] t, int offsett, int ldt, float[] b, int offsetb, float w, org.netlib.util.floatW scale, float[] x, int offsetx, float[] work, int offsetwork, org.netlib.util.intW info);

  public void slar1v(int n, int b1, int bn, float lambda, float[] d, float[] l, float[] ld, float[] lld, float pivmin, float gaptol, float[] z, boolean wantnc, org.netlib.util.intW negcnt, org.netlib.util.floatW ztz, org.netlib.util.floatW mingma, org.netlib.util.intW r, int[] isuppz, org.netlib.util.floatW nrminv, org.netlib.util.floatW resid, org.netlib.util.floatW rqcorr, float[] work) {
    slar1v(n, b1, bn, lambda, d, 0, l, 0, ld, 0, lld, 0, pivmin, gaptol, z, 0, wantnc, negcnt, ztz, mingma, r, isuppz, 0, nrminv, resid, rqcorr, work, 0);
  }

  public void slar1v(int n, int b1, int bn, float lambda, float[] d, int offsetd, float[] l, int offsetl, float[] ld, int offsetld, float[] lld, int offsetlld, float pivmin, float gaptol, float[] z, int offsetz, boolean wantnc, org.netlib.util.intW negcnt, org.netlib.util.floatW ztz, org.netlib.util.floatW mingma, org.netlib.util.intW r, int[] isuppz, int offsetisuppz, org.netlib.util.floatW nrminv, org.netlib.util.floatW resid, org.netlib.util.floatW rqcorr, float[] work, int offsetwork) {
    //FIXME Add arguments check
    slar1vK(n, b1, bn, lambda, d, offsetd, l, offsetl, ld, offsetld, lld, offsetlld, pivmin, gaptol, z, offsetz, wantnc, negcnt, ztz, mingma, r, isuppz, offsetisuppz, nrminv, resid, rqcorr, work, offsetwork);
  }

  protected abstract void slar1vK(int n, int b1, int bn, float lambda, float[] d, int offsetd, float[] l, int offsetl, float[] ld, int offsetld, float[] lld, int offsetlld, float pivmin, float gaptol, float[] z, int offsetz, boolean wantnc, org.netlib.util.intW negcnt, org.netlib.util.floatW ztz, org.netlib.util.floatW mingma, org.netlib.util.intW r, int[] isuppz, int offsetisuppz, org.netlib.util.floatW nrminv, org.netlib.util.floatW resid, org.netlib.util.floatW rqcorr, float[] work, int offsetwork);

  public void slar2v(int n, float[] x, float[] y, float[] z, int incx, float[] c, float[] s, int incc) {
    slar2v(n, x, 0, y, 0, z, 0, incx, c, 0, s, 0, incc);
  }

  public void slar2v(int n, float[] x, int offsetx, float[] y, int offsety, float[] z, int offsetz, int incx, float[] c, int offsetc, float[] s, int offsets, int incc) {
    //FIXME Add arguments check
    slar2vK(n, x, offsetx, y, offsety, z, offsetz, incx, c, offsetc, s, offsets, incc);
  }

  protected abstract void slar2vK(int n, float[] x, int offsetx, float[] y, int offsety, float[] z, int offsetz, int incx, float[] c, int offsetc, float[] s, int offsets, int incc);

  public void slarf(String side, int m, int n, float[] v, int incv, float tau, float[] c, int Ldc, float[] work) {
    slarf(side, m, n, v, 0, incv, tau, c, 0, Ldc, work, 0);
  }

  public void slarf(String side, int m, int n, float[] v, int offsetv, int incv, float tau, float[] c, int offsetc, int Ldc, float[] work, int offsetwork) {
    //FIXME Add arguments check
    slarfK(side, m, n, v, offsetv, incv, tau, c, offsetc, Ldc, work, offsetwork);
  }

  protected abstract void slarfK(String side, int m, int n, float[] v, int offsetv, int incv, float tau, float[] c, int offsetc, int Ldc, float[] work, int offsetwork);

  public void slarfb(String side, String trans, String direct, String storev, int m, int n, int k, float[] v, int ldv, float[] t, int ldt, float[] c, int Ldc, float[] work, int ldwork) {
    slarfb(side, trans, direct, storev, m, n, k, v, 0, ldv, t, 0, ldt, c, 0, Ldc, work, 0, ldwork);
  }

  public void slarfb(String side, String trans, String direct, String storev, int m, int n, int k, float[] v, int offsetv, int ldv, float[] t, int offsett, int ldt, float[] c, int offsetc, int Ldc, float[] work, int offsetwork, int ldwork) {
    //FIXME Add arguments check
    slarfbK(side, trans, direct, storev, m, n, k, v, offsetv, ldv, t, offsett, ldt, c, offsetc, Ldc, work, offsetwork, ldwork);
  }

  protected abstract void slarfbK(String side, String trans, String direct, String storev, int m, int n, int k, float[] v, int offsetv, int ldv, float[] t, int offsett, int ldt, float[] c, int offsetc, int Ldc, float[] work, int offsetwork, int ldwork);

  public void slarfg(int n, org.netlib.util.floatW alpha, float[] x, int incx, org.netlib.util.floatW tau) {
    slarfg(n, alpha, x, 0, incx, tau);
  }

  public void slarfg(int n, org.netlib.util.floatW alpha, float[] x, int offsetx, int incx, org.netlib.util.floatW tau) {
    //FIXME Add arguments check
    slarfgK(n, alpha, x, offsetx, incx, tau);
  }

  protected abstract void slarfgK(int n, org.netlib.util.floatW alpha, float[] x, int offsetx, int incx, org.netlib.util.floatW tau);

  public void slarft(String direct, String storev, int n, int k, float[] v, int ldv, float[] tau, float[] t, int ldt) {
    slarft(direct, storev, n, k, v, 0, ldv, tau, 0, t, 0, ldt);
  }

  public void slarft(String direct, String storev, int n, int k, float[] v, int offsetv, int ldv, float[] tau, int offsettau, float[] t, int offsett, int ldt) {
    //FIXME Add arguments check
    slarftK(direct, storev, n, k, v, offsetv, ldv, tau, offsettau, t, offsett, ldt);
  }

  protected abstract void slarftK(String direct, String storev, int n, int k, float[] v, int offsetv, int ldv, float[] tau, int offsettau, float[] t, int offsett, int ldt);

  public void slarfx(String side, int m, int n, float[] v, float tau, float[] c, int Ldc, float[] work) {
    slarfx(side, m, n, v, 0, tau, c, 0, Ldc, work, 0);
  }

  public void slarfx(String side, int m, int n, float[] v, int offsetv, float tau, float[] c, int offsetc, int Ldc, float[] work, int offsetwork) {
    //FIXME Add arguments check
    slarfxK(side, m, n, v, offsetv, tau, c, offsetc, Ldc, work, offsetwork);
  }

  protected abstract void slarfxK(String side, int m, int n, float[] v, int offsetv, float tau, float[] c, int offsetc, int Ldc, float[] work, int offsetwork);

  public void slargv(int n, float[] x, int incx, float[] y, int incy, float[] c, int incc) {
    slargv(n, x, 0, incx, y, 0, incy, c, 0, incc);
  }

  public void slargv(int n, float[] x, int offsetx, int incx, float[] y, int offsety, int incy, float[] c, int offsetc, int incc) {
    //FIXME Add arguments check
    slargvK(n, x, offsetx, incx, y, offsety, incy, c, offsetc, incc);
  }

  protected abstract void slargvK(int n, float[] x, int offsetx, int incx, float[] y, int offsety, int incy, float[] c, int offsetc, int incc);

  public void slarnv(int idist, int[] iseed, int n, float[] x) {
    slarnv(idist, iseed, 0, n, x, 0);
  }

  public void slarnv(int idist, int[] iseed, int offsetiseed, int n, float[] x, int offsetx) {
    //FIXME Add arguments check
    slarnvK(idist, iseed, offsetiseed, n, x, offsetx);
  }

  protected abstract void slarnvK(int idist, int[] iseed, int offsetiseed, int n, float[] x, int offsetx);

  public void slarra(int n, float[] d, float[] e, float[] e2, float spltol, float tnrm, org.netlib.util.intW nsplit, int[] isplit, org.netlib.util.intW info) {
    slarra(n, d, 0, e, 0, e2, 0, spltol, tnrm, nsplit, isplit, 0, info);
  }

  public void slarra(int n, float[] d, int offsetd, float[] e, int offsete, float[] e2, int offsete2, float spltol, float tnrm, org.netlib.util.intW nsplit, int[] isplit, int offsetisplit, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slarraK(n, d, offsetd, e, offsete, e2, offsete2, spltol, tnrm, nsplit, isplit, offsetisplit, info);
  }

  protected abstract void slarraK(int n, float[] d, int offsetd, float[] e, int offsete, float[] e2, int offsete2, float spltol, float tnrm, org.netlib.util.intW nsplit, int[] isplit, int offsetisplit, org.netlib.util.intW info);

  public void slarrb(int n, float[] d, float[] lld, int ifirst, int ilast, float rtol1, float rtol2, int offset, float[] w, float[] wgap, float[] werr, float[] work, int[] iwork, float pivmin, float spdiam, int twist, org.netlib.util.intW info) {
    slarrb(n, d, 0, lld, 0, ifirst, ilast, rtol1, rtol2, offset, w, 0, wgap, 0, werr, 0, work, 0, iwork, 0, pivmin, spdiam, twist, info);
  }

  public void slarrb(int n, float[] d, int offsetd, float[] lld, int offsetlld, int ifirst, int ilast, float rtol1, float rtol2, int offset, float[] w, int offsetw, float[] wgap, int offsetwgap, float[] werr, int offsetwerr, float[] work, int offsetwork, int[] iwork, int offsetiwork, float pivmin, float spdiam, int twist, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slarrbK(n, d, offsetd, lld, offsetlld, ifirst, ilast, rtol1, rtol2, offset, w, offsetw, wgap, offsetwgap, werr, offsetwerr, work, offsetwork, iwork, offsetiwork, pivmin, spdiam, twist, info);
  }

  protected abstract void slarrbK(int n, float[] d, int offsetd, float[] lld, int offsetlld, int ifirst, int ilast, float rtol1, float rtol2, int offset, float[] w, int offsetw, float[] wgap, int offsetwgap, float[] werr, int offsetwerr, float[] work, int offsetwork, int[] iwork, int offsetiwork, float pivmin, float spdiam, int twist, org.netlib.util.intW info);

  public void slarrc(String jobt, int n, float vl, float vu, float[] d, float[] e, float pivmin, org.netlib.util.intW eigcnt, org.netlib.util.intW lcnt, org.netlib.util.intW rcnt, org.netlib.util.intW info) {
    slarrc(jobt, n, vl, vu, d, 0, e, 0, pivmin, eigcnt, lcnt, rcnt, info);
  }

  public void slarrc(String jobt, int n, float vl, float vu, float[] d, int offsetd, float[] e, int offsete, float pivmin, org.netlib.util.intW eigcnt, org.netlib.util.intW lcnt, org.netlib.util.intW rcnt, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slarrcK(jobt, n, vl, vu, d, offsetd, e, offsete, pivmin, eigcnt, lcnt, rcnt, info);
  }

  protected abstract void slarrcK(String jobt, int n, float vl, float vu, float[] d, int offsetd, float[] e, int offsete, float pivmin, org.netlib.util.intW eigcnt, org.netlib.util.intW lcnt, org.netlib.util.intW rcnt, org.netlib.util.intW info);

  public void slarrd(String range, String order, int n, float vl, float vu, int il, int iu, float[] gers, float reltol, float[] d, float[] e, float[] e2, float pivmin, int nsplit, int[] isplit, org.netlib.util.intW m, float[] w, float[] werr, org.netlib.util.floatW wl, org.netlib.util.floatW wu, int[] iblock, int[] indexw, float[] work, int[] iwork, org.netlib.util.intW info) {
    slarrd(range, order, n, vl, vu, il, iu, gers, 0, reltol, d, 0, e, 0, e2, 0, pivmin, nsplit, isplit, 0, m, w, 0, werr, 0, wl, wu, iblock, 0, indexw, 0, work, 0, iwork, 0, info);
  }

  public void slarrd(String range, String order, int n, float vl, float vu, int il, int iu, float[] gers, int offsetgers, float reltol, float[] d, int offsetd, float[] e, int offsete, float[] e2, int offsete2, float pivmin, int nsplit, int[] isplit, int offsetisplit, org.netlib.util.intW m, float[] w, int offsetw, float[] werr, int offsetwerr, org.netlib.util.floatW wl, org.netlib.util.floatW wu, int[] iblock, int offsetiblock, int[] indexw, int offsetindexw, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slarrdK(range, order, n, vl, vu, il, iu, gers, offsetgers, reltol, d, offsetd, e, offsete, e2, offsete2, pivmin, nsplit, isplit, offsetisplit, m, w, offsetw, werr, offsetwerr, wl, wu, iblock, offsetiblock, indexw, offsetindexw, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void slarrdK(String range, String order, int n, float vl, float vu, int il, int iu, float[] gers, int offsetgers, float reltol, float[] d, int offsetd, float[] e, int offsete, float[] e2, int offsete2, float pivmin, int nsplit, int[] isplit, int offsetisplit, org.netlib.util.intW m, float[] w, int offsetw, float[] werr, int offsetwerr, org.netlib.util.floatW wl, org.netlib.util.floatW wu, int[] iblock, int offsetiblock, int[] indexw, int offsetindexw, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void slarre(String range, int n, org.netlib.util.floatW vl, org.netlib.util.floatW vu, int il, int iu, float[] d, float[] e, float[] e2, float rtol1, float rtol2, float spltol, org.netlib.util.intW nsplit, int[] isplit, org.netlib.util.intW m, float[] w, float[] werr, float[] wgap, int[] iblock, int[] indexw, float[] gers, org.netlib.util.floatW pivmin, float[] work, int[] iwork, org.netlib.util.intW info) {
    slarre(range, n, vl, vu, il, iu, d, 0, e, 0, e2, 0, rtol1, rtol2, spltol, nsplit, isplit, 0, m, w, 0, werr, 0, wgap, 0, iblock, 0, indexw, 0, gers, 0, pivmin, work, 0, iwork, 0, info);
  }

  public void slarre(String range, int n, org.netlib.util.floatW vl, org.netlib.util.floatW vu, int il, int iu, float[] d, int offsetd, float[] e, int offsete, float[] e2, int offsete2, float rtol1, float rtol2, float spltol, org.netlib.util.intW nsplit, int[] isplit, int offsetisplit, org.netlib.util.intW m, float[] w, int offsetw, float[] werr, int offsetwerr, float[] wgap, int offsetwgap, int[] iblock, int offsetiblock, int[] indexw, int offsetindexw, float[] gers, int offsetgers, org.netlib.util.floatW pivmin, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slarreK(range, n, vl, vu, il, iu, d, offsetd, e, offsete, e2, offsete2, rtol1, rtol2, spltol, nsplit, isplit, offsetisplit, m, w, offsetw, werr, offsetwerr, wgap, offsetwgap, iblock, offsetiblock, indexw, offsetindexw, gers, offsetgers, pivmin, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void slarreK(String range, int n, org.netlib.util.floatW vl, org.netlib.util.floatW vu, int il, int iu, float[] d, int offsetd, float[] e, int offsete, float[] e2, int offsete2, float rtol1, float rtol2, float spltol, org.netlib.util.intW nsplit, int[] isplit, int offsetisplit, org.netlib.util.intW m, float[] w, int offsetw, float[] werr, int offsetwerr, float[] wgap, int offsetwgap, int[] iblock, int offsetiblock, int[] indexw, int offsetindexw, float[] gers, int offsetgers, org.netlib.util.floatW pivmin, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void slarrf(int n, float[] d, float[] l, float[] ld, int clstrt, int clend, float[] w, float[] wgap, float[] werr, float spdiam, float clgapl, float clgapr, float pivmin, org.netlib.util.floatW sigma, float[] dplus, float[] lplus, float[] work, org.netlib.util.intW info) {
    slarrf(n, d, 0, l, 0, ld, 0, clstrt, clend, w, 0, wgap, 0, werr, 0, spdiam, clgapl, clgapr, pivmin, sigma, dplus, 0, lplus, 0, work, 0, info);
  }

  public void slarrf(int n, float[] d, int offsetd, float[] l, int offsetl, float[] ld, int offsetld, int clstrt, int clend, float[] w, int offsetw, float[] wgap, int offsetwgap, float[] werr, int offsetwerr, float spdiam, float clgapl, float clgapr, float pivmin, org.netlib.util.floatW sigma, float[] dplus, int offsetdplus, float[] lplus, int offsetlplus, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slarrfK(n, d, offsetd, l, offsetl, ld, offsetld, clstrt, clend, w, offsetw, wgap, offsetwgap, werr, offsetwerr, spdiam, clgapl, clgapr, pivmin, sigma, dplus, offsetdplus, lplus, offsetlplus, work, offsetwork, info);
  }

  protected abstract void slarrfK(int n, float[] d, int offsetd, float[] l, int offsetl, float[] ld, int offsetld, int clstrt, int clend, float[] w, int offsetw, float[] wgap, int offsetwgap, float[] werr, int offsetwerr, float spdiam, float clgapl, float clgapr, float pivmin, org.netlib.util.floatW sigma, float[] dplus, int offsetdplus, float[] lplus, int offsetlplus, float[] work, int offsetwork, org.netlib.util.intW info);

  public void slarrj(int n, float[] d, float[] e2, int ifirst, int ilast, float rtol, int offset, float[] w, float[] werr, float[] work, int[] iwork, float pivmin, float spdiam, org.netlib.util.intW info) {
    slarrj(n, d, 0, e2, 0, ifirst, ilast, rtol, offset, w, 0, werr, 0, work, 0, iwork, 0, pivmin, spdiam, info);
  }

  public void slarrj(int n, float[] d, int offsetd, float[] e2, int offsete2, int ifirst, int ilast, float rtol, int offset, float[] w, int offsetw, float[] werr, int offsetwerr, float[] work, int offsetwork, int[] iwork, int offsetiwork, float pivmin, float spdiam, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slarrjK(n, d, offsetd, e2, offsete2, ifirst, ilast, rtol, offset, w, offsetw, werr, offsetwerr, work, offsetwork, iwork, offsetiwork, pivmin, spdiam, info);
  }

  protected abstract void slarrjK(int n, float[] d, int offsetd, float[] e2, int offsete2, int ifirst, int ilast, float rtol, int offset, float[] w, int offsetw, float[] werr, int offsetwerr, float[] work, int offsetwork, int[] iwork, int offsetiwork, float pivmin, float spdiam, org.netlib.util.intW info);

  public void slarrk(int n, int iw, float gl, float gu, float[] d, float[] e2, float pivmin, float reltol, org.netlib.util.floatW w, org.netlib.util.floatW werr, org.netlib.util.intW info) {
    slarrk(n, iw, gl, gu, d, 0, e2, 0, pivmin, reltol, w, werr, info);
  }

  public void slarrk(int n, int iw, float gl, float gu, float[] d, int offsetd, float[] e2, int offsete2, float pivmin, float reltol, org.netlib.util.floatW w, org.netlib.util.floatW werr, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slarrkK(n, iw, gl, gu, d, offsetd, e2, offsete2, pivmin, reltol, w, werr, info);
  }

  protected abstract void slarrkK(int n, int iw, float gl, float gu, float[] d, int offsetd, float[] e2, int offsete2, float pivmin, float reltol, org.netlib.util.floatW w, org.netlib.util.floatW werr, org.netlib.util.intW info);

  public void slarrr(int n, float[] d, float[] e, org.netlib.util.intW info) {
    slarrr(n, d, 0, e, 0, info);
  }

  public void slarrr(int n, float[] d, int offsetd, float[] e, int offsete, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slarrrK(n, d, offsetd, e, offsete, info);
  }

  protected abstract void slarrrK(int n, float[] d, int offsetd, float[] e, int offsete, org.netlib.util.intW info);

  public void slarrv(int n, float vl, float vu, float[] d, float[] l, float pivmin, int[] isplit, int m, int dol, int dou, float minrgp, org.netlib.util.floatW rtol1, org.netlib.util.floatW rtol2, float[] w, float[] werr, float[] wgap, int[] iblock, int[] indexw, float[] gers, float[] z, int ldz, int[] isuppz, float[] work, int[] iwork, org.netlib.util.intW info) {
    slarrv(n, vl, vu, d, 0, l, 0, pivmin, isplit, 0, m, dol, dou, minrgp, rtol1, rtol2, w, 0, werr, 0, wgap, 0, iblock, 0, indexw, 0, gers, 0, z, 0, ldz, isuppz, 0, work, 0, iwork, 0, info);
  }

  public void slarrv(int n, float vl, float vu, float[] d, int offsetd, float[] l, int offsetl, float pivmin, int[] isplit, int offsetisplit, int m, int dol, int dou, float minrgp, org.netlib.util.floatW rtol1, org.netlib.util.floatW rtol2, float[] w, int offsetw, float[] werr, int offsetwerr, float[] wgap, int offsetwgap, int[] iblock, int offsetiblock, int[] indexw, int offsetindexw, float[] gers, int offsetgers, float[] z, int offsetz, int ldz, int[] isuppz, int offsetisuppz, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slarrvK(n, vl, vu, d, offsetd, l, offsetl, pivmin, isplit, offsetisplit, m, dol, dou, minrgp, rtol1, rtol2, w, offsetw, werr, offsetwerr, wgap, offsetwgap, iblock, offsetiblock, indexw, offsetindexw, gers, offsetgers, z, offsetz, ldz, isuppz, offsetisuppz, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void slarrvK(int n, float vl, float vu, float[] d, int offsetd, float[] l, int offsetl, float pivmin, int[] isplit, int offsetisplit, int m, int dol, int dou, float minrgp, org.netlib.util.floatW rtol1, org.netlib.util.floatW rtol2, float[] w, int offsetw, float[] werr, int offsetwerr, float[] wgap, int offsetwgap, int[] iblock, int offsetiblock, int[] indexw, int offsetindexw, float[] gers, int offsetgers, float[] z, int offsetz, int ldz, int[] isuppz, int offsetisuppz, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void slartg(float f, float g, org.netlib.util.floatW cs, org.netlib.util.floatW sn, org.netlib.util.floatW r) {
    slartgK(f, g, cs, sn, r);
  }

  protected abstract void slartgK(float f, float g, org.netlib.util.floatW cs, org.netlib.util.floatW sn, org.netlib.util.floatW r);

  public void slartv(int n, float[] x, int incx, float[] y, int incy, float[] c, float[] s, int incc) {
    slartv(n, x, 0, incx, y, 0, incy, c, 0, s, 0, incc);
  }

  public void slartv(int n, float[] x, int offsetx, int incx, float[] y, int offsety, int incy, float[] c, int offsetc, float[] s, int offsets, int incc) {
    //FIXME Add arguments check
    slartvK(n, x, offsetx, incx, y, offsety, incy, c, offsetc, s, offsets, incc);
  }

  protected abstract void slartvK(int n, float[] x, int offsetx, int incx, float[] y, int offsety, int incy, float[] c, int offsetc, float[] s, int offsets, int incc);

  public void slaruv(int[] iseed, int n, float[] x) {
    slaruv(iseed, 0, n, x, 0);
  }

  public void slaruv(int[] iseed, int offsetiseed, int n, float[] x, int offsetx) {
    //FIXME Add arguments check
    slaruvK(iseed, offsetiseed, n, x, offsetx);
  }

  protected abstract void slaruvK(int[] iseed, int offsetiseed, int n, float[] x, int offsetx);

  public void slarz(String side, int m, int n, int l, float[] v, int incv, float tau, float[] c, int Ldc, float[] work) {
    slarz(side, m, n, l, v, 0, incv, tau, c, 0, Ldc, work, 0);
  }

  public void slarz(String side, int m, int n, int l, float[] v, int offsetv, int incv, float tau, float[] c, int offsetc, int Ldc, float[] work, int offsetwork) {
    //FIXME Add arguments check
    slarzK(side, m, n, l, v, offsetv, incv, tau, c, offsetc, Ldc, work, offsetwork);
  }

  protected abstract void slarzK(String side, int m, int n, int l, float[] v, int offsetv, int incv, float tau, float[] c, int offsetc, int Ldc, float[] work, int offsetwork);

  public void slarzb(String side, String trans, String direct, String storev, int m, int n, int k, int l, float[] v, int ldv, float[] t, int ldt, float[] c, int Ldc, float[] work, int ldwork) {
    slarzb(side, trans, direct, storev, m, n, k, l, v, 0, ldv, t, 0, ldt, c, 0, Ldc, work, 0, ldwork);
  }

  public void slarzb(String side, String trans, String direct, String storev, int m, int n, int k, int l, float[] v, int offsetv, int ldv, float[] t, int offsett, int ldt, float[] c, int offsetc, int Ldc, float[] work, int offsetwork, int ldwork) {
    //FIXME Add arguments check
    slarzbK(side, trans, direct, storev, m, n, k, l, v, offsetv, ldv, t, offsett, ldt, c, offsetc, Ldc, work, offsetwork, ldwork);
  }

  protected abstract void slarzbK(String side, String trans, String direct, String storev, int m, int n, int k, int l, float[] v, int offsetv, int ldv, float[] t, int offsett, int ldt, float[] c, int offsetc, int Ldc, float[] work, int offsetwork, int ldwork);

  public void slarzt(String direct, String storev, int n, int k, float[] v, int ldv, float[] tau, float[] t, int ldt) {
    slarzt(direct, storev, n, k, v, 0, ldv, tau, 0, t, 0, ldt);
  }

  public void slarzt(String direct, String storev, int n, int k, float[] v, int offsetv, int ldv, float[] tau, int offsettau, float[] t, int offsett, int ldt) {
    //FIXME Add arguments check
    slarztK(direct, storev, n, k, v, offsetv, ldv, tau, offsettau, t, offsett, ldt);
  }

  protected abstract void slarztK(String direct, String storev, int n, int k, float[] v, int offsetv, int ldv, float[] tau, int offsettau, float[] t, int offsett, int ldt);

  public void slas2(float f, float g, float h, org.netlib.util.floatW ssmin, org.netlib.util.floatW ssmax) {
    slas2K(f, g, h, ssmin, ssmax);
  }

  protected abstract void slas2K(float f, float g, float h, org.netlib.util.floatW ssmin, org.netlib.util.floatW ssmax);

  public void slascl(String type, int kl, int ku, float cfrom, float cto, int m, int n, float[] a, int lda, org.netlib.util.intW info) {
    slascl(type, kl, ku, cfrom, cto, m, n, a, 0, lda, info);
  }

  public void slascl(String type, int kl, int ku, float cfrom, float cto, int m, int n, float[] a, int offseta, int lda, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slasclK(type, kl, ku, cfrom, cto, m, n, a, offseta, lda, info);
  }

  protected abstract void slasclK(String type, int kl, int ku, float cfrom, float cto, int m, int n, float[] a, int offseta, int lda, org.netlib.util.intW info);

  public void slasd0(int n, int sqre, float[] d, float[] e, float[] u, int ldu, float[] vt, int ldvt, int smlsiz, int[] iwork, float[] work, org.netlib.util.intW info) {
    slasd0(n, sqre, d, 0, e, 0, u, 0, ldu, vt, 0, ldvt, smlsiz, iwork, 0, work, 0, info);
  }

  public void slasd0(int n, int sqre, float[] d, int offsetd, float[] e, int offsete, float[] u, int offsetu, int ldu, float[] vt, int offsetvt, int ldvt, int smlsiz, int[] iwork, int offsetiwork, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slasd0K(n, sqre, d, offsetd, e, offsete, u, offsetu, ldu, vt, offsetvt, ldvt, smlsiz, iwork, offsetiwork, work, offsetwork, info);
  }

  protected abstract void slasd0K(int n, int sqre, float[] d, int offsetd, float[] e, int offsete, float[] u, int offsetu, int ldu, float[] vt, int offsetvt, int ldvt, int smlsiz, int[] iwork, int offsetiwork, float[] work, int offsetwork, org.netlib.util.intW info);

  public void slasd1(int nl, int nr, int sqre, float[] d, org.netlib.util.floatW alpha, org.netlib.util.floatW beta, float[] u, int ldu, float[] vt, int ldvt, int[] idxq, int[] iwork, float[] work, org.netlib.util.intW info) {
    slasd1(nl, nr, sqre, d, 0, alpha, beta, u, 0, ldu, vt, 0, ldvt, idxq, 0, iwork, 0, work, 0, info);
  }

  public void slasd1(int nl, int nr, int sqre, float[] d, int offsetd, org.netlib.util.floatW alpha, org.netlib.util.floatW beta, float[] u, int offsetu, int ldu, float[] vt, int offsetvt, int ldvt, int[] idxq, int offsetidxq, int[] iwork, int offsetiwork, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slasd1K(nl, nr, sqre, d, offsetd, alpha, beta, u, offsetu, ldu, vt, offsetvt, ldvt, idxq, offsetidxq, iwork, offsetiwork, work, offsetwork, info);
  }

  protected abstract void slasd1K(int nl, int nr, int sqre, float[] d, int offsetd, org.netlib.util.floatW alpha, org.netlib.util.floatW beta, float[] u, int offsetu, int ldu, float[] vt, int offsetvt, int ldvt, int[] idxq, int offsetidxq, int[] iwork, int offsetiwork, float[] work, int offsetwork, org.netlib.util.intW info);

  public void slasd2(int nl, int nr, int sqre, org.netlib.util.intW k, float[] d, float[] z, float alpha, float beta, float[] u, int ldu, float[] vt, int ldvt, float[] dsigma, float[] u2, int ldu2, float[] vt2, int ldvt2, int[] idxp, int[] idx, int[] idxc, int[] idxq, int[] coltyp, org.netlib.util.intW info) {
    slasd2(nl, nr, sqre, k, d, 0, z, 0, alpha, beta, u, 0, ldu, vt, 0, ldvt, dsigma, 0, u2, 0, ldu2, vt2, 0, ldvt2, idxp, 0, idx, 0, idxc, 0, idxq, 0, coltyp, 0, info);
  }

  public void slasd2(int nl, int nr, int sqre, org.netlib.util.intW k, float[] d, int offsetd, float[] z, int offsetz, float alpha, float beta, float[] u, int offsetu, int ldu, float[] vt, int offsetvt, int ldvt, float[] dsigma, int offsetdsigma, float[] u2, int offsetu2, int ldu2, float[] vt2, int offsetvt2, int ldvt2, int[] idxp, int offsetidxp, int[] idx, int offsetidx, int[] idxc, int offsetidxc, int[] idxq, int offsetidxq, int[] coltyp, int offsetcoltyp, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slasd2K(nl, nr, sqre, k, d, offsetd, z, offsetz, alpha, beta, u, offsetu, ldu, vt, offsetvt, ldvt, dsigma, offsetdsigma, u2, offsetu2, ldu2, vt2, offsetvt2, ldvt2, idxp, offsetidxp, idx, offsetidx, idxc, offsetidxc, idxq, offsetidxq, coltyp, offsetcoltyp, info);
  }

  protected abstract void slasd2K(int nl, int nr, int sqre, org.netlib.util.intW k, float[] d, int offsetd, float[] z, int offsetz, float alpha, float beta, float[] u, int offsetu, int ldu, float[] vt, int offsetvt, int ldvt, float[] dsigma, int offsetdsigma, float[] u2, int offsetu2, int ldu2, float[] vt2, int offsetvt2, int ldvt2, int[] idxp, int offsetidxp, int[] idx, int offsetidx, int[] idxc, int offsetidxc, int[] idxq, int offsetidxq, int[] coltyp, int offsetcoltyp, org.netlib.util.intW info);

  public void slasd3(int nl, int nr, int sqre, int k, float[] d, float[] q, int ldq, float[] dsigma, float[] u, int ldu, float[] u2, int ldu2, float[] vt, int ldvt, float[] vt2, int ldvt2, int[] idxc, int[] ctot, float[] z, org.netlib.util.intW info) {
    slasd3(nl, nr, sqre, k, d, 0, q, 0, ldq, dsigma, 0, u, 0, ldu, u2, 0, ldu2, vt, 0, ldvt, vt2, 0, ldvt2, idxc, 0, ctot, 0, z, 0, info);
  }

  public void slasd3(int nl, int nr, int sqre, int k, float[] d, int offsetd, float[] q, int offsetq, int ldq, float[] dsigma, int offsetdsigma, float[] u, int offsetu, int ldu, float[] u2, int offsetu2, int ldu2, float[] vt, int offsetvt, int ldvt, float[] vt2, int offsetvt2, int ldvt2, int[] idxc, int offsetidxc, int[] ctot, int offsetctot, float[] z, int offsetz, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slasd3K(nl, nr, sqre, k, d, offsetd, q, offsetq, ldq, dsigma, offsetdsigma, u, offsetu, ldu, u2, offsetu2, ldu2, vt, offsetvt, ldvt, vt2, offsetvt2, ldvt2, idxc, offsetidxc, ctot, offsetctot, z, offsetz, info);
  }

  protected abstract void slasd3K(int nl, int nr, int sqre, int k, float[] d, int offsetd, float[] q, int offsetq, int ldq, float[] dsigma, int offsetdsigma, float[] u, int offsetu, int ldu, float[] u2, int offsetu2, int ldu2, float[] vt, int offsetvt, int ldvt, float[] vt2, int offsetvt2, int ldvt2, int[] idxc, int offsetidxc, int[] ctot, int offsetctot, float[] z, int offsetz, org.netlib.util.intW info);

  public void slasd4(int n, int i, float[] d, float[] z, float[] delta, float rho, org.netlib.util.floatW sigma, float[] work, org.netlib.util.intW info) {
    slasd4(n, i, d, 0, z, 0, delta, 0, rho, sigma, work, 0, info);
  }

  public void slasd4(int n, int i, float[] d, int offsetd, float[] z, int offsetz, float[] delta, int offsetdelta, float rho, org.netlib.util.floatW sigma, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slasd4K(n, i, d, offsetd, z, offsetz, delta, offsetdelta, rho, sigma, work, offsetwork, info);
  }

  protected abstract void slasd4K(int n, int i, float[] d, int offsetd, float[] z, int offsetz, float[] delta, int offsetdelta, float rho, org.netlib.util.floatW sigma, float[] work, int offsetwork, org.netlib.util.intW info);

  public void slasd5(int i, float[] d, float[] z, float[] delta, float rho, org.netlib.util.floatW dsigma, float[] work) {
    slasd5(i, d, 0, z, 0, delta, 0, rho, dsigma, work, 0);
  }

  public void slasd5(int i, float[] d, int offsetd, float[] z, int offsetz, float[] delta, int offsetdelta, float rho, org.netlib.util.floatW dsigma, float[] work, int offsetwork) {
    //FIXME Add arguments check
    slasd5K(i, d, offsetd, z, offsetz, delta, offsetdelta, rho, dsigma, work, offsetwork);
  }

  protected abstract void slasd5K(int i, float[] d, int offsetd, float[] z, int offsetz, float[] delta, int offsetdelta, float rho, org.netlib.util.floatW dsigma, float[] work, int offsetwork);

  public void slasd6(int icompq, int nl, int nr, int sqre, float[] d, float[] vf, float[] vl, org.netlib.util.floatW alpha, org.netlib.util.floatW beta, int[] idxq, int[] perm, org.netlib.util.intW givptr, int[] givcol, int ldgcol, float[] givnum, int ldgnum, float[] poles, float[] difl, float[] difr, float[] z, org.netlib.util.intW k, org.netlib.util.floatW c, org.netlib.util.floatW s, float[] work, int[] iwork, org.netlib.util.intW info) {
    slasd6(icompq, nl, nr, sqre, d, 0, vf, 0, vl, 0, alpha, beta, idxq, 0, perm, 0, givptr, givcol, 0, ldgcol, givnum, 0, ldgnum, poles, 0, difl, 0, difr, 0, z, 0, k, c, s, work, 0, iwork, 0, info);
  }

  public void slasd6(int icompq, int nl, int nr, int sqre, float[] d, int offsetd, float[] vf, int offsetvf, float[] vl, int offsetvl, org.netlib.util.floatW alpha, org.netlib.util.floatW beta, int[] idxq, int offsetidxq, int[] perm, int offsetperm, org.netlib.util.intW givptr, int[] givcol, int offsetgivcol, int ldgcol, float[] givnum, int offsetgivnum, int ldgnum, float[] poles, int offsetpoles, float[] difl, int offsetdifl, float[] difr, int offsetdifr, float[] z, int offsetz, org.netlib.util.intW k, org.netlib.util.floatW c, org.netlib.util.floatW s, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slasd6K(icompq, nl, nr, sqre, d, offsetd, vf, offsetvf, vl, offsetvl, alpha, beta, idxq, offsetidxq, perm, offsetperm, givptr, givcol, offsetgivcol, ldgcol, givnum, offsetgivnum, ldgnum, poles, offsetpoles, difl, offsetdifl, difr, offsetdifr, z, offsetz, k, c, s, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void slasd6K(int icompq, int nl, int nr, int sqre, float[] d, int offsetd, float[] vf, int offsetvf, float[] vl, int offsetvl, org.netlib.util.floatW alpha, org.netlib.util.floatW beta, int[] idxq, int offsetidxq, int[] perm, int offsetperm, org.netlib.util.intW givptr, int[] givcol, int offsetgivcol, int ldgcol, float[] givnum, int offsetgivnum, int ldgnum, float[] poles, int offsetpoles, float[] difl, int offsetdifl, float[] difr, int offsetdifr, float[] z, int offsetz, org.netlib.util.intW k, org.netlib.util.floatW c, org.netlib.util.floatW s, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void slasd7(int icompq, int nl, int nr, int sqre, org.netlib.util.intW k, float[] d, float[] z, float[] zw, float[] vf, float[] vfw, float[] vl, float[] vlw, float alpha, float beta, float[] dsigma, int[] idx, int[] idxp, int[] idxq, int[] perm, org.netlib.util.intW givptr, int[] givcol, int ldgcol, float[] givnum, int ldgnum, org.netlib.util.floatW c, org.netlib.util.floatW s, org.netlib.util.intW info) {
    slasd7(icompq, nl, nr, sqre, k, d, 0, z, 0, zw, 0, vf, 0, vfw, 0, vl, 0, vlw, 0, alpha, beta, dsigma, 0, idx, 0, idxp, 0, idxq, 0, perm, 0, givptr, givcol, 0, ldgcol, givnum, 0, ldgnum, c, s, info);
  }

  public void slasd7(int icompq, int nl, int nr, int sqre, org.netlib.util.intW k, float[] d, int offsetd, float[] z, int offsetz, float[] zw, int offsetzw, float[] vf, int offsetvf, float[] vfw, int offsetvfw, float[] vl, int offsetvl, float[] vlw, int offsetvlw, float alpha, float beta, float[] dsigma, int offsetdsigma, int[] idx, int offsetidx, int[] idxp, int offsetidxp, int[] idxq, int offsetidxq, int[] perm, int offsetperm, org.netlib.util.intW givptr, int[] givcol, int offsetgivcol, int ldgcol, float[] givnum, int offsetgivnum, int ldgnum, org.netlib.util.floatW c, org.netlib.util.floatW s, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slasd7K(icompq, nl, nr, sqre, k, d, offsetd, z, offsetz, zw, offsetzw, vf, offsetvf, vfw, offsetvfw, vl, offsetvl, vlw, offsetvlw, alpha, beta, dsigma, offsetdsigma, idx, offsetidx, idxp, offsetidxp, idxq, offsetidxq, perm, offsetperm, givptr, givcol, offsetgivcol, ldgcol, givnum, offsetgivnum, ldgnum, c, s, info);
  }

  protected abstract void slasd7K(int icompq, int nl, int nr, int sqre, org.netlib.util.intW k, float[] d, int offsetd, float[] z, int offsetz, float[] zw, int offsetzw, float[] vf, int offsetvf, float[] vfw, int offsetvfw, float[] vl, int offsetvl, float[] vlw, int offsetvlw, float alpha, float beta, float[] dsigma, int offsetdsigma, int[] idx, int offsetidx, int[] idxp, int offsetidxp, int[] idxq, int offsetidxq, int[] perm, int offsetperm, org.netlib.util.intW givptr, int[] givcol, int offsetgivcol, int ldgcol, float[] givnum, int offsetgivnum, int ldgnum, org.netlib.util.floatW c, org.netlib.util.floatW s, org.netlib.util.intW info);

  public void slasd8(int icompq, int k, float[] d, float[] z, float[] vf, float[] vl, float[] difl, float[] difr, int lddifr, float[] dsigma, float[] work, org.netlib.util.intW info) {
    slasd8(icompq, k, d, 0, z, 0, vf, 0, vl, 0, difl, 0, difr, 0, lddifr, dsigma, 0, work, 0, info);
  }

  public void slasd8(int icompq, int k, float[] d, int offsetd, float[] z, int offsetz, float[] vf, int offsetvf, float[] vl, int offsetvl, float[] difl, int offsetdifl, float[] difr, int offsetdifr, int lddifr, float[] dsigma, int offsetdsigma, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slasd8K(icompq, k, d, offsetd, z, offsetz, vf, offsetvf, vl, offsetvl, difl, offsetdifl, difr, offsetdifr, lddifr, dsigma, offsetdsigma, work, offsetwork, info);
  }

  protected abstract void slasd8K(int icompq, int k, float[] d, int offsetd, float[] z, int offsetz, float[] vf, int offsetvf, float[] vl, int offsetvl, float[] difl, int offsetdifl, float[] difr, int offsetdifr, int lddifr, float[] dsigma, int offsetdsigma, float[] work, int offsetwork, org.netlib.util.intW info);

  public void slasda(int icompq, int smlsiz, int n, int sqre, float[] d, float[] e, float[] u, int ldu, float[] vt, int[] k, float[] difl, float[] difr, float[] z, float[] poles, int[] givptr, int[] givcol, int ldgcol, int[] perm, float[] givnum, float[] c, float[] s, float[] work, int[] iwork, org.netlib.util.intW info) {
    slasda(icompq, smlsiz, n, sqre, d, 0, e, 0, u, 0, ldu, vt, 0, k, 0, difl, 0, difr, 0, z, 0, poles, 0, givptr, 0, givcol, 0, ldgcol, perm, 0, givnum, 0, c, 0, s, 0, work, 0, iwork, 0, info);
  }

  public void slasda(int icompq, int smlsiz, int n, int sqre, float[] d, int offsetd, float[] e, int offsete, float[] u, int offsetu, int ldu, float[] vt, int offsetvt, int[] k, int offsetk, float[] difl, int offsetdifl, float[] difr, int offsetdifr, float[] z, int offsetz, float[] poles, int offsetpoles, int[] givptr, int offsetgivptr, int[] givcol, int offsetgivcol, int ldgcol, int[] perm, int offsetperm, float[] givnum, int offsetgivnum, float[] c, int offsetc, float[] s, int offsets, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slasdaK(icompq, smlsiz, n, sqre, d, offsetd, e, offsete, u, offsetu, ldu, vt, offsetvt, k, offsetk, difl, offsetdifl, difr, offsetdifr, z, offsetz, poles, offsetpoles, givptr, offsetgivptr, givcol, offsetgivcol, ldgcol, perm, offsetperm, givnum, offsetgivnum, c, offsetc, s, offsets, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void slasdaK(int icompq, int smlsiz, int n, int sqre, float[] d, int offsetd, float[] e, int offsete, float[] u, int offsetu, int ldu, float[] vt, int offsetvt, int[] k, int offsetk, float[] difl, int offsetdifl, float[] difr, int offsetdifr, float[] z, int offsetz, float[] poles, int offsetpoles, int[] givptr, int offsetgivptr, int[] givcol, int offsetgivcol, int ldgcol, int[] perm, int offsetperm, float[] givnum, int offsetgivnum, float[] c, int offsetc, float[] s, int offsets, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void slasdq(String uplo, int sqre, int n, int ncvt, int nru, int ncc, float[] d, float[] e, float[] vt, int ldvt, float[] u, int ldu, float[] c, int Ldc, float[] work, org.netlib.util.intW info) {
    slasdq(uplo, sqre, n, ncvt, nru, ncc, d, 0, e, 0, vt, 0, ldvt, u, 0, ldu, c, 0, Ldc, work, 0, info);
  }

  public void slasdq(String uplo, int sqre, int n, int ncvt, int nru, int ncc, float[] d, int offsetd, float[] e, int offsete, float[] vt, int offsetvt, int ldvt, float[] u, int offsetu, int ldu, float[] c, int offsetc, int Ldc, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slasdqK(uplo, sqre, n, ncvt, nru, ncc, d, offsetd, e, offsete, vt, offsetvt, ldvt, u, offsetu, ldu, c, offsetc, Ldc, work, offsetwork, info);
  }

  protected abstract void slasdqK(String uplo, int sqre, int n, int ncvt, int nru, int ncc, float[] d, int offsetd, float[] e, int offsete, float[] vt, int offsetvt, int ldvt, float[] u, int offsetu, int ldu, float[] c, int offsetc, int Ldc, float[] work, int offsetwork, org.netlib.util.intW info);

  public void slasdt(int n, org.netlib.util.intW lvl, org.netlib.util.intW nd, int[] inode, int[] ndiml, int[] ndimr, int msub) {
    slasdt(n, lvl, nd, inode, 0, ndiml, 0, ndimr, 0, msub);
  }

  public void slasdt(int n, org.netlib.util.intW lvl, org.netlib.util.intW nd, int[] inode, int offsetinode, int[] ndiml, int offsetndiml, int[] ndimr, int offsetndimr, int msub) {
    //FIXME Add arguments check
    slasdtK(n, lvl, nd, inode, offsetinode, ndiml, offsetndiml, ndimr, offsetndimr, msub);
  }

  protected abstract void slasdtK(int n, org.netlib.util.intW lvl, org.netlib.util.intW nd, int[] inode, int offsetinode, int[] ndiml, int offsetndiml, int[] ndimr, int offsetndimr, int msub);

  public void slaset(String uplo, int m, int n, float alpha, float beta, float[] a, int lda) {
    slaset(uplo, m, n, alpha, beta, a, 0, lda);
  }

  public void slaset(String uplo, int m, int n, float alpha, float beta, float[] a, int offseta, int lda) {
    //FIXME Add arguments check
    slasetK(uplo, m, n, alpha, beta, a, offseta, lda);
  }

  protected abstract void slasetK(String uplo, int m, int n, float alpha, float beta, float[] a, int offseta, int lda);

  public void slasq1(int n, float[] d, float[] e, float[] work, org.netlib.util.intW info) {
    slasq1(n, d, 0, e, 0, work, 0, info);
  }

  public void slasq1(int n, float[] d, int offsetd, float[] e, int offsete, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slasq1K(n, d, offsetd, e, offsete, work, offsetwork, info);
  }

  protected abstract void slasq1K(int n, float[] d, int offsetd, float[] e, int offsete, float[] work, int offsetwork, org.netlib.util.intW info);

  public void slasq2(int n, float[] z, org.netlib.util.intW info) {
    slasq2(n, z, 0, info);
  }

  public void slasq2(int n, float[] z, int offsetz, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slasq2K(n, z, offsetz, info);
  }

  protected abstract void slasq2K(int n, float[] z, int offsetz, org.netlib.util.intW info);

  public void slasq3(int i0, org.netlib.util.intW n0, float[] z, int pp, org.netlib.util.floatW dmin, org.netlib.util.floatW sigma, org.netlib.util.floatW desig, org.netlib.util.floatW qmax, org.netlib.util.intW nfail, org.netlib.util.intW iter, org.netlib.util.intW ndiv, boolean ieee) {
    slasq3(i0, n0, z, 0, pp, dmin, sigma, desig, qmax, nfail, iter, ndiv, ieee);
  }

  public void slasq3(int i0, org.netlib.util.intW n0, float[] z, int offsetz, int pp, org.netlib.util.floatW dmin, org.netlib.util.floatW sigma, org.netlib.util.floatW desig, org.netlib.util.floatW qmax, org.netlib.util.intW nfail, org.netlib.util.intW iter, org.netlib.util.intW ndiv, boolean ieee) {
    //FIXME Add arguments check
    slasq3K(i0, n0, z, offsetz, pp, dmin, sigma, desig, qmax, nfail, iter, ndiv, ieee);
  }

  protected abstract void slasq3K(int i0, org.netlib.util.intW n0, float[] z, int offsetz, int pp, org.netlib.util.floatW dmin, org.netlib.util.floatW sigma, org.netlib.util.floatW desig, org.netlib.util.floatW qmax, org.netlib.util.intW nfail, org.netlib.util.intW iter, org.netlib.util.intW ndiv, boolean ieee);

  public void slasq4(int i0, int n0, float[] z, int pp, int n0in, float dmin, float dmin1, float dmin2, float dn, float dn1, float dn2, org.netlib.util.floatW tau, org.netlib.util.intW ttype) {
    slasq4(i0, n0, z, 0, pp, n0in, dmin, dmin1, dmin2, dn, dn1, dn2, tau, ttype);
  }

  public void slasq4(int i0, int n0, float[] z, int offsetz, int pp, int n0in, float dmin, float dmin1, float dmin2, float dn, float dn1, float dn2, org.netlib.util.floatW tau, org.netlib.util.intW ttype) {
    //FIXME Add arguments check
    slasq4K(i0, n0, z, offsetz, pp, n0in, dmin, dmin1, dmin2, dn, dn1, dn2, tau, ttype);
  }

  protected abstract void slasq4K(int i0, int n0, float[] z, int offsetz, int pp, int n0in, float dmin, float dmin1, float dmin2, float dn, float dn1, float dn2, org.netlib.util.floatW tau, org.netlib.util.intW ttype);

  public void slasq5(int i0, int n0, float[] z, int pp, float tau, org.netlib.util.floatW dmin, org.netlib.util.floatW dmin1, org.netlib.util.floatW dmin2, org.netlib.util.floatW dn, org.netlib.util.floatW dnm1, org.netlib.util.floatW dnm2, boolean ieee) {
    slasq5(i0, n0, z, 0, pp, tau, dmin, dmin1, dmin2, dn, dnm1, dnm2, ieee);
  }

  public void slasq5(int i0, int n0, float[] z, int offsetz, int pp, float tau, org.netlib.util.floatW dmin, org.netlib.util.floatW dmin1, org.netlib.util.floatW dmin2, org.netlib.util.floatW dn, org.netlib.util.floatW dnm1, org.netlib.util.floatW dnm2, boolean ieee) {
    //FIXME Add arguments check
    slasq5K(i0, n0, z, offsetz, pp, tau, dmin, dmin1, dmin2, dn, dnm1, dnm2, ieee);
  }

  protected abstract void slasq5K(int i0, int n0, float[] z, int offsetz, int pp, float tau, org.netlib.util.floatW dmin, org.netlib.util.floatW dmin1, org.netlib.util.floatW dmin2, org.netlib.util.floatW dn, org.netlib.util.floatW dnm1, org.netlib.util.floatW dnm2, boolean ieee);

  public void slasq6(int i0, int n0, float[] z, int pp, org.netlib.util.floatW dmin, org.netlib.util.floatW dmin1, org.netlib.util.floatW dmin2, org.netlib.util.floatW dn, org.netlib.util.floatW dnm1, org.netlib.util.floatW dnm2) {
    slasq6(i0, n0, z, 0, pp, dmin, dmin1, dmin2, dn, dnm1, dnm2);
  }

  public void slasq6(int i0, int n0, float[] z, int offsetz, int pp, org.netlib.util.floatW dmin, org.netlib.util.floatW dmin1, org.netlib.util.floatW dmin2, org.netlib.util.floatW dn, org.netlib.util.floatW dnm1, org.netlib.util.floatW dnm2) {
    //FIXME Add arguments check
    slasq6K(i0, n0, z, offsetz, pp, dmin, dmin1, dmin2, dn, dnm1, dnm2);
  }

  protected abstract void slasq6K(int i0, int n0, float[] z, int offsetz, int pp, org.netlib.util.floatW dmin, org.netlib.util.floatW dmin1, org.netlib.util.floatW dmin2, org.netlib.util.floatW dn, org.netlib.util.floatW dnm1, org.netlib.util.floatW dnm2);

  public void slasr(String side, String pivot, String direct, int m, int n, float[] c, float[] s, float[] a, int lda) {
    slasr(side, pivot, direct, m, n, c, 0, s, 0, a, 0, lda);
  }

  public void slasr(String side, String pivot, String direct, int m, int n, float[] c, int offsetc, float[] s, int offsets, float[] a, int offseta, int lda) {
    //FIXME Add arguments check
    slasrK(side, pivot, direct, m, n, c, offsetc, s, offsets, a, offseta, lda);
  }

  protected abstract void slasrK(String side, String pivot, String direct, int m, int n, float[] c, int offsetc, float[] s, int offsets, float[] a, int offseta, int lda);

  public void slasrt(String id, int n, float[] d, org.netlib.util.intW info) {
    slasrt(id, n, d, 0, info);
  }

  public void slasrt(String id, int n, float[] d, int offsetd, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slasrtK(id, n, d, offsetd, info);
  }

  protected abstract void slasrtK(String id, int n, float[] d, int offsetd, org.netlib.util.intW info);

  public void slassq(int n, float[] x, int incx, org.netlib.util.floatW scale, org.netlib.util.floatW sumsq) {
    slassq(n, x, 0, incx, scale, sumsq);
  }

  public void slassq(int n, float[] x, int offsetx, int incx, org.netlib.util.floatW scale, org.netlib.util.floatW sumsq) {
    //FIXME Add arguments check
    slassqK(n, x, offsetx, incx, scale, sumsq);
  }

  protected abstract void slassqK(int n, float[] x, int offsetx, int incx, org.netlib.util.floatW scale, org.netlib.util.floatW sumsq);

  public void slasv2(float f, float g, float h, org.netlib.util.floatW ssmin, org.netlib.util.floatW ssmax, org.netlib.util.floatW snr, org.netlib.util.floatW csr, org.netlib.util.floatW snl, org.netlib.util.floatW csl) {
    slasv2K(f, g, h, ssmin, ssmax, snr, csr, snl, csl);
  }

  protected abstract void slasv2K(float f, float g, float h, org.netlib.util.floatW ssmin, org.netlib.util.floatW ssmax, org.netlib.util.floatW snr, org.netlib.util.floatW csr, org.netlib.util.floatW snl, org.netlib.util.floatW csl);

  public void slaswp(int n, float[] a, int lda, int k1, int k2, int[] ipiv, int incx) {
    slaswp(n, a, 0, lda, k1, k2, ipiv, 0, incx);
  }

  public void slaswp(int n, float[] a, int offseta, int lda, int k1, int k2, int[] ipiv, int offsetipiv, int incx) {
    //FIXME Add arguments check
    slaswpK(n, a, offseta, lda, k1, k2, ipiv, offsetipiv, incx);
  }

  protected abstract void slaswpK(int n, float[] a, int offseta, int lda, int k1, int k2, int[] ipiv, int offsetipiv, int incx);

  public void slasy2(boolean ltranl, boolean ltranr, int isgn, int n1, int n2, float[] tl, int ldtl, float[] tr, int ldtr, float[] b, int ldb, org.netlib.util.floatW scale, float[] x, int ldx, org.netlib.util.floatW xnorm, org.netlib.util.intW info) {
    slasy2(ltranl, ltranr, isgn, n1, n2, tl, 0, ldtl, tr, 0, ldtr, b, 0, ldb, scale, x, 0, ldx, xnorm, info);
  }

  public void slasy2(boolean ltranl, boolean ltranr, int isgn, int n1, int n2, float[] tl, int offsettl, int ldtl, float[] tr, int offsettr, int ldtr, float[] b, int offsetb, int ldb, org.netlib.util.floatW scale, float[] x, int offsetx, int ldx, org.netlib.util.floatW xnorm, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slasy2K(ltranl, ltranr, isgn, n1, n2, tl, offsettl, ldtl, tr, offsettr, ldtr, b, offsetb, ldb, scale, x, offsetx, ldx, xnorm, info);
  }

  protected abstract void slasy2K(boolean ltranl, boolean ltranr, int isgn, int n1, int n2, float[] tl, int offsettl, int ldtl, float[] tr, int offsettr, int ldtr, float[] b, int offsetb, int ldb, org.netlib.util.floatW scale, float[] x, int offsetx, int ldx, org.netlib.util.floatW xnorm, org.netlib.util.intW info);

  public void slasyf(String uplo, int n, int nb, org.netlib.util.intW kb, float[] a, int lda, int[] ipiv, float[] w, int ldw, org.netlib.util.intW info) {
    slasyf(uplo, n, nb, kb, a, 0, lda, ipiv, 0, w, 0, ldw, info);
  }

  public void slasyf(String uplo, int n, int nb, org.netlib.util.intW kb, float[] a, int offseta, int lda, int[] ipiv, int offsetipiv, float[] w, int offsetw, int ldw, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slasyfK(uplo, n, nb, kb, a, offseta, lda, ipiv, offsetipiv, w, offsetw, ldw, info);
  }

  protected abstract void slasyfK(String uplo, int n, int nb, org.netlib.util.intW kb, float[] a, int offseta, int lda, int[] ipiv, int offsetipiv, float[] w, int offsetw, int ldw, org.netlib.util.intW info);

  public void slatbs(String uplo, String trans, String diag, String normin, int n, int kd, float[] ab, int ldab, float[] x, org.netlib.util.floatW scale, float[] cnorm, org.netlib.util.intW info) {
    slatbs(uplo, trans, diag, normin, n, kd, ab, 0, ldab, x, 0, scale, cnorm, 0, info);
  }

  public void slatbs(String uplo, String trans, String diag, String normin, int n, int kd, float[] ab, int offsetab, int ldab, float[] x, int offsetx, org.netlib.util.floatW scale, float[] cnorm, int offsetcnorm, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slatbsK(uplo, trans, diag, normin, n, kd, ab, offsetab, ldab, x, offsetx, scale, cnorm, offsetcnorm, info);
  }

  protected abstract void slatbsK(String uplo, String trans, String diag, String normin, int n, int kd, float[] ab, int offsetab, int ldab, float[] x, int offsetx, org.netlib.util.floatW scale, float[] cnorm, int offsetcnorm, org.netlib.util.intW info);

  public void slatdf(int ijob, int n, float[] z, int ldz, float[] rhs, org.netlib.util.floatW rdsum, org.netlib.util.floatW rdscal, int[] ipiv, int[] jpiv) {
    slatdf(ijob, n, z, 0, ldz, rhs, 0, rdsum, rdscal, ipiv, 0, jpiv, 0);
  }

  public void slatdf(int ijob, int n, float[] z, int offsetz, int ldz, float[] rhs, int offsetrhs, org.netlib.util.floatW rdsum, org.netlib.util.floatW rdscal, int[] ipiv, int offsetipiv, int[] jpiv, int offsetjpiv) {
    //FIXME Add arguments check
    slatdfK(ijob, n, z, offsetz, ldz, rhs, offsetrhs, rdsum, rdscal, ipiv, offsetipiv, jpiv, offsetjpiv);
  }

  protected abstract void slatdfK(int ijob, int n, float[] z, int offsetz, int ldz, float[] rhs, int offsetrhs, org.netlib.util.floatW rdsum, org.netlib.util.floatW rdscal, int[] ipiv, int offsetipiv, int[] jpiv, int offsetjpiv);

  public void slatps(String uplo, String trans, String diag, String normin, int n, float[] ap, float[] x, org.netlib.util.floatW scale, float[] cnorm, org.netlib.util.intW info) {
    slatps(uplo, trans, diag, normin, n, ap, 0, x, 0, scale, cnorm, 0, info);
  }

  public void slatps(String uplo, String trans, String diag, String normin, int n, float[] ap, int offsetap, float[] x, int offsetx, org.netlib.util.floatW scale, float[] cnorm, int offsetcnorm, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slatpsK(uplo, trans, diag, normin, n, ap, offsetap, x, offsetx, scale, cnorm, offsetcnorm, info);
  }

  protected abstract void slatpsK(String uplo, String trans, String diag, String normin, int n, float[] ap, int offsetap, float[] x, int offsetx, org.netlib.util.floatW scale, float[] cnorm, int offsetcnorm, org.netlib.util.intW info);

  public void slatrd(String uplo, int n, int nb, float[] a, int lda, float[] e, float[] tau, float[] w, int ldw) {
    slatrd(uplo, n, nb, a, 0, lda, e, 0, tau, 0, w, 0, ldw);
  }

  public void slatrd(String uplo, int n, int nb, float[] a, int offseta, int lda, float[] e, int offsete, float[] tau, int offsettau, float[] w, int offsetw, int ldw) {
    //FIXME Add arguments check
    slatrdK(uplo, n, nb, a, offseta, lda, e, offsete, tau, offsettau, w, offsetw, ldw);
  }

  protected abstract void slatrdK(String uplo, int n, int nb, float[] a, int offseta, int lda, float[] e, int offsete, float[] tau, int offsettau, float[] w, int offsetw, int ldw);

  public void slatrs(String uplo, String trans, String diag, String normin, int n, float[] a, int lda, float[] x, org.netlib.util.floatW scale, float[] cnorm, org.netlib.util.intW info) {
    slatrs(uplo, trans, diag, normin, n, a, 0, lda, x, 0, scale, cnorm, 0, info);
  }

  public void slatrs(String uplo, String trans, String diag, String normin, int n, float[] a, int offseta, int lda, float[] x, int offsetx, org.netlib.util.floatW scale, float[] cnorm, int offsetcnorm, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slatrsK(uplo, trans, diag, normin, n, a, offseta, lda, x, offsetx, scale, cnorm, offsetcnorm, info);
  }

  protected abstract void slatrsK(String uplo, String trans, String diag, String normin, int n, float[] a, int offseta, int lda, float[] x, int offsetx, org.netlib.util.floatW scale, float[] cnorm, int offsetcnorm, org.netlib.util.intW info);

  public void slatrz(int m, int n, int l, float[] a, int lda, float[] tau, float[] work) {
    slatrz(m, n, l, a, 0, lda, tau, 0, work, 0);
  }

  public void slatrz(int m, int n, int l, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork) {
    //FIXME Add arguments check
    slatrzK(m, n, l, a, offseta, lda, tau, offsettau, work, offsetwork);
  }

  protected abstract void slatrzK(int m, int n, int l, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork);

  public void slatzm(String side, int m, int n, float[] v, int incv, float tau, float[] c1, float[] c2, int Ldc, float[] work) {
    slatzm(side, m, n, v, 0, incv, tau, c1, 0, c2, 0, Ldc, work, 0);
  }

  public void slatzm(String side, int m, int n, float[] v, int offsetv, int incv, float tau, float[] c1, int offsetc1, float[] c2, int offsetc2, int Ldc, float[] work, int offsetwork) {
    //FIXME Add arguments check
    slatzmK(side, m, n, v, offsetv, incv, tau, c1, offsetc1, c2, offsetc2, Ldc, work, offsetwork);
  }

  protected abstract void slatzmK(String side, int m, int n, float[] v, int offsetv, int incv, float tau, float[] c1, int offsetc1, float[] c2, int offsetc2, int Ldc, float[] work, int offsetwork);

  public void slauu2(String uplo, int n, float[] a, int lda, org.netlib.util.intW info) {
    slauu2(uplo, n, a, 0, lda, info);
  }

  public void slauu2(String uplo, int n, float[] a, int offseta, int lda, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slauu2K(uplo, n, a, offseta, lda, info);
  }

  protected abstract void slauu2K(String uplo, int n, float[] a, int offseta, int lda, org.netlib.util.intW info);

  public void slauum(String uplo, int n, float[] a, int lda, org.netlib.util.intW info) {
    slauum(uplo, n, a, 0, lda, info);
  }

  public void slauum(String uplo, int n, float[] a, int offseta, int lda, org.netlib.util.intW info) {
    //FIXME Add arguments check
    slauumK(uplo, n, a, offseta, lda, info);
  }

  protected abstract void slauumK(String uplo, int n, float[] a, int offseta, int lda, org.netlib.util.intW info);

  public void slazq3(int i0, org.netlib.util.intW n0, float[] z, int pp, org.netlib.util.floatW dmin, org.netlib.util.floatW sigma, org.netlib.util.floatW desig, org.netlib.util.floatW qmax, org.netlib.util.intW nfail, org.netlib.util.intW iter, org.netlib.util.intW ndiv, boolean ieee, org.netlib.util.intW ttype, org.netlib.util.floatW dmin1, org.netlib.util.floatW dmin2, org.netlib.util.floatW dn, org.netlib.util.floatW dn1, org.netlib.util.floatW dn2, org.netlib.util.floatW tau) {
    slazq3(i0, n0, z, 0, pp, dmin, sigma, desig, qmax, nfail, iter, ndiv, ieee, ttype, dmin1, dmin2, dn, dn1, dn2, tau);
  }

  public void slazq3(int i0, org.netlib.util.intW n0, float[] z, int offsetz, int pp, org.netlib.util.floatW dmin, org.netlib.util.floatW sigma, org.netlib.util.floatW desig, org.netlib.util.floatW qmax, org.netlib.util.intW nfail, org.netlib.util.intW iter, org.netlib.util.intW ndiv, boolean ieee, org.netlib.util.intW ttype, org.netlib.util.floatW dmin1, org.netlib.util.floatW dmin2, org.netlib.util.floatW dn, org.netlib.util.floatW dn1, org.netlib.util.floatW dn2, org.netlib.util.floatW tau) {
    //FIXME Add arguments check
    slazq3K(i0, n0, z, offsetz, pp, dmin, sigma, desig, qmax, nfail, iter, ndiv, ieee, ttype, dmin1, dmin2, dn, dn1, dn2, tau);
  }

  protected abstract void slazq3K(int i0, org.netlib.util.intW n0, float[] z, int offsetz, int pp, org.netlib.util.floatW dmin, org.netlib.util.floatW sigma, org.netlib.util.floatW desig, org.netlib.util.floatW qmax, org.netlib.util.intW nfail, org.netlib.util.intW iter, org.netlib.util.intW ndiv, boolean ieee, org.netlib.util.intW ttype, org.netlib.util.floatW dmin1, org.netlib.util.floatW dmin2, org.netlib.util.floatW dn, org.netlib.util.floatW dn1, org.netlib.util.floatW dn2, org.netlib.util.floatW tau);

  public void slazq4(int i0, int n0, float[] z, int pp, int n0in, float dmin, float dmin1, float dmin2, float dn, float dn1, float dn2, org.netlib.util.floatW tau, org.netlib.util.intW ttype, org.netlib.util.floatW g) {
    slazq4(i0, n0, z, 0, pp, n0in, dmin, dmin1, dmin2, dn, dn1, dn2, tau, ttype, g);
  }

  public void slazq4(int i0, int n0, float[] z, int offsetz, int pp, int n0in, float dmin, float dmin1, float dmin2, float dn, float dn1, float dn2, org.netlib.util.floatW tau, org.netlib.util.intW ttype, org.netlib.util.floatW g) {
    //FIXME Add arguments check
    slazq4K(i0, n0, z, offsetz, pp, n0in, dmin, dmin1, dmin2, dn, dn1, dn2, tau, ttype, g);
  }

  protected abstract void slazq4K(int i0, int n0, float[] z, int offsetz, int pp, int n0in, float dmin, float dmin1, float dmin2, float dn, float dn1, float dn2, org.netlib.util.floatW tau, org.netlib.util.intW ttype, org.netlib.util.floatW g);

  public void sopgtr(String uplo, int n, float[] ap, float[] tau, float[] q, int ldq, float[] work, org.netlib.util.intW info) {
    sopgtr(uplo, n, ap, 0, tau, 0, q, 0, ldq, work, 0, info);
  }

  public void sopgtr(String uplo, int n, float[] ap, int offsetap, float[] tau, int offsettau, float[] q, int offsetq, int ldq, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sopgtrK(uplo, n, ap, offsetap, tau, offsettau, q, offsetq, ldq, work, offsetwork, info);
  }

  protected abstract void sopgtrK(String uplo, int n, float[] ap, int offsetap, float[] tau, int offsettau, float[] q, int offsetq, int ldq, float[] work, int offsetwork, org.netlib.util.intW info);

  public void sopmtr(String side, String uplo, String trans, int m, int n, float[] ap, float[] tau, float[] c, int Ldc, float[] work, org.netlib.util.intW info) {
    sopmtr(side, uplo, trans, m, n, ap, 0, tau, 0, c, 0, Ldc, work, 0, info);
  }

  public void sopmtr(String side, String uplo, String trans, int m, int n, float[] ap, int offsetap, float[] tau, int offsettau, float[] c, int offsetc, int Ldc, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sopmtrK(side, uplo, trans, m, n, ap, offsetap, tau, offsettau, c, offsetc, Ldc, work, offsetwork, info);
  }

  protected abstract void sopmtrK(String side, String uplo, String trans, int m, int n, float[] ap, int offsetap, float[] tau, int offsettau, float[] c, int offsetc, int Ldc, float[] work, int offsetwork, org.netlib.util.intW info);

  public void sorg2l(int m, int n, int k, float[] a, int lda, float[] tau, float[] work, org.netlib.util.intW info) {
    sorg2l(m, n, k, a, 0, lda, tau, 0, work, 0, info);
  }

  public void sorg2l(int m, int n, int k, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sorg2lK(m, n, k, a, offseta, lda, tau, offsettau, work, offsetwork, info);
  }

  protected abstract void sorg2lK(int m, int n, int k, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, org.netlib.util.intW info);

  public void sorg2r(int m, int n, int k, float[] a, int lda, float[] tau, float[] work, org.netlib.util.intW info) {
    sorg2r(m, n, k, a, 0, lda, tau, 0, work, 0, info);
  }

  public void sorg2r(int m, int n, int k, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sorg2rK(m, n, k, a, offseta, lda, tau, offsettau, work, offsetwork, info);
  }

  protected abstract void sorg2rK(int m, int n, int k, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, org.netlib.util.intW info);

  public void sorgbr(String vect, int m, int n, int k, float[] a, int lda, float[] tau, float[] work, int lwork, org.netlib.util.intW info) {
    sorgbr(vect, m, n, k, a, 0, lda, tau, 0, work, 0, lwork, info);
  }

  public void sorgbr(String vect, int m, int n, int k, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sorgbrK(vect, m, n, k, a, offseta, lda, tau, offsettau, work, offsetwork, lwork, info);
  }

  protected abstract void sorgbrK(String vect, int m, int n, int k, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void sorghr(int n, int ilo, int ihi, float[] a, int lda, float[] tau, float[] work, int lwork, org.netlib.util.intW info) {
    sorghr(n, ilo, ihi, a, 0, lda, tau, 0, work, 0, lwork, info);
  }

  public void sorghr(int n, int ilo, int ihi, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sorghrK(n, ilo, ihi, a, offseta, lda, tau, offsettau, work, offsetwork, lwork, info);
  }

  protected abstract void sorghrK(int n, int ilo, int ihi, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void sorgl2(int m, int n, int k, float[] a, int lda, float[] tau, float[] work, org.netlib.util.intW info) {
    sorgl2(m, n, k, a, 0, lda, tau, 0, work, 0, info);
  }

  public void sorgl2(int m, int n, int k, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sorgl2K(m, n, k, a, offseta, lda, tau, offsettau, work, offsetwork, info);
  }

  protected abstract void sorgl2K(int m, int n, int k, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, org.netlib.util.intW info);

  public void sorglq(int m, int n, int k, float[] a, int lda, float[] tau, float[] work, int lwork, org.netlib.util.intW info) {
    sorglq(m, n, k, a, 0, lda, tau, 0, work, 0, lwork, info);
  }

  public void sorglq(int m, int n, int k, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sorglqK(m, n, k, a, offseta, lda, tau, offsettau, work, offsetwork, lwork, info);
  }

  protected abstract void sorglqK(int m, int n, int k, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void sorgql(int m, int n, int k, float[] a, int lda, float[] tau, float[] work, int lwork, org.netlib.util.intW info) {
    sorgql(m, n, k, a, 0, lda, tau, 0, work, 0, lwork, info);
  }

  public void sorgql(int m, int n, int k, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sorgqlK(m, n, k, a, offseta, lda, tau, offsettau, work, offsetwork, lwork, info);
  }

  protected abstract void sorgqlK(int m, int n, int k, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void sorgqr(int m, int n, int k, float[] a, int lda, float[] tau, float[] work, int lwork, org.netlib.util.intW info) {
    sorgqr(m, n, k, a, 0, lda, tau, 0, work, 0, lwork, info);
  }

  public void sorgqr(int m, int n, int k, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sorgqrK(m, n, k, a, offseta, lda, tau, offsettau, work, offsetwork, lwork, info);
  }

  protected abstract void sorgqrK(int m, int n, int k, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void sorgr2(int m, int n, int k, float[] a, int lda, float[] tau, float[] work, org.netlib.util.intW info) {
    sorgr2(m, n, k, a, 0, lda, tau, 0, work, 0, info);
  }

  public void sorgr2(int m, int n, int k, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sorgr2K(m, n, k, a, offseta, lda, tau, offsettau, work, offsetwork, info);
  }

  protected abstract void sorgr2K(int m, int n, int k, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, org.netlib.util.intW info);

  public void sorgrq(int m, int n, int k, float[] a, int lda, float[] tau, float[] work, int lwork, org.netlib.util.intW info) {
    sorgrq(m, n, k, a, 0, lda, tau, 0, work, 0, lwork, info);
  }

  public void sorgrq(int m, int n, int k, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sorgrqK(m, n, k, a, offseta, lda, tau, offsettau, work, offsetwork, lwork, info);
  }

  protected abstract void sorgrqK(int m, int n, int k, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void sorgtr(String uplo, int n, float[] a, int lda, float[] tau, float[] work, int lwork, org.netlib.util.intW info) {
    sorgtr(uplo, n, a, 0, lda, tau, 0, work, 0, lwork, info);
  }

  public void sorgtr(String uplo, int n, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sorgtrK(uplo, n, a, offseta, lda, tau, offsettau, work, offsetwork, lwork, info);
  }

  protected abstract void sorgtrK(String uplo, int n, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void sorm2l(String side, String trans, int m, int n, int k, float[] a, int lda, float[] tau, float[] c, int Ldc, float[] work, org.netlib.util.intW info) {
    sorm2l(side, trans, m, n, k, a, 0, lda, tau, 0, c, 0, Ldc, work, 0, info);
  }

  public void sorm2l(String side, String trans, int m, int n, int k, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] c, int offsetc, int Ldc, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sorm2lK(side, trans, m, n, k, a, offseta, lda, tau, offsettau, c, offsetc, Ldc, work, offsetwork, info);
  }

  protected abstract void sorm2lK(String side, String trans, int m, int n, int k, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] c, int offsetc, int Ldc, float[] work, int offsetwork, org.netlib.util.intW info);

  public void sorm2r(String side, String trans, int m, int n, int k, float[] a, int lda, float[] tau, float[] c, int Ldc, float[] work, org.netlib.util.intW info) {
    sorm2r(side, trans, m, n, k, a, 0, lda, tau, 0, c, 0, Ldc, work, 0, info);
  }

  public void sorm2r(String side, String trans, int m, int n, int k, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] c, int offsetc, int Ldc, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sorm2rK(side, trans, m, n, k, a, offseta, lda, tau, offsettau, c, offsetc, Ldc, work, offsetwork, info);
  }

  protected abstract void sorm2rK(String side, String trans, int m, int n, int k, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] c, int offsetc, int Ldc, float[] work, int offsetwork, org.netlib.util.intW info);

  public void sormbr(String vect, String side, String trans, int m, int n, int k, float[] a, int lda, float[] tau, float[] c, int Ldc, float[] work, int lwork, org.netlib.util.intW info) {
    sormbr(vect, side, trans, m, n, k, a, 0, lda, tau, 0, c, 0, Ldc, work, 0, lwork, info);
  }

  public void sormbr(String vect, String side, String trans, int m, int n, int k, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] c, int offsetc, int Ldc, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sormbrK(vect, side, trans, m, n, k, a, offseta, lda, tau, offsettau, c, offsetc, Ldc, work, offsetwork, lwork, info);
  }

  protected abstract void sormbrK(String vect, String side, String trans, int m, int n, int k, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] c, int offsetc, int Ldc, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void sormhr(String side, String trans, int m, int n, int ilo, int ihi, float[] a, int lda, float[] tau, float[] c, int Ldc, float[] work, int lwork, org.netlib.util.intW info) {
    sormhr(side, trans, m, n, ilo, ihi, a, 0, lda, tau, 0, c, 0, Ldc, work, 0, lwork, info);
  }

  public void sormhr(String side, String trans, int m, int n, int ilo, int ihi, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] c, int offsetc, int Ldc, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sormhrK(side, trans, m, n, ilo, ihi, a, offseta, lda, tau, offsettau, c, offsetc, Ldc, work, offsetwork, lwork, info);
  }

  protected abstract void sormhrK(String side, String trans, int m, int n, int ilo, int ihi, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] c, int offsetc, int Ldc, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void sorml2(String side, String trans, int m, int n, int k, float[] a, int lda, float[] tau, float[] c, int Ldc, float[] work, org.netlib.util.intW info) {
    sorml2(side, trans, m, n, k, a, 0, lda, tau, 0, c, 0, Ldc, work, 0, info);
  }

  public void sorml2(String side, String trans, int m, int n, int k, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] c, int offsetc, int Ldc, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sorml2K(side, trans, m, n, k, a, offseta, lda, tau, offsettau, c, offsetc, Ldc, work, offsetwork, info);
  }

  protected abstract void sorml2K(String side, String trans, int m, int n, int k, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] c, int offsetc, int Ldc, float[] work, int offsetwork, org.netlib.util.intW info);

  public void sormlq(String side, String trans, int m, int n, int k, float[] a, int lda, float[] tau, float[] c, int Ldc, float[] work, int lwork, org.netlib.util.intW info) {
    sormlq(side, trans, m, n, k, a, 0, lda, tau, 0, c, 0, Ldc, work, 0, lwork, info);
  }

  public void sormlq(String side, String trans, int m, int n, int k, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] c, int offsetc, int Ldc, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sormlqK(side, trans, m, n, k, a, offseta, lda, tau, offsettau, c, offsetc, Ldc, work, offsetwork, lwork, info);
  }

  protected abstract void sormlqK(String side, String trans, int m, int n, int k, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] c, int offsetc, int Ldc, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void sormql(String side, String trans, int m, int n, int k, float[] a, int lda, float[] tau, float[] c, int Ldc, float[] work, int lwork, org.netlib.util.intW info) {
    sormql(side, trans, m, n, k, a, 0, lda, tau, 0, c, 0, Ldc, work, 0, lwork, info);
  }

  public void sormql(String side, String trans, int m, int n, int k, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] c, int offsetc, int Ldc, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sormqlK(side, trans, m, n, k, a, offseta, lda, tau, offsettau, c, offsetc, Ldc, work, offsetwork, lwork, info);
  }

  protected abstract void sormqlK(String side, String trans, int m, int n, int k, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] c, int offsetc, int Ldc, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void sormqr(String side, String trans, int m, int n, int k, float[] a, int lda, float[] tau, float[] c, int Ldc, float[] work, int lwork, org.netlib.util.intW info) {
    sormqr(side, trans, m, n, k, a, 0, lda, tau, 0, c, 0, Ldc, work, 0, lwork, info);
  }

  public void sormqr(String side, String trans, int m, int n, int k, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] c, int offsetc, int Ldc, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sormqrK(side, trans, m, n, k, a, offseta, lda, tau, offsettau, c, offsetc, Ldc, work, offsetwork, lwork, info);
  }

  protected abstract void sormqrK(String side, String trans, int m, int n, int k, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] c, int offsetc, int Ldc, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void sormr2(String side, String trans, int m, int n, int k, float[] a, int lda, float[] tau, float[] c, int Ldc, float[] work, org.netlib.util.intW info) {
    sormr2(side, trans, m, n, k, a, 0, lda, tau, 0, c, 0, Ldc, work, 0, info);
  }

  public void sormr2(String side, String trans, int m, int n, int k, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] c, int offsetc, int Ldc, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sormr2K(side, trans, m, n, k, a, offseta, lda, tau, offsettau, c, offsetc, Ldc, work, offsetwork, info);
  }

  protected abstract void sormr2K(String side, String trans, int m, int n, int k, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] c, int offsetc, int Ldc, float[] work, int offsetwork, org.netlib.util.intW info);

  public void sormr3(String side, String trans, int m, int n, int k, int l, float[] a, int lda, float[] tau, float[] c, int Ldc, float[] work, org.netlib.util.intW info) {
    sormr3(side, trans, m, n, k, l, a, 0, lda, tau, 0, c, 0, Ldc, work, 0, info);
  }

  public void sormr3(String side, String trans, int m, int n, int k, int l, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] c, int offsetc, int Ldc, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sormr3K(side, trans, m, n, k, l, a, offseta, lda, tau, offsettau, c, offsetc, Ldc, work, offsetwork, info);
  }

  protected abstract void sormr3K(String side, String trans, int m, int n, int k, int l, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] c, int offsetc, int Ldc, float[] work, int offsetwork, org.netlib.util.intW info);

  public void sormrq(String side, String trans, int m, int n, int k, float[] a, int lda, float[] tau, float[] c, int Ldc, float[] work, int lwork, org.netlib.util.intW info) {
    sormrq(side, trans, m, n, k, a, 0, lda, tau, 0, c, 0, Ldc, work, 0, lwork, info);
  }

  public void sormrq(String side, String trans, int m, int n, int k, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] c, int offsetc, int Ldc, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sormrqK(side, trans, m, n, k, a, offseta, lda, tau, offsettau, c, offsetc, Ldc, work, offsetwork, lwork, info);
  }

  protected abstract void sormrqK(String side, String trans, int m, int n, int k, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] c, int offsetc, int Ldc, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void sormrz(String side, String trans, int m, int n, int k, int l, float[] a, int lda, float[] tau, float[] c, int Ldc, float[] work, int lwork, org.netlib.util.intW info) {
    sormrz(side, trans, m, n, k, l, a, 0, lda, tau, 0, c, 0, Ldc, work, 0, lwork, info);
  }

  public void sormrz(String side, String trans, int m, int n, int k, int l, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] c, int offsetc, int Ldc, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sormrzK(side, trans, m, n, k, l, a, offseta, lda, tau, offsettau, c, offsetc, Ldc, work, offsetwork, lwork, info);
  }

  protected abstract void sormrzK(String side, String trans, int m, int n, int k, int l, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] c, int offsetc, int Ldc, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void sormtr(String side, String uplo, String trans, int m, int n, float[] a, int lda, float[] tau, float[] c, int Ldc, float[] work, int lwork, org.netlib.util.intW info) {
    sormtr(side, uplo, trans, m, n, a, 0, lda, tau, 0, c, 0, Ldc, work, 0, lwork, info);
  }

  public void sormtr(String side, String uplo, String trans, int m, int n, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] c, int offsetc, int Ldc, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sormtrK(side, uplo, trans, m, n, a, offseta, lda, tau, offsettau, c, offsetc, Ldc, work, offsetwork, lwork, info);
  }

  protected abstract void sormtrK(String side, String uplo, String trans, int m, int n, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] c, int offsetc, int Ldc, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void spbcon(String uplo, int n, int kd, float[] ab, int ldab, float anorm, org.netlib.util.floatW rcond, float[] work, int[] iwork, org.netlib.util.intW info) {
    spbcon(uplo, n, kd, ab, 0, ldab, anorm, rcond, work, 0, iwork, 0, info);
  }

  public void spbcon(String uplo, int n, int kd, float[] ab, int offsetab, int ldab, float anorm, org.netlib.util.floatW rcond, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    spbconK(uplo, n, kd, ab, offsetab, ldab, anorm, rcond, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void spbconK(String uplo, int n, int kd, float[] ab, int offsetab, int ldab, float anorm, org.netlib.util.floatW rcond, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void spbequ(String uplo, int n, int kd, float[] ab, int ldab, float[] s, org.netlib.util.floatW scond, org.netlib.util.floatW amax, org.netlib.util.intW info) {
    spbequ(uplo, n, kd, ab, 0, ldab, s, 0, scond, amax, info);
  }

  public void spbequ(String uplo, int n, int kd, float[] ab, int offsetab, int ldab, float[] s, int offsets, org.netlib.util.floatW scond, org.netlib.util.floatW amax, org.netlib.util.intW info) {
    //FIXME Add arguments check
    spbequK(uplo, n, kd, ab, offsetab, ldab, s, offsets, scond, amax, info);
  }

  protected abstract void spbequK(String uplo, int n, int kd, float[] ab, int offsetab, int ldab, float[] s, int offsets, org.netlib.util.floatW scond, org.netlib.util.floatW amax, org.netlib.util.intW info);

  public void spbrfs(String uplo, int n, int kd, int nrhs, float[] ab, int ldab, float[] afb, int ldafb, float[] b, int ldb, float[] x, int ldx, float[] ferr, float[] berr, float[] work, int[] iwork, org.netlib.util.intW info) {
    spbrfs(uplo, n, kd, nrhs, ab, 0, ldab, afb, 0, ldafb, b, 0, ldb, x, 0, ldx, ferr, 0, berr, 0, work, 0, iwork, 0, info);
  }

  public void spbrfs(String uplo, int n, int kd, int nrhs, float[] ab, int offsetab, int ldab, float[] afb, int offsetafb, int ldafb, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    spbrfsK(uplo, n, kd, nrhs, ab, offsetab, ldab, afb, offsetafb, ldafb, b, offsetb, ldb, x, offsetx, ldx, ferr, offsetferr, berr, offsetberr, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void spbrfsK(String uplo, int n, int kd, int nrhs, float[] ab, int offsetab, int ldab, float[] afb, int offsetafb, int ldafb, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void spbstf(String uplo, int n, int kd, float[] ab, int ldab, org.netlib.util.intW info) {
    spbstf(uplo, n, kd, ab, 0, ldab, info);
  }

  public void spbstf(String uplo, int n, int kd, float[] ab, int offsetab, int ldab, org.netlib.util.intW info) {
    //FIXME Add arguments check
    spbstfK(uplo, n, kd, ab, offsetab, ldab, info);
  }

  protected abstract void spbstfK(String uplo, int n, int kd, float[] ab, int offsetab, int ldab, org.netlib.util.intW info);

  public void spbsv(String uplo, int n, int kd, int nrhs, float[] ab, int ldab, float[] b, int ldb, org.netlib.util.intW info) {
    spbsv(uplo, n, kd, nrhs, ab, 0, ldab, b, 0, ldb, info);
  }

  public void spbsv(String uplo, int n, int kd, int nrhs, float[] ab, int offsetab, int ldab, float[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    spbsvK(uplo, n, kd, nrhs, ab, offsetab, ldab, b, offsetb, ldb, info);
  }

  protected abstract void spbsvK(String uplo, int n, int kd, int nrhs, float[] ab, int offsetab, int ldab, float[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void spbsvx(String fact, String uplo, int n, int kd, int nrhs, float[] ab, int ldab, float[] afb, int ldafb, org.netlib.util.StringW equed, float[] s, float[] b, int ldb, float[] x, int ldx, org.netlib.util.floatW rcond, float[] ferr, float[] berr, float[] work, int[] iwork, org.netlib.util.intW info) {
    spbsvx(fact, uplo, n, kd, nrhs, ab, 0, ldab, afb, 0, ldafb, equed, s, 0, b, 0, ldb, x, 0, ldx, rcond, ferr, 0, berr, 0, work, 0, iwork, 0, info);
  }

  public void spbsvx(String fact, String uplo, int n, int kd, int nrhs, float[] ab, int offsetab, int ldab, float[] afb, int offsetafb, int ldafb, org.netlib.util.StringW equed, float[] s, int offsets, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, org.netlib.util.floatW rcond, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    spbsvxK(fact, uplo, n, kd, nrhs, ab, offsetab, ldab, afb, offsetafb, ldafb, equed, s, offsets, b, offsetb, ldb, x, offsetx, ldx, rcond, ferr, offsetferr, berr, offsetberr, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void spbsvxK(String fact, String uplo, int n, int kd, int nrhs, float[] ab, int offsetab, int ldab, float[] afb, int offsetafb, int ldafb, org.netlib.util.StringW equed, float[] s, int offsets, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, org.netlib.util.floatW rcond, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void spbtf2(String uplo, int n, int kd, float[] ab, int ldab, org.netlib.util.intW info) {
    spbtf2(uplo, n, kd, ab, 0, ldab, info);
  }

  public void spbtf2(String uplo, int n, int kd, float[] ab, int offsetab, int ldab, org.netlib.util.intW info) {
    //FIXME Add arguments check
    spbtf2K(uplo, n, kd, ab, offsetab, ldab, info);
  }

  protected abstract void spbtf2K(String uplo, int n, int kd, float[] ab, int offsetab, int ldab, org.netlib.util.intW info);

  public void spbtrf(String uplo, int n, int kd, float[] ab, int ldab, org.netlib.util.intW info) {
    spbtrf(uplo, n, kd, ab, 0, ldab, info);
  }

  public void spbtrf(String uplo, int n, int kd, float[] ab, int offsetab, int ldab, org.netlib.util.intW info) {
    //FIXME Add arguments check
    spbtrfK(uplo, n, kd, ab, offsetab, ldab, info);
  }

  protected abstract void spbtrfK(String uplo, int n, int kd, float[] ab, int offsetab, int ldab, org.netlib.util.intW info);

  public void spbtrs(String uplo, int n, int kd, int nrhs, float[] ab, int ldab, float[] b, int ldb, org.netlib.util.intW info) {
    spbtrs(uplo, n, kd, nrhs, ab, 0, ldab, b, 0, ldb, info);
  }

  public void spbtrs(String uplo, int n, int kd, int nrhs, float[] ab, int offsetab, int ldab, float[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    spbtrsK(uplo, n, kd, nrhs, ab, offsetab, ldab, b, offsetb, ldb, info);
  }

  protected abstract void spbtrsK(String uplo, int n, int kd, int nrhs, float[] ab, int offsetab, int ldab, float[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void spocon(String uplo, int n, float[] a, int lda, float anorm, org.netlib.util.floatW rcond, float[] work, int[] iwork, org.netlib.util.intW info) {
    spocon(uplo, n, a, 0, lda, anorm, rcond, work, 0, iwork, 0, info);
  }

  public void spocon(String uplo, int n, float[] a, int offseta, int lda, float anorm, org.netlib.util.floatW rcond, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    spoconK(uplo, n, a, offseta, lda, anorm, rcond, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void spoconK(String uplo, int n, float[] a, int offseta, int lda, float anorm, org.netlib.util.floatW rcond, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void spoequ(int n, float[] a, int lda, float[] s, org.netlib.util.floatW scond, org.netlib.util.floatW amax, org.netlib.util.intW info) {
    spoequ(n, a, 0, lda, s, 0, scond, amax, info);
  }

  public void spoequ(int n, float[] a, int offseta, int lda, float[] s, int offsets, org.netlib.util.floatW scond, org.netlib.util.floatW amax, org.netlib.util.intW info) {
    //FIXME Add arguments check
    spoequK(n, a, offseta, lda, s, offsets, scond, amax, info);
  }

  protected abstract void spoequK(int n, float[] a, int offseta, int lda, float[] s, int offsets, org.netlib.util.floatW scond, org.netlib.util.floatW amax, org.netlib.util.intW info);

  public void sporfs(String uplo, int n, int nrhs, float[] a, int lda, float[] af, int ldaf, float[] b, int ldb, float[] x, int ldx, float[] ferr, float[] berr, float[] work, int[] iwork, org.netlib.util.intW info) {
    sporfs(uplo, n, nrhs, a, 0, lda, af, 0, ldaf, b, 0, ldb, x, 0, ldx, ferr, 0, berr, 0, work, 0, iwork, 0, info);
  }

  public void sporfs(String uplo, int n, int nrhs, float[] a, int offseta, int lda, float[] af, int offsetaf, int ldaf, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sporfsK(uplo, n, nrhs, a, offseta, lda, af, offsetaf, ldaf, b, offsetb, ldb, x, offsetx, ldx, ferr, offsetferr, berr, offsetberr, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void sporfsK(String uplo, int n, int nrhs, float[] a, int offseta, int lda, float[] af, int offsetaf, int ldaf, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void sposv(String uplo, int n, int nrhs, float[] a, int lda, float[] b, int ldb, org.netlib.util.intW info) {
    sposv(uplo, n, nrhs, a, 0, lda, b, 0, ldb, info);
  }

  public void sposv(String uplo, int n, int nrhs, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sposvK(uplo, n, nrhs, a, offseta, lda, b, offsetb, ldb, info);
  }

  protected abstract void sposvK(String uplo, int n, int nrhs, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void sposvx(String fact, String uplo, int n, int nrhs, float[] a, int lda, float[] af, int ldaf, org.netlib.util.StringW equed, float[] s, float[] b, int ldb, float[] x, int ldx, org.netlib.util.floatW rcond, float[] ferr, float[] berr, float[] work, int[] iwork, org.netlib.util.intW info) {
    sposvx(fact, uplo, n, nrhs, a, 0, lda, af, 0, ldaf, equed, s, 0, b, 0, ldb, x, 0, ldx, rcond, ferr, 0, berr, 0, work, 0, iwork, 0, info);
  }

  public void sposvx(String fact, String uplo, int n, int nrhs, float[] a, int offseta, int lda, float[] af, int offsetaf, int ldaf, org.netlib.util.StringW equed, float[] s, int offsets, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, org.netlib.util.floatW rcond, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sposvxK(fact, uplo, n, nrhs, a, offseta, lda, af, offsetaf, ldaf, equed, s, offsets, b, offsetb, ldb, x, offsetx, ldx, rcond, ferr, offsetferr, berr, offsetberr, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void sposvxK(String fact, String uplo, int n, int nrhs, float[] a, int offseta, int lda, float[] af, int offsetaf, int ldaf, org.netlib.util.StringW equed, float[] s, int offsets, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, org.netlib.util.floatW rcond, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void spotf2(String uplo, int n, float[] a, int lda, org.netlib.util.intW info) {
    spotf2(uplo, n, a, 0, lda, info);
  }

  public void spotf2(String uplo, int n, float[] a, int offseta, int lda, org.netlib.util.intW info) {
    //FIXME Add arguments check
    spotf2K(uplo, n, a, offseta, lda, info);
  }

  protected abstract void spotf2K(String uplo, int n, float[] a, int offseta, int lda, org.netlib.util.intW info);

  public void spotrf(String uplo, int n, float[] a, int lda, org.netlib.util.intW info) {
    spotrf(uplo, n, a, 0, lda, info);
  }

  public void spotrf(String uplo, int n, float[] a, int offseta, int lda, org.netlib.util.intW info) {
    //FIXME Add arguments check
    spotrfK(uplo, n, a, offseta, lda, info);
  }

  protected abstract void spotrfK(String uplo, int n, float[] a, int offseta, int lda, org.netlib.util.intW info);

  public void spotri(String uplo, int n, float[] a, int lda, org.netlib.util.intW info) {
    spotri(uplo, n, a, 0, lda, info);
  }

  public void spotri(String uplo, int n, float[] a, int offseta, int lda, org.netlib.util.intW info) {
    //FIXME Add arguments check
    spotriK(uplo, n, a, offseta, lda, info);
  }

  protected abstract void spotriK(String uplo, int n, float[] a, int offseta, int lda, org.netlib.util.intW info);

  public void spotrs(String uplo, int n, int nrhs, float[] a, int lda, float[] b, int ldb, org.netlib.util.intW info) {
    spotrs(uplo, n, nrhs, a, 0, lda, b, 0, ldb, info);
  }

  public void spotrs(String uplo, int n, int nrhs, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    spotrsK(uplo, n, nrhs, a, offseta, lda, b, offsetb, ldb, info);
  }

  protected abstract void spotrsK(String uplo, int n, int nrhs, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void sppcon(String uplo, int n, float[] ap, float anorm, org.netlib.util.floatW rcond, float[] work, int[] iwork, org.netlib.util.intW info) {
    sppcon(uplo, n, ap, 0, anorm, rcond, work, 0, iwork, 0, info);
  }

  public void sppcon(String uplo, int n, float[] ap, int offsetap, float anorm, org.netlib.util.floatW rcond, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sppconK(uplo, n, ap, offsetap, anorm, rcond, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void sppconK(String uplo, int n, float[] ap, int offsetap, float anorm, org.netlib.util.floatW rcond, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void sppequ(String uplo, int n, float[] ap, float[] s, org.netlib.util.floatW scond, org.netlib.util.floatW amax, org.netlib.util.intW info) {
    sppequ(uplo, n, ap, 0, s, 0, scond, amax, info);
  }

  public void sppequ(String uplo, int n, float[] ap, int offsetap, float[] s, int offsets, org.netlib.util.floatW scond, org.netlib.util.floatW amax, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sppequK(uplo, n, ap, offsetap, s, offsets, scond, amax, info);
  }

  protected abstract void sppequK(String uplo, int n, float[] ap, int offsetap, float[] s, int offsets, org.netlib.util.floatW scond, org.netlib.util.floatW amax, org.netlib.util.intW info);

  public void spprfs(String uplo, int n, int nrhs, float[] ap, float[] afp, float[] b, int ldb, float[] x, int ldx, float[] ferr, float[] berr, float[] work, int[] iwork, org.netlib.util.intW info) {
    spprfs(uplo, n, nrhs, ap, 0, afp, 0, b, 0, ldb, x, 0, ldx, ferr, 0, berr, 0, work, 0, iwork, 0, info);
  }

  public void spprfs(String uplo, int n, int nrhs, float[] ap, int offsetap, float[] afp, int offsetafp, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    spprfsK(uplo, n, nrhs, ap, offsetap, afp, offsetafp, b, offsetb, ldb, x, offsetx, ldx, ferr, offsetferr, berr, offsetberr, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void spprfsK(String uplo, int n, int nrhs, float[] ap, int offsetap, float[] afp, int offsetafp, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void sppsv(String uplo, int n, int nrhs, float[] ap, float[] b, int ldb, org.netlib.util.intW info) {
    sppsv(uplo, n, nrhs, ap, 0, b, 0, ldb, info);
  }

  public void sppsv(String uplo, int n, int nrhs, float[] ap, int offsetap, float[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sppsvK(uplo, n, nrhs, ap, offsetap, b, offsetb, ldb, info);
  }

  protected abstract void sppsvK(String uplo, int n, int nrhs, float[] ap, int offsetap, float[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void sppsvx(String fact, String uplo, int n, int nrhs, float[] ap, float[] afp, org.netlib.util.StringW equed, float[] s, float[] b, int ldb, float[] x, int ldx, org.netlib.util.floatW rcond, float[] ferr, float[] berr, float[] work, int[] iwork, org.netlib.util.intW info) {
    sppsvx(fact, uplo, n, nrhs, ap, 0, afp, 0, equed, s, 0, b, 0, ldb, x, 0, ldx, rcond, ferr, 0, berr, 0, work, 0, iwork, 0, info);
  }

  public void sppsvx(String fact, String uplo, int n, int nrhs, float[] ap, int offsetap, float[] afp, int offsetafp, org.netlib.util.StringW equed, float[] s, int offsets, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, org.netlib.util.floatW rcond, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sppsvxK(fact, uplo, n, nrhs, ap, offsetap, afp, offsetafp, equed, s, offsets, b, offsetb, ldb, x, offsetx, ldx, rcond, ferr, offsetferr, berr, offsetberr, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void sppsvxK(String fact, String uplo, int n, int nrhs, float[] ap, int offsetap, float[] afp, int offsetafp, org.netlib.util.StringW equed, float[] s, int offsets, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, org.netlib.util.floatW rcond, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void spptrf(String uplo, int n, float[] ap, org.netlib.util.intW info) {
    spptrf(uplo, n, ap, 0, info);
  }

  public void spptrf(String uplo, int n, float[] ap, int offsetap, org.netlib.util.intW info) {
    //FIXME Add arguments check
    spptrfK(uplo, n, ap, offsetap, info);
  }

  protected abstract void spptrfK(String uplo, int n, float[] ap, int offsetap, org.netlib.util.intW info);

  public void spptri(String uplo, int n, float[] ap, org.netlib.util.intW info) {
    spptri(uplo, n, ap, 0, info);
  }

  public void spptri(String uplo, int n, float[] ap, int offsetap, org.netlib.util.intW info) {
    //FIXME Add arguments check
    spptriK(uplo, n, ap, offsetap, info);
  }

  protected abstract void spptriK(String uplo, int n, float[] ap, int offsetap, org.netlib.util.intW info);

  public void spptrs(String uplo, int n, int nrhs, float[] ap, float[] b, int ldb, org.netlib.util.intW info) {
    spptrs(uplo, n, nrhs, ap, 0, b, 0, ldb, info);
  }

  public void spptrs(String uplo, int n, int nrhs, float[] ap, int offsetap, float[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    spptrsK(uplo, n, nrhs, ap, offsetap, b, offsetb, ldb, info);
  }

  protected abstract void spptrsK(String uplo, int n, int nrhs, float[] ap, int offsetap, float[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void sptcon(int n, float[] d, float[] e, float anorm, org.netlib.util.floatW rcond, float[] work, org.netlib.util.intW info) {
    sptcon(n, d, 0, e, 0, anorm, rcond, work, 0, info);
  }

  public void sptcon(int n, float[] d, int offsetd, float[] e, int offsete, float anorm, org.netlib.util.floatW rcond, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sptconK(n, d, offsetd, e, offsete, anorm, rcond, work, offsetwork, info);
  }

  protected abstract void sptconK(int n, float[] d, int offsetd, float[] e, int offsete, float anorm, org.netlib.util.floatW rcond, float[] work, int offsetwork, org.netlib.util.intW info);

  public void spteqr(String compz, int n, float[] d, float[] e, float[] z, int ldz, float[] work, org.netlib.util.intW info) {
    spteqr(compz, n, d, 0, e, 0, z, 0, ldz, work, 0, info);
  }

  public void spteqr(String compz, int n, float[] d, int offsetd, float[] e, int offsete, float[] z, int offsetz, int ldz, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    spteqrK(compz, n, d, offsetd, e, offsete, z, offsetz, ldz, work, offsetwork, info);
  }

  protected abstract void spteqrK(String compz, int n, float[] d, int offsetd, float[] e, int offsete, float[] z, int offsetz, int ldz, float[] work, int offsetwork, org.netlib.util.intW info);

  public void sptrfs(int n, int nrhs, float[] d, float[] e, float[] df, float[] ef, float[] b, int ldb, float[] x, int ldx, float[] ferr, float[] berr, float[] work, org.netlib.util.intW info) {
    sptrfs(n, nrhs, d, 0, e, 0, df, 0, ef, 0, b, 0, ldb, x, 0, ldx, ferr, 0, berr, 0, work, 0, info);
  }

  public void sptrfs(int n, int nrhs, float[] d, int offsetd, float[] e, int offsete, float[] df, int offsetdf, float[] ef, int offsetef, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sptrfsK(n, nrhs, d, offsetd, e, offsete, df, offsetdf, ef, offsetef, b, offsetb, ldb, x, offsetx, ldx, ferr, offsetferr, berr, offsetberr, work, offsetwork, info);
  }

  protected abstract void sptrfsK(int n, int nrhs, float[] d, int offsetd, float[] e, int offsete, float[] df, int offsetdf, float[] ef, int offsetef, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, org.netlib.util.intW info);

  public void sptsv(int n, int nrhs, float[] d, float[] e, float[] b, int ldb, org.netlib.util.intW info) {
    sptsv(n, nrhs, d, 0, e, 0, b, 0, ldb, info);
  }

  public void sptsv(int n, int nrhs, float[] d, int offsetd, float[] e, int offsete, float[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sptsvK(n, nrhs, d, offsetd, e, offsete, b, offsetb, ldb, info);
  }

  protected abstract void sptsvK(int n, int nrhs, float[] d, int offsetd, float[] e, int offsete, float[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void sptsvx(String fact, int n, int nrhs, float[] d, float[] e, float[] df, float[] ef, float[] b, int ldb, float[] x, int ldx, org.netlib.util.floatW rcond, float[] ferr, float[] berr, float[] work, org.netlib.util.intW info) {
    sptsvx(fact, n, nrhs, d, 0, e, 0, df, 0, ef, 0, b, 0, ldb, x, 0, ldx, rcond, ferr, 0, berr, 0, work, 0, info);
  }

  public void sptsvx(String fact, int n, int nrhs, float[] d, int offsetd, float[] e, int offsete, float[] df, int offsetdf, float[] ef, int offsetef, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, org.netlib.util.floatW rcond, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sptsvxK(fact, n, nrhs, d, offsetd, e, offsete, df, offsetdf, ef, offsetef, b, offsetb, ldb, x, offsetx, ldx, rcond, ferr, offsetferr, berr, offsetberr, work, offsetwork, info);
  }

  protected abstract void sptsvxK(String fact, int n, int nrhs, float[] d, int offsetd, float[] e, int offsete, float[] df, int offsetdf, float[] ef, int offsetef, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, org.netlib.util.floatW rcond, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, org.netlib.util.intW info);

  public void spttrf(int n, float[] d, float[] e, org.netlib.util.intW info) {
    spttrf(n, d, 0, e, 0, info);
  }

  public void spttrf(int n, float[] d, int offsetd, float[] e, int offsete, org.netlib.util.intW info) {
    //FIXME Add arguments check
    spttrfK(n, d, offsetd, e, offsete, info);
  }

  protected abstract void spttrfK(int n, float[] d, int offsetd, float[] e, int offsete, org.netlib.util.intW info);

  public void spttrs(int n, int nrhs, float[] d, float[] e, float[] b, int ldb, org.netlib.util.intW info) {
    spttrs(n, nrhs, d, 0, e, 0, b, 0, ldb, info);
  }

  public void spttrs(int n, int nrhs, float[] d, int offsetd, float[] e, int offsete, float[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    spttrsK(n, nrhs, d, offsetd, e, offsete, b, offsetb, ldb, info);
  }

  protected abstract void spttrsK(int n, int nrhs, float[] d, int offsetd, float[] e, int offsete, float[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void sptts2(int n, int nrhs, float[] d, float[] e, float[] b, int ldb) {
    sptts2(n, nrhs, d, 0, e, 0, b, 0, ldb);
  }

  public void sptts2(int n, int nrhs, float[] d, int offsetd, float[] e, int offsete, float[] b, int offsetb, int ldb) {
    //FIXME Add arguments check
    sptts2K(n, nrhs, d, offsetd, e, offsete, b, offsetb, ldb);
  }

  protected abstract void sptts2K(int n, int nrhs, float[] d, int offsetd, float[] e, int offsete, float[] b, int offsetb, int ldb);

  public void srscl(int n, float sa, float[] sx, int incx) {
    srscl(n, sa, sx, 0, incx);
  }

  public void srscl(int n, float sa, float[] sx, int offsetsx, int incx) {
    //FIXME Add arguments check
    srsclK(n, sa, sx, offsetsx, incx);
  }

  protected abstract void srsclK(int n, float sa, float[] sx, int offsetsx, int incx);

  public void ssbev(String jobz, String uplo, int n, int kd, float[] ab, int ldab, float[] w, float[] z, int ldz, float[] work, org.netlib.util.intW info) {
    ssbev(jobz, uplo, n, kd, ab, 0, ldab, w, 0, z, 0, ldz, work, 0, info);
  }

  public void ssbev(String jobz, String uplo, int n, int kd, float[] ab, int offsetab, int ldab, float[] w, int offsetw, float[] z, int offsetz, int ldz, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    ssbevK(jobz, uplo, n, kd, ab, offsetab, ldab, w, offsetw, z, offsetz, ldz, work, offsetwork, info);
  }

  protected abstract void ssbevK(String jobz, String uplo, int n, int kd, float[] ab, int offsetab, int ldab, float[] w, int offsetw, float[] z, int offsetz, int ldz, float[] work, int offsetwork, org.netlib.util.intW info);

  public void ssbevd(String jobz, String uplo, int n, int kd, float[] ab, int ldab, float[] w, float[] z, int ldz, float[] work, int lwork, int[] iwork, int liwork, org.netlib.util.intW info) {
    ssbevd(jobz, uplo, n, kd, ab, 0, ldab, w, 0, z, 0, ldz, work, 0, lwork, iwork, 0, liwork, info);
  }

  public void ssbevd(String jobz, String uplo, int n, int kd, float[] ab, int offsetab, int ldab, float[] w, int offsetw, float[] z, int offsetz, int ldz, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    ssbevdK(jobz, uplo, n, kd, ab, offsetab, ldab, w, offsetw, z, offsetz, ldz, work, offsetwork, lwork, iwork, offsetiwork, liwork, info);
  }

  protected abstract void ssbevdK(String jobz, String uplo, int n, int kd, float[] ab, int offsetab, int ldab, float[] w, int offsetw, float[] z, int offsetz, int ldz, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info);

  public void ssbevx(String jobz, String range, String uplo, int n, int kd, float[] ab, int ldab, float[] q, int ldq, float vl, float vu, int il, int iu, float abstol, org.netlib.util.intW m, float[] w, float[] z, int ldz, float[] work, int[] iwork, int[] ifail, org.netlib.util.intW info) {
    ssbevx(jobz, range, uplo, n, kd, ab, 0, ldab, q, 0, ldq, vl, vu, il, iu, abstol, m, w, 0, z, 0, ldz, work, 0, iwork, 0, ifail, 0, info);
  }

  public void ssbevx(String jobz, String range, String uplo, int n, int kd, float[] ab, int offsetab, int ldab, float[] q, int offsetq, int ldq, float vl, float vu, int il, int iu, float abstol, org.netlib.util.intW m, float[] w, int offsetw, float[] z, int offsetz, int ldz, float[] work, int offsetwork, int[] iwork, int offsetiwork, int[] ifail, int offsetifail, org.netlib.util.intW info) {
    //FIXME Add arguments check
    ssbevxK(jobz, range, uplo, n, kd, ab, offsetab, ldab, q, offsetq, ldq, vl, vu, il, iu, abstol, m, w, offsetw, z, offsetz, ldz, work, offsetwork, iwork, offsetiwork, ifail, offsetifail, info);
  }

  protected abstract void ssbevxK(String jobz, String range, String uplo, int n, int kd, float[] ab, int offsetab, int ldab, float[] q, int offsetq, int ldq, float vl, float vu, int il, int iu, float abstol, org.netlib.util.intW m, float[] w, int offsetw, float[] z, int offsetz, int ldz, float[] work, int offsetwork, int[] iwork, int offsetiwork, int[] ifail, int offsetifail, org.netlib.util.intW info);

  public void ssbgst(String vect, String uplo, int n, int ka, int kb, float[] ab, int ldab, float[] bb, int ldbb, float[] x, int ldx, float[] work, org.netlib.util.intW info) {
    ssbgst(vect, uplo, n, ka, kb, ab, 0, ldab, bb, 0, ldbb, x, 0, ldx, work, 0, info);
  }

  public void ssbgst(String vect, String uplo, int n, int ka, int kb, float[] ab, int offsetab, int ldab, float[] bb, int offsetbb, int ldbb, float[] x, int offsetx, int ldx, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    ssbgstK(vect, uplo, n, ka, kb, ab, offsetab, ldab, bb, offsetbb, ldbb, x, offsetx, ldx, work, offsetwork, info);
  }

  protected abstract void ssbgstK(String vect, String uplo, int n, int ka, int kb, float[] ab, int offsetab, int ldab, float[] bb, int offsetbb, int ldbb, float[] x, int offsetx, int ldx, float[] work, int offsetwork, org.netlib.util.intW info);

  public void ssbgv(String jobz, String uplo, int n, int ka, int kb, float[] ab, int ldab, float[] bb, int ldbb, float[] w, float[] z, int ldz, float[] work, org.netlib.util.intW info) {
    ssbgv(jobz, uplo, n, ka, kb, ab, 0, ldab, bb, 0, ldbb, w, 0, z, 0, ldz, work, 0, info);
  }

  public void ssbgv(String jobz, String uplo, int n, int ka, int kb, float[] ab, int offsetab, int ldab, float[] bb, int offsetbb, int ldbb, float[] w, int offsetw, float[] z, int offsetz, int ldz, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    ssbgvK(jobz, uplo, n, ka, kb, ab, offsetab, ldab, bb, offsetbb, ldbb, w, offsetw, z, offsetz, ldz, work, offsetwork, info);
  }

  protected abstract void ssbgvK(String jobz, String uplo, int n, int ka, int kb, float[] ab, int offsetab, int ldab, float[] bb, int offsetbb, int ldbb, float[] w, int offsetw, float[] z, int offsetz, int ldz, float[] work, int offsetwork, org.netlib.util.intW info);

  public void ssbgvd(String jobz, String uplo, int n, int ka, int kb, float[] ab, int ldab, float[] bb, int ldbb, float[] w, float[] z, int ldz, float[] work, int lwork, int[] iwork, int liwork, org.netlib.util.intW info) {
    ssbgvd(jobz, uplo, n, ka, kb, ab, 0, ldab, bb, 0, ldbb, w, 0, z, 0, ldz, work, 0, lwork, iwork, 0, liwork, info);
  }

  public void ssbgvd(String jobz, String uplo, int n, int ka, int kb, float[] ab, int offsetab, int ldab, float[] bb, int offsetbb, int ldbb, float[] w, int offsetw, float[] z, int offsetz, int ldz, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    ssbgvdK(jobz, uplo, n, ka, kb, ab, offsetab, ldab, bb, offsetbb, ldbb, w, offsetw, z, offsetz, ldz, work, offsetwork, lwork, iwork, offsetiwork, liwork, info);
  }

  protected abstract void ssbgvdK(String jobz, String uplo, int n, int ka, int kb, float[] ab, int offsetab, int ldab, float[] bb, int offsetbb, int ldbb, float[] w, int offsetw, float[] z, int offsetz, int ldz, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info);

  public void ssbgvx(String jobz, String range, String uplo, int n, int ka, int kb, float[] ab, int ldab, float[] bb, int ldbb, float[] q, int ldq, float vl, float vu, int il, int iu, float abstol, org.netlib.util.intW m, float[] w, float[] z, int ldz, float[] work, int[] iwork, int[] ifail, org.netlib.util.intW info) {
    ssbgvx(jobz, range, uplo, n, ka, kb, ab, 0, ldab, bb, 0, ldbb, q, 0, ldq, vl, vu, il, iu, abstol, m, w, 0, z, 0, ldz, work, 0, iwork, 0, ifail, 0, info);
  }

  public void ssbgvx(String jobz, String range, String uplo, int n, int ka, int kb, float[] ab, int offsetab, int ldab, float[] bb, int offsetbb, int ldbb, float[] q, int offsetq, int ldq, float vl, float vu, int il, int iu, float abstol, org.netlib.util.intW m, float[] w, int offsetw, float[] z, int offsetz, int ldz, float[] work, int offsetwork, int[] iwork, int offsetiwork, int[] ifail, int offsetifail, org.netlib.util.intW info) {
    //FIXME Add arguments check
    ssbgvxK(jobz, range, uplo, n, ka, kb, ab, offsetab, ldab, bb, offsetbb, ldbb, q, offsetq, ldq, vl, vu, il, iu, abstol, m, w, offsetw, z, offsetz, ldz, work, offsetwork, iwork, offsetiwork, ifail, offsetifail, info);
  }

  protected abstract void ssbgvxK(String jobz, String range, String uplo, int n, int ka, int kb, float[] ab, int offsetab, int ldab, float[] bb, int offsetbb, int ldbb, float[] q, int offsetq, int ldq, float vl, float vu, int il, int iu, float abstol, org.netlib.util.intW m, float[] w, int offsetw, float[] z, int offsetz, int ldz, float[] work, int offsetwork, int[] iwork, int offsetiwork, int[] ifail, int offsetifail, org.netlib.util.intW info);

  public void ssbtrd(String vect, String uplo, int n, int kd, float[] ab, int ldab, float[] d, float[] e, float[] q, int ldq, float[] work, org.netlib.util.intW info) {
    ssbtrd(vect, uplo, n, kd, ab, 0, ldab, d, 0, e, 0, q, 0, ldq, work, 0, info);
  }

  public void ssbtrd(String vect, String uplo, int n, int kd, float[] ab, int offsetab, int ldab, float[] d, int offsetd, float[] e, int offsete, float[] q, int offsetq, int ldq, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    ssbtrdK(vect, uplo, n, kd, ab, offsetab, ldab, d, offsetd, e, offsete, q, offsetq, ldq, work, offsetwork, info);
  }

  protected abstract void ssbtrdK(String vect, String uplo, int n, int kd, float[] ab, int offsetab, int ldab, float[] d, int offsetd, float[] e, int offsete, float[] q, int offsetq, int ldq, float[] work, int offsetwork, org.netlib.util.intW info);

  public void sspcon(String uplo, int n, float[] ap, int[] ipiv, float anorm, org.netlib.util.floatW rcond, float[] work, int[] iwork, org.netlib.util.intW info) {
    sspcon(uplo, n, ap, 0, ipiv, 0, anorm, rcond, work, 0, iwork, 0, info);
  }

  public void sspcon(String uplo, int n, float[] ap, int offsetap, int[] ipiv, int offsetipiv, float anorm, org.netlib.util.floatW rcond, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sspconK(uplo, n, ap, offsetap, ipiv, offsetipiv, anorm, rcond, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void sspconK(String uplo, int n, float[] ap, int offsetap, int[] ipiv, int offsetipiv, float anorm, org.netlib.util.floatW rcond, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void sspev(String jobz, String uplo, int n, float[] ap, float[] w, float[] z, int ldz, float[] work, org.netlib.util.intW info) {
    sspev(jobz, uplo, n, ap, 0, w, 0, z, 0, ldz, work, 0, info);
  }

  public void sspev(String jobz, String uplo, int n, float[] ap, int offsetap, float[] w, int offsetw, float[] z, int offsetz, int ldz, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sspevK(jobz, uplo, n, ap, offsetap, w, offsetw, z, offsetz, ldz, work, offsetwork, info);
  }

  protected abstract void sspevK(String jobz, String uplo, int n, float[] ap, int offsetap, float[] w, int offsetw, float[] z, int offsetz, int ldz, float[] work, int offsetwork, org.netlib.util.intW info);

  public void sspevd(String jobz, String uplo, int n, float[] ap, float[] w, float[] z, int ldz, float[] work, int lwork, int[] iwork, int liwork, org.netlib.util.intW info) {
    sspevd(jobz, uplo, n, ap, 0, w, 0, z, 0, ldz, work, 0, lwork, iwork, 0, liwork, info);
  }

  public void sspevd(String jobz, String uplo, int n, float[] ap, int offsetap, float[] w, int offsetw, float[] z, int offsetz, int ldz, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sspevdK(jobz, uplo, n, ap, offsetap, w, offsetw, z, offsetz, ldz, work, offsetwork, lwork, iwork, offsetiwork, liwork, info);
  }

  protected abstract void sspevdK(String jobz, String uplo, int n, float[] ap, int offsetap, float[] w, int offsetw, float[] z, int offsetz, int ldz, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info);

  public void sspevx(String jobz, String range, String uplo, int n, float[] ap, float vl, float vu, int il, int iu, float abstol, org.netlib.util.intW m, float[] w, float[] z, int ldz, float[] work, int[] iwork, int[] ifail, org.netlib.util.intW info) {
    sspevx(jobz, range, uplo, n, ap, 0, vl, vu, il, iu, abstol, m, w, 0, z, 0, ldz, work, 0, iwork, 0, ifail, 0, info);
  }

  public void sspevx(String jobz, String range, String uplo, int n, float[] ap, int offsetap, float vl, float vu, int il, int iu, float abstol, org.netlib.util.intW m, float[] w, int offsetw, float[] z, int offsetz, int ldz, float[] work, int offsetwork, int[] iwork, int offsetiwork, int[] ifail, int offsetifail, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sspevxK(jobz, range, uplo, n, ap, offsetap, vl, vu, il, iu, abstol, m, w, offsetw, z, offsetz, ldz, work, offsetwork, iwork, offsetiwork, ifail, offsetifail, info);
  }

  protected abstract void sspevxK(String jobz, String range, String uplo, int n, float[] ap, int offsetap, float vl, float vu, int il, int iu, float abstol, org.netlib.util.intW m, float[] w, int offsetw, float[] z, int offsetz, int ldz, float[] work, int offsetwork, int[] iwork, int offsetiwork, int[] ifail, int offsetifail, org.netlib.util.intW info);

  public void sspgst(int itype, String uplo, int n, float[] ap, float[] bp, org.netlib.util.intW info) {
    sspgst(itype, uplo, n, ap, 0, bp, 0, info);
  }

  public void sspgst(int itype, String uplo, int n, float[] ap, int offsetap, float[] bp, int offsetbp, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sspgstK(itype, uplo, n, ap, offsetap, bp, offsetbp, info);
  }

  protected abstract void sspgstK(int itype, String uplo, int n, float[] ap, int offsetap, float[] bp, int offsetbp, org.netlib.util.intW info);

  public void sspgv(int itype, String jobz, String uplo, int n, float[] ap, float[] bp, float[] w, float[] z, int ldz, float[] work, org.netlib.util.intW info) {
    sspgv(itype, jobz, uplo, n, ap, 0, bp, 0, w, 0, z, 0, ldz, work, 0, info);
  }

  public void sspgv(int itype, String jobz, String uplo, int n, float[] ap, int offsetap, float[] bp, int offsetbp, float[] w, int offsetw, float[] z, int offsetz, int ldz, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sspgvK(itype, jobz, uplo, n, ap, offsetap, bp, offsetbp, w, offsetw, z, offsetz, ldz, work, offsetwork, info);
  }

  protected abstract void sspgvK(int itype, String jobz, String uplo, int n, float[] ap, int offsetap, float[] bp, int offsetbp, float[] w, int offsetw, float[] z, int offsetz, int ldz, float[] work, int offsetwork, org.netlib.util.intW info);

  public void sspgvd(int itype, String jobz, String uplo, int n, float[] ap, float[] bp, float[] w, float[] z, int ldz, float[] work, int lwork, int[] iwork, int liwork, org.netlib.util.intW info) {
    sspgvd(itype, jobz, uplo, n, ap, 0, bp, 0, w, 0, z, 0, ldz, work, 0, lwork, iwork, 0, liwork, info);
  }

  public void sspgvd(int itype, String jobz, String uplo, int n, float[] ap, int offsetap, float[] bp, int offsetbp, float[] w, int offsetw, float[] z, int offsetz, int ldz, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sspgvdK(itype, jobz, uplo, n, ap, offsetap, bp, offsetbp, w, offsetw, z, offsetz, ldz, work, offsetwork, lwork, iwork, offsetiwork, liwork, info);
  }

  protected abstract void sspgvdK(int itype, String jobz, String uplo, int n, float[] ap, int offsetap, float[] bp, int offsetbp, float[] w, int offsetw, float[] z, int offsetz, int ldz, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info);

  public void sspgvx(int itype, String jobz, String range, String uplo, int n, float[] ap, float[] bp, float vl, float vu, int il, int iu, float abstol, org.netlib.util.intW m, float[] w, float[] z, int ldz, float[] work, int[] iwork, int[] ifail, org.netlib.util.intW info) {
    sspgvx(itype, jobz, range, uplo, n, ap, 0, bp, 0, vl, vu, il, iu, abstol, m, w, 0, z, 0, ldz, work, 0, iwork, 0, ifail, 0, info);
  }

  public void sspgvx(int itype, String jobz, String range, String uplo, int n, float[] ap, int offsetap, float[] bp, int offsetbp, float vl, float vu, int il, int iu, float abstol, org.netlib.util.intW m, float[] w, int offsetw, float[] z, int offsetz, int ldz, float[] work, int offsetwork, int[] iwork, int offsetiwork, int[] ifail, int offsetifail, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sspgvxK(itype, jobz, range, uplo, n, ap, offsetap, bp, offsetbp, vl, vu, il, iu, abstol, m, w, offsetw, z, offsetz, ldz, work, offsetwork, iwork, offsetiwork, ifail, offsetifail, info);
  }

  protected abstract void sspgvxK(int itype, String jobz, String range, String uplo, int n, float[] ap, int offsetap, float[] bp, int offsetbp, float vl, float vu, int il, int iu, float abstol, org.netlib.util.intW m, float[] w, int offsetw, float[] z, int offsetz, int ldz, float[] work, int offsetwork, int[] iwork, int offsetiwork, int[] ifail, int offsetifail, org.netlib.util.intW info);

  public void ssprfs(String uplo, int n, int nrhs, float[] ap, float[] afp, int[] ipiv, float[] b, int ldb, float[] x, int ldx, float[] ferr, float[] berr, float[] work, int[] iwork, org.netlib.util.intW info) {
    ssprfs(uplo, n, nrhs, ap, 0, afp, 0, ipiv, 0, b, 0, ldb, x, 0, ldx, ferr, 0, berr, 0, work, 0, iwork, 0, info);
  }

  public void ssprfs(String uplo, int n, int nrhs, float[] ap, int offsetap, float[] afp, int offsetafp, int[] ipiv, int offsetipiv, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    ssprfsK(uplo, n, nrhs, ap, offsetap, afp, offsetafp, ipiv, offsetipiv, b, offsetb, ldb, x, offsetx, ldx, ferr, offsetferr, berr, offsetberr, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void ssprfsK(String uplo, int n, int nrhs, float[] ap, int offsetap, float[] afp, int offsetafp, int[] ipiv, int offsetipiv, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void sspsv(String uplo, int n, int nrhs, float[] ap, int[] ipiv, float[] b, int ldb, org.netlib.util.intW info) {
    sspsv(uplo, n, nrhs, ap, 0, ipiv, 0, b, 0, ldb, info);
  }

  public void sspsv(String uplo, int n, int nrhs, float[] ap, int offsetap, int[] ipiv, int offsetipiv, float[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sspsvK(uplo, n, nrhs, ap, offsetap, ipiv, offsetipiv, b, offsetb, ldb, info);
  }

  protected abstract void sspsvK(String uplo, int n, int nrhs, float[] ap, int offsetap, int[] ipiv, int offsetipiv, float[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void sspsvx(String fact, String uplo, int n, int nrhs, float[] ap, float[] afp, int[] ipiv, float[] b, int ldb, float[] x, int ldx, org.netlib.util.floatW rcond, float[] ferr, float[] berr, float[] work, int[] iwork, org.netlib.util.intW info) {
    sspsvx(fact, uplo, n, nrhs, ap, 0, afp, 0, ipiv, 0, b, 0, ldb, x, 0, ldx, rcond, ferr, 0, berr, 0, work, 0, iwork, 0, info);
  }

  public void sspsvx(String fact, String uplo, int n, int nrhs, float[] ap, int offsetap, float[] afp, int offsetafp, int[] ipiv, int offsetipiv, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, org.netlib.util.floatW rcond, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sspsvxK(fact, uplo, n, nrhs, ap, offsetap, afp, offsetafp, ipiv, offsetipiv, b, offsetb, ldb, x, offsetx, ldx, rcond, ferr, offsetferr, berr, offsetberr, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void sspsvxK(String fact, String uplo, int n, int nrhs, float[] ap, int offsetap, float[] afp, int offsetafp, int[] ipiv, int offsetipiv, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, org.netlib.util.floatW rcond, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void ssptrd(String uplo, int n, float[] ap, float[] d, float[] e, float[] tau, org.netlib.util.intW info) {
    ssptrd(uplo, n, ap, 0, d, 0, e, 0, tau, 0, info);
  }

  public void ssptrd(String uplo, int n, float[] ap, int offsetap, float[] d, int offsetd, float[] e, int offsete, float[] tau, int offsettau, org.netlib.util.intW info) {
    //FIXME Add arguments check
    ssptrdK(uplo, n, ap, offsetap, d, offsetd, e, offsete, tau, offsettau, info);
  }

  protected abstract void ssptrdK(String uplo, int n, float[] ap, int offsetap, float[] d, int offsetd, float[] e, int offsete, float[] tau, int offsettau, org.netlib.util.intW info);

  public void ssptrf(String uplo, int n, float[] ap, int[] ipiv, org.netlib.util.intW info) {
    ssptrf(uplo, n, ap, 0, ipiv, 0, info);
  }

  public void ssptrf(String uplo, int n, float[] ap, int offsetap, int[] ipiv, int offsetipiv, org.netlib.util.intW info) {
    //FIXME Add arguments check
    ssptrfK(uplo, n, ap, offsetap, ipiv, offsetipiv, info);
  }

  protected abstract void ssptrfK(String uplo, int n, float[] ap, int offsetap, int[] ipiv, int offsetipiv, org.netlib.util.intW info);

  public void ssptri(String uplo, int n, float[] ap, int[] ipiv, float[] work, org.netlib.util.intW info) {
    ssptri(uplo, n, ap, 0, ipiv, 0, work, 0, info);
  }

  public void ssptri(String uplo, int n, float[] ap, int offsetap, int[] ipiv, int offsetipiv, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    ssptriK(uplo, n, ap, offsetap, ipiv, offsetipiv, work, offsetwork, info);
  }

  protected abstract void ssptriK(String uplo, int n, float[] ap, int offsetap, int[] ipiv, int offsetipiv, float[] work, int offsetwork, org.netlib.util.intW info);

  public void ssptrs(String uplo, int n, int nrhs, float[] ap, int[] ipiv, float[] b, int ldb, org.netlib.util.intW info) {
    ssptrs(uplo, n, nrhs, ap, 0, ipiv, 0, b, 0, ldb, info);
  }

  public void ssptrs(String uplo, int n, int nrhs, float[] ap, int offsetap, int[] ipiv, int offsetipiv, float[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    ssptrsK(uplo, n, nrhs, ap, offsetap, ipiv, offsetipiv, b, offsetb, ldb, info);
  }

  protected abstract void ssptrsK(String uplo, int n, int nrhs, float[] ap, int offsetap, int[] ipiv, int offsetipiv, float[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void sstebz(String range, String order, int n, float vl, float vu, int il, int iu, float abstol, float[] d, float[] e, org.netlib.util.intW m, org.netlib.util.intW nsplit, float[] w, int[] iblock, int[] isplit, float[] work, int[] iwork, org.netlib.util.intW info) {
    sstebz(range, order, n, vl, vu, il, iu, abstol, d, 0, e, 0, m, nsplit, w, 0, iblock, 0, isplit, 0, work, 0, iwork, 0, info);
  }

  public void sstebz(String range, String order, int n, float vl, float vu, int il, int iu, float abstol, float[] d, int offsetd, float[] e, int offsete, org.netlib.util.intW m, org.netlib.util.intW nsplit, float[] w, int offsetw, int[] iblock, int offsetiblock, int[] isplit, int offsetisplit, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sstebzK(range, order, n, vl, vu, il, iu, abstol, d, offsetd, e, offsete, m, nsplit, w, offsetw, iblock, offsetiblock, isplit, offsetisplit, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void sstebzK(String range, String order, int n, float vl, float vu, int il, int iu, float abstol, float[] d, int offsetd, float[] e, int offsete, org.netlib.util.intW m, org.netlib.util.intW nsplit, float[] w, int offsetw, int[] iblock, int offsetiblock, int[] isplit, int offsetisplit, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void sstedc(String compz, int n, float[] d, float[] e, float[] z, int ldz, float[] work, int lwork, int[] iwork, int liwork, org.netlib.util.intW info) {
    sstedc(compz, n, d, 0, e, 0, z, 0, ldz, work, 0, lwork, iwork, 0, liwork, info);
  }

  public void sstedc(String compz, int n, float[] d, int offsetd, float[] e, int offsete, float[] z, int offsetz, int ldz, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sstedcK(compz, n, d, offsetd, e, offsete, z, offsetz, ldz, work, offsetwork, lwork, iwork, offsetiwork, liwork, info);
  }

  protected abstract void sstedcK(String compz, int n, float[] d, int offsetd, float[] e, int offsete, float[] z, int offsetz, int ldz, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info);

  public void sstegr(String jobz, String range, int n, float[] d, float[] e, float vl, float vu, int il, int iu, float abstol, org.netlib.util.intW m, float[] w, float[] z, int ldz, int[] isuppz, float[] work, int lwork, int[] iwork, int liwork, org.netlib.util.intW info) {
    sstegr(jobz, range, n, d, 0, e, 0, vl, vu, il, iu, abstol, m, w, 0, z, 0, ldz, isuppz, 0, work, 0, lwork, iwork, 0, liwork, info);
  }

  public void sstegr(String jobz, String range, int n, float[] d, int offsetd, float[] e, int offsete, float vl, float vu, int il, int iu, float abstol, org.netlib.util.intW m, float[] w, int offsetw, float[] z, int offsetz, int ldz, int[] isuppz, int offsetisuppz, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sstegrK(jobz, range, n, d, offsetd, e, offsete, vl, vu, il, iu, abstol, m, w, offsetw, z, offsetz, ldz, isuppz, offsetisuppz, work, offsetwork, lwork, iwork, offsetiwork, liwork, info);
  }

  protected abstract void sstegrK(String jobz, String range, int n, float[] d, int offsetd, float[] e, int offsete, float vl, float vu, int il, int iu, float abstol, org.netlib.util.intW m, float[] w, int offsetw, float[] z, int offsetz, int ldz, int[] isuppz, int offsetisuppz, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info);

  public void sstein(int n, float[] d, float[] e, int m, float[] w, int[] iblock, int[] isplit, float[] z, int ldz, float[] work, int[] iwork, int[] ifail, org.netlib.util.intW info) {
    sstein(n, d, 0, e, 0, m, w, 0, iblock, 0, isplit, 0, z, 0, ldz, work, 0, iwork, 0, ifail, 0, info);
  }

  public void sstein(int n, float[] d, int offsetd, float[] e, int offsete, int m, float[] w, int offsetw, int[] iblock, int offsetiblock, int[] isplit, int offsetisplit, float[] z, int offsetz, int ldz, float[] work, int offsetwork, int[] iwork, int offsetiwork, int[] ifail, int offsetifail, org.netlib.util.intW info) {
    //FIXME Add arguments check
    ssteinK(n, d, offsetd, e, offsete, m, w, offsetw, iblock, offsetiblock, isplit, offsetisplit, z, offsetz, ldz, work, offsetwork, iwork, offsetiwork, ifail, offsetifail, info);
  }

  protected abstract void ssteinK(int n, float[] d, int offsetd, float[] e, int offsete, int m, float[] w, int offsetw, int[] iblock, int offsetiblock, int[] isplit, int offsetisplit, float[] z, int offsetz, int ldz, float[] work, int offsetwork, int[] iwork, int offsetiwork, int[] ifail, int offsetifail, org.netlib.util.intW info);

  public void sstemr(String jobz, String range, int n, float[] d, float[] e, float vl, float vu, int il, int iu, org.netlib.util.intW m, float[] w, float[] z, int ldz, int nzc, int[] isuppz, org.netlib.util.booleanW tryrac, float[] work, int lwork, int[] iwork, int liwork, org.netlib.util.intW info) {
    sstemr(jobz, range, n, d, 0, e, 0, vl, vu, il, iu, m, w, 0, z, 0, ldz, nzc, isuppz, 0, tryrac, work, 0, lwork, iwork, 0, liwork, info);
  }

  public void sstemr(String jobz, String range, int n, float[] d, int offsetd, float[] e, int offsete, float vl, float vu, int il, int iu, org.netlib.util.intW m, float[] w, int offsetw, float[] z, int offsetz, int ldz, int nzc, int[] isuppz, int offsetisuppz, org.netlib.util.booleanW tryrac, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sstemrK(jobz, range, n, d, offsetd, e, offsete, vl, vu, il, iu, m, w, offsetw, z, offsetz, ldz, nzc, isuppz, offsetisuppz, tryrac, work, offsetwork, lwork, iwork, offsetiwork, liwork, info);
  }

  protected abstract void sstemrK(String jobz, String range, int n, float[] d, int offsetd, float[] e, int offsete, float vl, float vu, int il, int iu, org.netlib.util.intW m, float[] w, int offsetw, float[] z, int offsetz, int ldz, int nzc, int[] isuppz, int offsetisuppz, org.netlib.util.booleanW tryrac, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info);

  public void ssteqr(String compz, int n, float[] d, float[] e, float[] z, int ldz, float[] work, org.netlib.util.intW info) {
    ssteqr(compz, n, d, 0, e, 0, z, 0, ldz, work, 0, info);
  }

  public void ssteqr(String compz, int n, float[] d, int offsetd, float[] e, int offsete, float[] z, int offsetz, int ldz, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    ssteqrK(compz, n, d, offsetd, e, offsete, z, offsetz, ldz, work, offsetwork, info);
  }

  protected abstract void ssteqrK(String compz, int n, float[] d, int offsetd, float[] e, int offsete, float[] z, int offsetz, int ldz, float[] work, int offsetwork, org.netlib.util.intW info);

  public void ssterf(int n, float[] d, float[] e, org.netlib.util.intW info) {
    ssterf(n, d, 0, e, 0, info);
  }

  public void ssterf(int n, float[] d, int offsetd, float[] e, int offsete, org.netlib.util.intW info) {
    //FIXME Add arguments check
    ssterfK(n, d, offsetd, e, offsete, info);
  }

  protected abstract void ssterfK(int n, float[] d, int offsetd, float[] e, int offsete, org.netlib.util.intW info);

  public void sstev(String jobz, int n, float[] d, float[] e, float[] z, int ldz, float[] work, org.netlib.util.intW info) {
    sstev(jobz, n, d, 0, e, 0, z, 0, ldz, work, 0, info);
  }

  public void sstev(String jobz, int n, float[] d, int offsetd, float[] e, int offsete, float[] z, int offsetz, int ldz, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sstevK(jobz, n, d, offsetd, e, offsete, z, offsetz, ldz, work, offsetwork, info);
  }

  protected abstract void sstevK(String jobz, int n, float[] d, int offsetd, float[] e, int offsete, float[] z, int offsetz, int ldz, float[] work, int offsetwork, org.netlib.util.intW info);

  public void sstevd(String jobz, int n, float[] d, float[] e, float[] z, int ldz, float[] work, int lwork, int[] iwork, int liwork, org.netlib.util.intW info) {
    sstevd(jobz, n, d, 0, e, 0, z, 0, ldz, work, 0, lwork, iwork, 0, liwork, info);
  }

  public void sstevd(String jobz, int n, float[] d, int offsetd, float[] e, int offsete, float[] z, int offsetz, int ldz, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sstevdK(jobz, n, d, offsetd, e, offsete, z, offsetz, ldz, work, offsetwork, lwork, iwork, offsetiwork, liwork, info);
  }

  protected abstract void sstevdK(String jobz, int n, float[] d, int offsetd, float[] e, int offsete, float[] z, int offsetz, int ldz, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info);

  public void sstevr(String jobz, String range, int n, float[] d, float[] e, float vl, float vu, int il, int iu, float abstol, org.netlib.util.intW m, float[] w, float[] z, int ldz, int[] isuppz, float[] work, int lwork, int[] iwork, int liwork, org.netlib.util.intW info) {
    sstevr(jobz, range, n, d, 0, e, 0, vl, vu, il, iu, abstol, m, w, 0, z, 0, ldz, isuppz, 0, work, 0, lwork, iwork, 0, liwork, info);
  }

  public void sstevr(String jobz, String range, int n, float[] d, int offsetd, float[] e, int offsete, float vl, float vu, int il, int iu, float abstol, org.netlib.util.intW m, float[] w, int offsetw, float[] z, int offsetz, int ldz, int[] isuppz, int offsetisuppz, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sstevrK(jobz, range, n, d, offsetd, e, offsete, vl, vu, il, iu, abstol, m, w, offsetw, z, offsetz, ldz, isuppz, offsetisuppz, work, offsetwork, lwork, iwork, offsetiwork, liwork, info);
  }

  protected abstract void sstevrK(String jobz, String range, int n, float[] d, int offsetd, float[] e, int offsete, float vl, float vu, int il, int iu, float abstol, org.netlib.util.intW m, float[] w, int offsetw, float[] z, int offsetz, int ldz, int[] isuppz, int offsetisuppz, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info);

  public void sstevx(String jobz, String range, int n, float[] d, float[] e, float vl, float vu, int il, int iu, float abstol, org.netlib.util.intW m, float[] w, float[] z, int ldz, float[] work, int[] iwork, int[] ifail, org.netlib.util.intW info) {
    sstevx(jobz, range, n, d, 0, e, 0, vl, vu, il, iu, abstol, m, w, 0, z, 0, ldz, work, 0, iwork, 0, ifail, 0, info);
  }

  public void sstevx(String jobz, String range, int n, float[] d, int offsetd, float[] e, int offsete, float vl, float vu, int il, int iu, float abstol, org.netlib.util.intW m, float[] w, int offsetw, float[] z, int offsetz, int ldz, float[] work, int offsetwork, int[] iwork, int offsetiwork, int[] ifail, int offsetifail, org.netlib.util.intW info) {
    //FIXME Add arguments check
    sstevxK(jobz, range, n, d, offsetd, e, offsete, vl, vu, il, iu, abstol, m, w, offsetw, z, offsetz, ldz, work, offsetwork, iwork, offsetiwork, ifail, offsetifail, info);
  }

  protected abstract void sstevxK(String jobz, String range, int n, float[] d, int offsetd, float[] e, int offsete, float vl, float vu, int il, int iu, float abstol, org.netlib.util.intW m, float[] w, int offsetw, float[] z, int offsetz, int ldz, float[] work, int offsetwork, int[] iwork, int offsetiwork, int[] ifail, int offsetifail, org.netlib.util.intW info);

  public void ssycon(String uplo, int n, float[] a, int lda, int[] ipiv, float anorm, org.netlib.util.floatW rcond, float[] work, int[] iwork, org.netlib.util.intW info) {
    ssycon(uplo, n, a, 0, lda, ipiv, 0, anorm, rcond, work, 0, iwork, 0, info);
  }

  public void ssycon(String uplo, int n, float[] a, int offseta, int lda, int[] ipiv, int offsetipiv, float anorm, org.netlib.util.floatW rcond, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    ssyconK(uplo, n, a, offseta, lda, ipiv, offsetipiv, anorm, rcond, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void ssyconK(String uplo, int n, float[] a, int offseta, int lda, int[] ipiv, int offsetipiv, float anorm, org.netlib.util.floatW rcond, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void ssyev(String jobz, String uplo, int n, float[] a, int lda, float[] w, float[] work, int lwork, org.netlib.util.intW info) {
    ssyev(jobz, uplo, n, a, 0, lda, w, 0, work, 0, lwork, info);
  }

  public void ssyev(String jobz, String uplo, int n, float[] a, int offseta, int lda, float[] w, int offsetw, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    ssyevK(jobz, uplo, n, a, offseta, lda, w, offsetw, work, offsetwork, lwork, info);
  }

  protected abstract void ssyevK(String jobz, String uplo, int n, float[] a, int offseta, int lda, float[] w, int offsetw, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void ssyevd(String jobz, String uplo, int n, float[] a, int lda, float[] w, float[] work, int lwork, int[] iwork, int liwork, org.netlib.util.intW info) {
    ssyevd(jobz, uplo, n, a, 0, lda, w, 0, work, 0, lwork, iwork, 0, liwork, info);
  }

  public void ssyevd(String jobz, String uplo, int n, float[] a, int offseta, int lda, float[] w, int offsetw, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    ssyevdK(jobz, uplo, n, a, offseta, lda, w, offsetw, work, offsetwork, lwork, iwork, offsetiwork, liwork, info);
  }

  protected abstract void ssyevdK(String jobz, String uplo, int n, float[] a, int offseta, int lda, float[] w, int offsetw, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info);

  public void ssyevr(String jobz, String range, String uplo, int n, float[] a, int lda, float vl, float vu, int il, int iu, float abstol, org.netlib.util.intW m, float[] w, float[] z, int ldz, int[] isuppz, float[] work, int lwork, int[] iwork, int liwork, org.netlib.util.intW info) {
    ssyevr(jobz, range, uplo, n, a, 0, lda, vl, vu, il, iu, abstol, m, w, 0, z, 0, ldz, isuppz, 0, work, 0, lwork, iwork, 0, liwork, info);
  }

  public void ssyevr(String jobz, String range, String uplo, int n, float[] a, int offseta, int lda, float vl, float vu, int il, int iu, float abstol, org.netlib.util.intW m, float[] w, int offsetw, float[] z, int offsetz, int ldz, int[] isuppz, int offsetisuppz, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    ssyevrK(jobz, range, uplo, n, a, offseta, lda, vl, vu, il, iu, abstol, m, w, offsetw, z, offsetz, ldz, isuppz, offsetisuppz, work, offsetwork, lwork, iwork, offsetiwork, liwork, info);
  }

  protected abstract void ssyevrK(String jobz, String range, String uplo, int n, float[] a, int offseta, int lda, float vl, float vu, int il, int iu, float abstol, org.netlib.util.intW m, float[] w, int offsetw, float[] z, int offsetz, int ldz, int[] isuppz, int offsetisuppz, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info);

  public void ssyevx(String jobz, String range, String uplo, int n, float[] a, int lda, float vl, float vu, int il, int iu, float abstol, org.netlib.util.intW m, float[] w, float[] z, int ldz, float[] work, int lwork, int[] iwork, int[] ifail, org.netlib.util.intW info) {
    ssyevx(jobz, range, uplo, n, a, 0, lda, vl, vu, il, iu, abstol, m, w, 0, z, 0, ldz, work, 0, lwork, iwork, 0, ifail, 0, info);
  }

  public void ssyevx(String jobz, String range, String uplo, int n, float[] a, int offseta, int lda, float vl, float vu, int il, int iu, float abstol, org.netlib.util.intW m, float[] w, int offsetw, float[] z, int offsetz, int ldz, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int[] ifail, int offsetifail, org.netlib.util.intW info) {
    //FIXME Add arguments check
    ssyevxK(jobz, range, uplo, n, a, offseta, lda, vl, vu, il, iu, abstol, m, w, offsetw, z, offsetz, ldz, work, offsetwork, lwork, iwork, offsetiwork, ifail, offsetifail, info);
  }

  protected abstract void ssyevxK(String jobz, String range, String uplo, int n, float[] a, int offseta, int lda, float vl, float vu, int il, int iu, float abstol, org.netlib.util.intW m, float[] w, int offsetw, float[] z, int offsetz, int ldz, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int[] ifail, int offsetifail, org.netlib.util.intW info);

  public void ssygs2(int itype, String uplo, int n, float[] a, int lda, float[] b, int ldb, org.netlib.util.intW info) {
    ssygs2(itype, uplo, n, a, 0, lda, b, 0, ldb, info);
  }

  public void ssygs2(int itype, String uplo, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    ssygs2K(itype, uplo, n, a, offseta, lda, b, offsetb, ldb, info);
  }

  protected abstract void ssygs2K(int itype, String uplo, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void ssygst(int itype, String uplo, int n, float[] a, int lda, float[] b, int ldb, org.netlib.util.intW info) {
    ssygst(itype, uplo, n, a, 0, lda, b, 0, ldb, info);
  }

  public void ssygst(int itype, String uplo, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    ssygstK(itype, uplo, n, a, offseta, lda, b, offsetb, ldb, info);
  }

  protected abstract void ssygstK(int itype, String uplo, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void ssygv(int itype, String jobz, String uplo, int n, float[] a, int lda, float[] b, int ldb, float[] w, float[] work, int lwork, org.netlib.util.intW info) {
    ssygv(itype, jobz, uplo, n, a, 0, lda, b, 0, ldb, w, 0, work, 0, lwork, info);
  }

  public void ssygv(int itype, String jobz, String uplo, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] w, int offsetw, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    ssygvK(itype, jobz, uplo, n, a, offseta, lda, b, offsetb, ldb, w, offsetw, work, offsetwork, lwork, info);
  }

  protected abstract void ssygvK(int itype, String jobz, String uplo, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] w, int offsetw, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void ssygvd(int itype, String jobz, String uplo, int n, float[] a, int lda, float[] b, int ldb, float[] w, float[] work, int lwork, int[] iwork, int liwork, org.netlib.util.intW info) {
    ssygvd(itype, jobz, uplo, n, a, 0, lda, b, 0, ldb, w, 0, work, 0, lwork, iwork, 0, liwork, info);
  }

  public void ssygvd(int itype, String jobz, String uplo, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] w, int offsetw, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    ssygvdK(itype, jobz, uplo, n, a, offseta, lda, b, offsetb, ldb, w, offsetw, work, offsetwork, lwork, iwork, offsetiwork, liwork, info);
  }

  protected abstract void ssygvdK(int itype, String jobz, String uplo, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] w, int offsetw, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info);

  public void ssygvx(int itype, String jobz, String range, String uplo, int n, float[] a, int lda, float[] b, int ldb, float vl, float vu, int il, int iu, float abstol, org.netlib.util.intW m, float[] w, float[] z, int ldz, float[] work, int lwork, int[] iwork, int[] ifail, org.netlib.util.intW info) {
    ssygvx(itype, jobz, range, uplo, n, a, 0, lda, b, 0, ldb, vl, vu, il, iu, abstol, m, w, 0, z, 0, ldz, work, 0, lwork, iwork, 0, ifail, 0, info);
  }

  public void ssygvx(int itype, String jobz, String range, String uplo, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float vl, float vu, int il, int iu, float abstol, org.netlib.util.intW m, float[] w, int offsetw, float[] z, int offsetz, int ldz, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int[] ifail, int offsetifail, org.netlib.util.intW info) {
    //FIXME Add arguments check
    ssygvxK(itype, jobz, range, uplo, n, a, offseta, lda, b, offsetb, ldb, vl, vu, il, iu, abstol, m, w, offsetw, z, offsetz, ldz, work, offsetwork, lwork, iwork, offsetiwork, ifail, offsetifail, info);
  }

  protected abstract void ssygvxK(int itype, String jobz, String range, String uplo, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float vl, float vu, int il, int iu, float abstol, org.netlib.util.intW m, float[] w, int offsetw, float[] z, int offsetz, int ldz, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int[] ifail, int offsetifail, org.netlib.util.intW info);

  public void ssyrfs(String uplo, int n, int nrhs, float[] a, int lda, float[] af, int ldaf, int[] ipiv, float[] b, int ldb, float[] x, int ldx, float[] ferr, float[] berr, float[] work, int[] iwork, org.netlib.util.intW info) {
    ssyrfs(uplo, n, nrhs, a, 0, lda, af, 0, ldaf, ipiv, 0, b, 0, ldb, x, 0, ldx, ferr, 0, berr, 0, work, 0, iwork, 0, info);
  }

  public void ssyrfs(String uplo, int n, int nrhs, float[] a, int offseta, int lda, float[] af, int offsetaf, int ldaf, int[] ipiv, int offsetipiv, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    ssyrfsK(uplo, n, nrhs, a, offseta, lda, af, offsetaf, ldaf, ipiv, offsetipiv, b, offsetb, ldb, x, offsetx, ldx, ferr, offsetferr, berr, offsetberr, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void ssyrfsK(String uplo, int n, int nrhs, float[] a, int offseta, int lda, float[] af, int offsetaf, int ldaf, int[] ipiv, int offsetipiv, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void ssysv(String uplo, int n, int nrhs, float[] a, int lda, int[] ipiv, float[] b, int ldb, float[] work, int lwork, org.netlib.util.intW info) {
    ssysv(uplo, n, nrhs, a, 0, lda, ipiv, 0, b, 0, ldb, work, 0, lwork, info);
  }

  public void ssysv(String uplo, int n, int nrhs, float[] a, int offseta, int lda, int[] ipiv, int offsetipiv, float[] b, int offsetb, int ldb, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    ssysvK(uplo, n, nrhs, a, offseta, lda, ipiv, offsetipiv, b, offsetb, ldb, work, offsetwork, lwork, info);
  }

  protected abstract void ssysvK(String uplo, int n, int nrhs, float[] a, int offseta, int lda, int[] ipiv, int offsetipiv, float[] b, int offsetb, int ldb, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void ssysvx(String fact, String uplo, int n, int nrhs, float[] a, int lda, float[] af, int ldaf, int[] ipiv, float[] b, int ldb, float[] x, int ldx, org.netlib.util.floatW rcond, float[] ferr, float[] berr, float[] work, int lwork, int[] iwork, org.netlib.util.intW info) {
    ssysvx(fact, uplo, n, nrhs, a, 0, lda, af, 0, ldaf, ipiv, 0, b, 0, ldb, x, 0, ldx, rcond, ferr, 0, berr, 0, work, 0, lwork, iwork, 0, info);
  }

  public void ssysvx(String fact, String uplo, int n, int nrhs, float[] a, int offseta, int lda, float[] af, int offsetaf, int ldaf, int[] ipiv, int offsetipiv, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, org.netlib.util.floatW rcond, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    ssysvxK(fact, uplo, n, nrhs, a, offseta, lda, af, offsetaf, ldaf, ipiv, offsetipiv, b, offsetb, ldb, x, offsetx, ldx, rcond, ferr, offsetferr, berr, offsetberr, work, offsetwork, lwork, iwork, offsetiwork, info);
  }

  protected abstract void ssysvxK(String fact, String uplo, int n, int nrhs, float[] a, int offseta, int lda, float[] af, int offsetaf, int ldaf, int[] ipiv, int offsetipiv, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, org.netlib.util.floatW rcond, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void ssytd2(String uplo, int n, float[] a, int lda, float[] d, float[] e, float[] tau, org.netlib.util.intW info) {
    ssytd2(uplo, n, a, 0, lda, d, 0, e, 0, tau, 0, info);
  }

  public void ssytd2(String uplo, int n, float[] a, int offseta, int lda, float[] d, int offsetd, float[] e, int offsete, float[] tau, int offsettau, org.netlib.util.intW info) {
    //FIXME Add arguments check
    ssytd2K(uplo, n, a, offseta, lda, d, offsetd, e, offsete, tau, offsettau, info);
  }

  protected abstract void ssytd2K(String uplo, int n, float[] a, int offseta, int lda, float[] d, int offsetd, float[] e, int offsete, float[] tau, int offsettau, org.netlib.util.intW info);

  public void ssytf2(String uplo, int n, float[] a, int lda, int[] ipiv, org.netlib.util.intW info) {
    ssytf2(uplo, n, a, 0, lda, ipiv, 0, info);
  }

  public void ssytf2(String uplo, int n, float[] a, int offseta, int lda, int[] ipiv, int offsetipiv, org.netlib.util.intW info) {
    //FIXME Add arguments check
    ssytf2K(uplo, n, a, offseta, lda, ipiv, offsetipiv, info);
  }

  protected abstract void ssytf2K(String uplo, int n, float[] a, int offseta, int lda, int[] ipiv, int offsetipiv, org.netlib.util.intW info);

  public void ssytrd(String uplo, int n, float[] a, int lda, float[] d, float[] e, float[] tau, float[] work, int lwork, org.netlib.util.intW info) {
    ssytrd(uplo, n, a, 0, lda, d, 0, e, 0, tau, 0, work, 0, lwork, info);
  }

  public void ssytrd(String uplo, int n, float[] a, int offseta, int lda, float[] d, int offsetd, float[] e, int offsete, float[] tau, int offsettau, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    ssytrdK(uplo, n, a, offseta, lda, d, offsetd, e, offsete, tau, offsettau, work, offsetwork, lwork, info);
  }

  protected abstract void ssytrdK(String uplo, int n, float[] a, int offseta, int lda, float[] d, int offsetd, float[] e, int offsete, float[] tau, int offsettau, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void ssytrf(String uplo, int n, float[] a, int lda, int[] ipiv, float[] work, int lwork, org.netlib.util.intW info) {
    ssytrf(uplo, n, a, 0, lda, ipiv, 0, work, 0, lwork, info);
  }

  public void ssytrf(String uplo, int n, float[] a, int offseta, int lda, int[] ipiv, int offsetipiv, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    ssytrfK(uplo, n, a, offseta, lda, ipiv, offsetipiv, work, offsetwork, lwork, info);
  }

  protected abstract void ssytrfK(String uplo, int n, float[] a, int offseta, int lda, int[] ipiv, int offsetipiv, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void ssytri(String uplo, int n, float[] a, int lda, int[] ipiv, float[] work, org.netlib.util.intW info) {
    ssytri(uplo, n, a, 0, lda, ipiv, 0, work, 0, info);
  }

  public void ssytri(String uplo, int n, float[] a, int offseta, int lda, int[] ipiv, int offsetipiv, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    ssytriK(uplo, n, a, offseta, lda, ipiv, offsetipiv, work, offsetwork, info);
  }

  protected abstract void ssytriK(String uplo, int n, float[] a, int offseta, int lda, int[] ipiv, int offsetipiv, float[] work, int offsetwork, org.netlib.util.intW info);

  public void ssytrs(String uplo, int n, int nrhs, float[] a, int lda, int[] ipiv, float[] b, int ldb, org.netlib.util.intW info) {
    ssytrs(uplo, n, nrhs, a, 0, lda, ipiv, 0, b, 0, ldb, info);
  }

  public void ssytrs(String uplo, int n, int nrhs, float[] a, int offseta, int lda, int[] ipiv, int offsetipiv, float[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    ssytrsK(uplo, n, nrhs, a, offseta, lda, ipiv, offsetipiv, b, offsetb, ldb, info);
  }

  protected abstract void ssytrsK(String uplo, int n, int nrhs, float[] a, int offseta, int lda, int[] ipiv, int offsetipiv, float[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void stbcon(String norm, String uplo, String diag, int n, int kd, float[] ab, int ldab, org.netlib.util.floatW rcond, float[] work, int[] iwork, org.netlib.util.intW info) {
    stbcon(norm, uplo, diag, n, kd, ab, 0, ldab, rcond, work, 0, iwork, 0, info);
  }

  public void stbcon(String norm, String uplo, String diag, int n, int kd, float[] ab, int offsetab, int ldab, org.netlib.util.floatW rcond, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    stbconK(norm, uplo, diag, n, kd, ab, offsetab, ldab, rcond, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void stbconK(String norm, String uplo, String diag, int n, int kd, float[] ab, int offsetab, int ldab, org.netlib.util.floatW rcond, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void stbrfs(String uplo, String trans, String diag, int n, int kd, int nrhs, float[] ab, int ldab, float[] b, int ldb, float[] x, int ldx, float[] ferr, float[] berr, float[] work, int[] iwork, org.netlib.util.intW info) {
    stbrfs(uplo, trans, diag, n, kd, nrhs, ab, 0, ldab, b, 0, ldb, x, 0, ldx, ferr, 0, berr, 0, work, 0, iwork, 0, info);
  }

  public void stbrfs(String uplo, String trans, String diag, int n, int kd, int nrhs, float[] ab, int offsetab, int ldab, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    stbrfsK(uplo, trans, diag, n, kd, nrhs, ab, offsetab, ldab, b, offsetb, ldb, x, offsetx, ldx, ferr, offsetferr, berr, offsetberr, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void stbrfsK(String uplo, String trans, String diag, int n, int kd, int nrhs, float[] ab, int offsetab, int ldab, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void stbtrs(String uplo, String trans, String diag, int n, int kd, int nrhs, float[] ab, int ldab, float[] b, int ldb, org.netlib.util.intW info) {
    stbtrs(uplo, trans, diag, n, kd, nrhs, ab, 0, ldab, b, 0, ldb, info);
  }

  public void stbtrs(String uplo, String trans, String diag, int n, int kd, int nrhs, float[] ab, int offsetab, int ldab, float[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    stbtrsK(uplo, trans, diag, n, kd, nrhs, ab, offsetab, ldab, b, offsetb, ldb, info);
  }

  protected abstract void stbtrsK(String uplo, String trans, String diag, int n, int kd, int nrhs, float[] ab, int offsetab, int ldab, float[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void stgevc(String side, String howmny, boolean[] select, int n, float[] s, int lds, float[] p, int ldp, float[] vl, int ldvl, float[] vr, int ldvr, int mm, org.netlib.util.intW m, float[] work, org.netlib.util.intW info) {
    stgevc(side, howmny, select, 0, n, s, 0, lds, p, 0, ldp, vl, 0, ldvl, vr, 0, ldvr, mm, m, work, 0, info);
  }

  public void stgevc(String side, String howmny, boolean[] select, int offsetselect, int n, float[] s, int offsets, int lds, float[] p, int offsetp, int ldp, float[] vl, int offsetvl, int ldvl, float[] vr, int offsetvr, int ldvr, int mm, org.netlib.util.intW m, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    stgevcK(side, howmny, select, offsetselect, n, s, offsets, lds, p, offsetp, ldp, vl, offsetvl, ldvl, vr, offsetvr, ldvr, mm, m, work, offsetwork, info);
  }

  protected abstract void stgevcK(String side, String howmny, boolean[] select, int offsetselect, int n, float[] s, int offsets, int lds, float[] p, int offsetp, int ldp, float[] vl, int offsetvl, int ldvl, float[] vr, int offsetvr, int ldvr, int mm, org.netlib.util.intW m, float[] work, int offsetwork, org.netlib.util.intW info);

  public void stgex2(boolean wantq, boolean wantz, int n, float[] a, int lda, float[] b, int ldb, float[] q, int ldq, float[] z, int ldz, int j1, int n1, int n2, float[] work, int lwork, org.netlib.util.intW info) {
    stgex2(wantq, wantz, n, a, 0, lda, b, 0, ldb, q, 0, ldq, z, 0, ldz, j1, n1, n2, work, 0, lwork, info);
  }

  public void stgex2(boolean wantq, boolean wantz, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] q, int offsetq, int ldq, float[] z, int offsetz, int ldz, int j1, int n1, int n2, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    stgex2K(wantq, wantz, n, a, offseta, lda, b, offsetb, ldb, q, offsetq, ldq, z, offsetz, ldz, j1, n1, n2, work, offsetwork, lwork, info);
  }

  protected abstract void stgex2K(boolean wantq, boolean wantz, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] q, int offsetq, int ldq, float[] z, int offsetz, int ldz, int j1, int n1, int n2, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void stgexc(boolean wantq, boolean wantz, int n, float[] a, int lda, float[] b, int ldb, float[] q, int ldq, float[] z, int ldz, org.netlib.util.intW ifst, org.netlib.util.intW ilst, float[] work, int lwork, org.netlib.util.intW info) {
    stgexc(wantq, wantz, n, a, 0, lda, b, 0, ldb, q, 0, ldq, z, 0, ldz, ifst, ilst, work, 0, lwork, info);
  }

  public void stgexc(boolean wantq, boolean wantz, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] q, int offsetq, int ldq, float[] z, int offsetz, int ldz, org.netlib.util.intW ifst, org.netlib.util.intW ilst, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    stgexcK(wantq, wantz, n, a, offseta, lda, b, offsetb, ldb, q, offsetq, ldq, z, offsetz, ldz, ifst, ilst, work, offsetwork, lwork, info);
  }

  protected abstract void stgexcK(boolean wantq, boolean wantz, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] q, int offsetq, int ldq, float[] z, int offsetz, int ldz, org.netlib.util.intW ifst, org.netlib.util.intW ilst, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public void stgsen(int ijob, boolean wantq, boolean wantz, boolean[] select, int n, float[] a, int lda, float[] b, int ldb, float[] alphar, float[] alphai, float[] beta, float[] q, int ldq, float[] z, int ldz, org.netlib.util.intW m, org.netlib.util.floatW pl, org.netlib.util.floatW pr, float[] dif, float[] work, int lwork, int[] iwork, int liwork, org.netlib.util.intW info) {
    stgsen(ijob, wantq, wantz, select, 0, n, a, 0, lda, b, 0, ldb, alphar, 0, alphai, 0, beta, 0, q, 0, ldq, z, 0, ldz, m, pl, pr, dif, 0, work, 0, lwork, iwork, 0, liwork, info);
  }

  public void stgsen(int ijob, boolean wantq, boolean wantz, boolean[] select, int offsetselect, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] alphar, int offsetalphar, float[] alphai, int offsetalphai, float[] beta, int offsetbeta, float[] q, int offsetq, int ldq, float[] z, int offsetz, int ldz, org.netlib.util.intW m, org.netlib.util.floatW pl, org.netlib.util.floatW pr, float[] dif, int offsetdif, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    stgsenK(ijob, wantq, wantz, select, offsetselect, n, a, offseta, lda, b, offsetb, ldb, alphar, offsetalphar, alphai, offsetalphai, beta, offsetbeta, q, offsetq, ldq, z, offsetz, ldz, m, pl, pr, dif, offsetdif, work, offsetwork, lwork, iwork, offsetiwork, liwork, info);
  }

  protected abstract void stgsenK(int ijob, boolean wantq, boolean wantz, boolean[] select, int offsetselect, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] alphar, int offsetalphar, float[] alphai, int offsetalphai, float[] beta, int offsetbeta, float[] q, int offsetq, int ldq, float[] z, int offsetz, int ldz, org.netlib.util.intW m, org.netlib.util.floatW pl, org.netlib.util.floatW pr, float[] dif, int offsetdif, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info);

  public void stgsja(String jobu, String jobv, String jobq, int m, int p, int n, int k, int l, float[] a, int lda, float[] b, int ldb, float tola, float tolb, float[] alpha, float[] beta, float[] u, int ldu, float[] v, int ldv, float[] q, int ldq, float[] work, org.netlib.util.intW ncycle, org.netlib.util.intW info) {
    stgsja(jobu, jobv, jobq, m, p, n, k, l, a, 0, lda, b, 0, ldb, tola, tolb, alpha, 0, beta, 0, u, 0, ldu, v, 0, ldv, q, 0, ldq, work, 0, ncycle, info);
  }

  public void stgsja(String jobu, String jobv, String jobq, int m, int p, int n, int k, int l, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float tola, float tolb, float[] alpha, int offsetalpha, float[] beta, int offsetbeta, float[] u, int offsetu, int ldu, float[] v, int offsetv, int ldv, float[] q, int offsetq, int ldq, float[] work, int offsetwork, org.netlib.util.intW ncycle, org.netlib.util.intW info) {
    //FIXME Add arguments check
    stgsjaK(jobu, jobv, jobq, m, p, n, k, l, a, offseta, lda, b, offsetb, ldb, tola, tolb, alpha, offsetalpha, beta, offsetbeta, u, offsetu, ldu, v, offsetv, ldv, q, offsetq, ldq, work, offsetwork, ncycle, info);
  }

  protected abstract void stgsjaK(String jobu, String jobv, String jobq, int m, int p, int n, int k, int l, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float tola, float tolb, float[] alpha, int offsetalpha, float[] beta, int offsetbeta, float[] u, int offsetu, int ldu, float[] v, int offsetv, int ldv, float[] q, int offsetq, int ldq, float[] work, int offsetwork, org.netlib.util.intW ncycle, org.netlib.util.intW info);

  public void stgsna(String job, String howmny, boolean[] select, int n, float[] a, int lda, float[] b, int ldb, float[] vl, int ldvl, float[] vr, int ldvr, float[] s, float[] dif, int mm, org.netlib.util.intW m, float[] work, int lwork, int[] iwork, org.netlib.util.intW info) {
    stgsna(job, howmny, select, 0, n, a, 0, lda, b, 0, ldb, vl, 0, ldvl, vr, 0, ldvr, s, 0, dif, 0, mm, m, work, 0, lwork, iwork, 0, info);
  }

  public void stgsna(String job, String howmny, boolean[] select, int offsetselect, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] vl, int offsetvl, int ldvl, float[] vr, int offsetvr, int ldvr, float[] s, int offsets, float[] dif, int offsetdif, int mm, org.netlib.util.intW m, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    stgsnaK(job, howmny, select, offsetselect, n, a, offseta, lda, b, offsetb, ldb, vl, offsetvl, ldvl, vr, offsetvr, ldvr, s, offsets, dif, offsetdif, mm, m, work, offsetwork, lwork, iwork, offsetiwork, info);
  }

  protected abstract void stgsnaK(String job, String howmny, boolean[] select, int offsetselect, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] vl, int offsetvl, int ldvl, float[] vr, int offsetvr, int ldvr, float[] s, int offsets, float[] dif, int offsetdif, int mm, org.netlib.util.intW m, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void stgsy2(String trans, int ijob, int m, int n, float[] a, int lda, float[] b, int ldb, float[] c, int Ldc, float[] d, int ldd, float[] e, int lde, float[] f, int ldf, org.netlib.util.floatW scale, org.netlib.util.floatW rdsum, org.netlib.util.floatW rdscal, int[] iwork, org.netlib.util.intW pq, org.netlib.util.intW info) {
    stgsy2(trans, ijob, m, n, a, 0, lda, b, 0, ldb, c, 0, Ldc, d, 0, ldd, e, 0, lde, f, 0, ldf, scale, rdsum, rdscal, iwork, 0, pq, info);
  }

  public void stgsy2(String trans, int ijob, int m, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] c, int offsetc, int Ldc, float[] d, int offsetd, int ldd, float[] e, int offsete, int lde, float[] f, int offsetf, int ldf, org.netlib.util.floatW scale, org.netlib.util.floatW rdsum, org.netlib.util.floatW rdscal, int[] iwork, int offsetiwork, org.netlib.util.intW pq, org.netlib.util.intW info) {
    //FIXME Add arguments check
    stgsy2K(trans, ijob, m, n, a, offseta, lda, b, offsetb, ldb, c, offsetc, Ldc, d, offsetd, ldd, e, offsete, lde, f, offsetf, ldf, scale, rdsum, rdscal, iwork, offsetiwork, pq, info);
  }

  protected abstract void stgsy2K(String trans, int ijob, int m, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] c, int offsetc, int Ldc, float[] d, int offsetd, int ldd, float[] e, int offsete, int lde, float[] f, int offsetf, int ldf, org.netlib.util.floatW scale, org.netlib.util.floatW rdsum, org.netlib.util.floatW rdscal, int[] iwork, int offsetiwork, org.netlib.util.intW pq, org.netlib.util.intW info);

  public void stgsyl(String trans, int ijob, int m, int n, float[] a, int lda, float[] b, int ldb, float[] c, int Ldc, float[] d, int ldd, float[] e, int lde, float[] f, int ldf, org.netlib.util.floatW scale, org.netlib.util.floatW dif, float[] work, int lwork, int[] iwork, org.netlib.util.intW info) {
    stgsyl(trans, ijob, m, n, a, 0, lda, b, 0, ldb, c, 0, Ldc, d, 0, ldd, e, 0, lde, f, 0, ldf, scale, dif, work, 0, lwork, iwork, 0, info);
  }

  public void stgsyl(String trans, int ijob, int m, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] c, int offsetc, int Ldc, float[] d, int offsetd, int ldd, float[] e, int offsete, int lde, float[] f, int offsetf, int ldf, org.netlib.util.floatW scale, org.netlib.util.floatW dif, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    stgsylK(trans, ijob, m, n, a, offseta, lda, b, offsetb, ldb, c, offsetc, Ldc, d, offsetd, ldd, e, offsete, lde, f, offsetf, ldf, scale, dif, work, offsetwork, lwork, iwork, offsetiwork, info);
  }

  protected abstract void stgsylK(String trans, int ijob, int m, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] c, int offsetc, int Ldc, float[] d, int offsetd, int ldd, float[] e, int offsete, int lde, float[] f, int offsetf, int ldf, org.netlib.util.floatW scale, org.netlib.util.floatW dif, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void stpcon(String norm, String uplo, String diag, int n, float[] ap, org.netlib.util.floatW rcond, float[] work, int[] iwork, org.netlib.util.intW info) {
    stpcon(norm, uplo, diag, n, ap, 0, rcond, work, 0, iwork, 0, info);
  }

  public void stpcon(String norm, String uplo, String diag, int n, float[] ap, int offsetap, org.netlib.util.floatW rcond, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    stpconK(norm, uplo, diag, n, ap, offsetap, rcond, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void stpconK(String norm, String uplo, String diag, int n, float[] ap, int offsetap, org.netlib.util.floatW rcond, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void stprfs(String uplo, String trans, String diag, int n, int nrhs, float[] ap, float[] b, int ldb, float[] x, int ldx, float[] ferr, float[] berr, float[] work, int[] iwork, org.netlib.util.intW info) {
    stprfs(uplo, trans, diag, n, nrhs, ap, 0, b, 0, ldb, x, 0, ldx, ferr, 0, berr, 0, work, 0, iwork, 0, info);
  }

  public void stprfs(String uplo, String trans, String diag, int n, int nrhs, float[] ap, int offsetap, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    stprfsK(uplo, trans, diag, n, nrhs, ap, offsetap, b, offsetb, ldb, x, offsetx, ldx, ferr, offsetferr, berr, offsetberr, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void stprfsK(String uplo, String trans, String diag, int n, int nrhs, float[] ap, int offsetap, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void stptri(String uplo, String diag, int n, float[] ap, org.netlib.util.intW info) {
    stptri(uplo, diag, n, ap, 0, info);
  }

  public void stptri(String uplo, String diag, int n, float[] ap, int offsetap, org.netlib.util.intW info) {
    //FIXME Add arguments check
    stptriK(uplo, diag, n, ap, offsetap, info);
  }

  protected abstract void stptriK(String uplo, String diag, int n, float[] ap, int offsetap, org.netlib.util.intW info);

  public void stptrs(String uplo, String trans, String diag, int n, int nrhs, float[] ap, float[] b, int ldb, org.netlib.util.intW info) {
    stptrs(uplo, trans, diag, n, nrhs, ap, 0, b, 0, ldb, info);
  }

  public void stptrs(String uplo, String trans, String diag, int n, int nrhs, float[] ap, int offsetap, float[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    stptrsK(uplo, trans, diag, n, nrhs, ap, offsetap, b, offsetb, ldb, info);
  }

  protected abstract void stptrsK(String uplo, String trans, String diag, int n, int nrhs, float[] ap, int offsetap, float[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void strcon(String norm, String uplo, String diag, int n, float[] a, int lda, org.netlib.util.floatW rcond, float[] work, int[] iwork, org.netlib.util.intW info) {
    strcon(norm, uplo, diag, n, a, 0, lda, rcond, work, 0, iwork, 0, info);
  }

  public void strcon(String norm, String uplo, String diag, int n, float[] a, int offseta, int lda, org.netlib.util.floatW rcond, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    strconK(norm, uplo, diag, n, a, offseta, lda, rcond, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void strconK(String norm, String uplo, String diag, int n, float[] a, int offseta, int lda, org.netlib.util.floatW rcond, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void strevc(String side, String howmny, boolean[] select, int n, float[] t, int ldt, float[] vl, int ldvl, float[] vr, int ldvr, int mm, org.netlib.util.intW m, float[] work, org.netlib.util.intW info) {
    strevc(side, howmny, select, 0, n, t, 0, ldt, vl, 0, ldvl, vr, 0, ldvr, mm, m, work, 0, info);
  }

  public void strevc(String side, String howmny, boolean[] select, int offsetselect, int n, float[] t, int offsett, int ldt, float[] vl, int offsetvl, int ldvl, float[] vr, int offsetvr, int ldvr, int mm, org.netlib.util.intW m, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    strevcK(side, howmny, select, offsetselect, n, t, offsett, ldt, vl, offsetvl, ldvl, vr, offsetvr, ldvr, mm, m, work, offsetwork, info);
  }

  protected abstract void strevcK(String side, String howmny, boolean[] select, int offsetselect, int n, float[] t, int offsett, int ldt, float[] vl, int offsetvl, int ldvl, float[] vr, int offsetvr, int ldvr, int mm, org.netlib.util.intW m, float[] work, int offsetwork, org.netlib.util.intW info);

  public void strexc(String compq, int n, float[] t, int ldt, float[] q, int ldq, org.netlib.util.intW ifst, org.netlib.util.intW ilst, float[] work, org.netlib.util.intW info) {
    strexc(compq, n, t, 0, ldt, q, 0, ldq, ifst, ilst, work, 0, info);
  }

  public void strexc(String compq, int n, float[] t, int offsett, int ldt, float[] q, int offsetq, int ldq, org.netlib.util.intW ifst, org.netlib.util.intW ilst, float[] work, int offsetwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    strexcK(compq, n, t, offsett, ldt, q, offsetq, ldq, ifst, ilst, work, offsetwork, info);
  }

  protected abstract void strexcK(String compq, int n, float[] t, int offsett, int ldt, float[] q, int offsetq, int ldq, org.netlib.util.intW ifst, org.netlib.util.intW ilst, float[] work, int offsetwork, org.netlib.util.intW info);

  public void strrfs(String uplo, String trans, String diag, int n, int nrhs, float[] a, int lda, float[] b, int ldb, float[] x, int ldx, float[] ferr, float[] berr, float[] work, int[] iwork, org.netlib.util.intW info) {
    strrfs(uplo, trans, diag, n, nrhs, a, 0, lda, b, 0, ldb, x, 0, ldx, ferr, 0, berr, 0, work, 0, iwork, 0, info);
  }

  public void strrfs(String uplo, String trans, String diag, int n, int nrhs, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    strrfsK(uplo, trans, diag, n, nrhs, a, offseta, lda, b, offsetb, ldb, x, offsetx, ldx, ferr, offsetferr, berr, offsetberr, work, offsetwork, iwork, offsetiwork, info);
  }

  protected abstract void strrfsK(String uplo, String trans, String diag, int n, int nrhs, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] x, int offsetx, int ldx, float[] ferr, int offsetferr, float[] berr, int offsetberr, float[] work, int offsetwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void strsen(String job, String compq, boolean[] select, int n, float[] t, int ldt, float[] q, int ldq, float[] wr, float[] wi, org.netlib.util.intW m, org.netlib.util.floatW s, org.netlib.util.floatW sep, float[] work, int lwork, int[] iwork, int liwork, org.netlib.util.intW info) {
    strsen(job, compq, select, 0, n, t, 0, ldt, q, 0, ldq, wr, 0, wi, 0, m, s, sep, work, 0, lwork, iwork, 0, liwork, info);
  }

  public void strsen(String job, String compq, boolean[] select, int offsetselect, int n, float[] t, int offsett, int ldt, float[] q, int offsetq, int ldq, float[] wr, int offsetwr, float[] wi, int offsetwi, org.netlib.util.intW m, org.netlib.util.floatW s, org.netlib.util.floatW sep, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    strsenK(job, compq, select, offsetselect, n, t, offsett, ldt, q, offsetq, ldq, wr, offsetwr, wi, offsetwi, m, s, sep, work, offsetwork, lwork, iwork, offsetiwork, liwork, info);
  }

  protected abstract void strsenK(String job, String compq, boolean[] select, int offsetselect, int n, float[] t, int offsett, int ldt, float[] q, int offsetq, int ldq, float[] wr, int offsetwr, float[] wi, int offsetwi, org.netlib.util.intW m, org.netlib.util.floatW s, org.netlib.util.floatW sep, float[] work, int offsetwork, int lwork, int[] iwork, int offsetiwork, int liwork, org.netlib.util.intW info);

  public void strsna(String job, String howmny, boolean[] select, int n, float[] t, int ldt, float[] vl, int ldvl, float[] vr, int ldvr, float[] s, float[] sep, int mm, org.netlib.util.intW m, float[] work, int ldwork, int[] iwork, org.netlib.util.intW info) {
    strsna(job, howmny, select, 0, n, t, 0, ldt, vl, 0, ldvl, vr, 0, ldvr, s, 0, sep, 0, mm, m, work, 0, ldwork, iwork, 0, info);
  }

  public void strsna(String job, String howmny, boolean[] select, int offsetselect, int n, float[] t, int offsett, int ldt, float[] vl, int offsetvl, int ldvl, float[] vr, int offsetvr, int ldvr, float[] s, int offsets, float[] sep, int offsetsep, int mm, org.netlib.util.intW m, float[] work, int offsetwork, int ldwork, int[] iwork, int offsetiwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    strsnaK(job, howmny, select, offsetselect, n, t, offsett, ldt, vl, offsetvl, ldvl, vr, offsetvr, ldvr, s, offsets, sep, offsetsep, mm, m, work, offsetwork, ldwork, iwork, offsetiwork, info);
  }

  protected abstract void strsnaK(String job, String howmny, boolean[] select, int offsetselect, int n, float[] t, int offsett, int ldt, float[] vl, int offsetvl, int ldvl, float[] vr, int offsetvr, int ldvr, float[] s, int offsets, float[] sep, int offsetsep, int mm, org.netlib.util.intW m, float[] work, int offsetwork, int ldwork, int[] iwork, int offsetiwork, org.netlib.util.intW info);

  public void strsyl(String trana, String tranb, int isgn, int m, int n, float[] a, int lda, float[] b, int ldb, float[] c, int Ldc, org.netlib.util.floatW scale, org.netlib.util.intW info) {
    strsyl(trana, tranb, isgn, m, n, a, 0, lda, b, 0, ldb, c, 0, Ldc, scale, info);
  }

  public void strsyl(String trana, String tranb, int isgn, int m, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] c, int offsetc, int Ldc, org.netlib.util.floatW scale, org.netlib.util.intW info) {
    //FIXME Add arguments check
    strsylK(trana, tranb, isgn, m, n, a, offseta, lda, b, offsetb, ldb, c, offsetc, Ldc, scale, info);
  }

  protected abstract void strsylK(String trana, String tranb, int isgn, int m, int n, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, float[] c, int offsetc, int Ldc, org.netlib.util.floatW scale, org.netlib.util.intW info);

  public void strti2(String uplo, String diag, int n, float[] a, int lda, org.netlib.util.intW info) {
    strti2(uplo, diag, n, a, 0, lda, info);
  }

  public void strti2(String uplo, String diag, int n, float[] a, int offseta, int lda, org.netlib.util.intW info) {
    //FIXME Add arguments check
    strti2K(uplo, diag, n, a, offseta, lda, info);
  }

  protected abstract void strti2K(String uplo, String diag, int n, float[] a, int offseta, int lda, org.netlib.util.intW info);

  public void strtri(String uplo, String diag, int n, float[] a, int lda, org.netlib.util.intW info) {
    strtri(uplo, diag, n, a, 0, lda, info);
  }

  public void strtri(String uplo, String diag, int n, float[] a, int offseta, int lda, org.netlib.util.intW info) {
    //FIXME Add arguments check
    strtriK(uplo, diag, n, a, offseta, lda, info);
  }

  protected abstract void strtriK(String uplo, String diag, int n, float[] a, int offseta, int lda, org.netlib.util.intW info);

  public void strtrs(String uplo, String trans, String diag, int n, int nrhs, float[] a, int lda, float[] b, int ldb, org.netlib.util.intW info) {
    strtrs(uplo, trans, diag, n, nrhs, a, 0, lda, b, 0, ldb, info);
  }

  public void strtrs(String uplo, String trans, String diag, int n, int nrhs, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, org.netlib.util.intW info) {
    //FIXME Add arguments check
    strtrsK(uplo, trans, diag, n, nrhs, a, offseta, lda, b, offsetb, ldb, info);
  }

  protected abstract void strtrsK(String uplo, String trans, String diag, int n, int nrhs, float[] a, int offseta, int lda, float[] b, int offsetb, int ldb, org.netlib.util.intW info);

  public void stzrqf(int m, int n, float[] a, int lda, float[] tau, org.netlib.util.intW info) {
    stzrqf(m, n, a, 0, lda, tau, 0, info);
  }

  public void stzrqf(int m, int n, float[] a, int offseta, int lda, float[] tau, int offsettau, org.netlib.util.intW info) {
    //FIXME Add arguments check
    stzrqfK(m, n, a, offseta, lda, tau, offsettau, info);
  }

  protected abstract void stzrqfK(int m, int n, float[] a, int offseta, int lda, float[] tau, int offsettau, org.netlib.util.intW info);

  public void stzrzf(int m, int n, float[] a, int lda, float[] tau, float[] work, int lwork, org.netlib.util.intW info) {
    stzrzf(m, n, a, 0, lda, tau, 0, work, 0, lwork, info);
  }

  public void stzrzf(int m, int n, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, int lwork, org.netlib.util.intW info) {
    //FIXME Add arguments check
    stzrzfK(m, n, a, offseta, lda, tau, offsettau, work, offsetwork, lwork, info);
  }

  protected abstract void stzrzfK(int m, int n, float[] a, int offseta, int lda, float[] tau, int offsettau, float[] work, int offsetwork, int lwork, org.netlib.util.intW info);

  public double dlamch(String cmach) {
    return dlamchK(cmach);
  }

  protected abstract double dlamchK(String cmach);

  public void dlamc1(org.netlib.util.intW beta, org.netlib.util.intW t, org.netlib.util.booleanW rnd, org.netlib.util.booleanW ieee1) {
    dlamc1K(beta, t, rnd, ieee1);
  }

  protected abstract void dlamc1K(org.netlib.util.intW beta, org.netlib.util.intW t, org.netlib.util.booleanW rnd, org.netlib.util.booleanW ieee1);

  public void dlamc2(org.netlib.util.intW beta, org.netlib.util.intW t, org.netlib.util.booleanW rnd, org.netlib.util.doubleW eps, org.netlib.util.intW emin, org.netlib.util.doubleW rmin, org.netlib.util.intW emax, org.netlib.util.doubleW rmax) {
    dlamc2K(beta, t, rnd, eps, emin, rmin, emax, rmax);
  }

  protected abstract void dlamc2K(org.netlib.util.intW beta, org.netlib.util.intW t, org.netlib.util.booleanW rnd, org.netlib.util.doubleW eps, org.netlib.util.intW emin, org.netlib.util.doubleW rmin, org.netlib.util.intW emax, org.netlib.util.doubleW rmax);

  public double dlamc3(double a, double b) {
    return dlamc3K(a, b);
  }

  protected abstract double dlamc3K(double a, double b);

  public void dlamc4(org.netlib.util.intW emin, double start, int base) {
    dlamc4K(emin, start, base);
  }

  protected abstract void dlamc4K(org.netlib.util.intW emin, double start, int base);

  public void dlamc5(int beta, int p, int emin, boolean ieee, org.netlib.util.intW emax, org.netlib.util.doubleW rmax) {
    dlamc5K(beta, p, emin, ieee, emax, rmax);
  }

  protected abstract void dlamc5K(int beta, int p, int emin, boolean ieee, org.netlib.util.intW emax, org.netlib.util.doubleW rmax);

  public double dsecnd() {
    return dsecndK();
  }

  protected abstract double dsecndK();

  public boolean lsame(String ca, String cb) {
    return lsameK(ca, cb);
  }

  protected abstract boolean lsameK(String ca, String cb);

  public float second() {
    return secondK();
  }

  protected abstract float secondK();

  public float slamch(String cmach) {
    return slamchK(cmach);
  }

  protected abstract float slamchK(String cmach);

  public void slamc1(org.netlib.util.intW beta, org.netlib.util.intW t, org.netlib.util.booleanW rnd, org.netlib.util.booleanW ieee1) {
    slamc1K(beta, t, rnd, ieee1);
  }

  protected abstract void slamc1K(org.netlib.util.intW beta, org.netlib.util.intW t, org.netlib.util.booleanW rnd, org.netlib.util.booleanW ieee1);

  public void slamc2(org.netlib.util.intW beta, org.netlib.util.intW t, org.netlib.util.booleanW rnd, org.netlib.util.floatW eps, org.netlib.util.intW emin, org.netlib.util.floatW rmin, org.netlib.util.intW emax, org.netlib.util.floatW rmax) {
    slamc2K(beta, t, rnd, eps, emin, rmin, emax, rmax);
  }

  protected abstract void slamc2K(org.netlib.util.intW beta, org.netlib.util.intW t, org.netlib.util.booleanW rnd, org.netlib.util.floatW eps, org.netlib.util.intW emin, org.netlib.util.floatW rmin, org.netlib.util.intW emax, org.netlib.util.floatW rmax);

  public float slamc3(float a, float b) {
    return slamc3K(a, b);
  }

  protected abstract float slamc3K(float a, float b);

  public void slamc4(org.netlib.util.intW emin, float start, int base) {
    slamc4K(emin, start, base);
  }

  protected abstract void slamc4K(org.netlib.util.intW emin, float start, int base);

  public void slamc5(int beta, int p, int emin, boolean ieee, org.netlib.util.intW emax, org.netlib.util.floatW rmax) {
    slamc5K(beta, p, emin, ieee, emax, rmax);
  }

  protected abstract void slamc5K(int beta, int p, int emin, boolean ieee, org.netlib.util.intW emax, org.netlib.util.floatW rmax);
}
