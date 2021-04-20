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

package dev.ludovic.netlib.arpack;

import dev.ludovic.netlib.ARPACK;

public final class NetlibNativeARPACK extends NetlibWrapper {

  private static final NetlibNativeARPACK instance;

  static {
    com.github.fommil.netlib.ARPACK arpack = com.github.fommil.netlib.ARPACK.getInstance();
    if (arpack instanceof com.github.fommil.netlib.F2jARPACK) {
        throw new RuntimeException("Unable to load native implementation");
    }
    instance = new NetlibNativeARPACK(arpack);
  }

  protected NetlibNativeARPACK(com.github.fommil.netlib.ARPACK _arpack) {
    super(_arpack);
  }

  public static ARPACK getInstance() {
    return instance;
  }
}
