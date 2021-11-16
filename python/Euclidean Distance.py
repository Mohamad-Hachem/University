def find_farthest_points(points):
    max = 0
    result = []
    for firstPoint in points:
        for secondPoint in points: #start from i+1 for faster result
            if((((secondPoint[0]-firstPoint[0])**2+(secondPoint[1]-firstPoint[1])**2)**0.5) > max):
                max = (((secondPoint[0]-firstPoint[0])**2+(secondPoint[1]-firstPoint[1])**2)**0.5)
                result = []
                result.append((firstPoint[0],firstPoint[1]))
                result.append((secondPoint[0],secondPoint[1]))
    return result
    pass
