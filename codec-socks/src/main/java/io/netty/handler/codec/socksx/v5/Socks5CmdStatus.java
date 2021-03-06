/*
 * Copyright 2013 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.netty.handler.codec.socksx.v5;

public enum Socks5CmdStatus {
    SUCCESS((byte) 0x00),
    FAILURE((byte) 0x01),
    FORBIDDEN((byte) 0x02),
    NETWORK_UNREACHABLE((byte) 0x03),
    HOST_UNREACHABLE((byte) 0x04),
    REFUSED((byte) 0x05),
    TTL_EXPIRED((byte) 0x06),
    COMMAND_NOT_SUPPORTED((byte) 0x07),
    ADDRESS_NOT_SUPPORTED((byte) 0x08),
    UNASSIGNED((byte) 0xff);

    private final byte b;

    Socks5CmdStatus(byte b) {
        this.b = b;
    }

    public static Socks5CmdStatus valueOf(byte b) {
        for (Socks5CmdStatus code : values()) {
            if (code.b == b) {
                return code;
            }
        }
        return UNASSIGNED;
    }

    public byte byteValue() {
        return b;
    }
}
