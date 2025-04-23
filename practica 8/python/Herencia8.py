class A:
    def __init__(self, x, z):
        self.x = x
        self.z = z

    def incrementaXZ(self):
        self.x += 1
        self.z += 1

    def incrementaZ(self):
        self.z += 1


class B:
    def __init__(self, y, z):
        self.y = y
        self.z = z

    def incrementaYZ(self):
        self.y += 1
        self.z += 1

    def incrementaZ(self):
        self.z += 1


class D(A, B):
    def __init__(self, x, y, z):
        A.__init__(self, x, z)
        B.__init__(self, y, z)

    def incrementaXYZ(self):
        self.x += 1
        self.y += 1
        self.z += 1

    def incrementaYZ(self):
        B.incrementaYZ(self)

    def incrementaZ(self):
        A.incrementaZ(self)

    def incrementaXZ(self):
        A.incrementaXZ(self)


d = D(1, 2, 3)

print(f"Inicial: x={d.x} y={d.y} z={d.z}")

d.incrementaXYZ()
print(f"Después de incrementaXYZ: x={d.x} y={d.y} z={d.z}")

d.incrementaXZ()
print(f"Después de incrementaXZ: x={d.x} y={d.y} z={d.z}")

d.incrementaYZ()
print(f"Después de incrementaYZ: x={d.x} y={d.y} z={d.z}")

d.incrementaZ()
print(f"Después de incrementaZ: x={d.x} y={d.y} z={d.z}")
