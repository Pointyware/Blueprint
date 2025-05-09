/*
 * Copyright (c) 2024 Pointyware. Use of this software is governed by the GPL-3.0 license.
 */

package org.pointyware.blueprint

/**
 * Members include user interface implementations and supporting classes like "<actual> view state" models.
 */
annotation class UiLayer {

}

/**
 * Members include implementations using frameworks and supporting classes like "<actual> view state" models.
 */
annotation class FrameworkLayer {

}

/**
 * Members include view models and supporting classes like "ui state" models.
 */
annotation class ViewModelLayer {

}

/**
 * Members include adapter implementations and supporting classes.
 */
annotation class AdapterLayer {

}

/**
 * Members include domain models and supporting classes like "use case" interactors.
 */
annotation class DomainLayer {

}


/**
 * Members include data access objects and supporting classes like "repository" interfaces.
 */
annotation class DataLayer {

}
