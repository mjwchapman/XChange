/**
 * Copyright (C) 2012 - 2013 Mark van Cuijk mark@van-cuijk.nl
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.xeiam.xchange.examples.mtgox.v1.service.account;

import com.xeiam.xchange.Exchange;
import com.xeiam.xchange.examples.mtgox.v1.MtGoxV1ExamplesUtils;
import com.xeiam.xchange.service.account.polling.PollingAccountService;

/**
 * Demo requesting account info at MtGox
 * 
 * @deprecated Use V2! This will be removed in 1.8.0+
 */
@Deprecated
public class BitcoinDepositAddressDemo {

  public static void main(String[] args) {

    Exchange mtgox = MtGoxV1ExamplesUtils.createExchange();

    // Interested in the private account functionality (authentication)
    PollingAccountService accountService = mtgox.getPollingAccountService();

    // Request a Bitcoin deposit address
    String address = accountService.requestBitcoinDepositAddress("Demonstation address", null);
    System.out.println("Address to deposit Bitcoins to: " + address);
  }
}