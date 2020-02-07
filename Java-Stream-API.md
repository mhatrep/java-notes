# JAVA Stream API
Java Stream API provides lots of in-built functionality to help in performing operations on a collection using a stream pipeline. 

-- Transforming

-- Filtering

-- Searching

-- Reordering

-- Summarizing

-- Grouping


----------------------------------------------------


# Stream pipeline. 

The stream pipeline made of the following three parts:

1 Stream builder — Collection, arrays (Arrays.stream()) and generator functions (Stream.iterate() and Stream.generate()).

2 Intermediate operation(s) — Apply zero, one or more than one operations on the stream by chaining the operations, like in a builder pattern. 

3 Terminal operation — Finish the pipeline by applying a mandatory terminal operator. 


----------------------------------------------------


Transforming - Converting the type of value that is stored in each element of a collection.

Filtering - Allow objects to flow through itself only if the object fulfills the conditions laid upon by a Predicate

Searching - Searching for an element may or may not return a value, hence you get an Optional.

Reordering - Takes an instance of a Comparator interface.

Summarizing - reduce and collect are the generic terminal operators. sum, count, summary Statistics, etc. that are built upon reduce and collect.

Grouping- classifying.

