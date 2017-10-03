3 subpackages:

* insured:

    All the objects implement the insurable iface. Currently empty.
    One type of insurable object is property (house, flat, land), you can define more
    insurable objects, like persons, vehicles..
    The example of property implemented is house. You define the area in the constructor.

* products

    All the products implement the Product iface
    There are 2 products right now, the household-compact and household-optimal, you can add more products
    There is a factory to generate the right product

* policies

    All the policies implement the policy iface, you can extend with more policies.

The main program will accept as first parameter the product (optimal, compact) and the area of the house.