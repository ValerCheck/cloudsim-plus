/**
 *
 * The package provide {@link org.cloudbus.cloudsim.vms.Vm} implementations.
 * A Virtual Machine (Vm) is executed by a Host and it is used to run applications ({@link org.cloudbus.cloudsim.cloudlets.Cloudlet})
 * from a specific cloud customer
 * (represented by a {@link org.cloudbus.cloudsim.brokers.DatacenterBroker}).
 *
 * <p>As each VM can run several Cloudlets, the scheduling of such Cloudlets on the VM's CPU
 * cores ({@link org.cloudbus.cloudsim.resources.Pe}) is defined by
 * a {@link org.cloudbus.cloudsim.schedulers.cloudlet.CloudletScheduler}.
 * </p>
 *
 * <p>The most basic Vm implementation is the {@link org.cloudbus.cloudsim.vms.VmSimple}.</p>
 *
 * <p>Specific Vm implementations can be power- or network-aware, enabling the simulation
 * of power consumption and network communication. For more information
 * see {@link org.cloudbus.cloudsim.datacenters} package documentation.</p>
 *
 * @author Manoel Campos da Silva Filho
 */
package org.cloudbus.cloudsim.vms;
