/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/CreateRegexPatternSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRegexPatternSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * High-level information about a <a>RegexPatternSet</a>, returned by operations like create and list. This provides
     * information like the ID, that you can use to retrieve and manage a <code>RegexPatternSet</code>, and the ARN,
     * that you provide to the <a>RegexPatternSetReferenceStatement</a> to use the pattern set in a <a>Rule</a>.
     * </p>
     */
    private RegexPatternSetSummary summary;

    /**
     * <p>
     * High-level information about a <a>RegexPatternSet</a>, returned by operations like create and list. This provides
     * information like the ID, that you can use to retrieve and manage a <code>RegexPatternSet</code>, and the ARN,
     * that you provide to the <a>RegexPatternSetReferenceStatement</a> to use the pattern set in a <a>Rule</a>.
     * </p>
     * 
     * @param summary
     *        High-level information about a <a>RegexPatternSet</a>, returned by operations like create and list. This
     *        provides information like the ID, that you can use to retrieve and manage a <code>RegexPatternSet</code>,
     *        and the ARN, that you provide to the <a>RegexPatternSetReferenceStatement</a> to use the pattern set in a
     *        <a>Rule</a>.
     */

    public void setSummary(RegexPatternSetSummary summary) {
        this.summary = summary;
    }

    /**
     * <p>
     * High-level information about a <a>RegexPatternSet</a>, returned by operations like create and list. This provides
     * information like the ID, that you can use to retrieve and manage a <code>RegexPatternSet</code>, and the ARN,
     * that you provide to the <a>RegexPatternSetReferenceStatement</a> to use the pattern set in a <a>Rule</a>.
     * </p>
     * 
     * @return High-level information about a <a>RegexPatternSet</a>, returned by operations like create and list. This
     *         provides information like the ID, that you can use to retrieve and manage a <code>RegexPatternSet</code>,
     *         and the ARN, that you provide to the <a>RegexPatternSetReferenceStatement</a> to use the pattern set in a
     *         <a>Rule</a>.
     */

    public RegexPatternSetSummary getSummary() {
        return this.summary;
    }

    /**
     * <p>
     * High-level information about a <a>RegexPatternSet</a>, returned by operations like create and list. This provides
     * information like the ID, that you can use to retrieve and manage a <code>RegexPatternSet</code>, and the ARN,
     * that you provide to the <a>RegexPatternSetReferenceStatement</a> to use the pattern set in a <a>Rule</a>.
     * </p>
     * 
     * @param summary
     *        High-level information about a <a>RegexPatternSet</a>, returned by operations like create and list. This
     *        provides information like the ID, that you can use to retrieve and manage a <code>RegexPatternSet</code>,
     *        and the ARN, that you provide to the <a>RegexPatternSetReferenceStatement</a> to use the pattern set in a
     *        <a>Rule</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRegexPatternSetResult withSummary(RegexPatternSetSummary summary) {
        setSummary(summary);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSummary() != null)
            sb.append("Summary: ").append(getSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRegexPatternSetResult == false)
            return false;
        CreateRegexPatternSetResult other = (CreateRegexPatternSetResult) obj;
        if (other.getSummary() == null ^ this.getSummary() == null)
            return false;
        if (other.getSummary() != null && other.getSummary().equals(this.getSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSummary() == null) ? 0 : getSummary().hashCode());
        return hashCode;
    }

    @Override
    public CreateRegexPatternSetResult clone() {
        try {
            return (CreateRegexPatternSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
