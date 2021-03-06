/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mq.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Returns information about all configurations.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/Configuration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Configuration implements Serializable, Cloneable, StructuredPojo {

    /** Required. The ARN of the configuration. */
    private String arn;
    /** Required. The description of the configuration. */
    private String description;
    /** Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ. */
    private String engineType;
    /** Required. The version of the broker engine. */
    private String engineVersion;
    /** Required. The unique ID that Amazon MQ generates for the configuration. */
    private String id;
    /** Required. The latest revision of the configuration. */
    private ConfigurationRevision latestRevision;
    /**
     * Required. The name of the configuration. This value can contain only alphanumeric characters, dashes, periods,
     * underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
     */
    private String name;

    /**
     * Required. The ARN of the configuration.
     * 
     * @param arn
     *        Required. The ARN of the configuration.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * Required. The ARN of the configuration.
     * 
     * @return Required. The ARN of the configuration.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * Required. The ARN of the configuration.
     * 
     * @param arn
     *        Required. The ARN of the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Configuration withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * Required. The description of the configuration.
     * 
     * @param description
     *        Required. The description of the configuration.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Required. The description of the configuration.
     * 
     * @return Required. The description of the configuration.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * Required. The description of the configuration.
     * 
     * @param description
     *        Required. The description of the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Configuration withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ.
     * 
     * @param engineType
     *        Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ.
     * @see EngineType
     */

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    /**
     * Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ.
     * 
     * @return Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ.
     * @see EngineType
     */

    public String getEngineType() {
        return this.engineType;
    }

    /**
     * Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ.
     * 
     * @param engineType
     *        Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineType
     */

    public Configuration withEngineType(String engineType) {
        setEngineType(engineType);
        return this;
    }

    /**
     * Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ.
     * 
     * @param engineType
     *        Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineType
     */

    public Configuration withEngineType(EngineType engineType) {
        this.engineType = engineType.toString();
        return this;
    }

    /**
     * Required. The version of the broker engine.
     * 
     * @param engineVersion
     *        Required. The version of the broker engine.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * Required. The version of the broker engine.
     * 
     * @return Required. The version of the broker engine.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * Required. The version of the broker engine.
     * 
     * @param engineVersion
     *        Required. The version of the broker engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Configuration withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * Required. The unique ID that Amazon MQ generates for the configuration.
     * 
     * @param id
     *        Required. The unique ID that Amazon MQ generates for the configuration.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Required. The unique ID that Amazon MQ generates for the configuration.
     * 
     * @return Required. The unique ID that Amazon MQ generates for the configuration.
     */

    public String getId() {
        return this.id;
    }

    /**
     * Required. The unique ID that Amazon MQ generates for the configuration.
     * 
     * @param id
     *        Required. The unique ID that Amazon MQ generates for the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Configuration withId(String id) {
        setId(id);
        return this;
    }

    /**
     * Required. The latest revision of the configuration.
     * 
     * @param latestRevision
     *        Required. The latest revision of the configuration.
     */

    public void setLatestRevision(ConfigurationRevision latestRevision) {
        this.latestRevision = latestRevision;
    }

    /**
     * Required. The latest revision of the configuration.
     * 
     * @return Required. The latest revision of the configuration.
     */

    public ConfigurationRevision getLatestRevision() {
        return this.latestRevision;
    }

    /**
     * Required. The latest revision of the configuration.
     * 
     * @param latestRevision
     *        Required. The latest revision of the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Configuration withLatestRevision(ConfigurationRevision latestRevision) {
        setLatestRevision(latestRevision);
        return this;
    }

    /**
     * Required. The name of the configuration. This value can contain only alphanumeric characters, dashes, periods,
     * underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
     * 
     * @param name
     *        Required. The name of the configuration. This value can contain only alphanumeric characters, dashes,
     *        periods, underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Required. The name of the configuration. This value can contain only alphanumeric characters, dashes, periods,
     * underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
     * 
     * @return Required. The name of the configuration. This value can contain only alphanumeric characters, dashes,
     *         periods, underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
     */

    public String getName() {
        return this.name;
    }

    /**
     * Required. The name of the configuration. This value can contain only alphanumeric characters, dashes, periods,
     * underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
     * 
     * @param name
     *        Required. The name of the configuration. This value can contain only alphanumeric characters, dashes,
     *        periods, underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Configuration withName(String name) {
        setName(name);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEngineType() != null)
            sb.append("EngineType: ").append(getEngineType()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLatestRevision() != null)
            sb.append("LatestRevision: ").append(getLatestRevision()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Configuration == false)
            return false;
        Configuration other = (Configuration) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEngineType() == null ^ this.getEngineType() == null)
            return false;
        if (other.getEngineType() != null && other.getEngineType().equals(this.getEngineType()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLatestRevision() == null ^ this.getLatestRevision() == null)
            return false;
        if (other.getLatestRevision() != null && other.getLatestRevision().equals(this.getLatestRevision()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEngineType() == null) ? 0 : getEngineType().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLatestRevision() == null) ? 0 : getLatestRevision().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public Configuration clone() {
        try {
            return (Configuration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mq.model.transform.ConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
