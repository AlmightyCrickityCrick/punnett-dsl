# DOMAIN SPECIFIC LANGUAGE FOR SOLVING GENETICS PROBLEMS 

**Vasile CEBAN , Damian GROSU, Lina SCRIPCA*, Andrei ZACATOV**

*Technical University of Moldova, Faculty of Computers, Informatics and Microelectronics, Software Engineering, FAF-201, Chișinău, Republic of Moldova*

**Corresponding author: Scripca, Lina, lina.scripca@isa.utm.md*

*Abstract. This article describes a Domain Specific Language for solving genetics problems that require the usage of Punnett Square. Subsequently, this paper delves into the syntaxis, functionality and creation of the language, as well as the steps required for its proper usage for maximum automatization of the steps for problem solution.*  

*Key words: domain-specific language, genetics, punnett square, character inheritance.*

## Introduction
A Domain Specific Language is a language designed to provide a notation tailored towards an application domain, and is based only on the relevant concepts and features of that domain[1]. Or, in other words, it is a language designed specifically for ease of usage for experts of a specific domain, with supported for syntactic sugar relevant to that specific domain.
A Punnett square problem is a problem that given the allele (symbolic notations of the genes carrying a certain hereditary character) of a set of parents, determines the probability of that character’s propagation in the next generation. For its solution, a parent’s genotypical constitution is broken down into possible gamete sets, and then combined with all the other possible gametes of the other parent to obtain a square that would show the distribution of characters of their kids.
While the solution seems pretty straightforward, the complexity of finding it rises exponentially with the number of genes that are being monitored, going from 16 possible cases for 2 sets of alleles, towards 256 cases for 4, creating a large margin for human error on the basis of attention during their analysis.  
Thus, the domain of genetics, and, specifically, the branches that study the Mendelian character inheritance and population diversity using Punnett square, could benefit from the automatization of problem solution provided by a DSL.  

## Solution Concept
The created DSL will help solve genetics problems using The Punnett square. The basic tool will generate predictions of the genotypes of a particular cross or breeding experiment.
The language will be intuitive and require beginner level coding skills and knowledge in genetics. With the DSL the users will write a code where they will specify the parent, the notation of the alleles, which alleles are dominant or recessive as well as other necessary parameters for the studied problem, after which the DSL will be interpreted, executed and computed to get as output the solutions to the problem, be they a Punnett Square, the possible genotype of a parent, or information about the inherited genotypes and phenotypes of the next generation, along with their probability.

## Computational Model of the DSL
The basic items of computation in the language are the data held in variables, types of which will be described in the following paragraph. The problem description model that was chosen envisions the language as being an object-oriented imperative language, following a Control-Driven execution style. The main computational methods are build-in and user defined functions, such as creating a new generation (via a cross function), or processing already achieved data (via a find <property> statement)

## Data Structures
The language will contain Atomic Data types and Object Types. The atomic data types will be closely related to already existing languages, while the Object Types will be custom structures in a vocabulary closely known by people in the specific domain.
### Atomic types will include:
**Nil / Null** - type for everything uninitialized.\
**Boolean** - logical 1 or 0, using 1 byte values.\
**String** - A pointer to an immutable Cstring (zero-terminated string)\
**Number** - An IEEE 754 binary64 type number, more commonly known as a "double" type variable. Using this datatype for both integers and real numbers aims to reduce the amount of variable types and hence the confusion, while still maintaining a more than decent integer value range (exact representation for numbers in the range of ±2^53 exactly and up to ±2^54 with  rounding to the nearest multiple of 4)
### Composite / Object types will be represented by:
**Gene** - A basic unit of genetics, that will contain information about the dominance properties of the allele variants, their phenotypical label, location, as well as the existence of codominant variants.\
**Parent** - an object containing genes, predefined methods and properties, as well as a possibility to add custom methods to aid in generalising the language for broader tasks.\
**Generation** – an object containing several parent candidate organisms as well as the probability of their manifestation within the generation.

## First Iteration functionality
The first iteration of the language is aiming to provide the following operations to the end users through the indicated functions:\
**cross** parent **x** parent – computation of a new generation using the genetical composition of a set of parents as the base.\
**find** field genes – computation of all possible genotypic variants containing the genes declared within the program and the allele given within the function, returning the indicated field as the result.\
**pred** generation – computation of all possible parent variants based on the traits inherited by a generation.\
**estimate** generation number – computation of the solution for a population problem, given the trait inheritance probability within a generation and the total number of expected individuals within it.


