# python imports
import time
import shutil
import subprocess


if __name__ == '__main__':

    for iter in range(30):

        # executing the iot policies interpreter
        cmd = ['java', '-jar', 'iot_policies.jar']
        subprocess.call(
            cmd, shell=True, stdin=subprocess.PIPE, stdout=subprocess.PIPE)

        # waiting for memory to be
        # deallocated at the raspberry
        time.sleep(5)

        # renaming and moving results file
        shutil.move('results.txt', f'output/results{iter}.txt')
