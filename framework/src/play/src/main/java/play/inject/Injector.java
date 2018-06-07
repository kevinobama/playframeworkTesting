/*
 * Copyright (C) 2009-2018 Lightbend Inc. <https://www.lightbend.com>
 */

package play.inject;

import play.api.inject.BindingKey;

/**
 * An injector, capable of providing components.
 *
 * This is an abstraction over whatever dependency injection is being used in Play. A minimal implementation may only
 * call {@code newInstance} on the passed in class.
 *
 * This abstraction is primarily provided for libraries that want to remain agnostic to the type of dependency
 * injection being used. End users are encouraged to use the facilities provided by the dependency injection framework
 * they are using directly, for example, if using Guice, use {@link com.google.inject.Injector} instead of this.
 */
public interface Injector {

    /**
     * Get an instance of the given class from the injector.
     *
     * @param <T> the type of the instance
     * @param clazz The class to get the instance of
     * @return The instance
     */
    <T> T instanceOf(Class<T> clazz);

    /**
     * Get an instance of the given class from the injector.
     *
     * @param <T> the type of the instance
     * @param key The key of the binding
     * @return The instance
     */
    <T> T instanceOf(BindingKey<T> key);

    /**
     * Get as an instance of the Scala injector.
     *
     * @return an instance of the Scala injector.
     * @see play.api.inject.Injector
     */
    play.api.inject.Injector asScala();
}
