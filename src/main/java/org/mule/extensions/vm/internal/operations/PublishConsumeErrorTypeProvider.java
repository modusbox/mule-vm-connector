/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.extensions.vm.internal.operations;

import static java.util.Collections.unmodifiableSet;
import static org.mule.extensions.vm.api.VMError.PUBLISH_CONSUMER_FLOW_ERROR;
import static org.mule.extensions.vm.api.VMError.QUEUE_TIMEOUT;
import org.mule.runtime.extension.api.annotation.error.ErrorTypeProvider;
import org.mule.runtime.extension.api.error.ErrorTypeDefinition;

import java.util.HashSet;
import java.util.Set;

/**
 * {@link ErrorTypeProvider} for the publishConsume operation
 *
 * @since 1.0
 */
public class PublishConsumeErrorTypeProvider implements ErrorTypeProvider {

  @Override
  public Set<ErrorTypeDefinition> getErrorTypes() {
    Set<ErrorTypeDefinition> errors = new HashSet<>();
    errors.add(QUEUE_TIMEOUT);
    errors.add(PUBLISH_CONSUMER_FLOW_ERROR);

    return unmodifiableSet(errors);
  }

}
