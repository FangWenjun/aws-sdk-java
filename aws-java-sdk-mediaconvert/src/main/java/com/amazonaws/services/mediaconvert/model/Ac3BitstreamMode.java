/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.mediaconvert.model;

import javax.annotation.Generated;

/**
 * Specifies the "Bitstream Mode" (bsmod) for the emitted AC-3 stream. See ATSC A/52-2012 for background on these
 * values.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum Ac3BitstreamMode {

    COMPLETE_MAIN("COMPLETE_MAIN"),
    COMMENTARY("COMMENTARY"),
    DIALOGUE("DIALOGUE"),
    EMERGENCY("EMERGENCY"),
    HEARING_IMPAIRED("HEARING_IMPAIRED"),
    MUSIC_AND_EFFECTS("MUSIC_AND_EFFECTS"),
    VISUALLY_IMPAIRED("VISUALLY_IMPAIRED"),
    VOICE_OVER("VOICE_OVER");

    private String value;

    private Ac3BitstreamMode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return Ac3BitstreamMode corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static Ac3BitstreamMode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (Ac3BitstreamMode enumEntry : Ac3BitstreamMode.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}