/*
 * JBoss, Home of Professional Open Source
 * Copyright 2018, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.weld.context.api;

import javax.enterprise.context.spi.Contextual;
import javax.enterprise.context.spi.CreationalContext;

/**
 * Represents a contextual instance of a given type. This is an abstraction on top of the actual bean instance stored in each
 * context. It glues together the actual instance with its {@link CreationalContext} and {@link Contextual}
 *
 * @author <a href="mailto:manovotn@redhat.com">Matej Novotny</a>
 */
public interface ContextualInstance<T> {

    T getInstance();

    CreationalContext<T> getCreationalContext();

    Contextual<T> getContextual();
}
