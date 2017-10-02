# Create a Soldier class, that has type, strength, health_point
# Create a constuctor for setting those values
# Create an Army class
# Create a constructor which take a number as a parameter
# The constructor generates randomly as many Soldiers as the given number, and stores them in a list
# The Soldier's type should be only: "archer", "knight" or "soldier", the strength and the health_point should be integers between 0 - 100
# Army should be represented as string in this format:
# "12 soldier: 3 archers, 2 knights, 7 soldier"
# Create a Battle class
# The constructor of the class takes two armies
# The class should reduce the soldiers of one armie's health_point with 10 % of the average of the other armie's strength in one round of the battle
# It should remove the dead soldier from the Army
# During the battle the armies should fight each other by turns
# After a turn the class should print the number of the soldiers in this format:
# "Army1 - 12 soldier: 3 archers, 2 knights, 7 soldier, Army2 - 30 soldier: 10 archers, 10 knights, 10 soldier"
# The battle should lasted until all soldiers of one Army are dead

army1 = Army(12)
army2 = Army(30)
print(army1)
# Should print out:
# "12 soldier: 3 archers, 2 knights, 7 soldier"
battle = Battle(army1, army2)
battle.fight()
# Should print out:
# "Army1 - 11 soldier: 2 archers, 2 knights, 7 soldier, Army2 - 30 soldier: 10 archers, 10 knights, 10 soldier"
# "Army1 - 10 soldier: 2 archers, 1 knights, 7 soldier, Army2 - 30 soldier: 10 archers, 10 knights, 10 soldier"
# etc.
# "Army1 - 0 soldier: 0 archers, 0 knights, 0 soldier, Army2 - 21 soldier: 7 archers, 7 knights, 7 soldier"
