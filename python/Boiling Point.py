boiling_map = dict()
boiling_map = {
    'Butane' : -0.5 ,
    'Copper' : 1187,
    'Gold' : 2660,
    'Mercury' : 357,
    'Methane' : -161.7,
    'Nonane' : 150.8,
    'Silver' : 2197,
    'Water' : 100
}
def boiling_material(boiling_map, boiling_point):
    for key in boiling_map:
        if(abs(boiling_map[key]) >= abs(round((boiling_point - (boiling_point/100.0)*5),5)) and abs(boiling_map[key]) <= abs(round((boiling_point + (boiling_point*5/100.0)),1))):
            return key
    return 'unkown'

print(boiling_material(boiling_map,95))